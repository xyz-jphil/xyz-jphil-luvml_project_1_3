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

import luvml.BrowserSupport;
import org.apache.http.client.fluent.Request;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

/**
 *
 * @author
 */
public class Tag {
    public final String tag;
    public final String description;
    public final String pageUrl;

    private BrowserSupport browserSupport = BrowserSupport.unknownBrowserSupport();
    private String example = null;
    
    public Tag(String tag, String description, String pageUrl) {
        this.tag = tag;
        this.description = description;
        this.pageUrl = pageUrl;
    }
    
    public void readFromPage()throws Exception{
        System.out.println("pa="+pageUrl);
        Document d = Jsoup.parse(
            Request.Get(pageUrl)
                .execute().returnContent().asString()
        );
        Element main_element = d.selectFirst("#main");
        browserSupport = PageParsers.browserSupport(main_element);
        example = PageParsers.parseExample(d.select(".w3-example").first());
    }
    
    public String javadoc(){
        return JavaDocUtils.javadoc(description, browserSupport, example, pageUrl);
    }
    
    public String asJavaConst(){
        return tag.toUpperCase();
    }
    
}
