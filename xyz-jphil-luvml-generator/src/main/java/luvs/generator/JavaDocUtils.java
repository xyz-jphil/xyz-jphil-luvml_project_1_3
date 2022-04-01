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

import java.util.regex.Pattern;
import luvml.BrowserSupport;

/**
 *
 * @author
 */
public class JavaDocUtils {
    public static final Pattern COMMENT = Pattern.compile("\\/\\* .*? \\*\\/");
    public static String javadoc(String description, BrowserSupport browserSupport, String example, String syntax, String pageUrl){
        String t = description;
        if(browserSupport!=null){
            t += "\n<br>Browser support : "+browserSupport.javadoc()+ "\n<br>";
        }else {
            t += "\n<br>";
        }
        if(syntax!=null){
            t += example + "<br>\n";
        }
        if(example!=null){
            t += ""//"<br>\n<h3>Example : </h3>\n"
                    + example
                    + "<br>\n From : <a href=\""+pageUrl+ "\">"+pageUrl+"</a>";
        }
        //System.out.println("javadoc="+t);
        t = t.replace("$", "$$"); // https://github.com/square/javapoet/issues/670
        t = t.replace("/*", "//");
        t = t.replace("*/", "\n");
        //t = COMMENT.matcher(t).replaceAll(comment -> "//" + comment.group().replace("/*", "").replace("*/", "") );
        return t;
    }
}
