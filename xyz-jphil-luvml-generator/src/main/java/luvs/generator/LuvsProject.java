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

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author
 */
public class LuvsProject {
    
    public static final Path javaSrc(){
        return path().resolve("src/main/java");
    }
    
    public static final Path packageSrc(){
        return javaSrc().resolve("luvs");
    }
    
    public static final Path values_path(){
        return packageSrc().resolve("v");
    }
    
    public static final Path properties_path(){
        return packageSrc().resolve("p");
    }
    
    public static final Path path() { 
        try {
            Path home = Paths.get(System.getProperty("user.home"));
            String luvs_loc = Files.readString(
                home.resolve(".jphil/xyz-jphil-luvml-generator/luvs_project_location"),
                StandardCharsets.UTF_8
            );
            return Paths.get(luvs_loc);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    
    
}
