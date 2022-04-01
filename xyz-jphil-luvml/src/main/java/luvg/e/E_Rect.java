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
package luvg.e;

import luvml.e.*;
import luvml.HtmlSegment_I;

/**
 *
 * @author
 */
public class E_Rect extends Element_m {
    public E_Rect() {
        super("rect");
    }
    public static E_Rect rect(){
        return new E_Rect();
    }
    public static E_Rect rect(HtmlSegment_I ... segments){
        return (E_Rect) new E_Rect().____(segments);
    }
}
