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
package luvml.dynamic;

import java.util.function.Function;
import luvml.Html5;

/**
 *
 * @author
 */
public final class ParameterizedHtml5 extends ParameterizedTemplate<Html5> {
    public ParameterizedHtml5(Function<ParameterizedTemplate, Html5> html_5_d) {
        super(html_5_d);
    }
    public static ParameterizedHtml5 parameterizedHtml5(Function<ParameterizedHtml5, Html5> html_5_d){
        return new ParameterizedHtml5((Function)html_5_d);
    }
}
