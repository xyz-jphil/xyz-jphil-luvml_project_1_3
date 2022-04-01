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
package luvs.f;

import java.util.ArrayList;
import java.util.List;
import luvml.___F;
import luvml.o.Out_I;
import luvml.o.Parameters;
import luvs.StyleSegmentType_E;
import luvs.v.ValueProvider_I;

/**
 *
 * @author
 */
public final class Function implements Function_I {
    private final String name;
    private final ArrayList<String> params = new ArrayList<>();

    public Function(String name) {
        this.name = name;
    }
    
    /**
     * M stands for Make - This makes a Function as per 
     * parameters given.
     * @param name CSS Function name
     * @param params Parameters, the toString values are used.
     * @return 
     */
    public static Function M(String name, Object ... params){
        Function f = new Function(name);
        for (int i = 0; i < params.length; i++) {
            f.addParam(params[i]);
        }
        return f;
    }
    
    @Override
    public StyleSegmentType_E type() {
        return StyleSegmentType_E.ValueProvider;
    }
    
    public Function addAllParams(List<String> paramsValues){
        params.addAll(paramsValues);
        return this;
    }
    
    public Function addParam(Object paramsValue){
        if(paramsValue instanceof ValueProvider_I){
            paramsValue = ((ValueProvider_I) paramsValue).value();
        }else if(paramsValue instanceof ___F){
            throw new UnsupportedOperationException("Currently not supported");
        }
        params.add(String.valueOf(paramsValue));
        return this;
    }
    
    public Function addParams(String ... paramsValues){
        params.addAll(List.of(paramsValues));
        return this;
    }

    @Override
    public void writeTo(Out_I o) {
        o.__(name)._c('(');
        for (int i = 0; i < params.size(); i++) {
            if(i>0)     o._c(',');
            String param_i = params.get(i);
            o.__(param_i);
        }
        o._c(')');
        return ;
    }

    @Override
    public String funcName() {
        return name;
    }

    @Override
    public String value() {
        String s  = name+"(";
        for (int i = 0; i < params.size(); i++) {
            if(i>0)     s = s + ',';
            String param_i = params.get(i);
            s = s + param_i;
        }
        s = s+")";
        return s;
    }

    @Override
    public List<String> funcParamValues() {
        return params;
    }
    
}
