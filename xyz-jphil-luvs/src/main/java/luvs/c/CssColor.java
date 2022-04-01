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

import luvs.StyleSegmentType_E;
import luvs.v.ValueProvider_I;

/**
 *
 * @author
 */
public abstract class CssColor implements CssColor_I {    
    public static RGB rgb(int r,int g,int b){
        return new RGB(r, g, b);
    }
    
    public static RGBA rgba(int r,int g,int b, double a){
        return new RGBA(r, g, b, a);
    }
    
    public static HSL hsl(int h,int s,int l){
        return new HSL(h, s, l);
    }
    
    public static HSLA hsla(int h,int s,int l, double a){
        return new HSLA(h, s, l, a);
    }
    
    public static Hex hex(String s){
        return new Hex(s);
    }
    
    @Override
    public StyleSegmentType_E type() {
        return StyleSegmentType_E.ValueProvider;
    }
    
}
