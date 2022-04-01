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
package luvs.selector;

import java.util.ArrayList;
import java.util.List;
import luvml.o.Out_I;
import luvs.StyleSegmentType_E;

/**
 *
 * @author
 */
public class Selector implements Selector_I{
    private final ArrayList<SelectorPhrase_I> selectorPhrases = new ArrayList<>();
    
    private Selector(){
        
    }
    
    public static final Selector select(SelectorPhrase_I ... phrases){
        Selector s = new Selector();
        for (int i = 0; i < phrases.length; i++) {
            s.selectorPhrases.add(phrases[i]);
        }
        return s;
    }
    
    @Override
    public StyleSegmentType_E type() {
        return StyleSegmentType_E.Selector;
    }

    @Override
    public void writeTo(Out_I o) {
        for (int i = 0; i < selectorPhrases.size(); i++) {
            SelectorPhrase_I selectorPhrase = selectorPhrases.get(i);
            if(i>0){
                o.__(",");//.nL();
            }
            selectorPhrase.writeTo(o);
        }
    }
    
}
