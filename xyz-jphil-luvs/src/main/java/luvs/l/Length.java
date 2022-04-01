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

import luvml.o.Out_I;
import luvs.StyleSegmentType_E;

/**
 *
 * @author
 */
public final class Length implements Length_I {

    private final double value;
    private final LengthUnit unit;

    public Length(double value, LengthUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    /**
     * Relative to the width of the "0" (zero). Browser support : Chrome:27,
     * Edge/IE:9, Firefox:1, Opera:20, Safari:7.
     */
    public static final Length ch(double v) {
        return new Length(v, LengthUnit.ch);
    }

    /**
     * centimeters. Browser support : Chrome:1, Edge/IE:3, Firefox:1, Opera:3.5,
     * Safari:1.
     */
    public static final Length cm(double v) {
        return new Length(v, LengthUnit.cm);
    }

    /**
     * Relative to the font-size of the element (2em means 2 times the size of
     * the current font). Browser support : Chrome:1, Edge/IE:3, Firefox:1,
     * Opera:3.5, Safari:1.
     */
    public static final Length em(double v) {
        return new Length(v, LengthUnit.em);
    }

    /**
     * Relative to the x-height of the current font (rarely used) Browser
     * support : Chrome:1, Edge/IE:3, Firefox:1, Opera:3.5, Safari:1.
     */
    public static final Length ex(double v) {
        return new Length(v, LengthUnit.ex);
    }

    /**
     * inches (1in = 96px = 2.54cm). Browser support : Chrome:1, Edge/IE:3,
     * Firefox:1, Opera:3.5, Safari:1.
     */
    public static final Length in(double v) {
        return new Length(v, LengthUnit.in);
    }

    /**
     * millimeters. Browser support : Chrome:1, Edge/IE:3, Firefox:1, Opera:3.5,
     * Safari:1.
     */
    public static final Length mm(double v) {
        return new Length(v, LengthUnit.mm);
    }

    /**
     * Percentage units, relative to the parent element. Browser support : Chrome:1, Edge/IE:3,
     * Firefox:1, Opera:3.5, Safari:1.
     */
    public static final Length p(double v) {
        return new Length(v, LengthUnit.p);
    }

    /**
     * picas (1pc = 12 pt). Browser support : Chrome:1, Edge/IE:3, Firefox:1,
     * Opera:3.5, Safari:1.
     */
    public static final Length pc(double v) {
        return new Length(v, LengthUnit.pc);
    }

    /**
     * points (1pt = 1/72 of 1in). Browser support : Chrome:1, Edge/IE:3,
     * Firefox:1, Opera:3.5, Safari:1.
     */
    public static final Length pt(double v) {
        return new Length(v, LengthUnit.pt);
    }

    /**
     * pixels (1px = 1/96th of 1in). Browser support : Chrome:1, Edge/IE:3,
     * Firefox:1, Opera:3.5, Safari:1.
     */
    public static final Length px(double v) {
        return new Length(v, LengthUnit.px);
    }

    /**
     * Relative to font-size of the root element. Browser support : Chrome:4,
     * Edge/IE:9, Firefox:3.6, Opera:11.6, Safari:4.1.
     */
    public static final Length rem(double v) {
        return new Length(v, LengthUnit.rem);
    }

    /**
     * Relative to 1% of the height of the viewport*. Browser support :
     * Chrome:20, Edge/IE:9, Firefox:19, Opera:20, Safari:6.
     */
    public static final Length vh(double v) {
        return new Length(v, LengthUnit.vh);
    }

    /**
     * Relative to 1% of viewport's* larger dimension. Browser support :
     * Chrome:26, Edge/IE:16, Firefox:19, Opera:20, Safari:7.
     */
    public static final Length vmax(double v) {
        return new Length(v, LengthUnit.vmax);
    }

    /**
     * Relative to 1% of viewport's* smaller dimension. Browser support :
     * Chrome:20, Edge/IE:12, Firefox:19, Opera:20, Safari:6.
     */
    public static final Length vmin(double v) {
        return new Length(v, LengthUnit.vmin);
    }

    /**
     * Relative to 1% of the width of the viewport*. Browser support : Chrome:20,
     * Edge/IE:9, Firefox:19, Opera:20, Safari:6.
     */
    public static final Length vw(double v) {
        return new Length(v, LengthUnit.vw);
    }

    public Length add(double v){
        return new Length(value+v, unit);
    }
    
    public Length subtract(double v){
        return new Length(value-v, unit);
    }
    
    public Length divide(double v){
        return new Length(value/v, unit);
    }
    
    public Length multiply(double v){
        return new Length(value*v, unit);
    }
    
    /**
     * Unit less, usually used as short-hand for pixels. Browser support : All
     */
    public static final Length __(double v) {
        return new Length(v, LengthUnit.__);
    }

    @Override
    public Double value() {
        return value;
    }

    @Override
    public LengthUnit unit() {
        return unit;
    }

    @Override
    public StyleSegmentType_E type() {
        return StyleSegmentType_E.ValueProvider;
    }

    @Override
    public void writeTo(Out_I o) {
        //https://stackoverflow.com/a/9898528/2448015
        if ((value == Math.floor(value)) && !Double.isInfinite(value)) {
            o._i((int) value);
        } else {
            o._d(value);
        }
        o.__(unit.unitName());
    }

}
