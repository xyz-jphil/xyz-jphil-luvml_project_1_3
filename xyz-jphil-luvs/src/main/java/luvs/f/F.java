package luvs.f;

import static luvs.f.Function.M;

import java.lang.Object;

public class F {
  /**
   * Returns the value of an attribute of the selected element
   * <br><br>
   * The attr() function returns the value of an attribute of the selected elements.<br>
   *
   * <br><p>The following example inserts the value of the href attribute in parenthesis after each link:</p> 
   * <pre>
   * a:after {<br>&nbsp;&nbsp;content: " (" attr(href) ")";<br>}   
   * </pre>  
   * <br><br>
   *  From : <a href="https://www.w3schools.com/cssref/func_attr.asp">https://www.w3schools.com/cssref/func_attr.asp</a>
   */
  public static final Function attr(Object attribute_name) {
    return M("attr",attribute_name);
  }

  /**
   * Allows you to perform calculations to determine CSS property values
   * <br><br>
   * The calc() function performs a calculation to be used as the property value.<br>
   *
   * <br><p>Use calc() to calculate the width of a &lt;div&gt; element:</p> 
   * <pre>
   *  #div1 {<br>&nbsp; position: absolute;<br>&nbsp; left: 50px;<br>&nbsp; width: calc(100% - 100px);<br>
   *   &nbsp; border: 1px solid black;<br>&nbsp; background-color: yellow;<br>&nbsp; padding: 5px;<br>
   *   &nbsp; text-align: center;<br>}   
   * </pre>  
   * <br><br>
   *  From : <a href="https://www.w3schools.com/cssref/func_calc.asp">https://www.w3schools.com/cssref/func_calc.asp</a>
   */
  public static final Function calc(Object expression) {
    return M("calc",expression);
  }

  /**
   * Defines a Cubic Bezier curve
   * <br><br>
   * The cubic-bezier() function defines a Cubic Bezier curve.<br>
   * A Cubic Bezier curve is defined by four points P0, P1, P2, and P3. P0 and P3 are the start and the end of the curve and, in CSS these points are fixed as the coordinates are ratios. P0 is (0, 0) and represents the initial time and the initial state, P3 is (1, 1) and represents the final time and the final state.<br>
   * The cubic-bezier() function can be used with the animation-timing-function property and the transition-timing-function property.<br>
   *
   * <br><p>A transition effect with variable speed from start to end:</p> 
   * <pre>
   *  div {<br>&nbsp; width: 100px;<br>&nbsp; height: 100px;<br>&nbsp; background: red;<br>
   *   &nbsp;
   *  transition: width 2s;<br>&nbsp; transition-timing-function: cubic-bezier(0.1, 0.7, 1.0, 0.1);<br>
   *  }   
   * </pre>  
   * <br><br>
   *  From : <a href="https://www.w3schools.com/cssref/func_cubic-bezier.asp">https://www.w3schools.com/cssref/func_cubic-bezier.asp</a>
   */
  public static final Function cubic_bezier(Object x1, Object y1, Object x2, Object y2) {
    return M("cubic-bezier",x1,y1,x2,y2);
  }

  /**
   * Defines colors using the Hue-Saturation-Lightness model (HSL)
   * <br><br>
   * The hsl() function define colors using the Hue-saturation-lightness model (HSL).<br>
   * HSL stands for hue, saturation, and lightness - and represents a cylindrical-coordinate representation of colors.<br>
   *
   * <br><p>Define different HSL colors:</p> 
   * <pre>
   *  #p1 {background-color:hsl(120,100%,50%);} // green 
   * <br>#p2 {background-color:hsl(120,100%,75%);} // light green 
   * <br>#p3 {background-color:hsl(120,100%,25%);} // dark green 
   * <br>#p4 {background-color:hsl(120,60%,70%);} // pastel green 
   *    
   * </pre>  
   * <br><br>
   *  From : <a href="https://www.w3schools.com/cssref/func_hsl.asp">https://www.w3schools.com/cssref/func_hsl.asp</a>
   */
  public static final Function hsl(Object hue, Object saturation, Object lightness) {
    return M("hsl",hue,saturation,lightness);
  }

  /**
   * Defines colors using the Hue-Saturation-Lightness-Alpha model (HSLA)
   * <br><br>
   * The hsla() function define colors using the Hue-saturation-lightness-alpha model (HSLA).<br>
   * HSLA color values are an extension of HSL color values with an alpha channel - which specifies the opacity of the color.<br>
   *
   * <br><p>Define different HSL colors with opacity:</p> 
   * <pre>
   *  #p1 {background-color:hsla(120,100%,50%,0.3);} // green 
   * <br>#p2 {background-color:hsla(120,100%,75%,0.3);} // light green 
   * <br>#p3 {background-color:hsla(120,100%,25%,0.3);} // dark green 
   * <br>#p4 {background-color:hsla(120,60%,70%,0.3);} // pastel green 
   *    
   * </pre>  
   * <br><br>
   *  From : <a href="https://www.w3schools.com/cssref/func_hsla.asp">https://www.w3schools.com/cssref/func_hsla.asp</a>
   */
  public static final Function hsla(Object hue, Object saturation, Object lightness, Object alpha) {
    return M("hsla",hue,saturation,lightness,alpha);
  }

  /**
   * Sets a linear gradient as the background image. Define at least two colors (top to bottom)
   * <br><br>
   * The linear-gradient() function sets a linear gradient as the background image.<br>
   * To create a linear gradient you must define at least two color stops. Color stops are the colors you want to render smooth transitions among. You can also set a starting point and a direction (or an angle) along with the gradient effect.<br>
   * Example of Linear Gradient:<br>
   *
   * <br><p>This linear gradient starts at the top. It starts red, transitioning to yellow, then to blue:</p> 
   * <pre>
   * #grad {<br>
   * &nbsp; background-image: linear-gradient(red, yellow, blue);<br>
   * }   
   * </pre>  
   * <br><br>
   *  From : <a href="https://www.w3schools.com/cssref/func_linear-gradient.asp">https://www.w3schools.com/cssref/func_linear-gradient.asp</a>
   */
  public static final Function linear_gradient(Object direction, Object color_stop1,
      Object color_stop2, Object p_) {
    return M("linear-gradient",direction,color_stop1,color_stop2,p_);
  }

  /**
   * Sets a radial gradient as the background image. Define at least two colors (center to edges)
   * <br><br>
   * The radial-gradient() function sets a radial gradient as the background image.<br>
   * A radial gradient is defined by its center.<br>
   * To create a radial gradient you must define at least two color stops.<br>
   * Example of Radial Gradient:<br>
   *
   * <br><p>A radial gradient with evenly spaced color stops:</p> 
   * <pre>
   *     #grad {<br>&nbsp; background-image: radial-gradient(red, green, blue);<br>} </pre>  
   * <br><br>
   *  From : <a href="https://www.w3schools.com/cssref/func_radial-gradient.asp">https://www.w3schools.com/cssref/func_radial-gradient.asp</a>
   */
  public static final Function radial_gradient(Object shape, Object start_color, Object p_,
      Object last_color) {
    return M("radial-gradient",shape,start_color,p_,last_color);
  }

  /**
   * Repeats a linear gradient
   * <br><br>
   * The repeating-linear-gradient() function is used to repeat linear gradients.<br>
   *
   * <br><p>A repeating linear gradient:</p> 
   * <pre>
   *     #grad {<br>&nbsp;&nbsp;background-image: repeating-linear-gradient(red, yellow 10%, green 20%);<br>} </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/func_repeating-linear-gradient.asp">https://www.w3schools.com/cssref/func_repeating-linear-gradient.asp</a>
   */
  public static final Function repeating_linear_gradient(Object angle, Object color_stop1,
      Object color_stop2, Object p_) {
    return M("repeating-linear-gradient",angle,color_stop1,color_stop2,p_);
  }

  /**
   * Repeats a radial gradient
   * <br><br>
   * The repeating-radial-gradient() function is used to repeat radial gradients.<br>
   *
   * <br><p>A repeating radial gradient:</p> 
   * <pre>
   *     #grad {<br>&nbsp;&nbsp;background-image: repeating-radial-gradient(red, yellow 10%, green 15%);<br>} </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/func_repeating-radial-gradient.asp">https://www.w3schools.com/cssref/func_repeating-radial-gradient.asp</a>
   */
  public static final Function repeating_radial_gradient(Object shape, Object start_color,
      Object p_, Object last_color) {
    return M("repeating-radial-gradient",shape,start_color,p_,last_color);
  }

  /**
   * Defines colors using the Red-Green-Blue model (RGB)
   * <br><br>
   * The rgb() function define colors using the Red-green-blue (RGB) model.<br>
   * An RGB color value is specified with: rgb(red, green, blue). Each parameter defines the intensity of that color and can be an integer between 0 and 255 or a percentage value (from 0% to 100%).<br>
   * For example, the rgb(0,0,255) value is rendered as blue, because the blue parameter is set to its highest value (255) and the others are set to 0.<br>
   *
   * <br><p>Define different RGB colors:</p> 
   * <pre>
   *  #p1 {background-color:rgb(255,0,0);} // red 
   * <br>#p2 {background-color:rgb(0,255,0);} // green 
   * <br>#p3 {background-color:rgb(0,0,255);} // blue 
   * </pre>  
   * <br><br>
   *  From : <a href="https://www.w3schools.com/cssref/func_rgb.asp">https://www.w3schools.com/cssref/func_rgb.asp</a>
   */
  public static final Function rgb(Object red, Object green, Object blue) {
    return M("rgb",red,green,blue);
  }

  /**
   * Defines colors using the Red-Green-Blue-Alpha model (RGBA)
   * <br><br>
   * The rgba() function define colors using the Red-green-blue-alpha (RGBA) model.<br>
   * RGBA color values are an extension of RGB color values with an alpha channel - which specifies the opacity of the color.<br>
   *
   * <br><p>Define different RGB colors with opacity (RGBA):</p> 
   * <pre>
   *  #p1 {background-color:rgba(255,0,0,0.3);} // red with opacity
   * <br>#p2 {background-color:rgba(0,255,0,0.3);} // green with opacity 
   * <br>#p3 {background-color:rgba(0,0,255,0.3);} // blue with opacity 
   * </pre>  
   * <br><br>
   *  From : <a href="https://www.w3schools.com/cssref/func_rgba.asp">https://www.w3schools.com/cssref/func_rgba.asp</a>
   */
  public static final Function rgba(Object red, Object green, Object blue, Object alpha) {
    return M("rgba",red,green,blue,alpha);
  }

  /**
   * Inserts the value of a custom property
   * <br><br>
   * The var() function is used to insert the value of a CSS variable.<br>
   *
   * <br><p>First, declare a global variable named "--main-bg-color", then use the var() function to insert the value of the variable later in the style sheet:</p> 
   * <pre>
   *   :root {<br>&nbsp; --main-bg-color: coral; <br>}<br><br>#div1 {<br>&nbsp; 
   *   background-color: var(--main-bg-color); <br>}<br><br>#div2 {<br>&nbsp;&nbsp;background-color: var(--main-bg-color);<br>}   
   * </pre>  
   * <br><br>
   *  From : <a href="https://www.w3schools.com/cssref/func_var.asp">https://www.w3schools.com/cssref/func_var.asp</a>
   */
  public static final Function var(Object name, Object value) {
    return M("var",name,value);
  }

  /**
   * Specifies a stepping function, with two parameters. The first parameter specifies the number of intervals in the function. It must be a positive integer (greater than 0). The second parameter, which is optional, is either the value "start" or "end", and specifies the point at which the change of values occur within the interval. If the second parameter is omitted, it is given the value "end"
   * <br>steps(int,start|end)<br>
   * steps(int,start|end)<br>
   *  From : <a href="nullnull">nullnull</a>
   */
  public static final Function steps(Object p_int, Object start) {
    return M("steps",p_int,start);
  }

  /**
   * The URL to the image. To specify more than one image, separate the URLs with a comma
   * <br>url('URL')<br>
   * url('URL')<br>
   *  From : <a href="nullnull">nullnull</a>
   */
  public static final Function url(Object url) {
    return M("url",url);
  }

  /**
   *
   * <br>fit-content()<br>
   * fit-content()<br>
   *  From : <a href="nullnull">nullnull</a>
   */
  public static final Function fit_content(Object p0) {
    return M("fit-content",p0);
  }

  /**
   * Sets a size range greater than or equal to min and less than or equal to max
   * <br>minmax(min.max)<br>
   * minmax(min.max)<br>
   *  From : <a href="nullnull">nullnull</a>
   */
  public static final Function minmax(Object minmax) {
    return M("minmax",minmax);
  }

  /**
   * Defines a 2D transformation, using a matrix of six values
   * <br>matrix(n,n,n,n,n,n)<br>
   * matrix(n,n,n,n,n,n)<br>
   *  From : <a href="nullnull">nullnull</a>
   */
  public static final Function matrix(Object n, Object n__1, Object n__2, Object n__3, Object n__4,
      Object n__5) {
    return M("matrix",n,n__1,n__2,n__3,n__4,n__5);
  }

  /**
   * Defines a 3D transformation, using a 4x4 matrix of 16 values
   * <br>matrix3d (n,n,n,n,n,n,n,n,n,n,n,n,n,n,n,n)<br>
   * matrix3d (n,n,n,n,n,n,n,n,n,n,n,n,n,n,n,n)<br>
   *  From : <a href="nullnull">nullnull</a>
   */
  public static final Function matrix3d(Object n, Object n__1, Object n__2, Object n__3,
      Object n__4, Object n__5, Object n__6, Object n__7, Object n__8, Object n__9, Object n__10,
      Object n__11, Object n__12, Object n__13, Object n__14, Object n__15) {
    return M("matrix3d ",n,n__1,n__2,n__3,n__4,n__5,n__6,n__7,n__8,n__9,n__10,n__11,n__12,n__13,n__14,n__15);
  }

  /**
   * Defines a 2D translation
   * <br>translate(x,y)<br>
   * translate(x,y)<br>
   *  From : <a href="nullnull">nullnull</a>
   */
  public static final Function translate(Object x, Object y) {
    return M("translate",x,y);
  }

  /**
   * Defines a 3D translation
   * <br>translate3d(x,y,z)<br>
   * translate3d(x,y,z)<br>
   *  From : <a href="nullnull">nullnull</a>
   */
  public static final Function translate3d(Object x, Object y, Object z) {
    return M("translate3d",x,y,z);
  }

  /**
   * Defines a translation, using only the value for the X-axis
   * <br>translateX(x)<br>
   * translateX(x)<br>
   *  From : <a href="nullnull">nullnull</a>
   */
  public static final Function translateX(Object x) {
    return M("translateX",x);
  }

  /**
   * Defines a translation, using only the value for the Y-axis
   * <br>translateY(y)<br>
   * translateY(y)<br>
   *  From : <a href="nullnull">nullnull</a>
   */
  public static final Function translateY(Object y) {
    return M("translateY",y);
  }

  /**
   * Defines a 3D translation, using only the value for the Z-axis
   * <br>translateZ(z)<br>
   * translateZ(z)<br>
   *  From : <a href="nullnull">nullnull</a>
   */
  public static final Function translateZ(Object z) {
    return M("translateZ",z);
  }

  /**
   * Defines a 2D scale transformation
   * <br>scale(x,y)<br>
   * scale(x,y)<br>
   *  From : <a href="nullnull">nullnull</a>
   */
  public static final Function scale(Object x, Object y) {
    return M("scale",x,y);
  }

  /**
   * Defines a 3D scale transformation
   * <br>scale3d(x,y,z)<br>
   * scale3d(x,y,z)<br>
   *  From : <a href="nullnull">nullnull</a>
   */
  public static final Function scale3d(Object x, Object y, Object z) {
    return M("scale3d",x,y,z);
  }

  /**
   * Defines a scale transformation by giving a value for the X-axis
   * <br>scaleX(x)<br>
   * scaleX(x)<br>
   *  From : <a href="nullnull">nullnull</a>
   */
  public static final Function scaleX(Object x) {
    return M("scaleX",x);
  }

  /**
   * Defines a scale transformation by giving a value for the Y-axis
   * <br>scaleY(y)<br>
   * scaleY(y)<br>
   *  From : <a href="nullnull">nullnull</a>
   */
  public static final Function scaleY(Object y) {
    return M("scaleY",y);
  }

  /**
   * Defines a 3D scale transformation by giving a value for the Z-axis
   * <br>scaleZ(z)<br>
   * scaleZ(z)<br>
   *  From : <a href="nullnull">nullnull</a>
   */
  public static final Function scaleZ(Object z) {
    return M("scaleZ",z);
  }

  /**
   * Defines a 2D rotation, the angle is specified in the parameter
   * <br>rotate(angle)<br>
   * rotate(angle)<br>
   *  From : <a href="nullnull">nullnull</a>
   */
  public static final Function rotate(Object angle) {
    return M("rotate",angle);
  }

  /**
   * Defines a 3D rotation
   * <br>rotate3d(x,y,z,angle)<br>
   * rotate3d(x,y,z,angle)<br>
   *  From : <a href="nullnull">nullnull</a>
   */
  public static final Function rotate3d(Object x, Object y, Object z, Object angle) {
    return M("rotate3d",x,y,z,angle);
  }

  /**
   * Defines a 3D rotation along the X-axis
   * <br>rotateX(angle)<br>
   * rotateX(angle)<br>
   *  From : <a href="nullnull">nullnull</a>
   */
  public static final Function rotateX(Object angle) {
    return M("rotateX",angle);
  }

  /**
   * Defines a 3D rotation along the Y-axis
   * <br>rotateY(angle)<br>
   * rotateY(angle)<br>
   *  From : <a href="nullnull">nullnull</a>
   */
  public static final Function rotateY(Object angle) {
    return M("rotateY",angle);
  }

  /**
   * Defines a 3D rotation along the Z-axis
   * <br>rotateZ(angle)<br>
   * rotateZ(angle)<br>
   *  From : <a href="nullnull">nullnull</a>
   */
  public static final Function rotateZ(Object angle) {
    return M("rotateZ",angle);
  }

  /**
   * Defines a 2D skew transformation along the X- and the Y-axis
   * <br>skew(x-angle,y-angle)<br>
   * skew(x-angle,y-angle)<br>
   *  From : <a href="nullnull">nullnull</a>
   */
  public static final Function skew(Object x_angle, Object y_angle) {
    return M("skew",x_angle,y_angle);
  }

  /**
   * Defines a 2D skew transformation along the X-axis
   * <br>skewX(angle)<br>
   * skewX(angle)<br>
   *  From : <a href="nullnull">nullnull</a>
   */
  public static final Function skewX(Object angle) {
    return M("skewX",angle);
  }

  /**
   * Defines a 2D skew transformation along the Y-axis
   * <br>skewY(angle)<br>
   * skewY(angle)<br>
   *  From : <a href="nullnull">nullnull</a>
   */
  public static final Function skewY(Object angle) {
    return M("skewY",angle);
  }

  /**
   * Defines a perspective view for a 3D transformed element
   * <br>perspective(n)<br>
   * perspective(n)<br>
   *  From : <a href="nullnull">nullnull</a>
   */
  public static final Function perspective(Object n) {
    return M("perspective",n);
  }
}
