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

import luvml.HtmlSegment_I;
import luvml.e.Element_m;

/**
 *
 * @author
 */
public class E_Image extends Element_m {
    public E_Image() {
        super("image");
    }
    public static E_Image image(){
        return new E_Image();
    }
    public static E_Image image(HtmlSegment_I ... segments){
        return (E_Image) new E_Image().____(segments);
    }
}
