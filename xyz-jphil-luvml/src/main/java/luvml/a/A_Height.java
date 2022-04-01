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
package luvml.a;

import luvml.NumberVal;

/**
 *
 * @author
 */
public class A_Height extends Attribute_m {
    public static final AttributeDefinition_O DEFINITION = AttributeDefinition_O.named("height");
    public A_Height() {
        super(DEFINITION);
    }
    
    public A_Height(String v) {
        super(DEFINITION,v);
    }
    
    public static A_Height height(String v){
        return new A_Height(v);
    }
    
    public static A_Height height_px(double v){
        return new A_Height(NumberVal.numval(v));
    }
}
