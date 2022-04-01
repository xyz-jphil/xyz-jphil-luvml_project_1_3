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

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author
 */
public class CssSelectors {
    public static Element after(String query, String content, Element inside, String tag_type){
        Elements h2s = inside.select(query);
        for (int i = 0; i < h2s.size(); i++) {
            Element h2_i = h2s.get(i);
            if(h2_i.text().equals(content)){
                Element nxt = h2_i;
                do{
                    if(nxt.tagName().equals(tag_type))
                        return nxt;
                }while((nxt = nxt.nextElementSibling())!=null);
            }
        }
        return null;
    }
}
