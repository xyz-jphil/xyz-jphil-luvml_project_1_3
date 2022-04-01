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
package luvs.l;

import luvml.BrowserSupport;
/**
 * Generated from
 * https://docs.google.com/spreadsheets/d/1dP5KYWbOHdbBYh7NZW53gFs_geJsFehvw-3sYvp9-OQ/edit#gid=0
 *
 * @author
 */
public enum LengthUnit {
    /**
     * Relative to the width of the "0" (zero)
     */
    ch("ch", new BrowserSupport(27, 9, 1, 20, 7)),
    /**
     * centimeters
     */
    cm("cm", new BrowserSupport(1, 3, 1, 3.5, 1)),
    /**
     * Relative to the font-size of the element (2em means 2 times the size of
     * the current font)
     */
    em("em", new BrowserSupport(1, 3, 1, 3.5, 1)),
    /**
     * Relative to the x-height of the current font (rarely used)
     */
    ex("ex", new BrowserSupport(1, 3, 1, 3.5, 1)),
    /**
     * inches (1in = 96px = 2.54cm)
     */
    in("in", new BrowserSupport(1, 3, 1, 3.5, 1)),
    /**
     * millimeters
     */
    mm("mm", new BrowserSupport(1, 3, 1, 3.5, 1)),
    /**
     * Relative to the parent element
     */
    p("%", new BrowserSupport(1, 3, 1, 3.5, 1)),
    /**
     * picas (1pc = 12 pt)
     */
    pc("pc", new BrowserSupport(1, 3, 1, 3.5, 1)),
    /**
     * points (1pt = 1/72 of 1in)
     */
    pt("pt", new BrowserSupport(1, 3, 1, 3.5, 1)),
    /**
     * pixels (1px = 1/96th of 1in)
     */
    px("px", new BrowserSupport(1, 3, 1, 3.5, 1)),
    /**
     * Relative to font-size of the root element
     */
    rem("rem", new BrowserSupport(4, 9, 3.6, 11.6, 4.1)),
    /**
     * Relative to 1% of the height of the viewport*
     */
    vh("vh", new BrowserSupport(20, 9, 19, 20, 6)),
    /**
     * Relative to 1% of viewport's* larger dimension
     */
    vmax("vmax", new BrowserSupport(26, 16, 19, 20, 7)),
    /**
     * Relative to 1% of viewport's* smaller dimension
     */
    vmin("vmin", new BrowserSupport(20, 12, 19, 20, 6)),
    /**
     * Relative to 1% of the width of the viewport*
     */
    vw("vw", new BrowserSupport(20, 9, 19, 20, 6)),
    /**
     * Unit less, usually used for pixels
     */
    __("", new BrowserSupport(0, 0, 0, 0, 0)),;

    private final String v;
    private final BrowserSupport browserSupport;

    private LengthUnit(String v, BrowserSupport browserSupport) {
        this.v = v;
        this.browserSupport = browserSupport;
    }

    public String unitName() {
        return v;
    }

}
