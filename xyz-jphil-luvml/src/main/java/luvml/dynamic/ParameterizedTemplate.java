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

import java.util.HashMap;
import java.util.function.Function;
import luvml.e.Node_I;

public class ParameterizedTemplate<N extends Node_I> {
    private final HashMap<String,Object> v = new HashMap<>();
    private final N html_5;

    public ParameterizedTemplate(Function<ParameterizedTemplate,N> html_5_d) {
        this.html_5 = html_5_d.apply(this);
    }
    
    public static <N extends Node_I> ParameterizedTemplate parameterizedTemplate(Function<ParameterizedTemplate,N> html_5_d){
        ParameterizedTemplate<N> dt = new ParameterizedTemplate<>(html_5_d);
        //dt.html_5 = html_5_d.apply(dt);
        return dt;
    }
    public <E,V> V valueOf(MappedObjectKey_I<E,V> key){
        try{
            E val = (E)v.get(key.keyName());
            if(val==null)
                return key.defaultValue();
            return key.mapValue().apply(val);
        }catch(Exception a){
            a.printStackTrace();
            return key.defaultValue();
        }
    }
    public <E> E getObject(ObjectKey_I<E,E> key){
        try{
            E val = (E)v.get(key.keyName());
            return val==null?key.defaultValue():val;
        }catch(Exception a){
            return key.defaultValue();
        }
    }
    protected Object get(String pKey,Object defaultValue){
        Object val = v.get(pKey);
        return val==null?defaultValue:val;
    }
    protected String getString(String pKey,String defaultValue){
        try{return (String)get(pKey,defaultValue);}
        catch(Exception a){}
        return defaultValue;
    }
    protected int getInteger(String pKey,int defaultValue){
        try{return (Integer)get(pKey,defaultValue);}
        catch(Exception a){}
        return defaultValue;
    }
    protected long getLong(String pKey,long defaultValue){
        try{return (Long)get(pKey,defaultValue);}
        catch(Exception a){}
        return defaultValue;
    }
    protected boolean getBoolean(String pKey,boolean defaultValue){
        try{return (Boolean)get(pKey,defaultValue);}
        catch(Exception a){}
        return defaultValue;
    }
    public <V> void set(KeyValue_I<V> keyValue){
        v.put(keyValue.key().keyName(), keyValue.value());
    }
    public void set(String pKey, Object value){
        v.put(pKey, value);
    }
    public void setString(String pKey, String value){
        set(pKey, value);
    }
    public void setNumber(String pKey, long value){
        set(pKey, value);
    }
    public void setBoolean(String pKey, boolean value){
        set(pKey, value);
    }
    public void clear(String pKey){
        v.remove(pKey);
    }
    public N get(){return html_5;}
}
