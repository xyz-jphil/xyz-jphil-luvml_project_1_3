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
package luvs.v.c;

import luvs.c.CssColor;
import luvs.c.RGB;
import luvs.c.RGBA;
import luvs.c.Hex;

/**
 *
 * @author
 */
public class JColor {
    public static CssColor cssColor(java.awt.Color c){
        return new RGBA(c.getRed(),c.getGreen(),c.getBlue(),c.getAlpha());
    }
    public static java.awt.Color jColor(CssColor c){
        if(c instanceof RGB){
            RGB rgb = (RGB)c;
            return new java.awt.Color(rgb.r,rgb.g,rgb.b);
        }
        if(c instanceof RGBA){
            RGBA rgba = (RGBA)c;
            return new java.awt.Color(rgba.r,rgba.g,rgba.b,(int)(255*rgba.a));
        }
        if(c instanceof Hex){
            Hex hex = (Hex)c;
            return new java.awt.Color(hex.rgb); // there is every chance for this to be wrong
            // given that shorthand colors can be expressed in 3 of 4
        }
        throw new UnsupportedOperationException("Conversion for other colors not supported as of now.");
    }
}
