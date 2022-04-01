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
package luvs.p;

import java.util.ArrayList;
import luvml.o.Out_I;
import luvs.StyleSegmentType_E;
import luvs.v.ValueProvider_I;

/**
 *
 * @author
 */
public class PropertyWithValues implements PropertyWithValues_I {
    private final Property_I property;
    private final ArrayList<ValueProvider_I> parameters = new ArrayList<>();

    public PropertyWithValues(Property_I property) {
        this.property = property;
    }
    
    @Override
    public StyleSegmentType_E type() {
        return StyleSegmentType_E.PropertyWithValues;
    }

    public ArrayList<ValueProvider_I> parameters() {
        return parameters;
    }
    
    @Override
    public void writeTo(Out_I o) {
        property.writeTo(o);
        o.__(":");
        
        for (int i = 0; i < parameters.size(); i++) {
            ValueProvider_I p_i = parameters.get(i);
            p_i.writeTo(o);
            o.__(" ");
        }
        o.__(" ;").nL();
    }
    
}
