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

/**
 *
 * @author
 */
public class CapitalizeHack {
    public static String capitalizeCentralLetter(String s){
        int l = s.length();
        if(l<1) throw new IllegalArgumentException("Zero Length String");
        if(l<2) return s.charAt(0)+Character.toUpperCase(s.charAt(1))+"";
        return s.substring(0,l/2)+
                Character.toUpperCase(s.charAt(l/2))+
                s.substring(l/2+1);
    }
    public static void main(String[] args) {
        System.out.println(capitalizeCentralLetter("static"));
    }
}
