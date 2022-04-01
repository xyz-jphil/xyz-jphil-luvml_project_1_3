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

import com.squareup.javapoet.FieldSpec;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;
import io.github.xyzjphil.xyz.jphil.cached_web_reader.ReadWeb;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import static java.util.Map.entry;
import javax.lang.model.SourceVersion;
import static javax.lang.model.element.Modifier.*;
import luvml.BrowserSupport;
import luvml.o.Out_I;
import luvs.StyleSegmentType_E;
import luvs.p.Property_I;
import luvs.v.StringConstant;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


/**
 *
 * @author
 */
public class ReadCssRef {
    
    private final ArrayList<Property> properties = new ArrayList<>();
    private final ArrayList<Function> functions = new ArrayList<>();
    private final LinkedHashSet<Constant> constants = new LinkedHashSet<>();
    
    private static final List<String> propertyIgnoreList = List.of(
        "@font-feature-values",
        "font-synthesis",
        "font-variant-alternates",
        "font-variant-east-asian",
        "font-variant-ligatures",
        "font-variant-numeric",
        "font-variant-position",
        "image-rendering",
        "line-break",
        "mask",
        "mask-type",
        "orphans",
        "overflow-wrap",
        "text-combine-upright",
        "text-orientation",
        "text-underline-position",
        "widows",
        "@media"
    );
    
    public void readPropertiesIndex()throws Exception{
        String rootUrl = "https://www.w3schools.com/cssref/";
        Document d = ReadWeb.readUrl(rootUrl, 1024, false, null).orElse(null);
        Element cssproperties = d.select("#cssproperties").first();
        Elements rows = cssproperties.select("tr");
        for (int i = 0; i < rows.size(); i++) {
            //if(i > 5)break;
            Element row = rows.get(i);
            Property p = new Property(rootUrl, row);
            if(propertyIgnoreList.stream().anyMatch(__->__.equalsIgnoreCase(p.name))){
                System.out.println("ignoring "+p.name);
                continue;
            }
            properties.add(p);
            try {
                p.readProperty();
            } catch (Exception e) {
                System.err.println("Could not handle property "+p.name);
                e.printStackTrace();
            }

        }
    }
    
    public void readFunctionsIndex(){
        String url = "https://www.w3schools.com/cssref/css_functions.asp";
        Document d = ReadWeb.readUrl(url, 1024, false, null).orElse(null);
        Element main_element = d.selectFirst("#main");
        Element table = d.selectFirst("table");
        Elements rows = table.select("tr");
        for (int i = 1; i < rows.size(); i++) { // skip heading
            //if(i > 5)break;
            Element row = rows.get(i);
            Function f = new Function("https://www.w3schools.com/cssref/", row);
            handleFunction(f);
        }
    }
    
    private void handleFunction(Function f){
        functions.add(f);
        try {
            f.readFunction();
        } catch (Exception e) {
            System.err.println("Could not handle property "+f.name);
            e.printStackTrace();
        }
    }
    
    public void readAnimatableIndex() throws Exception{
        String rootUrl = "https://www.w3schools.com/cssref/css_animatable.asp";
        Document d = ReadWeb.readUrl(rootUrl, 1024, false, null).orElse(null);
        Element main_element = d.select("#main").first();
        Element support = CssSelectors.after("h2","Animatable Properties",main_element,"table");
        Elements rows = support.select("tr");
        for (int i = 1; i < rows.size(); i++) { // skip heading
            Element row = rows.get(i);
            String a_i = row.selectFirst("a").text();
            Property p = findPropertyByName(a_i);
            if(p!=null)p.animatable = true;
        }
    }
    
    public Property findPropertyByName(String n){
        for (Property property : properties) {
            if(property.name.equals(n))return property;
        }
        return null;
    }
    
    public Function findFunctionByName(String n){
        for (Function f : functions) {
            if(f.name.equals(n))return f;
        }
        return null;
    }
    
    public void listProperties(){
        for (Property property : properties) {
            System.out.println(property);
        }
    }
    
    public void createPropertyEnum() {
        FieldSpec propertyName_f = FieldSpec.builder(String.class,"propertyName", PUBLIC, FINAL).build();
        FieldSpec animatable_f = FieldSpec.builder(boolean.class,"animatable", PUBLIC, FINAL).build();
        FieldSpec browserSupport_f = FieldSpec.builder(BrowserSupport.class,"browserSupport", PUBLIC, FINAL).build();
        FieldSpec cssVersion_f = FieldSpec.builder(double.class,"cssVersion", PUBLIC, FINAL).build();

        FieldSpec [] fields = { propertyName_f,animatable_f,browserSupport_f,cssVersion_f };
        
        MethodSpec constructor = PoetUtils.createConstructor(fields);
        MethodSpec[]getters = PoetUtils.getters(fields);
        MethodSpec type_method = MethodSpec.methodBuilder("type")
                .returns(StyleSegmentType_E.class)
                .addModifiers(PUBLIC, FINAL)
                .addAnnotation(Override.class)
                .addStatement("return StyleSegmentType_E.PropertyName").build();
        
        MethodSpec writeTo_method = MethodSpec.methodBuilder("writeTo")
                .returns(void.class)
                .addParameter(Out_I.class, "o")
                .addModifiers(PUBLIC, FINAL)
                .addAnnotation(Override.class)
                .addStatement("o.__(propertyName).__(\":\")").build();

        TypeSpec.Builder Properties_class = TypeSpec.enumBuilder("P")
                .addModifiers(PUBLIC)
                .addSuperinterface(Property_I.class)
                .addFields(List.of(fields))
                .addMethod(constructor)
                .addMethods(List.of(getters))
        ;
        
        Properties_class.addMethod(type_method).addMethod(writeTo_method);
        
        for (Property p : properties) {
            BrowserSupport bs = p.browserSupport();
            Properties_class.addEnumConstant(
                p.constantName(),
                TypeSpec
                    .anonymousClassBuilder("$S,$L,new BrowserSupport($L,$L,$L,$L,$L),$L /*default Value = $L */  ",
                            p.name,p.animatable,
                            bs.chrome, bs.edge, bs.firefox, bs.opera, bs.safari,
                            p.cssVersion, p.defaultValue)   
                    .addJavadoc(p.javadoc())
                    .build()
            );
        }
                
        JavaFile javaFile = JavaFile.builder("luvs.p",Properties_class.build())
                //.addStaticImport(BrowserSupport.class, "*")
                .build();
        
        try {
            javaFile.writeTo(LuvsProject.javaSrc());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    public void createStringConstants() {
        
        for (Property property : properties) {
            for (Map.Entry<String, String> entry : property.param_values.entrySet()) {
                String c_s = entry.getKey();
                if(!c_s.contains("(")){
                    Constant c = getConstantByName(c_s);
                    c.addSource(property);
                }else {
                    String f_n = c_s.substring(0,c_s.indexOf("("));
                    Function f = findFunctionByName(f_n);
                    if(f==null){
                        System.out.println("Function not found "+c_s);
                        f = new Function(f_n, entry.getValue(), c_s);
                        handleFunction(f);
                    }
                    
                }
            }
        }
        
        List<Entry<String,String>>map_Constant_Type = List.of(
            entry("property","luvs.p.P")
        );
        for (Constant c : constants) {
            map_Constant_Type.stream().
                filter(e->e.getKey().equals(c.name)).
                findAny().
                ifPresent(___->c.setType(___.getValue()));
            System.out.println(c);
        }
        System.out.println();
        
    }
    
    public void createFunctions(){
        ArrayList fs = new ArrayList();
        
        TypeSpec.Builder F_class = TypeSpec.classBuilder("F")
                .addModifiers(PUBLIC);
        ;
        for (Function f : functions) {
            String fnm = f.name.replace("-", "_").trim();
            System.out.println("Making "+fnm+" "+f);
            MethodSpec.Builder m = MethodSpec.methodBuilder(fnm)
                .returns(luvs.f.Function.class)
                .addModifiers(PUBLIC, STATIC,FINAL)
                .addJavadoc(f.javadoc());
            String params = "",p=null;
            //int i = 0;
            for (int i = 0; i < f.parameters.size(); i++) {
                PropertyParameter parameter = f.parameters.get(i);
                p = parameter.name().orElse("p"+i);
                INNER_LOOP:
                for (int j = 0; j < i; j++) {
                    PropertyParameter prv_parameter = f.parameters.get(j);
                    String prv_param = prv_parameter.name().orElse("p"+j);
                    if(p.equals(prv_param)){
                        p = p + "__"+i;
                        break INNER_LOOP;
                    }
                }
                p = p.replace(".", "");
                if(!javax.lang.model.SourceVersion.isName(p)){
                    if(p.equals("...")){
                        p = "etc";
                    }
                    p = p.replace("'", "");
                    p = p.replace("-", "_");
                    p = p.toLowerCase();
                    if(p.equals("_")){
                        p = "p"+i;
                    }
                    if(!javax.lang.model.SourceVersion.isName(p)){
                        p = "p_"+p;
                    }
                    
                }
                if(i>0){
                    params = params +"," + p;
                }else {
                    params = p;
                }
                if(p.equals("etc")){
                    m.addParameter(Object[].class,p);
                }else {
                    m.addParameter(Object.class,p);
                }
            }
            String statement = "return M(\""+f.name+"\","+params+ ")";
            System.out.println("Making "+fnm+" "+f+" {"+statement+";}");
            m.addStatement(statement);
            F_class.addMethod(m.build());
        }
        
        JavaFile javaFile = JavaFile.builder("luvs.f",F_class.build())
                .addStaticImport(luvs.f.Function.class, "M")
                .build();
        
        try {
            javaFile.writeTo(LuvsProject.javaSrc());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void createConstantValues(){
        ArrayList fs = new ArrayList();
        TypeSpec.Builder V_class = TypeSpec.classBuilder("V")
                .addModifiers(PUBLIC);
        List<String> skip_n_ignore = List.of(
            "url|string"
        );
        int c_i = 0;
        for (Constant c : constants) {
            if(skip_n_ignore.stream().anyMatch(s->s.equals(c.name))){
                System.out.println("Skipping "+c);
                continue;
            }
            String cnm = c.name.replace("-", "_").trim();
            if(!SourceVersion.isName(cnm)){
                cnm = CapitalizeHack.capitalizeCentralLetter(cnm);
            }
            System.out.println("Making ("+
                    c_i+"/"+constants.size()+ ")"+cnm+" "+c);
            FieldSpec.Builder fld = FieldSpec.builder(StringConstant.class,cnm)
                .addModifiers(PUBLIC, STATIC,FINAL)
                .addJavadoc(c.javadoc())
                .initializer("M($S)",c.name);
            V_class.addField(fld.build());
            c_i++;
        }
        
        JavaFile javaFile = JavaFile.builder("luvs.v",V_class.build())
                .addStaticImport(luvs.v.StringConstant.class, "M")
                .build();
        
        try {
            javaFile.writeTo(LuvsProject.javaSrc());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void functionParametersList(){
        System.out.println("--------");
        System.out.println();
        HashMap<String,PropertyParameter> unique_func_params = new HashMap<>();
        for (Function f : functions) {
            for (PropertyParameter parameter : f.parameters) {
                PropertyParameter pp = unique_func_params.get(parameter.name().get());
                if(pp!=null){
                    unique_func_params.put(parameter.name().get(), pp);
                }
            }
            
            System.out.println(f.toString());
        }
    }
    
    public Constant getConstantByName(String nm){
        for (Constant c : constants) {
            if(c.name.equals(nm))return c;
        }
        Constant c = new Constant(nm);
        constants.add(c);
        return c;
    }
    
    
    public static void main(String[] args) throws Exception{
        ReadCssRef gen = new ReadCssRef();
        gen.readPropertiesIndex();
        gen.readFunctionsIndex();
        gen.readAnimatableIndex();
        //css.createPropertyEnum();
        gen.createStringConstants();
        //gen.createFunctions();
        gen.createConstantValues();
        //css.createPropertyValueStatics();
    }
    
}
