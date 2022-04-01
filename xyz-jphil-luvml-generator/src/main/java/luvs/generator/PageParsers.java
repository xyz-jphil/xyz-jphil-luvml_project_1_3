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

import luvml.BrowserSupport;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import static xyz.jphil.html_transformers.common.Transform.transformChildren;

/**
 *
 * @author
 */
public class PageParsers {
    public static BrowserSupport browserSupport(Element main_element){
        Element support = CssSelectors.after("h2","Browser Support",main_element,"table");
        if(support==null)
            support = CssSelectors.after("h2","Browser Support",main_element,"div");
        if(support==null){
            System.out.println("could not find browser support block");
            return BrowserSupport.unknownBrowserSupport();
        }
        Elements rows = support.select("tr");
        
        Element r1 = rows.get(0);
        Element r2 = rows.get(1);
        
        double edge,firefox,chrome,safari,opera;
        edge = firefox = chrome = safari = opera = BrowserSupport.UNKNOWN;
        for (int i = 1; i < r1.children().size(); i++) { // skip first
            Element key_i = r1.children().get(i);
            Element val_i = r2.children().get(i);
            
            String keyV = key_i.attr("title");
            String valV = val_i.text();
            
            if(keyV.equals("Chrome"))                       chrome = parseVal(valV);
            if(keyV.equals("Internet Explorer / Edge"))     edge = parseVal(valV);
            if(keyV.equals("Firefox"))                      firefox = parseVal(valV);
            if(keyV.equals("Safari"))                       safari = parseVal(valV);
            if(keyV.equals("Opera"))                        opera = parseVal(valV);
        }
        
        return BrowserSupport.browser_support(chrome, edge, firefox, opera, safari);
    }
    
    private static double parseVal(String valV){
        if("Yes".equalsIgnoreCase(valV)) return 0;
        if("Not supported".equalsIgnoreCase(valV)) return BrowserSupport.NOT_SUPPORTED;
        try {
            return Double.parseDouble(valV);
        } catch (Exception e1) {
            try {
                return Double.parseDouble(valV.split(" ")[0]);
            } catch (Exception e2) {
            }
        }
        return BrowserSupport.UNKNOWN;
    }
    
    public static String parseExample(Element main_element){
        if(main_element==null)return "";
        Element w3_example = main_element.selectFirst(".w3-example");
        transformChildren(w3_example).select("h3").
            delete().
        __();
        transformChildren(w3_example).select(".w3-code").
            transformTag(oldTag->"pre").
            transformClss(clssMapper->clssMapper.clear()).
            //transformContent(oldContent->oldContent.prefixText("{@code \n").addText("\n}")).
        __();
        transformChildren(w3_example).select("a.w3-btn").
            delete().
        __();
        return w3_example.html();
    }
    
}
