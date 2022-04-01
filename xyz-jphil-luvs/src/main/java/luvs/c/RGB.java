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
package luvs.c;

import java.util.List;
import jsweet.util.StringTypes.s;
import luvml.o.Out_I;
import luvs.f.Function_I;
import static luvs.selector.ElementSelectorPhrase.h;

/**
 *
 * @author
 */
public class RGB extends CssColor implements Function_I{
    public final int r,g,b;

    public RGB(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
        assert r >= 0 && r <= 255;
        assert g >= 0 && g <= 255;
        assert b >= 0 && b <= 255;
    }

    @Override
    public void writeTo(Out_I o) {
        o.__("rgb(")._i(r).__(",")._i(g).__(",")._i(b).__(")");
    }
    
    @Override
    public String value() {
        return "rgb("+r+","+g+","+b+")";
    }

    @Override
    public String funcName() {
        return "hsl";
    }

    @Override
    public List<String> funcParamValues() {
        return List.of(String.valueOf(r),String.valueOf(g),String.valueOf(b));
    }
    
}
