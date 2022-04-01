/*
 * Copyright 2020 Ivan Velikanova ivan.velikanova@gmail.com .
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
package luvml.e;

import luvml.HtmlSegment_I;
import static luvml.e.N_Text.textnode;

/**
 *
 * @author
 */
public class E_H3 extends Element_m {
    public E_H3() {
        super("h3");
    }
    public static E_H3 h3(){
        return new E_H3();
    }
    public static E_H3 h3(HtmlSegment_I ... segments){
        return (E_H3) new E_H3().____(segments);
    }
    public static E_H3 h3(String text_value){
        return (E_H3) new E_H3().____(textnode(text_value));
    }
}
