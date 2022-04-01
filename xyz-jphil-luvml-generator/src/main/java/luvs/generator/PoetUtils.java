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
package luvs.generator;

import com.squareup.javapoet.FieldSpec;
import com.squareup.javapoet.MethodSpec;
import static javax.lang.model.element.Modifier.*;


/**
 *
 * @author
 */
public class PoetUtils {
    public static MethodSpec createConstructor(FieldSpec ... fields){
        MethodSpec.Builder constructor = MethodSpec.constructorBuilder();
        for (int i = 0; i < fields.length; i++) {
            FieldSpec field = fields[i];
            constructor.addParameter(field.type, field.name);
            constructor.addStatement("this."+field.name+" = "+field.name);
        }
        return constructor.build();
    }
    
    public static MethodSpec[]getters(FieldSpec ... fields){
        MethodSpec[]getters = new MethodSpec[fields.length];
        for (int i = 0; i < fields.length; i++) {
            FieldSpec field = fields[i];
            MethodSpec.Builder getter = MethodSpec.methodBuilder(Names.fieldToGetterName(field));
            getter
            .returns(field.type)
            .addModifiers(FINAL,PUBLIC)
            .addAnnotation(Override.class)
            .addStatement("return "+field.name);
            getters[i] = getter.build();
        }
        
        return getters;
    }
    
    
    
}
