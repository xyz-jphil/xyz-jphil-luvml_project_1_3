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
import luvml.o.Out_I;
import luvs.f.Function_I;

/**
 *
 * @author
 */
public class HSLA extends CssColor implements Function_I{
    public final int h,s,l;
    public final double a;

    public HSLA(int h, int s, int l, double a) {
        this.h = h;
        this.s = s;
        this.l = l;
        this.a = a;
        assert h >= 0 && h <= 360;
        assert s >= 0 && s <= 100;
        assert l >= 0 && l <= 100;
        assert a >= 0 && a <= 1;
    }

    @Override
    public void writeTo(Out_I o) {
        o.__("hsla(")._i(h).__(",")._i(s).__(",")._i(l).__(",")._d(a).__(")");
    }
    
    @Override
    public String value() {
        return "hsla("+h+","+s+"%,"+l+"%,"+a+")";
    }

    @Override
    public String funcName() {
        return "hsla";
    }

    @Override
    public List<String> funcParamValues() {
        return List.of(String.valueOf(h),String.valueOf(s),String.valueOf(l));
    }
}
