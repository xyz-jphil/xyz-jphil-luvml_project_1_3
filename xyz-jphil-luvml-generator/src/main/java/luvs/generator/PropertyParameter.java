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
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 *
 * @author
 */
public class PropertyParameter {
    public final Property property;
    public final String syntax;
    public final int index;
    
    private String name = null;
    private final boolean function;
    private final ArrayList<String> options = new ArrayList<>();

    /*public PropertyParameter(Property property, String syntax, int index) {
        this(property, syntax, index, false);
    }*/
    public PropertyParameter(Property property, String syntax, int index, boolean function) {
        this.property = property;
        this.syntax = syntax;
        this.index = index;
        this.function = function;
        
        ArrayList<String> t1 = new ArrayList<>();
        t1.addAll(List.of(syntax.split("\\|")));
        ArrayList<String> t2 = new ArrayList<>();
        for (String t1_i : t1) {
            t2.addAll(List.of(t1_i.split("\\s+\\/\\s+")));
        }
        ArrayList<String> t3 = new ArrayList<>();
        for (String t2_i : t2) {
            t3.addAll(List.of(t2_i.split("\\s+")));
        }
        ArrayList<String> t4 = new ArrayList<>();
        if(function){
            for (String t3_i : t3) {
                t4.addAll(List.of(t3_i.split("\\,")).stream().map(s->s.trim()).collect(Collectors.toList()));
            }
        }else {
            t4.addAll(t3);
        }
        ArrayList<String> t5 = new ArrayList<>();
        t5.addAll ( t4.stream().filter(s->{
            return !s.isBlank() && !s.contains("("); // remove blank and functions
        }).collect(Collectors.toList()) ); // remove blanks
        options.addAll(t5);
        if(!options.isEmpty()){
            if(options.get(0).startsWith(property.name+"-")){
                name = options.get(0);
            }
            if(function){
                name = options.get(0);
            }
        }else {
            System.out.println("not even one options for property "+property.getPageUrl());
            System.out.println("property-param "+"\tt1="+t1+" \tt2="+t2+"\tt3="+t3+"\tt4="+t4+"\tt5="+t5+"\t"+syntax+"\t"+property.singleLineDesc());
        }
    }

    public Optional<String> name() {
        if(name==null)return Optional.empty();
        return Optional.of(name);
    }

    public List<String> options() {
        return Collections.unmodifiableList(options);
    }    

    @Override
    public String toString() {
        return name+"<"+syntax+ ">";
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PropertyParameter other = (PropertyParameter) obj;
        if (this.index != other.index) {
            return false;
        }
        if (!Objects.equals(this.syntax, other.syntax)) {
            return false;
        }
        if (!Objects.equals(this.property, other.property)) {
            return false;
        }
        return true;
    }
    
    
    
}
