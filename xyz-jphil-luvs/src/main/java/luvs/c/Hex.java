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
package luvs.c;

import luvml.o.Out_I;

/**
 *
 * @author
 */
public class Hex extends CssColor {
    public final String hex;
    public final int rgb;

    public Hex(String hex) {
        if(hex.startsWith("#")) this.hex = hex.substring(1);
        else this.hex = hex;
        rgb = Integer.parseInt(hex, 16);
    }
    
    public Hex(int rgb) {
        this.hex = Integer.toHexString(rgb);
        this.rgb = rgb;
    }
    
    @Override
    public void writeTo(Out_I o) {
        o.__("#").__(hex);
    }

    @Override
    public String value() {
        return "#"+hex;
    }
    
    
    
}
