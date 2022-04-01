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
import luvml.o.Out_I;
import luvs.ClassNameProvider;
/**
 *
 * @author
 */
public class SelectorPhrase implements SelectorPhrase_I {
    private final ArrayList<SelectorPhrasePart_I> parts
            = new ArrayList<>();

    public static SelectorPhrase select(SelectorPhrasePart_I ... parts){
        SelectorPhrase selectorPhrase = new SelectorPhrase();
        for (SelectorPhrasePart_I part : parts)
            selectorPhrase.parts.add(part);
        return selectorPhrase;
    }
    
    @Override
    public void writeTo(Out_I o) {
        for (int i = 0; i < parts.size(); i++) {
            SelectorPhrasePart_I phrasePart_i = parts.get(i);
            if(phrasePart_i instanceof SelectorPhrase){
                SelectorPhrasePart spp = (SelectorPhrasePart)phrasePart_i;
                o.__(spp.patternPrefix).__(spp.phrasePart);
            }else if(phrasePart_i instanceof ClassNameProvider){
                ClassNameProvider cnp = (ClassNameProvider)phrasePart_i;
                o.__(".").__(cnp.className());
            }else {
                throw new IllegalStateException("Don't know how to handle "+phrasePart_i);
            }
            
        }
        
    }
    
}
