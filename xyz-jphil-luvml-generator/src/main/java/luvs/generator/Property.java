/*
 * Copyright 2021 Ivan Velikanova ivan.velikanova@gmail.com .
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package luvs.generator;

import io.github.xyzjphil.xyz.jphil.cached_web_reader.ReadWeb;
import java.nio.channels.IllegalSelectorException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Objects;
import luvml.BrowserSupport;
import static luvml.BrowserSupport.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author
 */
public class Property {
    public final String 
            pageUrlBase,pageRelUrl,name;
    public String description;
    
    private String example;
    ArrayList<PropertyParameter> parameters = new ArrayList<>();
    private BrowserSupport browserSupport = unknownBrowserSupport();
    
    public boolean animatable = false;
    public double cssVersion = -1;
    
    public String defaultValue;
    public final boolean function;
    public final boolean undocumented;
    
    private final String functionSyntax;
    
    final LinkedHashMap<String,String> param_values = new LinkedHashMap<>();

    public Property(String pageUrlBase, Element row) {
        this(pageUrlBase, row, false);
    }
    public Property(String pageUrlBase, Element row, boolean function) {
        this.pageUrlBase = pageUrlBase;
        this.function = function; this.undocumented = false; functionSyntax = null;
        Element nameTD = row.children().get(0);
        Element descTD = row.children().get(1);
        Element a = nameTD.selectFirst("a");
        String pageRelUrl = "";
        String name = "";
        if(a==null){
            name = nameTD.text();
            pageRelUrl = "css3_pr_"+name.replace("@", "")+".asp"; // guess
        }else {
            name = a.text();
            pageRelUrl = a.attr("href");
        }
        if(function){
            if(!name.contains("(")){
                System.out.println("not a function "+name);
            }else {
                name = name.substring(0,name.indexOf('('));
            }
        }
        this.pageRelUrl = pageRelUrl;
        this.name = name;
        this.description = descTD.text();
    }

    public Property(String function_name, String description, String functionSyntax) {
        this.pageUrlBase = null;
        this.pageRelUrl = null;
        this.name = function_name;
        this.function = true;
        this.undocumented = true;
        this.description = description;
        this.functionSyntax = functionSyntax;
    }
    
    
    public String getPageUrl() {
        String r = pageUrlBase+pageRelUrl;
        r = r.replace("cssref//cssref", "cssref");
        return r;
    }

    @Override
    public String toString() {
        if(!undocumented){
            return name+"\t"+getPageUrl()+"\t"+singleLineDesc();
        }else {
            return name+"\t"+""+"\t"+singleLineDesc();
        }
    }
    
    String singleLineDesc(){
        String ret = description.replace("\n", "").replace("\r", "");
        if(undocumented){
            ret = functionSyntax+ret;
        }
        return ret;
    }
    
    public String javadoc(){
        return JavaDocUtils.javadoc(description, null, example, 
                functionSyntax, pageUrlBase+pageRelUrl);
    }
    
    public void readFunction()throws Exception{
        if(undocumented){
            browserSupport = BrowserSupport.unknownBrowserSupport();
            example = functionSyntax;
            //definitions
            // description // already set in constructor
            defaultValue = null;
            cssVersion = -1;
            //syntax
            parseFunctionSyntax_forUndocumented(functionSyntax);
            //values
            parseFunctionValues_forUndocumented();
        }else{
            System.out.println("p="+getPageUrl());
            Document d = ReadWeb.readUrl(getPageUrl(), 1024, false, null).orElse(null);
            Element main_element = d.selectFirst("#main");
            if(main_element==null)return;
            browserSupport = PageParsers.browserSupport(main_element);
            example = PageParsers.parseExample(main_element);

            parseDefinition(main_element);
            parseSyntax(main_element);
            parsePropertyValues(main_element);
        }
    }
    
    public void readProperty() throws Exception{
        if(function){
            throw new IllegalStateException("Call readFunction instead.");
        }
        System.out.println("p="+getPageUrl());
        Document d = ReadWeb.readUrl(getPageUrl(), 1024, false, null).orElse(null);
        
        Element main_element = d.selectFirst("#main");
        if(main_element==null)return;
        browserSupport = PageParsers.browserSupport(main_element);
        example = PageParsers.parseExample(main_element);
        
        parseDefinition(main_element);
        parseSyntax(main_element);
        parsePropertyValues(main_element);
        
    }
    
    public BrowserSupport browserSupport(){
        return browserSupport;
    }
    
    public void parseDefinition(Element main_element){
        Element description_expanded = CssSelectors.after("h2","Definition and Usage",main_element,"p");
        description += "\n<br><br>\n";
        for( Element nxt = description_expanded; nxt.tagName().equals("p"); nxt = nxt.nextElementSibling() ){
            description += nxt.text()+"<br>\n";
        }
        
        Element defTableDiv = CssSelectors.after("h2","Definition and Usage",main_element,"div");
        // align-content: stretch|center|flex-start|flex-end|space-between|space-around|initial|inherit;
        if(defTableDiv==null){
            System.out.println("Could not find definitions table's parent div");
            return ;
        }
        Elements rows = defTableDiv.select("tr");
        for (int i = 0; i < rows.size(); i++) {
            Element row = rows.get(i);
            Element ci0 = row.children().get(0);
            Element ci1 = row.children().get(1);
            if(ci0.text().toLowerCase().contains("default value")){
                defaultValue = ci1.text().trim();
            }
            if(ci0.text().toLowerCase().contains("version")){
                try {
                    cssVersion = Double.parseDouble(ci1.text().split(" ")[0].substring(3)); // skip css
                } catch (Exception e) {
                }
            }
        }
    }
    
    private void parseFunctionSyntax_forUndocumented(String fs){
        String s = fs.substring(fs.indexOf("("));
        s = s.substring(1,s.indexOf(")"));
        String[]params = s.split(",");
        for (int p_i = 0; p_i < params.length; p_i++) {
            String param_p_i = params[p_i];
            PropertyParameter pp = new PropertyParameter(this, param_p_i.trim(), p_i,function);
            parameters.add(pp);
        }
    }
    
    private void parseFunctionValues_forUndocumented(){
        for (PropertyParameter p_i : parameters) {
            p_i.name().ifPresent(n->param_values.put(n, p_i.syntax));
        }
    }
    
    public void parseSyntax(Element main_element){
        Element CSS_Syntax = CssSelectors.after("h2","CSS Syntax",main_element,"div");
        // align-content: stretch|center|flex-start|flex-end|space-between|space-around|initial|inherit;
        if(CSS_Syntax==null)return ;
        String t = CSS_Syntax.text().trim();
        t = t.substring(name.length()+1);
        t = t.replace(";", "");
        t = t.trim();
        if(!function){
            t = t.replace(" | ", "|");
        }else {
            t = t.replace(" , ", ",");
            t = t.replace(" ,", ",");
            t = t.replace(", ", ",");
            if(t.contains("(")){
                t = t.substring(t.indexOf("(")+1);
            }
            if(t.contains(")")){
                t = t.substring(0,t.indexOf(")"));
            }
            
        }
        String[]params;
        if(!function){
            params = t.split("\\s+");
        }else {
            params = t.split("\\,");
        }
        
        for (int p_i = 0; p_i < params.length; p_i++) {
            String param_p_i = params[p_i];
            PropertyParameter pp = new PropertyParameter(this, param_p_i, p_i,function);
            parameters.add(pp);
        }
    }
    
    public void parsePropertyValues(Element main_element){
        Element Property_Values = CssSelectors.after("h2","Property Values",main_element,"div");
        if(Property_Values==null)return;
        //System.out.println(Property_Values.text());
        Elements row = Property_Values.select("tr");
        for (int i = 1; i < row.size(); i++) { // skip heading
            Element row_i = row.get(i);
            Element value_i = row_i.children().get(0);
            Element description_i = row_i.children().get(1);
            param_values.put(value_i.text(), description_i.text());
        }
    }
    
    private String[]normalizeName(){
        return Names.normalizeAndSplitBy(name, "\\-");
    }
    
    public String methodName(){
        return Names.methodName(normalizeName());
    }

    public String className(){
        return Names.className(normalizeName());
    }
    
    public String constantName(){
        return Names.constName(normalizeName());
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Property other = (Property) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
    public String funcName(){
        if(function)return name.replace("-", "_")+"()";
        return name;
    }
}
