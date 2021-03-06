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
package luvml;

import luvml.HtmlSegmentType_E;
import luvml.HtmlSegment_I;
import luvml.e.E_Html;
import luvml.o.Out_I;

/**
 *
 * @author
 */
public final class DOCTYPE implements HtmlSegment_I {
    private E_Html h;
    public static DOCTYPE html5(){
        return new DOCTYPE();
    }
    
    public E_Html html(HtmlSegment_I ... segments){
        if(h!=null){
            throw new IllegalStateException("Already added children, now please use the returned html object or a child to put more elements");            
        }
        h = new E_Html();
        h.____(segments);
        return h;
    }
    
    @Override
    public HtmlSegmentType_E type() {
        return HtmlSegmentType_E.DocType;
    }

    @Override
    public void writeTo(Out_I o) {
        o.__("<!DOCTYPE html>").nL();
        if(h!=null){
            h.writeTo(o);
        }
    }
    
}
