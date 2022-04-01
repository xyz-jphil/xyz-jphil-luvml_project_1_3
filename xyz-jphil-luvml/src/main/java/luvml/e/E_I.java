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
import static luvml.e.N_Text.dynamic;
import static luvml.e.N_Text.textnode;

/**
 *
 * @author
 */
public class E_I extends Element_m {
    public E_I() {
        super("i", false, false, true);
    }
    public static E_I i(){
        return new E_I();
    }
    public static E_I i(HtmlSegment_I ... segments){
        return (E_I) new E_I().____(segments);
    }
    public static E_I i(String text_value){
        return (E_I) new E_I().____(textnode(text_value));
    }
}
