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

import luvml.NumberVal;
import luvml.a.AttributeDefinition_O;
import luvml.a.Attribute_m;

/**
 *
 * @author
 */
public class A_ViewBox extends Attribute_m{
    public static final AttributeDefinition_O
            DEFINITION = AttributeDefinition_O.named("viewBox");
    public A_ViewBox() {
        super(DEFINITION);
    }
    public static A_ViewBox __(int w,int h){
        A_ViewBox v = new A_ViewBox();
        v.setValue("0 0 "+w+" "+h);
        return v;
    }
    public static A_ViewBox viewBox(double x1, double y1, double x2, double y2){
        A_ViewBox v = new A_ViewBox();
        v.setValue(
            NumberVal.numval(x1)+" "+
            NumberVal.numval(y1)+" "+
            NumberVal.numval(x2)+" "+
            NumberVal.numval(y2)
        );        
        return v;
    }
}
