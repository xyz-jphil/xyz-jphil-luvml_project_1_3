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

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 *
 * @author
 */
public class Constant {
    public final String name;
    private final ArrayList<Property> srcs = new ArrayList<>();
    private String type = "luvs.v.V";

    public Constant(String name) {
        this.name = name;
    }
    
    public void addSource(Property p){
        if(! srcs.stream().anyMatch(__->__.name.equals(p.name)) ){
            srcs.add(p);
        }
    }
    
    public String javadoc(){
        if(srcs.isEmpty())return "";
        String res = "";
        if(srcs.size()>1)res = res +"<br>\nUsed in the following properties as : <ul>";
        for (int i = 0; i < srcs.size(); i++) {
            Property p_i = srcs.get(i);
            if(srcs.size()==1)return p_i.javadoc();
            if(srcs.size()>1) res = res +"<li><strong>"+p_i.name+ "</strong> : "+p_i.javadoc()+"</li>";
        }
        if(srcs.size()>1) res = res + "</ul>";
        return res;
    }
    
    public void setType(String type){
        this.type = type;
    }

    @Override
    public String toString() {
        String s = name+"\t";        
        s+=srcs.size()+ "\t{";
        s+=srcs.stream().map(p->p.funcName()).collect(Collectors.joining(","));
        s+="}\t"+type;
        return s; //To change body of generated methods, choose Tools | Templates.
    }

    
}
