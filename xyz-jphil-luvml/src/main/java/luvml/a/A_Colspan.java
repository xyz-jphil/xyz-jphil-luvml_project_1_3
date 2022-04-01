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
public class A_Colspan extends Attribute_m {
    public static final AttributeDefinition_O DEFINITION = AttributeDefinition_O.named("colspan");
    public A_Colspan() {
        super(DEFINITION);
    }
    
    public A_Colspan(String v) {
        super(DEFINITION,v);
    }
    
    public static A_Colspan colspan(String v){
        return new A_Colspan(v);
    }
    
    public static A_Colspan colspan(int v){
        return new A_Colspan(NumberVal.numval(v));
    }
}
