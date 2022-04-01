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
package luvg.a;

import luvml.a.AttributeDefinition_O;
import luvml.a.Attribute_m;

/**
 *
 * @author
 */
public class A_Cy extends Attribute_m{
    public static final AttributeDefinition_O
            DEFINITION = AttributeDefinition_O.named("cy");
    public A_Cy() {
        super(DEFINITION);
    }
    public static A_Cy __(double y){
        A_Cy v = new A_Cy();
        v.setValue(String.valueOf(y));
        return v;
    }
    public static A_Cy cy(String y){
        A_Cy v = new A_Cy();
        v.setValue(y);
        return v;
    }
    public static A_Cy cy_px(double y){
        return cy(String.valueOf(y));
    }
}
