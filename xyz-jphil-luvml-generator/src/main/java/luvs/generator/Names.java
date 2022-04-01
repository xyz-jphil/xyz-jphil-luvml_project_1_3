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

/**
 *
 * @author
 */
public class Names {
    public static String[]normalizeAndSplitBy(String n,String splitRegex){
        n = n.replace("@", "");
        return n.split(splitRegex);
    }
    
    public static String methodName(String[]n){
        String np = n[0];
        for (int i = 1; i < n.length; i++) {
            String n_i = n[i];
            n_i = firstLetterCapital(n_i);
            np += n_i;
        }
        return np;
    }
    
    public static String className(String[]n){
        String np = "";
        for (int i = 0; i < n.length; i++) {
            String n_i = n[i];
            n_i = firstLetterCapital(n_i);
            np += n_i;
        }
        return np;
    }
    
    public static String constName(String[]n){
        String np = "";
        for (int i = 0; i < n.length; i++) {
            String n_i = n[i];
            n_i = n_i.toUpperCase();
            if(i>0)np += "_";
            np += n_i;
        }
        return np;
    }
    
    public static String firstLetterCapital(String n_i){
        return Character.toUpperCase(n_i.charAt(0))+n_i.substring(1, n_i.length());
    }
    
    public static String fieldToGetterName(FieldSpec f){
        String n = f.name;
        if("boolean".equals(f.type.toString())){
            n = "is"+ firstLetterCapital(n); // already other letter camel cased
        }
        return n;
    }
    
}
