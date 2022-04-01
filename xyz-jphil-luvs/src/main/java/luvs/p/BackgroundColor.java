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
package luvs.p;

import luvs.v.ValueProvider_I;
import luvs.c.CssColor_I;
import static luvs.c.NamedColors.White;

/**
 *
 * @author
 */
public class BackgroundColor {
    public static PropertyWithValues background_color(CssColor_I p1){
        return __(P.BACKGROUND_COLOR, p1);
    }
    
    public static PropertyWithValues background_color(ValueProvider_I ... vs){
        return __(P.BACKGROUND_COLOR, vs);
    }
    
    public static PropertyWithValues __(Property_I property, ValueProvider_I ... vs){
        background_color(White);
        PropertyWithValues pwv = new PropertyWithValues(property);
        for (int i = 0; i < vs.length; i++) {
            ValueProvider_I v_i = vs[i];
            pwv.parameters().add(v_i);
        }
        return pwv;
    }
}
