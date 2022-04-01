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
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;
import java.util.HashSet;
import static javax.lang.model.element.Modifier.*;
import luvs.TagNameProvider;
import luvs.selector.ElementSelectorPhrase;
import org.apache.http.client.fluent.Request;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author
 */
public class ReadTags {

    private static final String rootUrl = "https://www.w3schools.com/tags/";

    private final HashSet<Tag> tags = new HashSet<>();

    public void readIndex() throws Exception {
        Document d = Jsoup.parse(
                Request.Get(rootUrl)
                        .execute().returnContent().asString()
        );
        Element htmltags = d.select("#htmltags").first();
        Elements rows = htmltags.select("tr");
        for (int i = 1; i < rows.size(); i++) {
            Element row = rows.get(i);
            Element tag_e = row.children().get(0);
            Element dsc_e = row.children().get(1);
            String tagName = tag_e.text();
            tagName = tagName.replace("<", "").replace(">", "").trim();
            if (tagName.contains("!")) {
                continue; // skip
            }
            String relUrl = tag_e.select("a").attr("href");
            String url = rootUrl + relUrl;
            Tag tag = new Tag(tagName, dsc_e.text(), url);
            tags.add(tag);

            try {
                tag.readFromPage();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void createTagsSourceCode() {
        FieldSpec tag_field = FieldSpec.builder(
                    String.class,
                    "tag", 
                    PUBLIC, FINAL)
                .build();
        
        MethodSpec constructor = MethodSpec.constructorBuilder()
                .addParameter(String.class, "tag")
                .addStatement("this.tag = tag")
                .build();
        
        MethodSpec tagName_method = MethodSpec.methodBuilder("tagName")
                .addModifiers(PUBLIC,FINAL)
                .returns(String.class)
                .addAnnotation(Override.class)
                .addStatement("return tag")
                .build();
    

        TypeSpec.Builder ElementSelectorPhrase_class = TypeSpec.enumBuilder(
                        ElementSelectorPhrase.class.getSimpleName()
                    )
                .addModifiers(PUBLIC)
                .addSuperinterface(TagNameProvider.class)
                .addField(tag_field)
                .addMethod(constructor)
                .addMethod(tagName_method)
        ;
        
        for (Tag tag : tags) {
            if("H1 to H6".equalsIgnoreCase(tag.tag)){
                handle_h1_to_h6(ElementSelectorPhrase_class,tag);
            }else {
                ElementSelectorPhrase_class.addEnumConstant(
                    tag.asJavaConst(),
                    TypeSpec
                        .anonymousClassBuilder("$S", tag.tag)   
                        .addJavadoc(tag.javadoc())
                        .build()
                );
            }
        }
                
        JavaFile javaFile = JavaFile.builder(
                    ElementSelectorPhrase.class.getPackageName(),
                    ElementSelectorPhrase_class.build())
                .build();
        
        try {
            javaFile.writeTo(LuvsProject.javaSrc());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    public void handle_h1_to_h6(TypeSpec.Builder ElementSelectorPhrase_class, Tag tag){
        for (int i = 1; i <= 6; i++) {
            ElementSelectorPhrase_class.addEnumConstant(
                "H"+i,
                TypeSpec
                    .anonymousClassBuilder("$S", "h"+i)
                    .addJavadoc(tag.javadoc())
                    .build()
            );
        }
        String sw_st = "switch(i){\n";
        for (int i = 1; i <= 6; i++) {
            sw_st += "case "+i+ ":"+" return H"+i+";\n";
        }
        sw_st += "}";
        ElementSelectorPhrase_class.addMethod(
            MethodSpec.methodBuilder("h")
            .addModifiers(PUBLIC,STATIC,FINAL)
            .addParameter(int.class, "i")
            .returns(ElementSelectorPhrase.class)
            .addStatement("assert i<7 && i > 0")
            .addStatement(sw_st)
            .addStatement("return null")
            .addJavadoc(tag.javadoc())
            .build()
        );
    }

    public static void main(String[] args) throws Exception {
        ReadTags readTags = new ReadTags();
        readTags.readIndex();
        readTags.createTagsSourceCode();
    }
}
