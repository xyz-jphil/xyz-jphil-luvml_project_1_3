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
public class A_X extends Attribute_m{
    public static final AttributeDefinition_O
            DEFINITION = AttributeDefinition_O.named("x");
    public A_X() {
        super(DEFINITION);
    }
    public static A_X __(double r){
        A_X v = new A_X();
        v.setValue(String.valueOf(r));
        return v;
    }
    public static A_X x(String x){
        A_X v = new A_X();
        v.setValue(x);
        return v;
    }
    public static A_X x_px(double x){
        return x(String.valueOf(x));
    }
}
