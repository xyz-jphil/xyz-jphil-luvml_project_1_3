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
package luvs.v;

import luvml.o.Out_I;
import luvs.StyleSegmentType_E;

/**
 *
 * @author
 */
public class StringConstant implements ValueProvider_I {
    private final String value;

    public StringConstant(String value) {
        this.value = value;
    }
    
    public static StringConstant M(String value){
        return new StringConstant(value);
    }
    
    @Override
    public Object value() {
        return value;
    }

    @Override
    public StyleSegmentType_E type() {
        return StyleSegmentType_E.ValueProvider;
    }

    @Override
    public void writeTo(Out_I o) {
        o.__(value);
    }
    
}
