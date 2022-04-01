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
package luvml;

/**
 *
 * @author
 */
public final class BrowserSupport {
    public final double 
            edge,
            firefox,
            chrome,
            safari,
            opera;
    
    public static final double UNKNOWN = -1D;
    public static final double NOT_SUPPORTED = -2D;

    public BrowserSupport(double chrome, double edge, double firefox, double opera, double safari) {
        this.edge = edge;
        this.firefox = firefox;
        this.chrome = chrome;
        this.safari = safari;
        this.opera = opera;
    }
    
    public static BrowserSupport browser_support(double chrome, double edge, double firefox, double opera, double safari) {
        return new BrowserSupport(chrome, edge, firefox, opera, safari);
    }
    
    public static BrowserSupport unknownBrowserSupport(){
        return new BrowserSupport(UNKNOWN, UNKNOWN, UNKNOWN, UNKNOWN, UNKNOWN);
    }
    
    public String javadoc(){
        return "<ul>\n<li>IE/Edge: "+__(edge)+"</li>\n<li>Firefox: "+__(firefox)
                +"</li>\n<li>Chrome: "+__(chrome)+"</li>\n<li>Safari: "+__(safari)
                +"</li>\n<li>Opera: "+__(opera)+"</li>\n</ul>";
    }
    
    private static String __(double v){
        if(v==UNKNOWN) return "Unknown";
        if(v==NOT_SUPPORTED) return "Not supported";
        
        if(v==0) return "Yes";
        return String.valueOf(v);
    }
    
}
