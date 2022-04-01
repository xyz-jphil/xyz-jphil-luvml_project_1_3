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
package luvml.e;

import luvml.HtmlSegmentType_E;
import luvml.___F;
import luvml.o.Out_I;

/**
 * TO DELETE
 * @author
 */
public class Node_F implements Node_I{
    private final ___F src;

    public Node_F(___F src) {
        this.src = src;
    }
    
    public static Node_F __(___F src){
        return new Node_F(src);
    }
    
    @Override public HtmlSegmentType_E type() {
        return HtmlSegmentType_E.NodeFragment;
    }

    @Override public void writeTo(Out_I o) {
        src.writeTo(o);
    }
    
}
