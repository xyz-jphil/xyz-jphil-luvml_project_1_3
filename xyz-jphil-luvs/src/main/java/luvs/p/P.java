package luvs.p;

import java.lang.Override;
import java.lang.String;
import luvml.BrowserSupport;
import luvml.o.Out_I;
import luvs.StyleSegmentType_E;

public enum P implements Property_I {
  /**
   * Specifies the alignment between the lines inside a flexible container when the items do not use all available space
   * <br><br>
   * The align-content property modifies the behavior of the flex-wrap property. It is similar to align-items, but instead of aligning flex items, it aligns flex lines.<br>
   * Note: There must be multiple lines of items for this property to have any effect!<br>
   * Tip: Use the justify-content property to align the items on the main-axis (horizontally).<br>
   * <p>Pack lines toward the center of the flex container:</p> 
   * <pre>  
   *     div
   *  {<br>&nbsp;&nbsp;width: 70px;<br>&nbsp;&nbsp;height: 300px;<br>&nbsp; border: 1px solid #c3c3c3;<br>&nbsp;&nbsp;display: flex;<br>
   *     &nbsp; flex-wrap: wrap;<br>&nbsp;&nbsp;align-content: center;<br>}
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_align-content.asp">https://www.w3schools.com/cssref/css3_pr_align-content.asp</a>
   */
  ALIGN_CONTENT("align-content",false,new BrowserSupport (21.0,11.0,28.0,12.1,9.0),3.0 /*default Value = stretch */  ),

  /**
   * Specifies the alignment for items inside a flexible container
   * <br><br>
   * The align-items property specifies the default alignment for items inside the flexible container.<br>
   * Tip: Use the align-self property of each item to override the align-items property.<br>
   * <p>Center the alignments for all the items of the flexible &lt;div&gt; element:</p> 
   * <pre>
   *     div
   *  {<br>
   *  &nbsp;&nbsp;display: flex;<br>&nbsp;&nbsp;align-items: center;<br>
   *  }
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_align-items.asp">https://www.w3schools.com/cssref/css3_pr_align-items.asp</a>
   */
  ALIGN_ITEMS("align-items",false,new BrowserSupport (21.0,11.0,20.0,12.1,9.0),3.0 /*default Value = stretch */  ),

  /**
   * Specifies the alignment for selected items inside a flexible container
   * <br><br>
   * The align-self property specifies the alignment for the selected item inside the flexible container.<br>
   * Note: The align-self property overrides the flexible container's align-items property.<br>
   * <p>Center the alignments for one of the items inside a flexible element:</p> 
   * <pre>
   *     #myBlueDiv
   *  {<br>
   *     &nbsp;
   *  align-self: center;<br>}
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_align-self.asp">https://www.w3schools.com/cssref/css3_pr_align-self.asp</a>
   */
  ALIGN_SELF("align-self",false,new BrowserSupport (21.0,11.0,20.0,12.1,9.0),3.0 /*default Value = auto */  ),

  /**
   * Resets all properties (except unicode-bidi and direction)
   * <br><br>
   * The all property resets all properties, apart from unicode-bidi and direction, to their initial or inherited value.<br>
   * <p>Change all the properties applied to the element or the element's parent to their initial value:</p> 
   * <pre>  
   *     div
   *  {<br>&nbsp;&nbsp;background-color: yellow;<br>&nbsp;&nbsp;color: red;<br>&nbsp;&nbsp;all: initial;<br>}
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_all.asp">https://www.w3schools.com/cssref/css3_pr_all.asp</a>
   */
  ALL("all",false,new BrowserSupport (37.0,79.0,27.0,24.0,9.1),3.0 /*default Value = none */  ),

  /**
   * A shorthand property for all the animation-* properties
   * <br><br>
   * The animation property is a shorthand property for:<br>
   * <p>Binding an animation to a &lt;div&gt; element, using the shorthand property:</p> 
   * <pre>
   *     div
   *  {<br>
   *  &nbsp;&nbsp;animation: mymove 5s infinite;<br>
   *  }
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_animation.asp">https://www.w3schools.com/cssref/css3_pr_animation.asp</a>
   */
  ANIMATION("animation",false,new BrowserSupport (43.0,10.0,16.0,30.0,9.0),3.0 /*default Value = none 0 ease 0 1 normal none running */  ),

  /**
   * Specifies a delay for the start of an animation
   * <br><br>
   * The animation-delay property specifies a delay for the start of an animation.<br>
   * The animation-delay value is defined in seconds (s) or milliseconds (ms).<br>
   * <p>Start the animation after 2 seconds:</p> 
   * <pre>
   *     div {<br>&nbsp;&nbsp;animation-delay: 2s;<br>}</pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_animation-delay.asp">https://www.w3schools.com/cssref/css3_pr_animation-delay.asp</a>
   */
  ANIMATION_DELAY("animation-delay",false,new BrowserSupport (43.0,10.0,16.0,30.0,9.0),3.0 /*default Value = 0s */  ),

  /**
   * Specifies whether an animation should be played forwards, backwards or in alternate cycles
   * <br><br>
   * The animation-direction property defines whether an animation should be played forwards, backwards or in alternate cycles.<br>
   * <p>Play the animation forwards first, then backwards:</p> 
   * <pre> 
   * div {<br>&nbsp;&nbsp;animation-direction: alternate;<br>}</pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_animation-direction.asp">https://www.w3schools.com/cssref/css3_pr_animation-direction.asp</a>
   */
  ANIMATION_DIRECTION("animation-direction",false,new BrowserSupport (43.0,10.0,16.0,30.0,9.0),3.0 /*default Value = normal */  ),

  /**
   * Specifies how long an animation should take to complete one cycle
   * <br><br>
   * The animation-duration property defines how long an animation should take to complete one cycle.<br>
   * <p>Specify that the animation should complete one cycle in 3 seconds:</p> 
   * <pre>
   * div {<br>&nbsp;
   * animation-duration: 3s;<br>
   * }
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_animation-duration.asp">https://www.w3schools.com/cssref/css3_pr_animation-duration.asp</a>
   */
  ANIMATION_DURATION("animation-duration",false,new BrowserSupport (43.0,10.0,16.0,30.0,9.0),3.0 /*default Value = 0 */  ),

  /**
   * Specifies a style for the element when the animation is not playing (before it starts, after it ends, or both)
   * <br><br>
   * The animation-fill-mode property specifies a style for the element when the animation is not playing (before it starts, after it ends, or both).<br>
   * CSS animations do not affect the element before the first keyframe is played or after the last keyframe is played. The animation-fill-mode property can override this behavior.<br>
   * <p>Let the &lt;div&gt; element retain the style values from the last keyframe when the animation ends:</p> 
   * <pre>
   *     div {<br>&nbsp;&nbsp;animation-fill-mode: forwards;<br>}</pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_animation-fill-mode.asp">https://www.w3schools.com/cssref/css3_pr_animation-fill-mode.asp</a>
   */
  ANIMATION_FILL_MODE("animation-fill-mode",false,new BrowserSupport (43.0,10.0,16.0,30.0,9.0),3.0 /*default Value = none */  ),

  /**
   * Specifies the number of times an animation should be played
   * <br><br>
   * The animation-iteration-count property specifies the number of times an animation should be played.<br>
   * <p>Play the animation two times:</p> 
   * <pre>
   * div {<br>&nbsp;
   * animation-iteration-count: 2;<br>}</pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_animation-iteration-count.asp">https://www.w3schools.com/cssref/css3_pr_animation-iteration-count.asp</a>
   */
  ANIMATION_ITERATION_COUNT("animation-iteration-count",false,new BrowserSupport (43.0,10.0,16.0,30.0,9.0),3.0 /*default Value = 1 */  ),

  /**
   * Specifies a name for the @keyframes animation
   * <br><br>
   * The animation-name property specifies a name for the @keyframes animation.<br>
   * <p>Specify a name for the @keyframes animation:</p> 
   * <pre>
   * div {<br>&nbsp;&nbsp;animation-name: mymove;<br>
   * }</pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_animation-name.asp">https://www.w3schools.com/cssref/css3_pr_animation-name.asp</a>
   */
  ANIMATION_NAME("animation-name",false,new BrowserSupport (43.0,10.0,16.0,30.0,9.0),3.0 /*default Value = none */  ),

  /**
   * Specifies whether the animation is running or paused
   * <br><br>
   * The animation-play-state property specifies whether the animation is running or paused.<br>
   * Note: Use this property in a JavaScript to pause an animation in the middle of a cycle.<br>
   * <p>Pause an animation:</p> 
   * <pre>
   * div {<br>&nbsp;
   * animation-play-state: paused;<br>
   * }</pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_animation-play-state.asp">https://www.w3schools.com/cssref/css3_pr_animation-play-state.asp</a>
   */
  ANIMATION_PLAY_STATE("animation-play-state",false,new BrowserSupport (43.0,10.0,16.0,30.0,9.0),3.0 /*default Value = running */  ),

  /**
   * Specifies the speed curve of an animation
   * <br><br>
   * The animation-timing-function specifies the speed curve of an animation.<br>
   * The speed curve defines the TIME an animation uses to change from one set of CSS styles to another.<br>
   * The speed curve is used to make the changes smoothly.<br>
   * <p>Play an animation with the same speed from beginning to end:</p> 
   * <pre>
   *     div {<br>&nbsp;
   *     animation-timing-function: linear;<br>}</pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_animation-timing-function.asp">https://www.w3schools.com/cssref/css3_pr_animation-timing-function.asp</a>
   */
  ANIMATION_TIMING_FUNCTION("animation-timing-function",false,new BrowserSupport (43.0,10.0,16.0,30.0,9.0),3.0 /*default Value = ease */  ),

  /**
   * Defines whether or not the back face of an element should be visible when facing the user
   * <br><br>
   * The backface-visibility property defines whether or not the back face of an element should be visible when facing the user.<br>
   * The back face of an element is a mirror image of the front face being displayed.<br>
   * This property is useful when an element is rotated. It lets you choose if the user should see the back face or not.<br>
   * To better understand this property, view a demo.<br>
   * <p>Hide and show the back face of two rotated &lt;div&gt; elements:</p> 
   * <pre> 
   *     #div1
   *  {<br>&nbsp; -webkit-backface-visibility: hidden; // Safari 
   * <br>
   *  &nbsp;&nbsp;backface-visibility: hidden;<br>
   *  }<br><br>#div2
   *  {<br>&nbsp; -webkit-backface-visibility: visible; // Safari 
   * <br>
   *  &nbsp;&nbsp;backface-visibility: visible;<br>
   *  }
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_backface-visibility.asp">https://www.w3schools.com/cssref/css3_pr_backface-visibility.asp</a>
   */
  BACKFACE_VISIBILITY("backface-visibility",false,new BrowserSupport (36.0,10.0,16.0,23.0,4.0),3.0 /*default Value = visible */  ),

  /**
   * A shorthand property for all the background-* properties
   * <br><br>
   * The background property is a shorthand property for:<br>
   * <p>Set different background properties in one declaration:</p> 
   * <pre> 
   *     body
   *  { <br>
   *  &nbsp;&nbsp;background: lightblue url("img_tree.gif") no-repeat fixed center; <br>
   *  } 
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_background.asp">https://www.w3schools.com/cssref/css3_pr_background.asp</a>
   */
  BACKGROUND("background",true,new BrowserSupport (1.0,4.0,1.0,3.5,1.0),1.0 /*default Value = see individual properties */  ),

  /**
   * Sets whether a background image scrolls with the rest of the page, or is fixed
   * <br><br>
   * The background-attachment property sets whether a background image scrolls with the rest of the page, or is fixed.<br>
   * <p>A background-image that will not scroll with the page (fixed):</p> 
   * <pre> 
   * body {<br>
   *   &nbsp; background-image: url("img_tree.gif");<br>
   *  &nbsp;&nbsp;background-repeat: no-repeat;<br>
   *   &nbsp;
   *  background-attachment: fixed;<br>
   *  }
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_background-attachment.asp">https://www.w3schools.com/cssref/pr_background-attachment.asp</a>
   */
  BACKGROUND_ATTACHMENT("background-attachment",false,new BrowserSupport (1.0,4.0,1.0,3.5,1.0),1.0 /*default Value = scroll */  ),

  /**
   * Specifies the blending mode of each background layer (color/image)
   * <br><br>
   * The background-blend-mode property defines the blending mode of each background layer (color and/or image).<br>
   * <p>Specify the blending mode of a background-image to be "lighten":</p> 
   * <pre> 
   *     div { <br>&nbsp;&nbsp;background-repeat: no-repeat, repeat;<br>&nbsp;&nbsp;background-image: url("img_tree.gif"), url("paper.gif");<br>
   *     &nbsp; 
   *     background-blend-mode: lighten;<br>} </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_background-blend-mode.asp">https://www.w3schools.com/cssref/pr_background-blend-mode.asp</a>
   */
  BACKGROUND_BLEND_MODE("background-blend-mode",false,new BrowserSupport (35.0,79.0,30.0,22.0,7.1),3.0 /*default Value = normal */  ),

  /**
   * Defines how far the background (color or image) should extend within an element
   * <br><br>
   * The background-clip property defines how far the background (color or image) should extend within an element.<br>
   * <p>Specify how far the background should extend within an element:</p> 
   * <pre>
   *     div
   *  {<br>
   *  &nbsp;&nbsp;border: 10px dotted black;<br>&nbsp; padding: 15px;<br>&nbsp; background: 
   *     lightblue;<br>&nbsp; background-clip: 
   *     padding-box;<br>}
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_background-clip.asp">https://www.w3schools.com/cssref/css3_pr_background-clip.asp</a>
   */
  BACKGROUND_CLIP("background-clip",false,new BrowserSupport (4.0,9.0,4.0,10.5,3.0),3.0 /*default Value = border-box */  ),

  /**
   * Specifies the background color of an element
   * <br><br>
   * The background-color property sets the background color of an element.<br>
   * The background of an element is the total size of the element, including padding and border (but not the margin).<br>
   * Tip: Use a background color and a text color that makes the text easy to read.<br>
   * <p>Set the background color for a page:</p> 
   * <pre>
   * body {background-color: coral;}</pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_background-color.asp">https://www.w3schools.com/cssref/pr_background-color.asp</a>
   */
  BACKGROUND_COLOR("background-color",true,new BrowserSupport (1.0,4.0,1.0,3.5,1.0),1.0 /*default Value = transparent */  ),

  /**
   * Specifies one or more background images for an element
   * <br><br>
   * The background-image property sets one or more background images for an element.<br>
   * By default, a background-image is placed at the top-left corner of an element, and repeated both vertically and horizontally.<br>
   * Tip: The background of an element is the total size of the element, including padding and border (but not the margin).<br>
   * Tip: Always set a background-color to be used if the image is unavailable.<br>
   * <p>Set a background-image for the &lt;body&gt; element:</p> 
   * <pre>
   * body {<br>
   * &nbsp;background-image: url("paper.gif");<br>
   * &nbsp;background-color: #cccccc;<br>
   * } 
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_background-image.asp">https://www.w3schools.com/cssref/pr_background-image.asp</a>
   */
  BACKGROUND_IMAGE("background-image",false,new BrowserSupport (1.0,4.0,1.0,3.5,1.0),1.0 /*default Value = none */  ),

  /**
   * Specifies the origin position of a background image
   * <br><br>
   * The background-origin property specifies the origin position (the background positioning area) of a background image.<br>
   * Note: This property has no effect if background-attachment is "fixed".<br>
   * <p>Let the background-image start from the upper left corner of the content:</p> 
   * <pre>
   * #example1 {<br>
   *  &nbsp;&nbsp;border: 10px dashed black;<br>&nbsp;&nbsp;padding: 
   *     25px;<br>&nbsp;&nbsp;background: url(paper.gif);<br>&nbsp; 
   *     background-repeat: no-repeat;<br>&nbsp; background-origin: 
   *     content-box;<br>}
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_background-origin.asp">https://www.w3schools.com/cssref/css3_pr_background-origin.asp</a>
   */
  BACKGROUND_ORIGIN("background-origin",false,new BrowserSupport (4.0,9.0,4.0,10.5,3.0),3.0 /*default Value = padding-box */  ),

  /**
   * Specifies the position of a background image
   * <br><br>
   * The background-position property sets the starting position of a background image.<br>
   * Tip: By default, a background-image is placed at the top-left corner of an element, and repeated both vertically and horizontally.<br>
   * <p>How to position a background-image:</p> 
   * <pre>
   *     body
   *  { <br>
   *  &nbsp;&nbsp;background-image: url('w3css.gif');<br>
   *     &nbsp;
   *  background-repeat: no-repeat;<br>
   *  &nbsp;&nbsp;background-attachment: fixed;<br>
   *  &nbsp;&nbsp;background-position: center; <br>
   *  }
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_background-position.asp">https://www.w3schools.com/cssref/pr_background-position.asp</a>
   */
  BACKGROUND_POSITION("background-position",true,new BrowserSupport (1.0,4.0,1.0,3.5,1.0),1.0 /*default Value = 0% 0% */  ),

  /**
   * Sets if/how a background image will be repeated
   * <br><br>
   * The background-repeat property sets if/how a background image will be repeated.<br>
   * By default, a background-image is repeated both vertically and horizontally.<br>
   * Tip: The background image is placed according to the background-position property. If no background-position is specified, the image is always placed at the element's top left corner.<br>
   * <p>Repeat a background-image only vertically:</p> 
   * <pre>
   *     body
   *  {<br>
   *     &nbsp;
   *  background-image: url("paper.gif");<br>
   *     &nbsp;
   *  background-repeat: repeat-y;<br>
   *  }
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_background-repeat.asp">https://www.w3schools.com/cssref/pr_background-repeat.asp</a>
   */
  BACKGROUND_REPEAT("background-repeat",false,new BrowserSupport (1.0,4.0,1.0,3.5,1.0),1.0 /*default Value = repeat */  ),

  /**
   * Specifies the size of the background images
   * <br><br>
   * The background-size property specifies the size of the background images.<br>
   * There are four different syntaxes you can use with this property: the keyword syntax ("auto", "cover" and "contain"), the one-value syntax (sets the width of the image (height becomes "auto"), the two-value syntax (first value: width of the image, second value: height), and the multiple background syntax (separated with comma).<br>
   * <p>Specify the size of a background-image with "auto" and in pixels:</p> 
   * <pre>
   *     #example1 {<br>&nbsp; background: url(mountain.jpg);<br>&nbsp; 
   *     background-repeat: no-repeat;<br>&nbsp; background-size: auto;<br>
   *     }<br><br>#example2 {<br>&nbsp; 
   *     background: url(mountain.jpg);<br>&nbsp; background-repeat: 
   *     no-repeat;<br>&nbsp; background-size: 300px 100px;<br>}</pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_background-size.asp">https://www.w3schools.com/cssref/css3_pr_background-size.asp</a>
   */
  BACKGROUND_SIZE("background-size",true,new BrowserSupport (4.0,9.0,4.0,10.5,4.1),3.0 /*default Value = auto */  ),

  /**
   * A shorthand property for border-width, border-style and border-color
   * <br><br>
   * The border property is a shorthand property for:<br>
   * <p>Set the style of the borders for different elements:</p> 
   * <pre>
   *     h1 {<br>&nbsp;&nbsp;border: 5px solid red;<br>}<br><br>h2 {<br>&nbsp; 
   *     border: 4px dotted blue;<br>}<br><br>div {<br>&nbsp;&nbsp;border: 
   *     double;<br>} 
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_border.asp">https://www.w3schools.com/cssref/pr_border.asp</a>
   */
  BORDER("border",true,new BrowserSupport (1.0,4.0,1.0,3.5,1.0),1.0 /*default Value = medium none color */  ),

  /**
   * A shorthand property for border-bottom-width, border-bottom-style and border-bottom-color
   * <br><br>
   * The border-bottom property is a shorthand property for (in the following order):<br>
   * <p>Set the style of the bottom border for different elements:</p> 
   * <pre> 
   *     h1 {<br>&nbsp; border-bottom: 5px solid red;<br>}<br><br>h2 {<br>&nbsp; 
   *     border-bottom: 4px dotted blue;<br>}<br><br>div {<br>&nbsp;&nbsp;border-bottom: double;<br>} 
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_border-bottom.asp">https://www.w3schools.com/cssref/pr_border-bottom.asp</a>
   */
  BORDER_BOTTOM("border-bottom",true,new BrowserSupport (1.0,4.0,1.0,3.5,1.0),1.0 /*default Value = medium none color */  ),

  /**
   * Sets the color of the bottom border
   * <br><br>
   * The border-bottom-color property sets the color of an element's bottom border.<br>
   * Note: Always declare the border-style or the border-bottom-style property before the border-bottom-color property. An element must have a border before you can change the color.<br>
   * <p>Set a color for the bottom border:</p> 
   * <pre>
   * div {border-bottom-color: coral;}</pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_border-bottom_color.asp">https://www.w3schools.com/cssref/pr_border-bottom_color.asp</a>
   */
  BORDER_BOTTOM_COLOR("border-bottom-color",true,new BrowserSupport (1.0,4.0,1.0,3.5,1.0),1.0 /*default Value = The current color of the element */  ),

  /**
   * Defines the radius of the border of the bottom-left corner
   * <br><br>
   * The border-bottom-left-radius property defines the radius of the bottom-left corner.<br>
   * Tip: This property allows you to add rounded borders to elements!<br>
   * <p>Add rounded borders to the bottom-left corner of two &lt;div&gt; elements:</p> 
   * <pre>
   *     #example1 {<br>&nbsp; border: 2px solid red;<br>&nbsp; 
   *     border-bottom-left-radius: 25px;<br>}<br><br>#example2 {<br>&nbsp; 
   *     border: 2px solid red;<br>&nbsp;&nbsp;border-bottom-left-radius: 50px 
   *     20px;<br>}
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_border-bottom-left-radius.asp">https://www.w3schools.com/cssref/css3_pr_border-bottom-left-radius.asp</a>
   */
  BORDER_BOTTOM_LEFT_RADIUS("border-bottom-left-radius",true,new BrowserSupport (5.0,9.0,4.0,10.5,5.0),3.0 /*default Value = 0 */  ),

  /**
   * Defines the radius of the border of the bottom-right corner
   * <br><br>
   * The border-bottom-right-radius property defines the radius of the bottom-right corner.<br>
   * Tip: This property allows you to add rounded borders to elements!<br>
   * <p>Add rounded borders to the bottom-right corner of two &lt;div&gt; elements:</p> 
   * <pre>
   *     #example1 {<br>&nbsp; border: 2px solid red;<br>&nbsp; 
   *     border-bottom-right-radius: 25px;<br>}<br><br>#example2 {<br>&nbsp; 
   *     border: 2px solid red;<br>&nbsp;&nbsp;border-bottom-right-radius: 50px 
   *     20px;<br>}
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_border-bottom-right-radius.asp">https://www.w3schools.com/cssref/css3_pr_border-bottom-right-radius.asp</a>
   */
  BORDER_BOTTOM_RIGHT_RADIUS("border-bottom-right-radius",true,new BrowserSupport (5.0,9.0,4.0,10.5,5.0),3.0 /*default Value = 0 */  ),

  /**
   * Sets the style of the bottom border
   * <br><br>
   * The border-bottom-style property sets the style of an element's bottom border.<br>
   * <p>Set a style for the bottom border:</p> 
   * <pre>
   * div {border-bottom-style: dotted;}</pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_border-bottom_style.asp">https://www.w3schools.com/cssref/pr_border-bottom_style.asp</a>
   */
  BORDER_BOTTOM_STYLE("border-bottom-style",false,new BrowserSupport (1.0,5.5,1.0,9.2,1.0),1.0 /*default Value = none */  ),

  /**
   * Sets the width of the bottom border
   * <br><br>
   * The border-bottom-width property sets the width of an element's bottom border.<br>
   * Note: Always declare the border-style or the border-bottom-style property before the border-bottom-width property. An element must have borders before you can change the width.<br>
   * <p>Set a width for the bottom border:</p> 
   * <pre>
   * div {border-bottom-width: thin;}</pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_border-bottom_width.asp">https://www.w3schools.com/cssref/pr_border-bottom_width.asp</a>
   */
  BORDER_BOTTOM_WIDTH("border-bottom-width",true,new BrowserSupport (1.0,4.0,1.0,3.5,1.0),1.0 /*default Value = medium */  ),

  /**
   * Sets whether table borders should collapse into a single border or be separated
   * <br><br>
   * The border-collapse property sets whether table borders should collapse into a single border or be separated as in standard HTML.<br>
   * <p>Set the collapsing borders model for two tables:</p> 
   * <pre>
   *     #table1 {<br>&nbsp; border-collapse: separate;<br>}<br><br>#table2 {<br>&nbsp; 
   *     border-collapse: collapse;<br>} </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_border-collapse.asp">https://www.w3schools.com/cssref/pr_border-collapse.asp</a>
   */
  BORDER_COLLAPSE("border-collapse",false,new BrowserSupport (1.0,5.0,1.0,4.0,1.2),2.0 /*default Value = separate */  ),

  /**
   * Sets the color of the four borders
   * <br><br>
   * The border-color property sets the color of an element's four borders. This property can have from one to four values.<br>
   * If the border-color property has four values:<br>
   * <p>Set a color for the border:</p> 
   * <pre>
   * div {border-color: coral;}</pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_border-color.asp">https://www.w3schools.com/cssref/pr_border-color.asp</a>
   */
  BORDER_COLOR("border-color",true,new BrowserSupport (1.0,4.0,1.0,3.5,1.0),1.0 /*default Value = The current color of the element */  ),

  /**
   * A shorthand property for all the border-image-* properties
   * <br><br>
   * The border-image property allows you to specify an image to be used as the border around an element.<br>
   * The border-image property is a shorthand property for:<br>
   * <p>Specify an image as the border around an element:</p> 
   * <pre>
   *     #borderimg { <br>&nbsp;&nbsp;border-image: url(border.png) 30 round;<br>}
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_border-image.asp">https://www.w3schools.com/cssref/css3_pr_border-image.asp</a>
   */
  BORDER_IMAGE("border-image",false,new BrowserSupport (16.0,11.0,15.0,15.0,6.0),3.0 /*default Value = none 100% 1 0 stretch */  ),

  /**
   * Specifies the amount by which the border image area extends beyond the border box
   * <br><br>
   * The border-image-outset property specifies the amount by which the border image area extends beyond the border box.<br>
   * Tip: Also look at the border-image property (a shorthand property for setting all the border-image-* properties).<br>
   * <p>Place the border image 10 pixels outside the border edges of an element:</p> 
   * <pre>
   *     #borderimg
   *  {<br>
   *     &nbsp;
   *  border-image-source: url(border.png);<br>
   *     &nbsp;
   *  border-image-outset: 10px;<br>
   *  }
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_border-image-outset.asp">https://www.w3schools.com/cssref/css3_pr_border-image-outset.asp</a>
   */
  BORDER_IMAGE_OUTSET("border-image-outset",false,new BrowserSupport (15.0,11.0,15.0,15.0,6.0),3.0 /*default Value = 0 */  ),

  /**
   * Specifies whether the border image should be repeated, rounded or stretched
   * <br><br>
   * The border-image-repeat property specifies whether the border image should be repeated, rounded or stretched.<br>
   * Tip: Also look at the border-image property (a shorthand property for setting all the border-image-* properties).<br>
   * <p>Specify how to repeat the border image:</p> 
   * <pre>
   *     #borderimg
   *  {<br>
   *  &nbsp;&nbsp;border-image-source: url(border.png);<br>
   *  &nbsp;&nbsp;border-image-repeat: repeat;<br>
   *  }
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_border-image-repeat.asp">https://www.w3schools.com/cssref/css3_pr_border-image-repeat.asp</a>
   */
  BORDER_IMAGE_REPEAT("border-image-repeat",false,new BrowserSupport (15.0,11.0,15.0,15.0,6.0),3.0 /*default Value = stretch */  ),

  /**
   * Specifies how to slice the border image
   * <br><br>
   * The border-image-slice property specifies how to slice the image specified by border-image-source. The image is always sliced into nine sections: four corners, four edges and the middle.<br>
   * The "middle" part is treated as fully transparent, unless the fill keyword is set.<br>
   * Tip: Also look at the border-image property (a shorthand property for setting all the border-image-* properties).<br>
   * <p>Specify how to slice the border image:</p> 
   * <pre>
   *     #borderimg { <br>&nbsp;&nbsp;border-image-slice: 30%;<br>
   *  }
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_border-image-slice.asp">https://www.w3schools.com/cssref/css3_pr_border-image-slice.asp</a>
   */
  BORDER_IMAGE_SLICE("border-image-slice",false,new BrowserSupport (15.0,11.0,15.0,15.0,6.0),3.0 /*default Value = 100% */  ),

  /**
   * Specifies the path to the image to be used as a border
   * <br><br>
   * The border-image-source property specifies the path to the image to be used as a border (instead of the normal border around an element).<br>
   * Tip: If the value is "none", or if the image cannot be displayed, the border styles will be used.<br>
   * Tip: Also look at the border-image property (a shorthand property for setting all the border-image-* properties).<br>
   * <p>Specify an image as the border around an element:</p> 
   * <pre>
   *     #borderimg
   *  {<br>
   *  &nbsp;&nbsp;border-image-source: url(border.png);<br>
   *  }
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_border-image-source.asp">https://www.w3schools.com/cssref/css3_pr_border-image-source.asp</a>
   */
  BORDER_IMAGE_SOURCE("border-image-source",false,new BrowserSupport (15.0,11.0,15.0,15.0,6.0),3.0 /*default Value = none */  ),

  /**
   * Specifies the width of the border image
   * <br><br>
   * The border-image-width property specifies the width of the border image.<br>
   * Tip: Also look at the border-image property (a shorthand property for setting all the border-image-* properties).<br>
   * <p>Specify the width of the border image:</p> 
   * <pre>
   *     #borderimg
   *  {<br>
   *  &nbsp;&nbsp;border-image-source: url(border.png);<br>
   *  &nbsp;&nbsp;border-image-width: 10px;<br>
   *  }  
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_border-image-width.asp">https://www.w3schools.com/cssref/css3_pr_border-image-width.asp</a>
   */
  BORDER_IMAGE_WIDTH("border-image-width",false,new BrowserSupport (15.0,11.0,13.0,15.0,6.0),3.0 /*default Value = 1 */  ),

  /**
   * A shorthand property for all the border-left-* properties
   * <br><br>
   * The border-left property is a shorthand property for (in the following order):<br>
   * <p>Set the style of the left border for different elements:</p> 
   * <pre> 
   *     h1 {<br>&nbsp; border-left: 5px solid red;<br>}<br><br>h2 {<br>&nbsp; 
   *     border-left: 4px dotted blue;<br>}<br><br>div {<br>&nbsp;&nbsp;border-left: double;<br>} 
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_border-left.asp">https://www.w3schools.com/cssref/pr_border-left.asp</a>
   */
  BORDER_LEFT("border-left",true,new BrowserSupport (1.0,4.0,1.0,1.0,3.5),1.0 /*default Value = medium none color */  ),

  /**
   * Sets the color of the left border
   * <br><br>
   * The border-left-color property sets the color of an element's left border.<br>
   * Note: Always declare the border-style or the border-left-style property before the border-left-color property. An element must have a border before you can change the color.<br>
   * <p>Set a color for the left border:</p> 
   * <pre>
   * div {border-left-color: coral;}</pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_border-left_color.asp">https://www.w3schools.com/cssref/pr_border-left_color.asp</a>
   */
  BORDER_LEFT_COLOR("border-left-color",true,new BrowserSupport (1.0,4.0,1.0,3.5,1.0),1.0 /*default Value = The current color of the element */  ),

  /**
   * Sets the style of the left border
   * <br><br>
   * The border-left-style property sets the style of an element's left border.<br>
   * <p>Set a style for the left border:</p> 
   * <pre>
   * div {border-left-style: dotted;}</pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_border-left_style.asp">https://www.w3schools.com/cssref/pr_border-left_style.asp</a>
   */
  BORDER_LEFT_STYLE("border-left-style",false,new BrowserSupport (1.0,5.5,1.0,9.2,1.0),1.0 /*default Value = none */  ),

  /**
   * Sets the width of the left border
   * <br><br>
   * The border-left-width property sets the width of an element's left border.<br>
   * Note: Always declare the border-style or the border-left-style property before the border-left-width property. An element must have borders before you can change the width.<br>
   * <p>Set a width for the left border:</p> 
   * <pre>
   * div {border-left-width: thin;}</pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_border-left_width.asp">https://www.w3schools.com/cssref/pr_border-left_width.asp</a>
   */
  BORDER_LEFT_WIDTH("border-left-width",true,new BrowserSupport (1.0,4.0,1.0,3.5,1.0),1.0 /*default Value = medium */  ),

  /**
   * A shorthand property for the four border-*-radius properties
   * <br><br>
   * The border-radius property defines the radius of the element's corners.<br>
   * Tip: This property allows you to add rounded corners to elements!<br>
   * This property can have from one to four values. Here are the rules:<br>
   * Four values - border-radius: 15px 50px 30px 5px; (first value applies to top-left corner, second value applies to top-right corner, third value applies to bottom-right corner, and fourth value applies to bottom-left corner):<br>
   * <br>
   * Three values - border-radius: 15px 50px 30px; (first value applies to top-left corner, second value applies to top-right and bottom-left corners, and third value applies to bottom-right corner):<br>
   * <br>
   * Two values - border-radius: 15px 50px; (first value applies to top-left and bottom-right corners, and the second value applies to top-right and bottom-left corners):<br>
   * <br>
   * One value - border-radius: 15px; (the value applies to all four corners, which are rounded equally:<br>
   * <br>
   * <p>Add rounded corners to two &lt;div&gt; elements:</p> 
   * <pre> 
   *     #example1 {<br>&nbsp;&nbsp;border: 2px solid red;<br>&nbsp; 
   *     border-radius: 25px;<br>}<br><br>#example2 {<br>&nbsp; 
   *     border: 2px solid red;<br>&nbsp; border-radius: 50px 
   *     20px;<br>}
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_border-radius.asp">https://www.w3schools.com/cssref/css3_pr_border-radius.asp</a>
   */
  BORDER_RADIUS("border-radius",false,new BrowserSupport (5.0,9.0,4.0,10.5,5.0),3.0 /*default Value = 0 */  ),

  /**
   * A shorthand property for all the border-right-* properties
   * <br><br>
   * The border-right property is a shorthand property for (in the following order):<br>
   * <p>Set the style of the right border for different elements:</p> 
   * <pre>
   *     h1 {<br>&nbsp;&nbsp;border-right: 5px solid red;<br>}<br><br>h2 {<br>&nbsp; 
   *     border-right: 4px dotted blue;<br>}<br><br>div {<br>&nbsp; 
   *     border-right: double;<br>} 
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_border-right.asp">https://www.w3schools.com/cssref/pr_border-right.asp</a>
   */
  BORDER_RIGHT("border-right",true,new BrowserSupport (1.0,4.0,1.0,3.5,1.0),1.0 /*default Value = medium none color */  ),

  /**
   * Sets the color of the right border
   * <br><br>
   * The border-right-color property sets the color of an element's right border.<br>
   * Note: Always declare the border-style or the border-right-style property before the border-right-color property. An element must have a border before you can change the color.<br>
   * <p>Set a color for the right border:</p> 
   * <pre>
   * div {border-right-color: coral;}</pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_border-right_color.asp">https://www.w3schools.com/cssref/pr_border-right_color.asp</a>
   */
  BORDER_RIGHT_COLOR("border-right-color",true,new BrowserSupport (1.0,4.0,1.0,3.5,1.0),1.0 /*default Value = black */  ),

  /**
   * Sets the style of the right border
   * <br><br>
   * The border-right-style property sets the style of an element's right border.<br>
   * <p>Set a style for the right border:</p> 
   * <pre>
   * div {border-right-style: dotted;}</pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_border-right_style.asp">https://www.w3schools.com/cssref/pr_border-right_style.asp</a>
   */
  BORDER_RIGHT_STYLE("border-right-style",false,new BrowserSupport (1.0,4.0,1.0,3.5,1.0),1.0 /*default Value = none */  ),

  /**
   * Sets the width of the right border
   * <br><br>
   * The border-right-width property sets the width of an element's right border.<br>
   * Note: Always declare the border-style or the border-right-style property before the border-right-width property. An element must have borders before you can change the width.<br>
   * <p>Set a width for the right border:</p> 
   * <pre>
   * div {border-right-width: thin;}</pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_border-right_width.asp">https://www.w3schools.com/cssref/pr_border-right_width.asp</a>
   */
  BORDER_RIGHT_WIDTH("border-right-width",true,new BrowserSupport (1.0,4.0,1.0,3.5,1.0),1.0 /*default Value = medium */  ),

  /**
   * Sets the distance between the borders of adjacent cells
   * <br><br>
   * The border-spacing property sets the distance between the borders of adjacent cells.<br>
   * Note: This property works only when border-collapse is separate.<br>
   * <p>Set the border-spacing for a table:</p> 
   * <pre>
   *     #table1 {<br>&nbsp; border-collapse: separate;<br>&nbsp; 
   *     border-spacing: 15px;<br>}<br>
   *     <br>#table2 {<br>&nbsp;&nbsp;border-collapse: separate;<br>&nbsp;&nbsp;border-spacing: 15px 50px;<br>} </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_border-spacing.asp">https://www.w3schools.com/cssref/pr_border-spacing.asp</a>
   */
  BORDER_SPACING("border-spacing",true,new BrowserSupport (1.0,8.0,1.0,4.0,1.0),2.0 /*default Value = 2px */  ),

  /**
   * Sets the style of the four borders
   * <br><br>
   * The border-style property sets the style of an element's four borders. This property can have from one to four values.<br>
   * Examples:<br>
   * <p>Set a style for the border:</p> 
   * <pre>
   * div {border-style: dotted;}</pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_border-style.asp">https://www.w3schools.com/cssref/pr_border-style.asp</a>
   */
  BORDER_STYLE("border-style",false,new BrowserSupport (1.0,4.0,1.0,3.5,1.0),1.0 /*default Value = none */  ),

  /**
   * A shorthand property for border-top-width, border-top-style and border-top-color
   * <br><br>
   * The border-top shorthand property sets all the top border properties in one declaration.<br>
   * The properties that can be set must be in the following order:<br>
   * <p>Set the style of the top border for different elements:</p> 
   * <pre>
   *     h1 {<br>&nbsp;&nbsp;border-top: 5px solid red;<br>}<br><br>h2 {<br>&nbsp;&nbsp;border-top: 4px dotted blue;<br>}<br><br>div {<br>&nbsp;&nbsp;border-top: double;<br>} 
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_border-top.asp">https://www.w3schools.com/cssref/pr_border-top.asp</a>
   */
  BORDER_TOP("border-top",true,new BrowserSupport (1.0,4.0,1.0,3.5,1.0),1.0 /*default Value = medium none color */  ),

  /**
   * Sets the color of the top border
   * <br><br>
   * The border-top-color property sets the color of an element's top border.<br>
   * Note: Always declare the border-style or the border-top-style property before the border-top-color property. An element must have a border before you can change the color.<br>
   * <p>Set a color for the top border:</p> 
   * <pre>
   * div {border-top-color: coral;}</pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_border-top_color.asp">https://www.w3schools.com/cssref/pr_border-top_color.asp</a>
   */
  BORDER_TOP_COLOR("border-top-color",true,new BrowserSupport (1.0,4.0,1.0,3.5,1.0),1.0 /*default Value = The current color of the element */  ),

  /**
   * Defines the radius of the border of the top-left corner
   * <br><br>
   * The border-top-left-radius property defines the radius of the top-left corner.<br>
   * Tip: This property allows you to add rounded borders to elements!<br>
   * <p>Add rounded borders to the top-left corner of two &lt;div&gt; elements:</p> 
   * <pre>
   *     #example1 {<br>&nbsp;&nbsp;border: 2px solid red;<br>&nbsp;&nbsp;border-top-left-radius: 25px;<br>}<br><br>#example2 {<br>&nbsp;&nbsp;border: 2px solid red;<br>&nbsp;&nbsp;border-top-left-radius: 50px 
   *     20px;<br>}
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_border-top-left-radius.asp">https://www.w3schools.com/cssref/css3_pr_border-top-left-radius.asp</a>
   */
  BORDER_TOP_LEFT_RADIUS("border-top-left-radius",true,new BrowserSupport (5.0,9.0,4.0,10.5,5.0),3.0 /*default Value = 0 */  ),

  /**
   * Defines the radius of the border of the top-right corner
   * <br><br>
   * The border-top-right-radius property defines the radius of the top-right corner.<br>
   * Tip: This property allow you to add rounded borders to elements!<br>
   * <p>Add rounded borders to the top-right corner of two &lt;div&gt; elements:</p> 
   * <pre>
   *     #example1 {<br>&nbsp;&nbsp;border: 2px solid red;<br>&nbsp;&nbsp;border-top-right-radius: 25px;<br>}<br><br>#example2 {<br>
   *     &nbsp; 
   *     border: 2px solid red;<br>&nbsp;&nbsp;border-top-right-radius: 50px 
   *     20px;<br>}
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_border-top-right-radius.asp">https://www.w3schools.com/cssref/css3_pr_border-top-right-radius.asp</a>
   */
  BORDER_TOP_RIGHT_RADIUS("border-top-right-radius",true,new BrowserSupport (5.0,9.0,4.0,10.5,5.0),3.0 /*default Value = 0 */  ),

  /**
   * Sets the style of the top border
   * <br><br>
   * The border-top-style property sets the style of an element's top border.<br>
   * <p>Set a style for the top border:</p> 
   * <pre>
   * div {border-top-style: dotted;}</pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_border-top_style.asp">https://www.w3schools.com/cssref/pr_border-top_style.asp</a>
   */
  BORDER_TOP_STYLE("border-top-style",false,new BrowserSupport (1.0,5.5,1.0,9.2,1.0),1.0 /*default Value = none */  ),

  /**
   * Sets the width of the top border
   * <br><br>
   * The border-top-width property sets the width of an element's top border.<br>
   * Note: Always declare the border-style or the border-top-style property before the border-top-width property. An element must have borders before you can change the width.<br>
   * <p>Set a width for the top border:</p> 
   * <pre>
   * div {border-top-width: thin;}</pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_border-top_width.asp">https://www.w3schools.com/cssref/pr_border-top_width.asp</a>
   */
  BORDER_TOP_WIDTH("border-top-width",true,new BrowserSupport (1.0,4.0,1.0,3.5,1.0),1.0 /*default Value = medium */  ),

  /**
   * Sets the width of the four borders
   * <br><br>
   * The border-width property sets the width of an element's four borders. This property can have from one to four values.<br>
   * Examples:<br>
   * <p>Set a width for the borders:</p> 
   * <pre>
   * div {border-width: thin;}</pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_border-width.asp">https://www.w3schools.com/cssref/pr_border-width.asp</a>
   */
  BORDER_WIDTH("border-width",false,new BrowserSupport (1.0,4.0,1.0,3.5,1.0),1.0 /*default Value = medium */  ),

  /**
   * Sets the elements position, from the bottom of its parent element
   * <br><br>
   * The bottom property affects the vertical position of a positioned element. This property has no effect on non-positioned elements.<br>
   * <p>Set the bottom edge of the &lt;div&gt; element to 10px above the bottom edge of its nearest parent element with some positioning:</p> 
   * <pre>
   *     div.absolute {<br>&nbsp; position: absolute;<br>&nbsp; bottom: 
   *     10px;<br>&nbsp; width: 50%;<br>&nbsp; border: 3px solid #8AC007;<br>}
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_pos_bottom.asp">https://www.w3schools.com/cssref/pr_pos_bottom.asp</a>
   */
  BOTTOM("bottom",true,new BrowserSupport (1.0,5.0,1.0,6.0,1.0),2.0 /*default Value = auto */  ),

  /**
   * Sets the behavior of the background and border of an element at page-break, or, for in-line elements, at line-break.
   * <br><br>
   * The box-decoration-break property specifies how the background, padding, border, border-image, box-shadow, margin, and clip-path of an element is applied when the box for the element is fragmented.<br>
   * <p>Specify the box-decoration-break property:</p> 
   * <pre>
   *     span.ex1 { <br>&nbsp;&nbsp;-webkit-box-decoration-break: clone;<br>&nbsp;&nbsp;-o-box-decoration-break: clone;<br>
   *     &nbsp; box-decoration-break: 
   *     clone;<br>}<br><br>
   *     span.ex2 { <br>&nbsp;&nbsp;-webkit-box-decoration-break: slice;<br>&nbsp;&nbsp;-o-box-decoration-break: slice;<br>&nbsp;&nbsp;box-decoration-break: 
   *     slice;<br>} </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_box-decoration-break.asp">https://www.w3schools.com/cssref/css3_pr_box-decoration-break.asp</a>
   */
  BOX_DECORATION_BREAK("box-decoration-break",false,new BrowserSupport (22.0,79.0,32.0,11.5,6.1),3.0 /*default Value = slice */  ),

  /**
   * Attaches one or more shadows to an element
   * <br><br>
   * The box-shadow property attaches one or more shadows to an element.<br>
   * <p>Add shadows to different &lt;div&gt; elements:</p> 
   * <pre>
   *     #example1 {<br>&nbsp; box-shadow: 5px 10px;<br>}<br><br>#example2 {<br>&nbsp;&nbsp;box-shadow: 
   *     5px 10px #888888;<br>
   *     } </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_box-shadow.asp">https://www.w3schools.com/cssref/css3_pr_box-shadow.asp</a>
   */
  BOX_SHADOW("box-shadow",true,new BrowserSupport (10.0,9.0,4.0,10.5,5.1),3.0 /*default Value = none */  ),

  /**
   * Defines how the width and height of an element are calculated: should they include padding and borders, or not
   * <br><br>
   * The box-sizing property defines how the width and height of an element are calculated: should they include padding and borders, or not.<br>
   * <p>Include padding and border in the element's total width and height:</p> 
   * <pre>
   *     #example1 {<br>&nbsp;&nbsp;box-sizing: border-box;<br>}
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_box-sizing.asp">https://www.w3schools.com/cssref/css3_pr_box-sizing.asp</a>
   */
  BOX_SIZING("box-sizing",false,new BrowserSupport (10.0,8.0,29.0,9.5,5.1),3.0 /*default Value = content-box */  ),

  /**
   * Specifies whether or not a page-, column-, or region-break should occur after the specified element
   * <br><br>
   * The break-after property specifies whether or not a page break, column break, or region break should occur after the specified element.<br>
   * The break-after property extends the CSS2 page-break-after property.<br>
   * Using break-after, you can tell the browser to break the page, column, or region after the element the break-after property is applied to, or avoid the element to be split and span across two pages.<br>
   * <p>Always insert a page-break after a &lt;footer&gt; element:&nbsp;</p> 
   * <pre>
   *  @media print
   * {<br>
   *   &nbsp;
   *  footer {<br>&nbsp;&nbsp;&nbsp; break-after: always;<br>&nbsp; }<br>
   * }</pre> 
   * <br><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_break-after.asp">https://www.w3schools.com/cssref/pr_break-after.asp</a>
   */
  BREAK_AFTER("break-after",false,new BrowserSupport (50.0,10.0,65.0,37.0,10.0),3.0 /*default Value = auto */  ),

  /**
   * Specifies whether or not a page-, column-, or region-break should occur before the specified element
   * <br><br>
   * The break-before property specifies whether or not a page break, column break, or region break should occur before the specified element.<br>
   * The break-before property extends the CSS2 page-break-before property.<br>
   * Using break-before, you can tell the browser to break the page, column, or region before the element the break-before property is applied to, or avoid the element to be split and span across two pages.<br>
   * <p>Always insert a page-break before a &lt;h1&gt; element:&nbsp;</p> 
   * <pre>
   *  @media print
   * {<br>
   *   &nbsp;
   *   h1 {<br>&nbsp;&nbsp;&nbsp; break-before: always;<br>&nbsp; }<br>
   * }</pre> 
   * <br><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_break-before.asp">https://www.w3schools.com/cssref/pr_break-before.asp</a>
   */
  BREAK_BEFORE("break-before",false,new BrowserSupport (50.0,10.0,65.0,37.0,10.0),3.0 /*default Value = auto */  ),

  /**
   * Specifies whether or not a page-, column-, or region-break should occur inside the specified element
   * <br><br>
   * The break-inside property specifies whether or not a page break, column break, or region break should occur inside the specified element.<br>
   * The break-inside property extends then CSS2 page-break-inside property.<br>
   * With break-inside, you can tell the browser to avoid breaks inside images, code snippets, tables, and listst.<br>
   * <p>Avoid a page-break inside an &lt;img&gt; element:&nbsp;</p> 
   * <pre>
   *  @media print
   * {<br>
   *   &nbsp;
   *   img {<br>&nbsp;&nbsp;&nbsp; display: block;<br>&nbsp;&nbsp;&nbsp; break-inside: 
   *   avoid;<br>&nbsp; }<br>
   * }</pre> 
   * <br><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_break-inside.asp">https://www.w3schools.com/cssref/pr_break-inside.asp</a>
   */
  BREAK_INSIDE("break-inside",false,new BrowserSupport (50.0,10.0,65.0,37.0,10.0),3.0 /*default Value = auto */  ),

  /**
   * Specifies the placement of a table caption
   * <br><br>
   * The caption-side property specifies the placement of a table caption.<br>
   * <p>Specify the placement of table captions:</p> 
   * <pre>
   *     #example1 {<br>
   *     &nbsp;
   *  caption-side: bottom;<br>
   *  }<br><br>#example2 {<br>
   *     &nbsp;
   *  caption-side: top;<br>
   *  }</pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_tab_caption-side.asp">https://www.w3schools.com/cssref/pr_tab_caption-side.asp</a>
   */
  CAPTION_SIDE("caption-side",false,new BrowserSupport (1.0,8.0,1.0,4.0,1.0),2.0 /*default Value = top */  ),

  /**
   * Specifies the color of the cursor (caret) in inputs, textareas, or any element that is editable
   * <br><br>
   * The caret-color property specifies the color of the cursor (caret) in inputs, textareas, or any element that is editable.<br>
   * <p>Set the color of the cursor in input elements:</p> 
   * <pre>
   *     input { <br>&nbsp;&nbsp;caret-color: red;<br>}
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_caret-color.asp">https://www.w3schools.com/cssref/css3_pr_caret-color.asp</a>
   */
  CARET_COLOR("caret-color",false,new BrowserSupport (57.0,79.0,53.0,44.0,11.1),3.0 /*default Value = auto */  ),

  /**
   * Specifies the character encoding used in the style sheet
   * <br><br>
   * The @charset rule specifies the character encoding used in the style sheet.<br>
   * The @charset rule must be the first element in the style sheet and not be preceded by any character. If several @charset rules are defined, only the first one is used. The @charset rule cannot be used inside a style attribute (on an HTML element), or inside the <style> element where the character set of the HTML page is relevant.<br>
   * <p>Set the encoding of the style sheet to Unicode UTF-8:</p> 
   * <pre>
   *     @charset "UTF-8";</pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_charset_rule.asp">https://www.w3schools.com/cssref/pr_charset_rule.asp</a>
   */
  CHARSET("@charset",false,new BrowserSupport (2.0,12.0,1.5,9.0,4.0),-1.0 /*default Value = null */  ),

  /**
   * Specifies on which sides of an element floating elements are not allowed to float
   * <br><br>
   * The clear property specifies on which sides of an element floating elements are not allowed to float.<br>
   * <p>Do not allow floating elements on the left or the right side of a specified &lt;p&gt; element:</p> 
   * <pre>
   *     img
   *  {<br>
   *  &nbsp;&nbsp;float: left;<br>
   *  }<br><br>
   *  p.clear
   *  {<br>
   *  &nbsp;&nbsp;clear: both;<br>
   *  }
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_class_clear.asp">https://www.w3schools.com/cssref/pr_class_clear.asp</a>
   */
  CLEAR("clear",false,new BrowserSupport (1.0,5.0,1.0,6.0,1.0),1.0 /*default Value = none */  ),

  /**
   * Clips an absolutely positioned element
   * <br><br>
   * What happens if an image is larger than its containing element?<br>
   * The clip property lets you specify a rectangle to clip an absolutely positioned element. The rectangle is specified as four coordinates, all from the top-left corner of the element to be clipped.<br>
   * Note: The clip property does not work if "overflow:visible".<br>
   * Note: The clip property is deprecated and will be replaced by the clip-path property in the future.<br>
   * <p>Clip an image:</p> 
   * <pre>
   *     img {<br>
   *  &nbsp;&nbsp;position: absolute;<br>
   *  &nbsp;&nbsp;clip: rect(0px,60px,200px,0px);<br>
   *  }
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_pos_clip.asp">https://www.w3schools.com/cssref/pr_pos_clip.asp</a>
   */
  CLIP("clip",true,new BrowserSupport (1.0,8.0,1.0,7.0,1.0),2.0 /*default Value = auto */  ),

  /**
   * Sets the color of text
   * <br><br>
   * The color property specifies the color of text.<br>
   * Tip: Use a background color combined with a text color that makes the text easy to read.<br>
   * <p>Set the text-color for different elements:</p> 
   * <pre> 
   *     body
   *  {<br>
   *  &nbsp;&nbsp;color: red;<br>
   *  }<br><br>
   *  h1
   *  {<br>
   *     &nbsp;
   *  color: #00ff00;<br>
   *  }<br><br>
   *  p.ex
   *  {<br>
   *     &nbsp;
   *  color: rgb(0,0,255);<br>
   *  }
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_text_color.asp">https://www.w3schools.com/cssref/pr_text_color.asp</a>
   */
  COLOR("color",true,new BrowserSupport (1.0,3.0,1.0,3.5,1.0),1.0 /*default Value = not specified */  ),

  /**
   * Specifies the number of columns an element should be divided into
   * <br><br>
   * The column-count property specifies the number of columns an element should be divided into.<br>
   * <p>Divide the text in the &lt;div&gt; element into three columns:</p> 
   * <pre>
   *     div
   *  {<br>
   *     &nbsp;
   *  column-count: 3;<br>
   *  }
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_column-count.asp">https://www.w3schools.com/cssref/css3_pr_column-count.asp</a>
   */
  COLUMN_COUNT("column-count",true,new BrowserSupport (50.0,10.0,52.0,37.0,9.0),3.0 /*default Value = auto */  ),

  /**
   * Specifies how to fill columns, balanced or not
   * <br><br>
   * The column-fill property specifies how to fill columns, balanced or not.<br>
   * Tip: If you add a height to a multi-column element, you can control how the content fills the columns. The content can be balanced or filled sequentially.<br>
   * <p>Specify how to fill columns:</p> 
   * <pre>
   *     .newspaper1 {<br>&nbsp; 
   *     column-fill: auto;<br>}<br><br>.newspaper2 {<br>&nbsp; column-fill: balance;<br>}
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_column-fill.asp">https://www.w3schools.com/cssref/css3_pr_column-fill.asp</a>
   */
  COLUMN_FILL("column-fill",false,new BrowserSupport (50.0,10.0,52.0,37.0,10.0),3.0 /*default Value = balance */  ),

  /**
   * Specifies the gap between the columns
   * <br><br>
   * The column-gap property specifies the gap between the columns.<br>
   * Note: If there is a column-rule between columns, it will appear in the middle of the gap.<br>
   * <p>Specify a 40 pixels gap between the columns:</p> 
   * <pre>
   *     div
   *  {<br>
   *     &nbsp;
   *  column-gap: 40px;<br>
   *  }
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_column-gap.asp">https://www.w3schools.com/cssref/css3_pr_column-gap.asp</a>
   */
  COLUMN_GAP("column-gap",true,new BrowserSupport (50.0,10.0,52.0,37.0,9.0),3.0 /*default Value = normal */  ),

  /**
   * A shorthand property for all the column-rule-* properties
   * <br><br>
   * The column-rule property sets the width, style, and color of the rule between columns.<br>
   * This property is a shorthand property for:<br>
   * <p>Specify the width, style, and color of the rule between columns:</p> 
   * <pre>
   *     div
   *  {<br>&nbsp;&nbsp;column-rule: 4px double #ff00ff;<br>
   *  }
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_column-rule.asp">https://www.w3schools.com/cssref/css3_pr_column-rule.asp</a>
   */
  COLUMN_RULE("column-rule",true,new BrowserSupport (50.0,10.0,52.0,37.0,9.0),3.0 /*default Value = medium none color */  ),

  /**
   * Specifies the color of the rule between columns
   * <br><br>
   * The column-rule-color property specifies the color of the rule between columns.<br>
   * <p>Specify the color of the rule between columns:</p> 
   * <pre>
   *     div
   *  {<br>
   *  &nbsp;&nbsp;column-rule-color: #ff0000;<br>
   *  }
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_column-rule-color.asp">https://www.w3schools.com/cssref/css3_pr_column-rule-color.asp</a>
   */
  COLUMN_RULE_COLOR("column-rule-color",true,new BrowserSupport (50.0,10.0,52.0,37.0,9.0),3.0 /*default Value = The current color of the element */  ),

  /**
   * Specifies the style of the rule between columns
   * <br><br>
   * The column-rule-style property specifies the style of the rule between columns.<br>
   * <p>Specify the style of the rule between columns:</p> 
   * <pre>
   *     div
   *  {<br>
   *     &nbsp;
   *  column-rule-style: dotted;<br>
   *  }
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_column-rule-style.asp">https://www.w3schools.com/cssref/css3_pr_column-rule-style.asp</a>
   */
  COLUMN_RULE_STYLE("column-rule-style",false,new BrowserSupport (50.0,10.0,52.0,37.0,9.0),3.0 /*default Value = none */  ),

  /**
   * Specifies the width of the rule between columns
   * <br><br>
   * The column-rule-width property specifies the width of the rule between columns.<br>
   * <p>Specify the width of the rule between columns:</p> 
   * <pre>
   *     div
   *  {<br>
   *  &nbsp;&nbsp;column-rule-width: 10px;<br>
   *  }
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_column-rule-width.asp">https://www.w3schools.com/cssref/css3_pr_column-rule-width.asp</a>
   */
  COLUMN_RULE_WIDTH("column-rule-width",true,new BrowserSupport (50.0,10.0,52.0,37.0,9.0),3.0 /*default Value = medium */  ),

  /**
   * Specifies how many columns an element should span across
   * <br><br>
   * The column-span property specifies how many columns an element should span across.<br>
   * <p>Let the &lt;h2&gt; element span across all columns:</p> 
   * <pre>
   *     h2
   *  {<br>&nbsp;
   *  column-span: all;<br>
   *  }
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_column-span.asp">https://www.w3schools.com/cssref/css3_pr_column-span.asp</a>
   */
  COLUMN_SPAN("column-span",false,new BrowserSupport (50.0,10.0,71.0,37.0,9.0),3.0 /*default Value = none */  ),

  /**
   * Specifies the column width
   * <br><br>
   * The column-width property specifies the column width.<br>
   * The number of columns will be the minimum number of columns needed to show all the content across the element.<br>
   * column-width is a flexible property. Think of column-width as a minimum width suggestion for the browser. Once the browser cannot fit at least two columns at your specified width then the columns will stop and drop into a single column.<br>
   * <p>Specify that the column width should be 100px:</p> 
   * <pre>
   *     div
   *  {<br>
   *  &nbsp;&nbsp;column-width: 100px;<br> 
   *  }
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_column-width.asp">https://www.w3schools.com/cssref/css3_pr_column-width.asp</a>
   */
  COLUMN_WIDTH("column-width",true,new BrowserSupport (50.0,10.0,52.0,37.0,9.0),3.0 /*default Value = auto */  ),

  /**
   * A shorthand property for column-width and column-count
   * <br><br>
   * The columns property is a shorthand property for:<br>
   * <p>Specify the minimum width for each column, and the maximum number of columns:</p> 
   * <pre>
   *     div
   *  {<br>&nbsp;&nbsp;columns: 100px 3;<br>  
   *  }
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_columns.asp">https://www.w3schools.com/cssref/css3_pr_columns.asp</a>
   */
  COLUMNS("columns",true,new BrowserSupport (50.0,10.0,52.0,37.0,9.0),3.0 /*default Value = auto auto */  ),

  /**
   * Used with the :before and :after pseudo-elements, to insert generated content
   * <br><br>
   * The content property is used with the ::before and ::after pseudo-elements, to insert generated content.<br>
   * <p>The following example inserts the value of the href attribute in parenthesis after each &lt;a&gt; element:</p> 
   * <pre>
   * a::after {<br>
   *  &nbsp;&nbsp;content: " (" attr(href) ")";<br>
   *  }
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_gen_content.asp">https://www.w3schools.com/cssref/pr_gen_content.asp</a>
   */
  CONTENT("content",false,new BrowserSupport (1.0,8.0,1.0,4.0,1.0),2.0 /*default Value = normal */  ),

  /**
   * Increases or decreases the value of one or more CSS counters
   * <br><br>
   * The counter-increment property increases or decreases the value of one or more CSS counters.<br>
   * The counter-increment property is usually used together with the counter-reset property and the content property.<br>
   * <p>Create a counter ("my-sec-counter") and increase it by one for each occurrence of the &lt;h2&gt; selector:</p> 
   * <pre>
   *   
   *     body {<br>&nbsp; // Set "my-sec-counter" to 0 
   * <br>&nbsp; 
   *     counter-reset: my-sec-counter;<br>}<br><br>h2::before {<br>&nbsp; 
   *     // Increment "my-sec-counter" by 1 
   * <br>&nbsp; counter-increment: 
   *     my-sec-counter;<br>&nbsp;&nbsp;content: "Section " 
   *     counter(my-sec-counter) ". ";<br>}&nbsp;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_gen_counter-increment.asp">https://www.w3schools.com/cssref/pr_gen_counter-increment.asp</a>
   */
  COUNTER_INCREMENT("counter-increment",false,new BrowserSupport (4.0,8.0,2.0,9.6,3.1),2.0 /*default Value = none */  ),

  /**
   * Creates or resets one or more CSS counters
   * <br><br>
   * The counter-reset property creates or resets one or more CSS counters.<br>
   * The counter-reset property is usually used together with the counter-increment property and the content property.<br>
   * <p>Create a counter ("my-sec-counter") and increase it by one for each occurrence of the &lt;h2&gt; selector:</p> 
   * <pre>
   *   
   *     body {<br>&nbsp; // Set "my-sec-counter" to 0 
   * <br>&nbsp; 
   *     counter-reset: my-sec-counter;<br>}<br><br>h2::before {<br>&nbsp;&nbsp;// Increment "my-sec-counter" by 1 
   * <br>&nbsp;&nbsp;counter-increment: 
   *     my-sec-counter;<br>&nbsp;&nbsp;content: "Section " 
   *     counter(my-sec-counter) ". ";<br>}   
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_gen_counter-reset.asp">https://www.w3schools.com/cssref/pr_gen_counter-reset.asp</a>
   */
  COUNTER_RESET("counter-reset",false,new BrowserSupport (4.0,8.0,2.0,9.6,3.1),2.0 /*default Value = none */  ),

  /**
   * Specifies the mouse cursor to be displayed when pointing over an element
   * <br><br>
   * The cursor property specifies the mouse cursor to be displayed when pointing over an element.<br>
   * <p>CSS can generate a bunch of different mouse cursors:</p> 
   * <pre>
   *
   *     .alias {cursor: alias;}<br>.all-scroll {cursor: all-scroll;}<br>.auto 
   *     {cursor: auto;}<br>.cell {cursor: cell;}<br>.context-menu {cursor: 
   *     context-menu;}<br>.col-resize {cursor: col-resize;}<br>.copy {cursor: copy;}<br>
   *     .crosshair {cursor: crosshair;}<br>.default {cursor: default;}<br>.e-resize 
   *     {cursor: e-resize;}<br>.ew-resize {cursor: ew-resize;}<br>.grab {cursor: 
   *     grab;}<br>.grabbing {cursor: grabbing;}<br>.help {cursor: help;}<br>.move 
   *     {cursor: move;}<br>.n-resize {cursor: n-resize;}<br>.ne-resize {cursor: 
   *     ne-resize;}<br>.nesw-resize {cursor: nesw-resize;}<br>.ns-resize {cursor: 
   *     ns-resize;}<br>.nw-resize {cursor: nw-resize;}<br>.nwse-resize {cursor: nwse-resize;}<br>
   *     .no-drop {cursor: no-drop;}<br>.none {cursor: none;}<br>.not-allowed 
   *     {cursor: not-allowed;}<br>.pointer {cursor: pointer;}<br>.progress {cursor: 
   *     progress;}<br>.row-resize {cursor: row-resize;}<br>.s-resize {cursor: 
   *     s-resize;}<br>.se-resize {cursor: se-resize;}<br>.sw-resize {cursor: sw-resize;}<br>
   *     .text {cursor: text;}<br>.url {cursor: url(myBall.cur),auto;}<br>.w-resize 
   *     {cursor: w-resize;}<br>.wait {cursor: wait;}<br>.zoom-in {cursor: zoom-in;}<br>
   *     .zoom-out {cursor: zoom-out;}
   *   
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_class_cursor.asp">https://www.w3schools.com/cssref/pr_class_cursor.asp</a>
   */
  CURSOR("cursor",false,new BrowserSupport (5.0,5.5,4.0,9.6,5.0),2.0 /*default Value = auto */  ),

  /**
   * Specifies the text direction/writing direction
   * <br><br>
   * The direction property specifies the text direction/writing direction within a block-level element.<br>
   * Tip: Use this property together with the unicode-bidi property to set or return whether the text should be overridden to support multiple languages in the same document.<br>
   * <p>Set the text direction to "right-to-left":</p> 
   * <pre>
   *     p.rtl
   *  {<br>
   *  &nbsp;&nbsp;direction: rtl;<br>
   *  }
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_text_direction.asp">https://www.w3schools.com/cssref/pr_text_direction.asp</a>
   */
  DIRECTION("direction",false,new BrowserSupport (2.0,5.5,1.0,9.2,1.3),2.0 /*default Value = ltr */  ),

  /**
   * Specifies how a certain HTML element should be displayed
   * <br><br>
   * The display property specifies the display behavior (the type of rendering box) of an element.<br>
   * In HTML, the default display property value is taken from the HTML specifications or from the browser/user default style sheet. The default value in XML is inline, including SVG elements.<br>
   * <p>Use of some different display values:</p> 
   * <pre>
   * p.ex1 {display: none;}<br>p.ex2 {display: inline;}<br>p.ex3 {display: 
   * block;}<br>p.ex4 {display: inline-block;}
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_class_display.asp">https://www.w3schools.com/cssref/pr_class_display.asp</a>
   */
  DISPLAY("display",false,new BrowserSupport (4.0,8.0,3.0,7.0,3.1),1.0 /*default Value = ? */  ),

  /**
   * Specifies whether or not to display borders and background on empty cells in a table
   * <br><br>
   * The empty-cells property sets whether or not to display borders on empty cells in a table.<br>
   * Note: This property has no effect if border-collapse is "collapse".<br>
   * <p>Display no borders on empty cells in a table:</p> 
   * <pre>
   *   
   *     table
   *  {<br>
   *  &nbsp;&nbsp;empty-cells: hide;<br>
   *  }
   *   
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_tab_empty-cells.asp">https://www.w3schools.com/cssref/pr_tab_empty-cells.asp</a>
   */
  EMPTY_CELLS("empty-cells",false,new BrowserSupport (1.0,8.0,1.0,4.0,1.2),2.0 /*default Value = show */  ),

  /**
   * Defines effects (e.g. blurring or color shifting) on an element before the element is displayed
   * <br><br>
   * The filter property defines visual effects (like blur and saturation) to an element (often <img>).<br>
   * <p>Change all images to black and white (100% gray):</p> 
   * <pre> 
   * img {<br>&nbsp;&nbsp;filter: grayscale(100%);<br>}</pre> <!--
   * <br>
   * <div class="w3-padding w3-white notranslate"> 
   * <div class="img">
   *  <img src="pineapple.jpg" class="w3-image" alt="Mountain View">
   *  <div class="desc">Original image</div>
   * </div>
   * <div class="img">
   *  <img class="w3-image filter_gray" src="pineapple.jpg" alt="Mountain View">
   *  <div class="desc">grayscale(100%)</div>
   * </div>
   * <p style="clear:both;"></p>
   * </div>--><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_filter.asp">https://www.w3schools.com/cssref/css3_pr_filter.asp</a>
   */
  FILTER("filter",true,new BrowserSupport (53.0,13.0,35.0,40.0,9.1),3.0 /*default Value = none */  ),

  /**
   * A shorthand property for the flex-grow, flex-shrink, and the flex-basis properties
   * <br><br>
   * The flex property is a shorthand property for:<br>
   * <p>Let all the flexible items be the same length, regardless of its content:</p> 
   * <pre>
   *     #main div {<br>&nbsp;&nbsp;-ms-flex: 1; // IE 10 
   *  <br>
   *     &nbsp; flex: 1;<br>}</pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_flex.asp">https://www.w3schools.com/cssref/css3_pr_flex.asp</a>
   */
  FLEX("flex",true,new BrowserSupport (29.0,11.0,28.0,17.0,9.0),3.0 /*default Value = 0 1 auto */  ),

  /**
   * Specifies the initial length of a flexible item
   * <br><br>
   * The flex-basis property specifies the initial length of a flexible item.<br>
   * Note: If the element is not a flexible item, the flex-basis property has no effect.<br>
   * <p>Set the initial length of the second flex-item to 100 pixels:</p> 
   * <pre>
   *  div:nth-of-type(2) {<br>&nbsp; flex-basis: 
   *   100px;<br>}</pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_flex-basis.asp">https://www.w3schools.com/cssref/css3_pr_flex-basis.asp</a>
   */
  FLEX_BASIS("flex-basis",true,new BrowserSupport (29.0,11.0,28.0,17.0,9.0),3.0 /*default Value = auto */  ),

  /**
   * Specifies the direction of the flexible items
   * <br><br>
   * The flex-direction property specifies the direction of the flexible items.<br>
   * Note: If the element is not a flexible item, the flex-direction property has no effect.<br>
   * <p>Set the direction of the flexible items inside the &lt;div&gt; element in reverse order:</p> 
   * <pre>
   * div
   * {<br>
   *   &nbsp;
   *   display: flex;<br>
   *   &nbsp;&nbsp;flex-direction: row-reverse; <br>
   * }<br>
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_flex-direction.asp">https://www.w3schools.com/cssref/css3_pr_flex-direction.asp</a>
   */
  FLEX_DIRECTION("flex-direction",false,new BrowserSupport (29.0,11.0,28.0,17.0,9.0),3.0 /*default Value = row */  ),

  /**
   * A shorthand property for the flex-direction and the flex-wrap properties
   * <br><br>
   * The flex-flow property is a shorthand property for:<br>
   * <p>Make the flexible items display in reverse order, and wrap if necessary:</p> 
   * <pre>
   *  div {<br>&nbsp;
   *  display: flex;<br>&nbsp; flex-flow: row-reverse wrap;<br>}</pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_flex-flow.asp">https://www.w3schools.com/cssref/css3_pr_flex-flow.asp</a>
   */
  FLEX_FLOW("flex-flow",false,new BrowserSupport (29.0,11.0,28.0,17.0,9.0),3.0 /*default Value = row nowrap */  ),

  /**
   * Specifies how much the item will grow relative to the rest
   * <br><br>
   * The flex-grow property specifies how much the item will grow relative to the rest of the flexible items inside the same container.<br>
   * Note: If the element is not a flexible item, the flex-grow property has no effect.<br>
   * <p>Let the second flex-item grow three times wider than the rest:</p> 
   * <pre>
   *   div:nth-of-type(1) {flex-grow: 1;}<br>
   * div:nth-of-type(2) {flex-grow: 3;}<br>
   * div:nth-of-type(3) {flex-grow: 1;}</pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_flex-grow.asp">https://www.w3schools.com/cssref/css3_pr_flex-grow.asp</a>
   */
  FLEX_GROW("flex-grow",true,new BrowserSupport (29.0,11.0,28.0,17.0,9.0),3.0 /*default Value = 0 */  ),

  /**
   * Specifies how the item will shrink relative to the rest
   * <br><br>
   * The flex-shrink property specifies how the item will shrink relative to the rest of the flexible items inside the same container.<br>
   * Note: If the element is not a flexible item, the flex-shrink property has no effect.<br>
   * <p>Let the second flex-item shrink three times more than the rest:</p> 
   * <pre>
   *   div:nth-of-type(2) {<br>&nbsp; flex-shrink: 3;<br>}</pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_flex-shrink.asp">https://www.w3schools.com/cssref/css3_pr_flex-shrink.asp</a>
   */
  FLEX_SHRINK("flex-shrink",true,new BrowserSupport (29.0,11.0,28.0,17.0,9.0),3.0 /*default Value = 1 */  ),

  /**
   * Specifies whether the flexible items should wrap or not
   * <br><br>
   * The flex-wrap property specifies whether the flexible items should wrap or not.<br>
   * Note: If the elements are not flexible items, the flex-wrap property has no effect.<br>
   * <p>Make the flexible items wrap if necessary:</p> 
   * <pre>
   *  div {<br>
   *   &nbsp;
   *  display: flex;&nbsp;&nbsp; <br>&nbsp; flex-wrap: wrap;<br>}</pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_flex-wrap.asp">https://www.w3schools.com/cssref/css3_pr_flex-wrap.asp</a>
   */
  FLEX_WRAP("flex-wrap",false,new BrowserSupport (29.0,11.0,28.0,17.0,9.0),3.0 /*default Value = nowrap */  ),

  /**
   * Specifies whether or not a box should float
   * <br><br>
   * The float property specifies how an element should float.<br>
   * Note: Absolutely positioned elements ignore the float property!<br>
   * Note: Elements after a floating element will flow around it. To avoid this, use the clear property or the clearfix hack (see example at the bottom of this page).<br>
   * <p>Let an image float to the right:</p> 
   * <pre>
   *     img&nbsp;
   *  {<br>
   *     &nbsp;
   *  float: right;<br>
   *  }
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_class_float.asp">https://www.w3schools.com/cssref/pr_class_float.asp</a>
   */
  FLOAT("float",false,new BrowserSupport (1.0,4.0,1.0,7.0,1.0),1.0 /*default Value = none */  ),

  /**
   * A shorthand property for the font-style, font-variant, font-weight, font-size/line-height, and the font-family properties
   * <br><br>
   * The font property is a shorthand property for:<br>
   * <p>Set some font properties with the shorthand declaration:</p> 
   * <pre>
   *     p.a
   *  {<br>
   *     &nbsp;
   *  font: 15px Arial, sans-serif;<br>
   *  }<br>
   *  <br>
   *  p.b
   *  {<br>
   *     &nbsp;
   *  font: italic small-caps bold 12px/30px Georgia, serif;<br>
   *  }
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_font_font.asp">https://www.w3schools.com/cssref/pr_font_font.asp</a>
   */
  FONT("font",true,new BrowserSupport (1.0,4.0,1.0,3.5,1.0),1.0 /*default Value = The default value of the font properties */  ),

  /**
   * A rule that allows websites to download and use fonts other than the "web-safe" fonts
   * <br><br>
   * With the @font-face rule, web designers do not have to use one of the "web-safe" fonts anymore.<br>
   * In the @font-face rule you must first define a name for the font (e.g. myFirstFont), and then point to the font file.<br>
   * To use the font for an HTML element, refer to the name of the font (myFirstFont) through the font-family property:<br>
   * <p>Specify a font named "myFirstFont", and specify the URL where it can be found:</p> 
   * <pre>
   * @font-face
   * {<br>
   * &nbsp;&nbsp;font-family: myFirstFont;<br>
   *   &nbsp;
   * src: url(sansation_light.woff);<br>
   * }</pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_font-face_rule.asp">https://www.w3schools.com/cssref/css3_pr_font-face_rule.asp</a>
   */
  FONT_FACE("@font-face",false,new BrowserSupport (4.0,-1.0,3.5,10.0,3.1),-1.0 /*default Value = null */  ),

  /**
   * Specifies the font family for text
   * <br><br>
   * The font-family property specifies the font for an element.<br>
   * The font-family property can hold several font names as a "fallback" system. If the browser does not support the first font, it tries the next font.<br>
   * There are two types of font family names:<br>
   * <p>Specify the font for two paragraphs:</p> 
   * <pre>
   *     p.a {<br>&nbsp;&nbsp;font-family: "Times New Roman", Times, serif;<br>
   *     }<br><br>p.b {<br>&nbsp; font-family: Arial, Helvetica, 
   *     sans-serif;<br>}
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_font_font-family.asp">https://www.w3schools.com/cssref/pr_font_font-family.asp</a>
   */
  FONT_FAMILY("font-family",false,new BrowserSupport (1.0,4.0,1.0,3.5,1.0),1.0 /*default Value = depends on the browser */  ),

  /**
   * Allows control over advanced typographic features in OpenType fonts
   * <br><br>
   * The font-feature-settings property allows control over advanced typographic features in OpenType fonts.<br>
   * <p>Specify font-feature-settings:</p> 
   * <pre>
   *     // enable small-caps 
   * <br>.ex1 { font-feature-settings: "smcp" on; }<br>
   *     <br>// convert both upper and lowercase to small caps 
   * <br>.ex2 { 
   *     font-feature-settings: "c2sc", "smcp"; }<br><br>// no common ligatures 
   * <br>
   *     .ex3 { font-feature-settings: "liga" 0; }<br><br>// enable automatic 
   *     fractions 
   * <br>.ex4 { font-feature-settings: "frac"; }
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_font-feature-settings.asp">https://www.w3schools.com/cssref/css3_pr_font-feature-settings.asp</a>
   */
  FONT_FEATURE_SETTINGS("font-feature-settings",false,new BrowserSupport (48.0,10.0,34.0,35.0,9.1),3.0 /*default Value = normal */  ),

  /**
   * Allows authors to use a common name in font-variant-alternate for feature activated differently in OpenType
   */
  FONT_FEATURE_VALUES("@font-feature-values",false,new BrowserSupport (-1.0,-1.0,-1.0,-1.0,-1.0),-1.0 /*default Value = null */  ),

  /**
   * Controls the usage of the kerning information (how letters are spaced)
   * <br><br>
   * The font-kerning property controls the usage of the kerning information stored in a font.<br>
   * Tip: Kerning defines how letters are spaced.<br>
   * Note: For fonts that do not include kerning data, this property will have no visible effect.<br>
   * <p>Specify that font kerning is applied:</p> 
   * <pre>
   *     .ex1 { <br>&nbsp;&nbsp;font-kerning: normal;<br>}
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_font-kerning.asp">https://www.w3schools.com/cssref/css3_pr_font-kerning.asp</a>
   */
  FONT_KERNING("font-kerning",false,new BrowserSupport (33.0,79.0,34.0,20.1,9.1),3.0 /*default Value = auto */  ),

  /**
   * Controls the usage of language-specific glyphs in a typeface
   * <br><br>
   * The font-language-override property controls the usage of language-specific glyphs.<br>
   * <p>Specify that font kerning is applied:</p> 
   * <pre>
   *     div1 { <br>&nbsp;&nbsp;font-language-override: normal;<br>}<br><br>div2 { <br>
   *     &nbsp; font-language-override: 
   *     NOR;<br>}
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_font-language-override.asp">https://www.w3schools.com/cssref/css3_pr_font-language-override.asp</a>
   */
  FONT_LANGUAGE_OVERRIDE("font-language-override",false,new BrowserSupport (-2.0,-2.0,34.0,-2.0,-2.0),3.0 /*default Value = normal */  ),

  /**
   * Specifies the font size of text
   * <br><br>
   * The font-size property sets the size of a font.<br>
   * <p>Set the font size for different elements:</p> 
   * <pre>
   *   
   *     div.a {<br>&nbsp; font-size: 15px;<br>}<br><br>div.b {<br>&nbsp; 
   *     font-size: large;<br>}<br><br>div.c {<br>&nbsp; font-size: 150%;<br>
   *     }
   *   
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_font_font-size.asp">https://www.w3schools.com/cssref/pr_font_font-size.asp</a>
   */
  FONT_SIZE("font-size",true,new BrowserSupport (1.0,5.5,1.0,7.0,1.0),1.0 /*default Value = medium */  ),

  /**
   * Preserves the readability of text when font fallback occurs
   * <br><br>
   * The font-size-adjust property gives you better control of the font size when the first selected font is not available.<br>
   * When a font is not available, the browser uses the second specified font. This could result in a big change for the font size. To prevent this, use the font-size-adjust property.<br>
   * All fonts have an "aspect value" which is the size-difference between the lowercase letter "x" and the uppercase letter "X".<br>
   * When the browser knows the "aspect value" for the first selected font, the browser can figure out what font-size to use when displaying text with the second choice font.<br>
   * <p>By specifying the font-size-adjust property, the browser will adjust the font size to be the same regardless of the font family ("verdana" has the aspect value 0.58)</p> 
   * <pre>
   *   
   *     div
   *  {<br>
   *  &nbsp;&nbsp;font-size-adjust: 0.58;<br>
   *  }
   *   
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_font-size-adjust.asp">https://www.w3schools.com/cssref/css3_pr_font-size-adjust.asp</a>
   */
  FONT_SIZE_ADJUST("font-size-adjust",true,new BrowserSupport (-2.0,-2.0,3.0,-2.0,-2.0),3.0 /*default Value = none */  ),

  /**
   * Selects a normal, condensed, or expanded face from a font family
   * <br><br>
   * The font-stretch property allows you to make text narrower (condensed) or wider (expanded).<br>
   * Note: Some fonts provide additional faces; condensed faces and expanded faces. For these fonts, you can use the font-stretch property to selct a normal, condensed, or expanded font face.<br>
   * Note: This property has no effect if the selected font does not offer condensed or expanded faces!<br>
   * <p>Make the text in &lt;div&gt; elements wider:</p> 
   * <pre>
   *     div
   *  {<br>&nbsp; font-family: sans-serif, "Helvetica Neue", "Lucida Grande", Arial;<br>
   *  &nbsp;&nbsp;font-stretch: expanded;<br>
   *  }
   * </pre> 
   * <br><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_font-stretch.asp">https://www.w3schools.com/cssref/css3_pr_font-stretch.asp</a>
   */
  FONT_STRETCH("font-stretch",true,new BrowserSupport (48.0,9.0,9.0,35.0,11.0),3.0 /*default Value = normal */  ),

  /**
   * Specifies the font style for text
   * <br><br>
   * The font-style property specifies the font style for a text.<br>
   * <p>Set different font styles for three paragraphs:</p> 
   * <pre>
   * p.a {<br>&nbsp;&nbsp;font-style: normal;<br>}<br><br>
   * p.b {<br>&nbsp; font-style: italic;<br>}<br><br>
   * p.c {<br>&nbsp; font-style: oblique;<br>}
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_font_font-style.asp">https://www.w3schools.com/cssref/pr_font_font-style.asp</a>
   */
  FONT_STYLE("font-style",false,new BrowserSupport (1.0,4.0,1.0,7.0,1.0),1.0 /*default Value = normal */  ),

  /**
   * Controls which missing typefaces (bold or italic) may be synthesized by the browser
   */
  FONT_SYNTHESIS("font-synthesis",false,new BrowserSupport (-1.0,-1.0,-1.0,-1.0,-1.0),-1.0 /*default Value = null */  ),

  /**
   * Specifies whether or not a text should be displayed in a small-caps font
   * <br><br>
   * In a small-caps font, all lowercase letters are converted to uppercase letters. However, the converted uppercase letters appears in a smaller font size than the original uppercase letters in the text.<br>
   * The font-variant property specifies whether or not a text should be displayed in a small-caps font.<br>
   * <p>Set a paragraph to a small-caps font:</p> 
   * <pre> 
   *     p.small
   *  {<br>
   *     &nbsp;
   *  font-variant: small-caps;<br>
   *  }
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_font_font-variant.asp">https://www.w3schools.com/cssref/pr_font_font-variant.asp</a>
   */
  FONT_VARIANT("font-variant",false,new BrowserSupport (1.0,4.0,1.0,3.5,1.0),1.0 /*default Value = normal */  ),

  /**
   * Controls the usage of alternate glyphs associated to alternative names defined in @font-feature-values
   */
  FONT_VARIANT_ALTERNATES("font-variant-alternates",false,new BrowserSupport (-1.0,-1.0,-1.0,-1.0,-1.0),-1.0 /*default Value = null */  ),

  /**
   * Controls the usage of alternate glyphs for capital letters
   * <br><br>
   * The font-variant-caps property controls the usage of alternate glyphs for capital letters.<br>
   * <p>Set a paragraph to a small-caps font:</p> 
   * <pre> 
   *     p.normal {font-variant-caps: normal;}<br>p.small {font-variant-caps: 
   *     small-caps;}<br>p.allsmall {font-variant-caps: all-small-caps;}<br>p.petite 
   *     {font-variant-caps: petite-caps;}<br>p.allpetite {font-variant-caps: 
   *     all-petite-caps;}<br>p.unicase {font-variant-caps: unicase;}<br>p.titling 
   *     {font-variant-caps: titling-caps;}
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_font-variant-caps.asp">https://www.w3schools.com/cssref/css3_pr_font-variant-caps.asp</a>
   */
  FONT_VARIANT_CAPS("font-variant-caps",false,new BrowserSupport (52.0,79.0,34.0,39.0,-2.0),3.0 /*default Value = normal */  ),

  /**
   * Controls the usage of alternate glyphs for East Asian scripts (e.g Japanese and Chinese)
   * <br><br>
   * The font-variant-caps property controls the usage of alternate glyphs for East Asian scripts (such as Japanese and Chinese).<br>
   * <p>Set a paragraph to a small-caps font:</p> 
   * <pre> 
   *     p.normal {font-variant-caps: normal;}<br>p.small {font-variant-caps: 
   *     small-caps;}<br>p.allsmall {font-variant-caps: all-small-caps;}<br>p.petite 
   *     {font-variant-caps: petite-caps;}<br>p.allpetite {font-variant-caps: 
   *     all-petite-caps;}<br>p.unicase {font-variant-caps: unicase;}<br>p.titling 
   *     {font-variant-caps: titling-caps;}
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_font-variant-east-asian.asp">https://www.w3schools.com/cssref/css3_pr_font-variant-east-asian.asp</a>
   */
  FONT_VARIANT_EAST_ASIAN("font-variant-east-asian",false,new BrowserSupport (63.0,-2.0,34.0,50.0,-2.0),3.0 /*default Value = normal */  ),

  /**
   * Controls which ligatures and contextual forms are used in textual content of the elements it applies to
   */
  FONT_VARIANT_LIGATURES("font-variant-ligatures",false,new BrowserSupport (-1.0,-1.0,-1.0,-1.0,-1.0),-1.0 /*default Value = null */  ),

  /**
   * Controls the usage of alternate glyphs for numbers, fractions, and ordinal markers
   */
  FONT_VARIANT_NUMERIC("font-variant-numeric",false,new BrowserSupport (-1.0,-1.0,-1.0,-1.0,-1.0),-1.0 /*default Value = null */  ),

  /**
   * Controls the usage of alternate glyphs of smaller size positioned as superscript or subscript regarding the baseline of the font
   */
  FONT_VARIANT_POSITION("font-variant-position",false,new BrowserSupport (-1.0,-1.0,-1.0,-1.0,-1.0),-1.0 /*default Value = null */  ),

  /**
   * Specifies the weight of a font
   * <br><br>
   * The font-weight property sets how thick or thin characters in text should be displayed.<br>
   * <p>Set different font weight for three paragraphs:</p> 
   * <pre>
   *   
   *     p.normal {<br>&nbsp;&nbsp;font-weight: normal;<br>}<br><br>
   *  p.thick {<br>&nbsp; font-weight: bold;<br>}<br><br>
   *  p.thicker {<br>&nbsp;&nbsp;font-weight: 900;<br>}
   *   
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_font_weight.asp">https://www.w3schools.com/cssref/pr_font_weight.asp</a>
   */
  FONT_WEIGHT("font-weight",true,new BrowserSupport (2.0,4.0,1.0,3.5,1.3),1.0 /*default Value = normal */  ),

  /**
   * A shorthand property for the grid-template-rows, grid-template-columns, grid-template-areas, grid-auto-rows, grid-auto-columns, and the grid-auto-flow properties
   * <br><br>
   * The grid property is a shorthand property for:<br>
   * <p>Make a three columns grid layout where the first row is 150px high:</p> 
   * <pre>
   *   .grid-container {<br>&nbsp;&nbsp;display: grid;<br>&nbsp; grid: 150px 
   *   / auto auto auto;<br>}</pre><br>
   *  From : <a href="https://www.w3schools.com/cssref//cssref/pr_grid.asp">https://www.w3schools.com/cssref//cssref/pr_grid.asp</a>
   */
  GRID("grid",true,new BrowserSupport (57.0,16.0,52.0,44.0,10.0),-1.0 /*default Value = none none none auto auto row */  ),

  /**
   * Either specifies a name for the grid item, or this property is a shorthand property for the grid-row-start, grid-column-start, grid-row-end, and grid-column-end properties
   * <br><br>
   * The grid-area property specifies a grid item's size and location in a grid layout, and is a shorthand property for the following properties:<br>
   * <p>Make "item1" start on row 2 column 1, and span 2 rows and 3 columns:</p> 
   * <pre>
   *   .item1 {<br>&nbsp; grid-area: 2 / 1 / span 2 / span 3;<br>}</pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_grid-area.asp">https://www.w3schools.com/cssref/pr_grid-area.asp</a>
   */
  GRID_AREA("grid-area",true,new BrowserSupport (57.0,16.0,52.0,44.0,10.0),-1.0 /*default Value = auto / auto / auto / auto */  ),

  /**
   * Specifies a default column size
   * <br><br>
   * The grid-auto-columns property sets a size for the columns in a grid container.<br>
   * This property affects only columns with the size not set.<br>
   * <p>Set a default size for the columns in a grid:</p> 
   * <pre>
   *   .grid-container {<br>&nbsp;&nbsp;display: grid;<br>&nbsp; grid-auto-columns: 50px;<br>}</pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_grid-auto-columns.asp">https://www.w3schools.com/cssref/pr_grid-auto-columns.asp</a>
   */
  GRID_AUTO_COLUMNS("grid-auto-columns",true,new BrowserSupport (57.0,16.0,52.0,44.0,10.0),-1.0 /*default Value = auto */  ),

  /**
   * Specifies how auto-placed items are inserted in the grid
   * <br><br>
   * The grid-auto-flow property controls how auto-placed items get inserted in the grid.<br>
   * <p>Insert auto-placed items column by column:</p> 
   * <pre>
   *   .grid-container {<br>&nbsp;&nbsp;display: grid;<br>&nbsp; grid-auto-flow: 
   *   column;<br>}</pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_grid-auto-flow.asp">https://www.w3schools.com/cssref/pr_grid-auto-flow.asp</a>
   */
  GRID_AUTO_FLOW("grid-auto-flow",true,new BrowserSupport (57.0,16.0,52.0,44.0,10.0),-1.0 /*default Value = row */  ),

  /**
   * Specifies a default row size
   * <br><br>
   * The grid-auto-rows property sets a size for the rows in a grid container.<br>
   * This property affects only rows with the size not set.<br>
   * <p>Set a default size for the rows in a grid:</p> 
   * <pre>
   *   .grid-container {<br>&nbsp;&nbsp;display: grid;<br>&nbsp; grid-auto-rows: 150px;<br>}</pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_grid-auto-rows.asp">https://www.w3schools.com/cssref/pr_grid-auto-rows.asp</a>
   */
  GRID_AUTO_ROWS("grid-auto-rows",true,new BrowserSupport (57.0,16.0,52.0,44.0,10.0),-1.0 /*default Value = auto */  ),

  /**
   * A shorthand property for the grid-column-start and the grid-column-end properties
   * <br><br>
   * The grid-column property specifies a grid item's size and location in a grid layout, and is a shorthand property for the following properties:<br>
   * <p>Make "item1" start on column 1 and span 2 columns:</p> 
   * <pre>
   * .item1 {<br>&nbsp; grid-column: 1 / span 2;<br>}</pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_grid-column.asp">https://www.w3schools.com/cssref/pr_grid-column.asp</a>
   */
  GRID_COLUMN("grid-column",true,new BrowserSupport (57.0,16.0,52.0,44.0,10.0),-1.0 /*default Value = auto / auto */  ),

  /**
   * Specifies where to end the grid item
   * <br><br>
   * The grid-column-end property defines how many columns an item will span, or on which column-line the item will end (see example at the end of this page).<br>
   * <p>Make "item1" span 3 columns:</p> 
   * <pre>
   *   .item1 {<br>&nbsp; grid-column-end: span 3;<br>}</pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_grid-column-end.asp">https://www.w3schools.com/cssref/pr_grid-column-end.asp</a>
   */
  GRID_COLUMN_END("grid-column-end",true,new BrowserSupport (57.0,16.0,52.0,44.0,10.0),-1.0 /*default Value = auto */  ),

  /**
   * Specifies the size of the gap between columns
   * <br><br>
   * The grid-column-gap property defines the size of the gap between the columns in a grid layout.<br>
   * <p>Set the gap between columns to 50px:</p> 
   * <pre>
   *   .grid-container {<br>&nbsp; grid-column-gap: 50px;<br>}</pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_grid-column-gap.asp">https://www.w3schools.com/cssref/pr_grid-column-gap.asp</a>
   */
  GRID_COLUMN_GAP("grid-column-gap",true,new BrowserSupport (57.0,16.0,52.0,44.0,10.0),-1.0 /*default Value = 0 */  ),

  /**
   * Specifies where to start the grid item
   * <br><br>
   * The grid-column-start property defines on which column-line the item will start.<br>
   * <p>Make "item1" start on column 2:</p> 
   * <pre>
   *   .item1 {<br>&nbsp; grid-column-start: 2;<br>}</pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_grid-column-start.asp">https://www.w3schools.com/cssref/pr_grid-column-start.asp</a>
   */
  GRID_COLUMN_START("grid-column-start",true,new BrowserSupport (57.0,16.0,52.0,44.0,10.0),-1.0 /*default Value = auto */  ),

  /**
   * A shorthand property for the grid-row-gap and grid-column-gap properties
   * <br><br>
   * The grid-gap property defines the size of the gap between the rows and columns in a grid layout, and is a shorthand property for the following properties:<br>
   * <p>Set the gap between rows <em>and</em> columns to 50px:</p> 
   * <pre>
   *   .grid-container {<br>&nbsp; grid-gap: 50px;<br>}</pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_grid-gap.asp">https://www.w3schools.com/cssref/pr_grid-gap.asp</a>
   */
  GRID_GAP("grid-gap",true,new BrowserSupport (57.0,16.0,52.0,44.0,10.0),-1.0 /*default Value = 0 0 */  ),

  /**
   * A shorthand property for the grid-row-start and the grid-row-end properties
   * <br><br>
   * The grid-row property specifies a grid item's size and location in a grid layout, and is a shorthand property for the following properties::<br>
   * <p>Make "item1" start on row 1 and span 2 rows:</p> 
   * <pre>
   *   .item1 {<br>&nbsp; grid-row: 1 / span 2;<br>}</pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_grid-row.asp">https://www.w3schools.com/cssref/pr_grid-row.asp</a>
   */
  GRID_ROW("grid-row",true,new BrowserSupport (57.0,16.0,52.0,44.0,10.0),-1.0 /*default Value = auto / auto */  ),

  /**
   * Specifies where to end the grid item
   * <br><br>
   * The grid-row-end property defines how many rows an item will span, or on which row-line the item will end (see example at the end of this page).<br>
   * <p>Make "item1" span 3 rows:</p> 
   * <pre>
   *   .item1 {<br>&nbsp; grid-row-end: span 3;<br>}</pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_grid-row-end.asp">https://www.w3schools.com/cssref/pr_grid-row-end.asp</a>
   */
  GRID_ROW_END("grid-row-end",true,new BrowserSupport (57.0,16.0,52.0,44.0,10.0),-1.0 /*default Value = auto */  ),

  /**
   * Specifies the size of the gap between rows
   * <br><br>
   * The grid-row-gap property defines the size of the gap between the rows in a grid layout.<br>
   * <p>Set the gap between rows to 50px:</p> 
   * <pre>
   *   .grid-container {<br>&nbsp; grid-row-gap: 50px;<br>}</pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_grid-row-gap.asp">https://www.w3schools.com/cssref/pr_grid-row-gap.asp</a>
   */
  GRID_ROW_GAP("grid-row-gap",true,new BrowserSupport (57.0,16.0,52.0,44.0,10.0),-1.0 /*default Value = 0 */  ),

  /**
   * Specifies where to start the grid item
   * <br><br>
   * The grid-row-start property defines on which row-line the item will start.<br>
   * <p>Make "item1" start on row 2:</p> 
   * <pre>
   *   .item1 {<br>&nbsp; grid-row-start: 2;<br>}</pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_grid-row-start.asp">https://www.w3schools.com/cssref/pr_grid-row-start.asp</a>
   */
  GRID_ROW_START("grid-row-start",true,new BrowserSupport (57.0,16.0,52.0,44.0,10.0),-1.0 /*default Value = auto */  ),

  /**
   * A shorthand property for the grid-template-rows, grid-template-columns and grid-areas properties
   * <br><br>
   * The grid-template property is a shorthand property for the following properties:<br>
   * <p>Make a three columns grid layout where the first row is 150px high:</p> 
   * <pre>
   *   .grid-container {<br>&nbsp;&nbsp;display: grid;<br>&nbsp; grid-template: 150px 
   *   / auto auto auto;<br>}</pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_grid-template.asp">https://www.w3schools.com/cssref/pr_grid-template.asp</a>
   */
  GRID_TEMPLATE("grid-template",true,new BrowserSupport (57.0,16.0,52.0,44.0,10.0),-1.0 /*default Value = none none none */  ),

  /**
   * Specifies how to display columns and rows, using named grid items
   * <br><br>
   * The grid-template-areas property specifies areas within the grid layout.<br>
   * You can name grid items by using the grid-area property, and then reference to the name in the grid-template-areas property.<br>
   * Each area is defined by apostrophes. Use a period sign to refer to a grid item with no name.<br>
   * <p>Make the named item "myArea" span two columns in a five columns grid layout:</p> 
   * <pre>
   *   .item1 {<br>&nbsp; grid-area: 
   *   myArea;<br>}<br>.grid-container {<br>&nbsp;&nbsp;display: grid;<br>&nbsp; grid-template-areas: 
   *   "myArea myArea . . .";<br>}</pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_grid-template-areas.asp">https://www.w3schools.com/cssref/pr_grid-template-areas.asp</a>
   */
  GRID_TEMPLATE_AREAS("grid-template-areas",true,new BrowserSupport (57.0,16.0,52.0,44.0,10.0),-1.0 /*default Value = none */  ),

  /**
   * Specifies the size of the columns, and how many columns in a grid layout
   * <br><br>
   * The grid-template-columns property specifies the number (and the widths) of columns in a grid layout.<br>
   * The values are a space separated list, where each value specifies the size of the respective column.<br>
   * <p>Make a 4 columns grid container:</p> 
   * <pre>
   *   .grid-container {<br>&nbsp;&nbsp;display: grid;<br>&nbsp; grid-template-columns: 
   *   auto auto auto auto;<br>}</pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_grid-template-columns.asp">https://www.w3schools.com/cssref/pr_grid-template-columns.asp</a>
   */
  GRID_TEMPLATE_COLUMNS("grid-template-columns",true,new BrowserSupport (57.0,16.0,52.0,44.0,10.0),-1.0 /*default Value = none */  ),

  /**
   * Specifies the size of the rows in a grid layout
   * <br><br>
   * The grid-template-rows property specifies the number (and the heights) of the rows in a grid layout.<br>
   * The values are a space-separated list, where each value specifies the height of the respective row.<br>
   * <p>Specify the row-size (height):</p> 
   * <pre>
   *   .grid-container {<br>&nbsp;&nbsp;display: grid;<br>&nbsp; grid-template-rows: 
   *   100px 300px;<br>}</pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_grid-template-rows.asp">https://www.w3schools.com/cssref/pr_grid-template-rows.asp</a>
   */
  GRID_TEMPLATE_ROWS("grid-template-rows",true,new BrowserSupport (57.0,16.0,52.0,44.0,10.0),-1.0 /*default Value = none */  ),

  /**
   * Specifies whether a punctuation character may be placed outside the line box
   * <br><br>
   * The hanging-punctuation property specifies whether a punctuation mark may be placed outside the line box at the start or at the end of a full line of text.<br>
   * <p>Place a punctuation mark (if any) outside the start edge of the first line in the &lt;p&gt; element:</p> 
   * <pre>
   *   
   *     p
   *  {<br>
   *     &nbsp;
   *  hanging-punctuation: first;<br>
   *  }
   *   
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_hanging-punctuation.asp">https://www.w3schools.com/cssref/css3_pr_hanging-punctuation.asp</a>
   */
  HANGING_PUNCTUATION("hanging-punctuation",false,new BrowserSupport (-2.0,-2.0,-2.0,-2.0,-1.0),3.0 /*default Value = none */  ),

  /**
   * Sets the height of an element
   * <br><br>
   * The height property sets the height of an element.<br>
   * The height of an element does not include padding, borders, or margins!<br>
   * If height: auto; the element will automatically adjust its height to allow its content to be displayed correctly.<br>
   * If height is set to a numeric value (like pixels, (r)em, percentages) then if the content does not fit within the specified height, it will overflow. How the container will handle the overflowing content is defined by the overflow property.<br>
   * Note: The min-height and max-height properties override the height property.<br>
   * <p>Set the height of two &lt;div&gt; elements:</p> 
   * <pre>
   *     div.a {<br>&nbsp;&nbsp;height: auto;<br>&nbsp; border: 
   *     1px solid black;<br>}<br><br>div.b {<br>&nbsp; height: 50px;<br>&nbsp;&nbsp;border: 1px solid black; <br>}</pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_dim_height.asp">https://www.w3schools.com/cssref/pr_dim_height.asp</a>
   */
  HEIGHT("height",true,new BrowserSupport (1.0,4.0,1.0,7.0,1.0),1.0 /*default Value = auto */  ),

  /**
   * Sets how to split words to improve the layout of paragraphs
   * <br><br>
   * The hyphens property defines whether hyphenation is allowed to create more soft wrap opportunities within a line of text.<br>
   * <p>Set different hyphenations:</p> 
   * <pre>
   *   div.a {<br>&nbsp; -webkit-hyphens: none;<br>&nbsp; -ms-hyphens: none;<br>&nbsp; 
   *   hyphens: none;<br>}<br><br>div.b {<br>&nbsp; -webkit-hyphens: manual;<br>&nbsp; -ms-hyphens: 
   *   manual;<br>&nbsp; hyphens: manual;<br>}<br><br>div.c {<br>&nbsp; -webkit-hyphens: 
   *   auto;<br>&nbsp; -ms-hyphens: auto;<br>&nbsp; hyphens: auto;<br>} </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_hyphens.asp">https://www.w3schools.com/cssref/css3_pr_hyphens.asp</a>
   */
  HYPHENS("hyphens",false,new BrowserSupport (55.0,79.0,43.0,44.0,5.1),3.0 /*default Value = manual */  ),

  /**
   * Gives a hint to the browser about what aspects of an image are most important to preserve when the image is scaled
   */
  IMAGE_RENDERING("image-rendering",false,new BrowserSupport (-1.0,-1.0,-1.0,-1.0,-1.0),-1.0 /*default Value = null */  ),

  /**
   * Allows you to import a style sheet into another style sheet
   * <br><br>
   * The @import rule allows you to import a style sheet into another style sheet.<br>
   * The @import rule must be at the top of the document (but after any @charset declaration).<br>
   * The @import rule also supports media queries, so you can allow the import to be media-dependent.<br>
   * <p>Import the "navigation.css" style sheet into the current style sheet:</p> 
   * <pre>
   *     @import 
   *     "navigation.css"; // Using a string 
   * <br><br>or<br><br>@import 
   *     url("navigation.css"); // Using a url 
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_import_rule.asp">https://www.w3schools.com/cssref/pr_import_rule.asp</a>
   */
  IMPORT("@import",false,new BrowserSupport (1.0,5.5,1.0,3.5,1.0),-1.0 /*default Value = null */  ),

  /**
   * Defines whether an element must create a new stacking content
   * <br><br>
   * The isolation property defines whether an element must create a new stacking content.<br>
   * Note: The isolation property is helpful when used with background-blend-mode or mix-blend-mode.<br>
   * <p>Create a new stacking context for the element with id="e":</p> 
   * <pre>
   *   #e {<br>&nbsp; isolation: isolate;<br>} </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_isolation.asp">https://www.w3schools.com/cssref/css3_pr_isolation.asp</a>
   */
  ISOLATION("isolation",false,new BrowserSupport (41.0,79.0,36.0,30.0,0.0),3.0 /*default Value = auto */  ),

  /**
   * Specifies the alignment between the items inside a flexible container when the items do not use all available space
   * <br><br>
   * The justify-content property aligns the flexible container's items when the items do not use all available space on the main-axis (horizontally).<br>
   * Tip: Use the align-items property to align the items vertically.<br>
   * <p>Align the flex items at the center of the container:</p> 
   * <pre>
   *   
   *     div
   *  {<br>&nbsp;&nbsp;display: flex;<br>
   *     &nbsp;&nbsp;justify-content: center;<br>
   *  }
   *   
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_justify-content.asp">https://www.w3schools.com/cssref/css3_pr_justify-content.asp</a>
   */
  JUSTIFY_CONTENT("justify-content",false,new BrowserSupport (29.0,11.0,28.0,17.0,9.0),3.0 /*default Value = flex-start */  ),

  /**
   * Specifies the animation code
   * <br><br>
   * The @keyframes rule specifies the animation code.<br>
   * The animation is created by gradually changing from one set of CSS styles to another.<br>
   * During the animation, you can change the set of CSS styles many times.<br>
   * Specify when the style change will happen in percent, or with the keywords "from" and "to", which is the same as 0% and 100%. 0% is the beginning of the animation, 100% is when the animation is complete.<br>
   * Tip: For best browser support, you should always define both the 0% and the 100% selectors.<br>
   * Note: Use the animation properties to control the appearance of the animation, and also to bind the animation to selectors.<br>
   * Note: The !important rule is ignored in a keyframe (See last example on this page).<br>
   * <p>Make an element move gradually 200px down:</p> 
   * <pre>
   *     @keyframes mymove
   *  {<br>
   *     &nbsp;
   *  from {top: 0px;}<br>
   *     &nbsp;
   *  to {top: 200px;}<br>
   *  }<br>
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_animation-keyframes.asp">https://www.w3schools.com/cssref/css3_pr_animation-keyframes.asp</a>
   */
  KEYFRAMES("@keyframes",false,new BrowserSupport (43.0,10.0,16.0,30.0,9.0),-1.0 /*default Value = null */  ),

  /**
   * Specifies the left position of a positioned element
   * <br><br>
   * The left property affects the horizontal position of a positioned element. This property has no effect on non-positioned elements.<br>
   * <p>Set the left edge of a positioned &lt;div&gt; element to 150px from the left edge of its nearest positioned ancestor:</p> 
   * <pre>
   * div.c {<br>&nbsp; position: absolute;<br>&nbsp; left: 
   * 150px;<br>&nbsp;&nbsp;width: 200px;<br>&nbsp; height: 120px;<br>&nbsp; border: 3px solid 
   * green;<br>}
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_pos_left.asp">https://www.w3schools.com/cssref/pr_pos_left.asp</a>
   */
  LEFT("left",true,new BrowserSupport (1.0,5.5,1.0,5.0,1.0),2.0 /*default Value = auto */  ),

  /**
   * Increases or decreases the space between characters in a text
   * <br><br>
   * The letter-spacing property increases or decreases the space between characters in a text.<br>
   * <p>Set the letter spacing for &lt;h1&gt;, &lt;h2&gt;, and &lt;h3&gt; elements:</p> 
   * <pre>
   *     h1 {<br>&nbsp; letter-spacing: 3px;<br>}<br><br>h2 {<br>&nbsp;&nbsp;letter-spacing: 2px;<br>}<br><br>h3 {<br>
   *     &nbsp; letter-spacing: 
   *     -1px;<br>}
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_text_letter-spacing.asp">https://www.w3schools.com/cssref/pr_text_letter-spacing.asp</a>
   */
  LETTER_SPACING("letter-spacing",true,new BrowserSupport (1.0,4.0,1.0,3.5,1.0),1.0 /*default Value = normal */  ),

  /**
   * Specifies how/if to break lines
   */
  LINE_BREAK("line-break",false,new BrowserSupport (-1.0,-1.0,-1.0,-1.0,-1.0),-1.0 /*default Value = null */  ),

  /**
   * Sets the line height
   * <br><br>
   * The line-height property specifies the height of a line.<br>
   * Note: Negative values are not allowed.<br>
   * <p>Set the line height for different &lt;div&gt; elements:</p> 
   * <pre>
   *     div.a {<br>&nbsp; line-height: normal;<br>}<br><br>div.b {<br>&nbsp; 
   *     line-height: 1.6;<br>}<br><br>div.c {<br>&nbsp; line-height: 
   *     80%;<br>}<br><br>div.d {<br>&nbsp; line-height: 200%;<br>} </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_dim_line-height.asp">https://www.w3schools.com/cssref/pr_dim_line-height.asp</a>
   */
  LINE_HEIGHT("line-height",true,new BrowserSupport (1.0,4.0,1.0,7.0,1.0),1.0 /*default Value = normal */  ),

  /**
   * Sets all the properties for a list in one declaration
   * <br><br>
   * The list-style property is a shorthand for the following properties:<br>
   * <p>Specify all the list properties in one declaration:</p> 
   * <pre>
   *     ul
   *  {<br>
   *  &nbsp;&nbsp;list-style: square inside url("sqpurple.gif");<br>
   *  }
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_list-style.asp">https://www.w3schools.com/cssref/pr_list-style.asp</a>
   */
  LIST_STYLE("list-style",false,new BrowserSupport (1.0,4.0,1.0,7.0,1.0),1.0 /*default Value = disc outside none */  ),

  /**
   * Specifies an image as the list-item marker
   * <br><br>
   * The list-style-image property replaces the list-item marker with an image.<br>
   * Note: Always specify the list-style-type property in addition. This property is used if the image for some reason is unavailable.<br>
   * <p>Specify an image as the list-item marker in a list:</p> 
   * <pre>
   *   
   *     ul
   *  {<br>
   *     &nbsp;
   *  list-style-image: url('sqpurple.gif');<br>
   *  }
   *   
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_list-style-image.asp">https://www.w3schools.com/cssref/pr_list-style-image.asp</a>
   */
  LIST_STYLE_IMAGE("list-style-image",false,new BrowserSupport (1.0,4.0,1.0,7.0,1.0),1.0 /*default Value = none */  ),

  /**
   * Specifies the position of the list-item markers (bullet points)
   * <br><br>
   * The list-style-position property specifies the position of the list-item markers (bullet points).<br>
   * list-style-position: outside; means that the bullet points will be outside the list item. The start of each line of a list item will be aligned vertically:<br>
   * <p>Specify the position of the list-item markers:</p> 
   * <pre>
   *   
   *     ul.a {<br>&nbsp; list-style-position: outside;<br>}<br><br>ul.b {<br>&nbsp; 
   *     list-style-position: inside;<br>}
   *   
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_list-style-position.asp">https://www.w3schools.com/cssref/pr_list-style-position.asp</a>
   */
  LIST_STYLE_POSITION("list-style-position",false,new BrowserSupport (1.0,4.0,1.0,3.5,1.0),1.0 /*default Value = outside */  ),

  /**
   * Specifies the type of list-item marker
   * <br><br>
   * The list-style-type specifies the type of list-item marker in a list.<br>
   * <p>Set some different list styles:</p> 
   * <pre>
   *     ul.a {list-style-type: circle;}<br>
   *  ul.b {list-style-type: square;}<br>
   *  ol.c {list-style-type: upper-roman;}<br>
   *  ol.d {list-style-type: lower-alpha;}
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_list-style-type.asp">https://www.w3schools.com/cssref/pr_list-style-type.asp</a>
   */
  LIST_STYLE_TYPE("list-style-type",false,new BrowserSupport (1.0,4.0,1.0,3.5,1.0),1.0 /*default Value = disc */  ),

  /**
   * Sets all the margin properties in one declaration
   * <br><br>
   * The margin property sets the margins for an element, and is a shorthand property for the following properties:<br>
   * <p>Set the margin for all four sides of a &lt;p&gt; element to 35 pixels:</p> 
   * <pre>
   * p {<br>
   *   &nbsp; margin: 35px;<br>
   * }
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_margin.asp">https://www.w3schools.com/cssref/pr_margin.asp</a>
   */
  MARGIN("margin",true,new BrowserSupport (1.0,6.0,1.0,3.5,1.0),1.0 /*default Value = 0 */  ),

  /**
   * Sets the bottom margin of an element
   * <br><br>
   * The margin-bottom property sets the bottom margin of an element.<br>
   * Note: Negative values are allowed.<br>
   * <p>Set the bottom margin for a &lt;p&gt; element to 25 pixels:</p> 
   * <pre>
   * p.ex1 {<br>
   * &nbsp;&nbsp;margin-bottom: 25px;<br>
   * }
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_margin-bottom.asp">https://www.w3schools.com/cssref/pr_margin-bottom.asp</a>
   */
  MARGIN_BOTTOM("margin-bottom",true,new BrowserSupport (1.0,6.0,1.0,3.5,1.0),1.0 /*default Value = 0 */  ),

  /**
   * Sets the left margin of an element
   * <br><br>
   * The margin-left property sets the left margin of an element.<br>
   * Note: Negative values are allowed.<br>
   * <p>Set the left margin for a &lt;p&gt; element to 30 pixels:&nbsp;</p> 
   * <pre>
   * p.ex1 {<br>
   *   &nbsp;
   *  margin-left: 30px;<br>
   *  }
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_margin-left.asp">https://www.w3schools.com/cssref/pr_margin-left.asp</a>
   */
  MARGIN_LEFT("margin-left",true,new BrowserSupport (1.0,6.0,1.0,3.5,1.0),1.0 /*default Value = 0 */  ),

  /**
   * Sets the right margin of an element
   * <br><br>
   * The margin-right property sets the right margin of an element.<br>
   * Note: Negative values are allowed.<br>
   * <p>Set the right margin for a &lt;p&gt; element to 150 pixels:&nbsp;</p> 
   * <pre>
   * p.ex1 {<br>
   *  &nbsp;
   *  margin-right: 150px;<br>
   * }
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_margin-right.asp">https://www.w3schools.com/cssref/pr_margin-right.asp</a>
   */
  MARGIN_RIGHT("margin-right",true,new BrowserSupport (1.0,6.0,1.0,3.5,1.0),1.0 /*default Value = 0 */  ),

  /**
   * Sets the top margin of an element
   * <br><br>
   * The margin-top property sets the top margin of an element.<br>
   * Note: Negative values are allowed.<br>
   * <p>Set the top margin for a &lt;p&gt; element to 25 pixels:</p> 
   * <pre>
   *     p.ex1 {<br>
   *  &nbsp;&nbsp;margin-top: 25px;<br>
   *  }
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_margin-top.asp">https://www.w3schools.com/cssref/pr_margin-top.asp</a>
   */
  MARGIN_TOP("margin-top",true,new BrowserSupport (1.0,6.0,1.0,3.5,1.0),1.0 /*default Value = 0 */  ),

  /**
   * Hides an element by masking or clipping the image at specific places
   */
  MASK("mask",false,new BrowserSupport (-1.0,-1.0,-1.0,-1.0,-1.0),-1.0 /*default Value = null */  ),

  /**
   * Specifies whether a mask element is used as a luminance or an alpha mask
   */
  MASK_TYPE("mask-type",false,new BrowserSupport (-1.0,-1.0,-1.0,-1.0,-1.0),-1.0 /*default Value = null */  ),

  /**
   * Sets the maximum height of an element
   * <br><br>
   * The max-height property defines the maximum height of an element.<br>
   * If the content is larger than the maximum height, it will overflow. How the container will handle the overflowing content is defined by the overflow property.<br>
   * If the content is smaller than the maximum height, the max-height property has no effect.<br>
   * Note: This prevents the value of the height property from becoming larger than max-height. The value of the max-height property overrides the height property.<br>
   * <p>Set the maximum height of a &lt;p&gt; element to 50 pixels:</p> 
   * <pre>
   *   
   *     p.ex1
   *  {<br>
   *  &nbsp;&nbsp;max-height: 50px;<br>
   *  }
   *   
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_dim_max-height.asp">https://www.w3schools.com/cssref/pr_dim_max-height.asp</a>
   */
  MAX_HEIGHT("max-height",true,new BrowserSupport (1.0,7.0,1.0,7.0,-1.0),2.0 /*default Value = none */  ),

  /**
   * Sets the maximum width of an element
   * <br><br>
   * The max-width property defines the maximum width of an element.<br>
   * If the content is larger than the maximum width, it will automatically change the height of the element.<br>
   * If the content is smaller than the maximum width, the max-width property has no effect.<br>
   * Note: This prevents the value of the width property from becoming larger than max-width. The value of the max-width property overrides the width property.<br>
   * <p>Set the maximum width of a &lt;p&gt; element to 150 pixels:</p> 
   * <pre>
   * p.ex1 {<br>
   *  &nbsp;&nbsp;max-width: 150px;<br>
   * }
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_dim_max-width.asp">https://www.w3schools.com/cssref/pr_dim_max-width.asp</a>
   */
  MAX_WIDTH("max-width",true,new BrowserSupport (1.0,7.0,1.0,7.0,-1.0),2.0 /*default Value = none */  ),

  /**
   * Sets the style rules for different media types/devices/sizes
   * <br><br>
   * The @media rule is used in media queries to apply different styles for different media types/devices.<br>
   * Media queries can be used to check many things, such as:<br>
   * <p>Change the background color of the &lt;body&gt; element to "lightblue" when the browser window is 600px wide or less:</p> 
   * <pre>
   *   @media only screen and (max-width: 600px) {<br>&nbsp; body {<br>&nbsp;&nbsp;&nbsp;&nbsp;background-color: lightblue;<br>
   *   &nbsp; }<br>}<br>
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_mediaquery.asp">https://www.w3schools.com/cssref/css3_pr_mediaquery.asp</a>
   */
  MEDIA("@media",false,new BrowserSupport (21.0,9.0,3.5,9.0,4.0),-1.0 /*default Value = null */  ),

  /**
   * Sets the minimum height of an element
   * <br><br>
   * The min-height property defines the minimum height of an element.<br>
   * If the content is smaller than the minimum height, the minimum height will be applied.<br>
   * If the content is larger than the minimum height, the min-height property has no effect.<br>
   * Note: This prevents the value of the height property from becoming smaller than min-height.<br>
   * <p>Set the minimum height of a &lt;p&gt; element to 200 pixels:</p> 
   * <pre>
   *   
   *     p.ex1
   *  {<br>
   *  &nbsp;&nbsp;min-height: 200px;<br>
   *  }
   *   
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_dim_min-height.asp">https://www.w3schools.com/cssref/pr_dim_min-height.asp</a>
   */
  MIN_HEIGHT("min-height",true,new BrowserSupport (1.0,7.0,3.0,4.0,-1.0),2.0 /*default Value = 0 */  ),

  /**
   * Sets the minimum width of an element
   * <br><br>
   * The min-width property defines the minimum width of an element.<br>
   * If the content is smaller than the minimum width, the minimum width will be applied.<br>
   * If the content is larger than the minimum width, the min-width property has no effect.<br>
   * Note: This prevents the value of the width property from becoming smaller than min-width.<br>
   * <p>Set the minimum width of a &lt;span&gt; element to 500 pixels:</p> 
   * <pre>
   *     span.ex1
   *  {<br>
   *  &nbsp;&nbsp;min-width: 500px;<br>
   *  }
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_dim_min-width.asp">https://www.w3schools.com/cssref/pr_dim_min-width.asp</a>
   */
  MIN_WIDTH("min-width",true,new BrowserSupport (1.0,7.0,1.0,4.0,-1.0),2.0 /*default Value = 0 */  ),

  /**
   * Specifies how an element's content should blend with its direct parent background
   * <br><br>
   * The mix-blend-mode property specifies how an element's content should blend with its direct parent background.<br>
   * <p>A container with a red background and an image that blends with the red container (darken):</p> 
   * <pre> 
   *     .container {<br>&nbsp; background-color: red;<br>}<br><br>
   *     .container img {<br>&nbsp; mix-blend-mode: darken;<br>}</pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_mix-blend-mode.asp">https://www.w3schools.com/cssref/pr_mix-blend-mode.asp</a>
   */
  MIX_BLEND_MODE("mix-blend-mode",false,new BrowserSupport (41.0,79.0,32.0,35.0,8.0),-1.0 /*default Value = normal */  ),

  /**
   * Specifies how the contents of a replaced element should be fitted to the box established by its used height and width
   * <br><br>
   * The object-fit property is used to specify how an <img> or <video> should be resized to fit its container.<br>
   * This property tells the content to fill the container in a variety of ways; such as "preserve that aspect ratio" or "stretch up and take up as much space as possible".<br>
   * <p>Cut off the sides of an image, preserving the aspect ratio, and fill in the space:</p> 
   * <pre> 
   *     img.a {<br>&nbsp;&nbsp;width: 200px;<br>&nbsp; height: 
   *     400px;<br>&nbsp;&nbsp;object-fit: cover;<br>}</pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_object-fit.asp">https://www.w3schools.com/cssref/css3_pr_object-fit.asp</a>
   */
  OBJECT_FIT("object-fit",false,new BrowserSupport (31.0,16.0,36.0,19.0,7.1),3.0 /*default Value = see individual properties */  ),

  /**
   * Specifies the alignment of the replaced element inside its box
   * <br><br>
   * The object-position property is used together with object-fit to specify how an <img> or <video> should be positioned with x/y coordinates inside its "own content box".<br>
   * <p>Resize an image to fit its content box, and position the image 5px from the left and 10% from the top inside the content box:</p> 
   * <pre> 
   *     img.a {<br>&nbsp;&nbsp;width: 200px;<br>&nbsp; height: 
   *     400px;<br>&nbsp; object-fit: none;<br>&nbsp;&nbsp;object-position: 5px 10%;<br>&nbsp;&nbsp;border: 5px solid red;<br>}</pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_object-position.asp">https://www.w3schools.com/cssref/css3_pr_object-position.asp</a>
   */
  OBJECT_POSITION("object-position",true,new BrowserSupport (31.0,16.0,36.0,19.0,10.0),3.0 /*default Value = 50% 50% */  ),

  /**
   * Sets the opacity level for an element
   * <br><br>
   * The opacity property sets the opacity level for an element.<br>
   * The opacity-level describes the transparency-level, where 1 is not transparent at all, 0.5 is 50% see-through, and 0 is completely transparent.<br>
   * <p>Set the opacity level for a &lt;div&gt; element:</p> 
   * <pre>
   *     div
   *  {<br>
   *  &nbsp;&nbsp;opacity: 0.5;<br>
   *  }
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_opacity.asp">https://www.w3schools.com/cssref/css3_pr_opacity.asp</a>
   */
  OPACITY("opacity",true,new BrowserSupport (4.0,9.0,2.0,9.0,3.1),-1.0 /*default Value = null */  ),

  /**
   * Sets the order of the flexible item, relative to the rest
   * <br><br>
   * The order property specifies the order of a flexible item relative to the rest of the flexible items inside the same container.<br>
   * Note: If the element is not a flexible item, the order property has no effect.<br>
   * <p>Set the order of the flexible items:</p> 
   * <pre>
   *  div#myRedDIV {order: 2;}<br>div#myBlueDIV {order: 4;}<br>div#myGreenDIV {order: 3;}<br>div#myPinkDIV {order: 1;}<br>
   *   
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_order.asp">https://www.w3schools.com/cssref/css3_pr_order.asp</a>
   */
  ORDER("order",true,new BrowserSupport (29.0,11.0,28.0,17.0,9.0),3.0 /*default Value = 0 */  ),

  /**
   * Sets the minimum number of lines that must be left at the bottom of a page when a page break occurs inside an element
   */
  ORPHANS("orphans",false,new BrowserSupport (-1.0,-1.0,-1.0,-1.0,-1.0),-1.0 /*default Value = null */  ),

  /**
   * A shorthand property for the outline-width, outline-style, and the outline-color properties
   * <br><br>
   * An outline is a line that is drawn around elements, outside the borders, to make the element "stand out".<br>
   * The outline property is a shorthand property for:<br>
   * <p>Set an outline around a &lt;h2&gt; element and a &lt;div&gt; element:</p> 
   * <pre>
   *   
   *     h2 {<br>&nbsp;&nbsp;outline: 5px dotted green;<br>}<br><br>div.a {<br>&nbsp;&nbsp;outline: 2px dashed blue;<br>}
   *   
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_outline.asp">https://www.w3schools.com/cssref/pr_outline.asp</a>
   */
  OUTLINE("outline",true,new BrowserSupport (1.0,8.0,1.5,7.0,1.2),2.0 /*default Value = medium invert color */  ),

  /**
   * Sets the color of an outline
   * <br><br>
   * An outline is a line that is drawn around elements, outside the borders, to make the element "stand out".<br>
   * The outline-color property specifies the color of an outline.<br>
   * Note: Always declare the outline-style property before the outline-color property. An element must have an outline before you change the color of it.<br>
   * <p>Set a color for the outline:</p> 
   * <pre>
   * div {outline-color: coral;}</pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_outline-color.asp">https://www.w3schools.com/cssref/pr_outline-color.asp</a>
   */
  OUTLINE_COLOR("outline-color",true,new BrowserSupport (1.0,8.0,1.5,7.0,1.2),2.0 /*default Value = invert */  ),

  /**
   * Offsets an outline, and draws it beyond the border edge
   * <br><br>
   * The outline-offset property adds space between an outline and the edge or border of an element.<br>
   * The space between an element and its outline is transparent.<br>
   * Outlines differ from borders in three ways:<br>
   * <p>Specify a 4 pixels solid red outline 15 pixels outside the border edge:</p> 
   * <pre>
   *   
   *     div
   *  {<br>
   *  &nbsp;&nbsp;outline: 4px solid red;<br>
   *  &nbsp;&nbsp;outline-offset: 15px;<br>
   *  }
   *   
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_outline-offset.asp">https://www.w3schools.com/cssref/css3_pr_outline-offset.asp</a>
   */
  OUTLINE_OFFSET("outline-offset",true,new BrowserSupport (4.0,15.0,3.5,10.5,3.1),3.0 /*default Value = 0 */  ),

  /**
   * Sets the style of an outline
   * <br><br>
   * An outline is a line that is drawn around elements, outside the borders, to make the element "stand out".<br>
   * The outline-style property specifies the style of an outline.<br>
   * <p>Set a style for the outline:</p> 
   * <pre>
   * div {outline-style: dotted;}
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_outline-style.asp">https://www.w3schools.com/cssref/pr_outline-style.asp</a>
   */
  OUTLINE_STYLE("outline-style",false,new BrowserSupport (1.0,8.0,1.5,7.0,1.2),2.0 /*default Value = none */  ),

  /**
   * Sets the width of an outline
   * <br><br>
   * An outline is a line that is drawn around elements, outside the borders, to make the element "stand out".<br>
   * The outline-width specifies the width of an outline.<br>
   * Note: Always declare the outline-style property before the outline-width property. An element must have an outline before you change the width of it.<br>
   * <p>Set the width of an outline:</p> 
   * <pre>
   * div {outline-width: thick;}
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_outline-width.asp">https://www.w3schools.com/cssref/pr_outline-width.asp</a>
   */
  OUTLINE_WIDTH("outline-width",true,new BrowserSupport (1.0,8.0,1.5,7.0,1.2),2.0 /*default Value = medium */  ),

  /**
   * Specifies what happens if content overflows an element's box
   * <br><br>
   * The overflow property specifies what should happen if content overflows an element's box.<br>
   * This property specifies whether to clip content or to add scrollbars when an element's content is too big to fit in a specified area.<br>
   * Note: The overflow property only works for block elements with a specified height.<br>
   * <p>Show different overflow property values:</p> 
   * <pre>
   *   
   *     div.ex1 {<br>&nbsp; overflow: scroll;<br>}<br><br>div.ex2 {<br>&nbsp; 
   *     overflow: hidden;<br>}<br><br>div.ex3 {<br>&nbsp;&nbsp;overflow: 
   *     auto;<br>}<br><br>div.ex4 {<br>&nbsp;&nbsp;overflow: visible;<br>}
   *   
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_pos_overflow.asp">https://www.w3schools.com/cssref/pr_pos_overflow.asp</a>
   */
  OVERFLOW("overflow",false,new BrowserSupport (1.0,4.0,1.0,7.0,1.0),2.0 /*default Value = visible */  ),

  /**
   * Specifies whether or not the browser may break lines within words in order to prevent overflow (when a string is too long to fit its containing box)
   */
  OVERFLOW_WRAP("overflow-wrap",false,new BrowserSupport (-1.0,-1.0,-1.0,-1.0,-1.0),-1.0 /*default Value = null */  ),

  /**
   * Specifies whether or not to clip the left/right edges of the content, if it overflows the element's content area
   * <br><br>
   * The overflow-x property specifies whether to clip the content, add a scroll bar, or display overflow content of a block-level element, when it overflows at the left and right edges.<br>
   * Tip: Use the overflow-y property to determine clipping at the top and bottom edges.<br>
   * <p>Show different overflow-x property values:</p> 
   * <pre>
   *   
   *     div.ex1 {<br>&nbsp;&nbsp;overflow-x: scroll;<br>}<br><br>div.ex2 {<br>&nbsp; 
   *     overflow-x: hidden;<br>}<br><br>div.ex3 {<br>&nbsp;&nbsp;overflow-x: 
   *     auto;<br>}<br><br>div.ex4 {<br>&nbsp;&nbsp;overflow-x: visible;<br>}
   *   
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_overflow-x.asp">https://www.w3schools.com/cssref/css3_pr_overflow-x.asp</a>
   */
  OVERFLOW_X("overflow-x",false,new BrowserSupport (4.0,9.0,3.5,9.5,3.0),3.0 /*default Value = visible */  ),

  /**
   * Specifies whether or not to clip the top/bottom edges of the content, if it overflows the element's content area
   * <br><br>
   * The overflow-y property specifies whether to clip the content, add a scroll bar, or display overflow content of a block-level element, when it overflows at the top and bottom edges.<br>
   * Tip: Use the overflow-x property to determine clipping at the left and right edges.<br>
   * <p>Show different overflow-y property values:</p> 
   * <pre>
   *   
   *     div.ex1 {<br>&nbsp; overflow-y: scroll;<br>}<br><br>div.ex2 {<br>&nbsp;&nbsp;overflow-y: hidden;<br>}<br><br>div.ex3 {<br>&nbsp;&nbsp;overflow-y: 
   *     auto;<br>}<br><br>div.ex4 {<br>&nbsp;&nbsp;overflow-y: visible;<br>}
   *   
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_overflow-y.asp">https://www.w3schools.com/cssref/css3_pr_overflow-y.asp</a>
   */
  OVERFLOW_Y("overflow-y",false,new BrowserSupport (4.0,9.0,1.5,9.5,3.0),3.0 /*default Value = visible */  ),

  /**
   * A shorthand property for all the padding-* properties
   * <br><br>
   * An element's padding is the space between its content and its border.<br>
   * The padding property is a shorthand property for:<br>
   * <p>Set the padding for all four sides of a &lt;p&gt; element to 35 pixels:</p> 
   * <pre>
   * p {<br>
   * &nbsp;&nbsp;padding: 35px;<br>
   * }
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_padding.asp">https://www.w3schools.com/cssref/pr_padding.asp</a>
   */
  PADDING("padding",true,new BrowserSupport (1.0,4.0,1.0,3.5,1.0),1.0 /*default Value = 0 */  ),

  /**
   * Sets the bottom padding of an element
   * <br><br>
   * An element's padding is the space between its content and its border.<br>
   * The padding-bottom property sets the bottom padding (space) of an element.<br>
   * Note: Negative values are not allowed.<br>
   * <p>Set the bottom padding for a &lt;p&gt; element to 25 pixels:</p> 
   * <pre>
   * p.ex1 {<br>
   *   &nbsp;
   *  padding-bottom: 25px;<br>
   * }
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_padding-bottom.asp">https://www.w3schools.com/cssref/pr_padding-bottom.asp</a>
   */
  PADDING_BOTTOM("padding-bottom",true,new BrowserSupport (1.0,4.0,1.0,3.5,1.0),1.0 /*default Value = 0 */  ),

  /**
   * Sets the left padding of an element
   * <br><br>
   * An element's padding is the space between its content and its border.<br>
   * The padding-left property sets the left padding (space) of an element.<br>
   * Note: Negative values are not allowed.<br>
   * <p>Set the left padding for a &lt;p&gt; element to 50 pixels:</p> 
   * <pre>
   * p.ex1 {<br>
   *   &nbsp; padding-left: 50px;<br>
   * }
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_padding-left.asp">https://www.w3schools.com/cssref/pr_padding-left.asp</a>
   */
  PADDING_LEFT("padding-left",true,new BrowserSupport (1.0,4.0,1.0,3.5,1.0),1.0 /*default Value = 0 */  ),

  /**
   * Sets the right padding of an element
   * <br><br>
   * An element's padding is the space between its content and its border.<br>
   * The padding-right property sets the right padding (space) of an element.<br>
   * Note: Negative values are not allowed.<br>
   * <p>Set the right padding for a &lt;p&gt; element to 150 pixels:</p> 
   * <pre>
   * p.ex1 {<br>
   * &nbsp;&nbsp;padding-right: 150px;<br>
   * }
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_padding-right.asp">https://www.w3schools.com/cssref/pr_padding-right.asp</a>
   */
  PADDING_RIGHT("padding-right",true,new BrowserSupport (1.0,4.0,1.0,3.5,1.0),1.0 /*default Value = 0 */  ),

  /**
   * Sets the top padding of an element
   * <br><br>
   * An element's padding is the space between its content and its border.<br>
   * The padding-top property sets the top padding (space) of an element.<br>
   * Note: Negative values are not allowed.<br>
   * <p>Set the top padding for a &lt;p&gt; element to 25 pixels:</p> 
   * <pre>
   * p.ex1 {<br>
   *   &nbsp;
   *  padding-top: 25px;<br>
   * }
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_padding-top.asp">https://www.w3schools.com/cssref/pr_padding-top.asp</a>
   */
  PADDING_TOP("padding-top",true,new BrowserSupport (1.0,4.0,1.0,3.5,1.0),1.0 /*default Value = 0 */  ),

  /**
   * Sets the page-break behavior after an element
   * <br><br>
   * The page-break-after property adds a page-break after a specified element.<br>
   * Tip: The properties: page-break-before, page-break-after and page-break-inside help to define how a document should behave when printed.<br>
   * Note: You cannot use this property on an empty <div> or on absolutely positioned elements.<br>
   * <p>Always insert a page-break after a &lt;footer&gt; element:&nbsp;</p> 
   * <pre>
   *  @media print
   * {<br>
   *   &nbsp;
   *  footer {page-break-after: always;}<br>
   * }</pre> 
   * <br><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_print_pageba.asp">https://www.w3schools.com/cssref/pr_print_pageba.asp</a>
   */
  PAGE_BREAK_AFTER("page-break-after",false,new BrowserSupport (1.0,4.0,1.0,7.0,1.2),2.0 /*default Value = auto */  ),

  /**
   * Sets the page-break behavior before an element
   * <br><br>
   * The page-break-before property adds a page-break before a specified element..<br>
   * Tip: The properties: page-break-before, page-break-after and page-break-inside help to define how a document should behave when printed.<br>
   * Note: You cannot use this property on an empty <div> or on absolutely positioned elements.<br>
   * <p>Always insert a page-break before a &lt;h1&gt; element:</p> 
   * <pre>
   *  @media print
   * {<br>
   *  &nbsp;&nbsp;h1 {page-break-before: always;}<br>
   * }</pre> 
   * <br><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_print_pagebb.asp">https://www.w3schools.com/cssref/pr_print_pagebb.asp</a>
   */
  PAGE_BREAK_BEFORE("page-break-before",false,new BrowserSupport (1.0,4.0,1.0,7.0,1.2),2.0 /*default Value = auto */  ),

  /**
   * Sets the page-break behavior inside an element
   * <br><br>
   * The page-break-inside property sets whether a page-break should be avoided inside a specified element.<br>
   * Tip: The properties: page-break-before, page-break-after and page-break-inside help to define how a document should behave when printed.<br>
   * Note: You cannot use this property on absolutely positioned elements.<br>
   * <p>Avoid page-break inside &lt;pre&gt; and &lt;blockquote&gt; elements:</p> 
   * <pre>
   * @media print {<br>
   *   &nbsp; pre, blockquote {page-break-inside: avoid;}<br>
   * }</pre> 
   * <br><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_print_pagebi.asp">https://www.w3schools.com/cssref/pr_print_pagebi.asp</a>
   */
  PAGE_BREAK_INSIDE("page-break-inside",false,new BrowserSupport (1.0,8.0,19.0,7.0,1.3),2.0 /*default Value = auto */  ),

  /**
   * Gives a 3D-positioned element some perspective
   * <br><br>
   * The perspective property is used to give a 3D-positioned element some perspective.<br>
   * The perspective property defines how far the object is away from the user. So, a lower value will result in a more intensive 3D effect than a higher value.<br>
   * When defining the perspective property for an element, it is the CHILD elements that get the perspective view, NOT the element itself.<br>
   * Tip: Also look at the perspective-origin property, which defines at which position the user is looking at the 3D object.<br>
   * To better understand the perspective property, view a demo.<br>
   * <p>Give a 3D-positioned element some perspective:</p> 
   * <pre>
   *   #div1
   *  {<br>
   *   &nbsp;
   *  perspective: 100px;<br>
   *  }
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_perspective.asp">https://www.w3schools.com/cssref/css3_pr_perspective.asp</a>
   */
  PERSPECTIVE("perspective",true,new BrowserSupport (36.0,10.0,16.0,23.0,9.0),3.0 /*default Value = none */  ),

  /**
   * Defines at which position the user is looking at the 3D-positioned element
   * <br><br>
   * The perspective-origin property defines at from which position the user is looking at the 3D-positioned element.<br>
   * When defining the perspective-origin property for an element, it is the CHILD elements that will get the effect, NOT the element itself.<br>
   * Note: This property must be used in conjunction with the perspective property!<br>
   * To better understand the perspective-origin property, view a demo.<br>
   * <p>Define at from which position the user is looking at the 3D-positioned element:</p> 
   * <pre>
   *   
   *     #div1
   *  {<br>
   *     &nbsp;
   *  perspective: 100px;<br>
   *     &nbsp;
   *  perspective-origin: left;<br>
   *  }
   *   
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_perspective-origin.asp">https://www.w3schools.com/cssref/css3_pr_perspective-origin.asp</a>
   */
  PERSPECTIVE_ORIGIN("perspective-origin",true,new BrowserSupport (36.0,10.0,16.0,23.0,9.0),3.0 /*default Value = 50% 50% */  ),

  /**
   * Defines whether or not an element reacts to pointer events
   * <br><br>
   * The pointer-events property defines whether or not an element reacts to pointer events.<br>
   * <p>Set whether or not an element should react to pointer events:</p> 
   * <pre>
   *   div.ex1 {<br>&nbsp; pointer-events: none;<br>}<br><br>div.ex2 {<br>&nbsp;&nbsp;pointer-events: auto;<br>} </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_pointer-events.asp">https://www.w3schools.com/cssref/css3_pr_pointer-events.asp</a>
   */
  POINTER_EVENTS("pointer-events",false,new BrowserSupport (2.0,11.0,3.6,9.0,4.0),3.0 /*default Value = auto */  ),

  /**
   * Specifies the type of positioning method used for an element (static, relative, absolute or fixed)
   * <br><br>
   * The position property specifies the type of positioning method used for an element (static, relative, absolute, fixed, or sticky).<br>
   * <p>Position an &lt;h2&gt; element:</p> 
   * <pre>
   *     h2
   *  {<br>
   *  &nbsp;
   *  position: absolute;<br>
   *     &nbsp;
   *  left: 100px;<br>
   *  &nbsp;&nbsp;top: 150px;<br>
   *  }
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_class_position.asp">https://www.w3schools.com/cssref/pr_class_position.asp</a>
   */
  POSITION("position",false,new BrowserSupport (1.0,7.0,1.0,4.0,1.0),2.0 /*default Value = static */  ),

  /**
   * Sets the type of quotation marks for embedded quotations
   * <br><br>
   * The quotes property sets the type of quotation marks for quotations.<br>
   * <p>Specify quotation marks for quotations:</p> 
   * <pre>
   *   
   *     #a {<br>&nbsp;&nbsp;quotes: "'" "'";<br>}
   *   
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_gen_quotes.asp">https://www.w3schools.com/cssref/pr_gen_quotes.asp</a>
   */
  QUOTES("quotes",false,new BrowserSupport (11.0,8.0,1.5,4.0,5.1),2.0 /*default Value = not specified */  ),

  /**
   * Defines if (and how) an element is resizable by the user
   * <br><br>
   * The resize property defines if (and how) an element is resizable by the user.<br>
   * Note: The resize property does not apply to inline elements or to block elements where overflow="visible". So, make sure that overflow is set to "scroll", "auto", or "hidden".<br>
   * <p>Here, the user can resize both the height and width of a &lt;div&gt; element:</p> 
   * <pre>
   * div {<br>
   *  &nbsp;&nbsp;resize: both;<br>
   *  &nbsp;&nbsp;overflow: auto;<br>
   * }
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_resize.asp">https://www.w3schools.com/cssref/css3_pr_resize.asp</a>
   */
  RESIZE("resize",false,new BrowserSupport (4.0,79.0,5.0,15.0,4.0),3.0 /*default Value = none */  ),

  /**
   * Specifies the right position of a positioned element
   * <br><br>
   * The right property affects the horizontal position of a positioned element. This property has no effect on non-positioned elements.<br>
   * <p>Set the right edge of the positioned &lt;div&gt; element 150px to the left of the right edge of its nearest positioned ancestor:</p> 
   * <pre>
   * div.absolute {<br>&nbsp;&nbsp;position: absolute;<br>&nbsp;&nbsp;right: 
   *   150px;<br>&nbsp;&nbsp;width: 200px;<br>&nbsp;&nbsp;height: 120px;<br>&nbsp;&nbsp;border: 3px solid 
   * green;<br>}&nbsp;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_pos_right.asp">https://www.w3schools.com/cssref/pr_pos_right.asp</a>
   */
  RIGHT("right",true,new BrowserSupport (1.0,5.5,1.0,5.0,1.0),2.0 /*default Value = auto */  ),

  /**
   * Specifies whether to smoothly animate the scroll position in a scrollable box, instead of a straight jump
   * <br><br>
   * The scroll-behavior property specifies whether to smoothly animate the scroll position, instead of a straight jump, when the user clicks on a link within a scrollable box.<br>
   * <p>Add a smooth scrolling effect to the document:</p> 
   * <pre>
   *   html {<br>&nbsp; scroll-behavior: smooth;<br>} </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_scroll-behavior.asp">https://www.w3schools.com/cssref/pr_scroll-behavior.asp</a>
   */
  SCROLL_BEHAVIOR("scroll-behavior",false,new BrowserSupport (61.0,79.0,36.0,48.0,14.0),-1.0 /*default Value = auto */  ),

  /**
   * Specifies the width of a tab character
   * <br><br>
   * The tab-size property specifies the width of a tab character.<br>
   * In HTML, the tab character is usually displayed as a single space-character, except for some elements, like <textarea> and <pre>, and the result of the tab-size property will only be visible for those elements.<br>
   * <p>Set the width of the tab character to 16 spaces:</p> 
   * <pre>
   *   
   * pre {-moz-tab-size: 16;} // Firefox 
   * <br>pre {tab-size: 16;}<br>
   *   
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_tab-size.asp">https://www.w3schools.com/cssref/css3_pr_tab-size.asp</a>
   */
  TAB_SIZE("tab-size",false,new BrowserSupport (21.0,79.0,4.0,15.0,6.1),3.0 /*default Value = 8 */  ),

  /**
   * Defines the algorithm used to lay out table cells, rows, and columns
   * <br><br>
   * The table-layout property defines the algorithm used to lay out table cells, rows, and columns.<br>
   * Tip: The main benefit of table-layout: fixed; is that the table renders much faster. On large tables, users will not see any part of the table until the browser has rendered the whole table. So, if you use table-layout: fixed, users will see the top of the table while the browser loads and renders rest of the table. This gives the impression that the page loads a lot quicker!<br>
   * <p>Set different table layout algorithms:</p> 
   * <pre>
   *   
   *     table.a {<br>&nbsp; table-layout: auto;<br>&nbsp; 
   *     width: 180px; <br>}<br><br>table.b {<br>&nbsp; table-layout: 
   *     fixed;<br>&nbsp; width: 180px; <br>}
   *   
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_tab_table-layout.asp">https://www.w3schools.com/cssref/pr_tab_table-layout.asp</a>
   */
  TABLE_LAYOUT("table-layout",false,new BrowserSupport (14.0,5.0,1.0,7.0,1.0),2.0 /*default Value = auto */  ),

  /**
   * Specifies the horizontal alignment of text
   * <br><br>
   * The text-align property specifies the horizontal alignment of text in an element.<br>
   * <p>Set the text alignment for different &lt;div&gt; elements:</p> 
   * <pre>
   *     div.a {<br>&nbsp;&nbsp;text-align: center;<br>}<br><br>
   *     div.b {<br>&nbsp; text-align: left;<br>}<br><br>
   *     div.c {<br>&nbsp; text-align: right;<br>}<br><br>div.c {<br>&nbsp; text-align: 
   *     justify;<br>} </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_text_text-align.asp">https://www.w3schools.com/cssref/pr_text_text-align.asp</a>
   */
  TEXT_ALIGN("text-align",false,new BrowserSupport (1.0,3.0,1.0,3.5,1.0),1.0 /*default Value = left if direction is ltr, and right if direction is rtl */  ),

  /**
   * Describes how the last line of a block or a line right before a forced line break is aligned when text-align is "justify"
   * <br><br>
   * The text-align-last property specifies how to align the last line of a text.<br>
   * Notice that the text-align-last property sets the alignment for all last lines within the selected element. So, if you have a <div> with three paragraphs in it, text-align-last will apply to the last line of EACH of the paragraphs. To use text-align-last on only the last paragraph in the container, you can use :last child, see example below.<br>
   * Note: In Edge prior 79, the text-align-last property only works on text that has "text-align: justify".<br>
   * <p>Align the last line of text in three &lt;div&gt; elements:</p> 
   * <pre>
   *   div.a
   * {<br>
   * &nbsp;&nbsp;text-align: justify;&nbsp; // For Edge 
   * <br>&nbsp;
   * text-align-last: right;<br>
   * }<br><br>div.b
   * {<br>
   *   &nbsp;
   * text-align: justify;&nbsp;// For Edge 
   *  <br>&nbsp;
   * text-align-last: center;<br>
   * }<br><br>div.c
   * {<br>
   *   &nbsp;
   * text-align: justify;&nbsp;// For Edge 
   *  <br>&nbsp;&nbsp;text-align-last: justify;<br>
   * }
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_text-align-last.asp">https://www.w3schools.com/cssref/css3_pr_text-align-last.asp</a>
   */
  TEXT_ALIGN_LAST("text-align-last",false,new BrowserSupport (47.0,-1.0,49.0,34.0,-2.0),3.0 /*default Value = auto */  ),

  /**
   * Specifies the combination of multiple characters into the space of a single character
   */
  TEXT_COMBINE_UPRIGHT("text-combine-upright",false,new BrowserSupport (-1.0,-1.0,-1.0,-1.0,-1.0),-1.0 /*default Value = null */  ),

  /**
   * Specifies the decoration added to text
   * <br><br>
   * The text-decoration property specifies the decoration added to text, and is a shorthand property for:<br>
   * <p>Set different text decorations for &lt;h1&gt;, &lt;h2&gt;, and &lt;h3&gt; elements:</p> 
   * <pre>
   * h1 {<br>&nbsp; text-decoration: overline;<br>}<br><br>
   * h2 {<br>&nbsp; text-decoration: line-through;<br>}<br><br>
   * h3 {<br>&nbsp; text-decoration: underline;<br>}<br><br>h4 {<br>&nbsp;&nbsp;text-decoration: underline 
   *   overline;<br>}<br>
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_text_text-decoration.asp">https://www.w3schools.com/cssref/pr_text_text-decoration.asp</a>
   */
  TEXT_DECORATION("text-decoration",false,new BrowserSupport (1.0,3.0,1.0,3.5,1.0),-1.0 /*default Value = none currentcolor solid */  ),

  /**
   * Specifies the color of the text-decoration
   * <br><br>
   * The text-decoration-color property specifies the color of the text-decoration (underlines, overlines, linethroughs).<br>
   * <p>Set the color of the text-decoration to red:</p> 
   * <pre>
   * p
   * {<br>
   *   &nbsp;
   * text-decoration: underline;<br>&nbsp;
   * text-decoration-color: red;<br>
   * }
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_text-decoration-color.asp">https://www.w3schools.com/cssref/css3_pr_text-decoration-color.asp</a>
   */
  TEXT_DECORATION_COLOR("text-decoration-color",true,new BrowserSupport (57.0,79.0,36.0,44.0,7.1),3.0 /*default Value = currentColor */  ),

  /**
   * Specifies the type of line in a text-decoration
   * <br><br>
   * The text-decoration-line property sets the kind of text decoration to use (like underline, overline, line-through).<br>
   * Tip: Also look at the text-decoration property, which is a short-hand property for text-decoration-line, text-decoration-style, and text-decoration-color.<br>
   * Note: You can also combine more than one value, like underline and overline to display lines both under and over the text.<br>
   * <p>Set different types of text-decoration lines:</p> 
   * <pre>
   *   div.a
   * {<br>&nbsp;&nbsp;text-decoration-line: overline;<br>
   * }<br><br>div.b
   * {<br>&nbsp;&nbsp;text-decoration-line: underline;<br>
   * }<br><br>div.c
   * {<br>&nbsp;
   * text-decoration-line: line-through;<br>
   * }<br><br>div.d
   * {<br>&nbsp;&nbsp;text-decoration-line: overline underline;<br>
   * }
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_text-decoration-line.asp">https://www.w3schools.com/cssref/css3_pr_text-decoration-line.asp</a>
   */
  TEXT_DECORATION_LINE("text-decoration-line",false,new BrowserSupport (57.0,79.0,36.0,44.0,7.1),3.0 /*default Value = none */  ),

  /**
   * Specifies the style of the line in a text decoration
   * <br><br>
   * The text-decoration-style property sets the style of the text decoration (like solid, wavy, dotted, dashed, double).<br>
   * Tip: Also look at the text-decoration property, which is a short-hand property for text-decoration-line, text-decoration-style, and text-decoration-color.<br>
   * <p>Set different types of text-decoration styles:</p> 
   * <pre>
   *   div.a
   * {<br>&nbsp;
   * text-decoration-line: underline;<br>&nbsp;
   * text-decoration-style: solid;<br>
   * }<br><br>div.b
   * {<br>&nbsp;
   * text-decoration-line: underline;<br>
   *   &nbsp;
   * text-decoration-style: wavy;<br>
   * }<br><br>div.c
   * {<br>&nbsp;
   * text-decoration-line: underline;<br>
   *   &nbsp;
   * text-decoration-style: double;<br>
   * }<br><br>div.d
   * {<br>&nbsp;
   * text-decoration-line: overline underline;<br>
   *   &nbsp;
   * text-decoration-style: wavy;<br>
   * }
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_text-decoration-style.asp">https://www.w3schools.com/cssref/css3_pr_text-decoration-style.asp</a>
   */
  TEXT_DECORATION_STYLE("text-decoration-style",false,new BrowserSupport (57.0,79.0,36.0,44.0,12.1),3.0 /*default Value = solid */  ),

  /**
   * Specifies the indentation of the first line in a text-block
   * <br><br>
   * The text-indent property specifies the indentation of the first line in a text-block.<br>
   * Note: Negative values are allowed. The first line will be indented to the left if the value is negative.<br>
   * <p>Indent the first line of text with different values:</p> 
   * <pre>
   *   
   *     div.a {<br>&nbsp; text-indent: 50px;<br>}<br><br>div.b {<br>&nbsp;&nbsp;text-indent: -2em;<br>}<br><br>div.c {<br>&nbsp;&nbsp;text-indent: 
   *     30%;<br>}
   *   
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_text_text-indent.asp">https://www.w3schools.com/cssref/pr_text_text-indent.asp</a>
   */
  TEXT_INDENT("text-indent",true,new BrowserSupport (1.0,3.0,1.0,3.5,1.0),1.0 /*default Value = 0 */  ),

  /**
   * Specifies the justification method used when text-align is "justify"
   * <br><br>
   * The text-justify property specifies the justification method of text when text-align is set to "justify".<br>
   * <p>Set the justification method to "inter-word" when text-align is set to "justify":</p> 
   * <pre>
   *   
   *     div
   *  {<br>
   *  &nbsp;
   *  text-align: justify;<br>
   *     &nbsp;
   *  text-justify: inter-word;<br>
   *  }
   *   
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_text-justify.asp">https://www.w3schools.com/cssref/css3_pr_text-justify.asp</a>
   */
  TEXT_JUSTIFY("text-justify",false,new BrowserSupport (-1.0,11.0,55.0,-1.0,-1.0),3.0 /*default Value = auto */  ),

  /**
   * Defines the orientation of the text in a line
   */
  TEXT_ORIENTATION("text-orientation",false,new BrowserSupport (-1.0,-1.0,-1.0,-1.0,-1.0),-1.0 /*default Value = null */  ),

  /**
   * Specifies what should happen when text overflows the containing element
   * <br><br>
   * The text-overflow property specifies how overflowed content that is not displayed should be signaled to the user. It can be clipped, display an ellipsis (...), or display a custom string.<br>
   * Both of the following properties are required for text-overflow:<br>
   * <p>Use of the text-overflow property:</p> 
   * <pre>
   *     div
   *  {<br>&nbsp; white-space: nowrap; <br>&nbsp; overflow: 
   *     hidden;<br>&nbsp;
   *  text-overflow: ellipsis;<br>
   *  }
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_text-overflow.asp">https://www.w3schools.com/cssref/css3_pr_text-overflow.asp</a>
   */
  TEXT_OVERFLOW("text-overflow",false,new BrowserSupport (4.0,6.0,7.0,11.0,3.1),3.0 /*default Value = clip */  ),

  /**
   * Adds shadow to text
   * <br><br>
   * The text-shadow property adds shadow to text.<br>
   * This property accepts a comma-separated list of shadows to be applied to the text.<br>
   * <p>Basic text-shadow:</p> 
   * <pre>
   *     h1
   *  {<br>
   *     &nbsp;
   *  text-shadow: 2px 2px #ff0000;<br>
   *  }
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_text-shadow.asp">https://www.w3schools.com/cssref/css3_pr_text-shadow.asp</a>
   */
  TEXT_SHADOW("text-shadow",true,new BrowserSupport (4.0,10.0,3.5,9.6,4.0),3.0 /*default Value = none */  ),

  /**
   * Controls the capitalization of text
   * <br><br>
   * The text-transform property controls the capitalization of text.<br>
   * <p>Transform text in different &lt;div&gt; elements:</p> 
   * <pre>
   *   
   *     div.a {<br>&nbsp;&nbsp;text-transform: uppercase;<br>}<br><br>
   *     div.b {<br>&nbsp; text-transform: lowercase;<br>}<br><br>
   *     div.c {<br>&nbsp; text-transform: capitalize;<br>}</pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_text_text-transform.asp">https://www.w3schools.com/cssref/pr_text_text-transform.asp</a>
   */
  TEXT_TRANSFORM("text-transform",false,new BrowserSupport (1.0,4.0,1.0,7.0,1.0),1.0 /*default Value = none */  ),

  /**
   * Specifies the position of the underline which is set using the text-decoration property
   */
  TEXT_UNDERLINE_POSITION("text-underline-position",false,new BrowserSupport (-1.0,-1.0,-1.0,-1.0,-1.0),-1.0 /*default Value = null */  ),

  /**
   * Specifies the top position of a positioned element
   * <br><br>
   * The top property affects the vertical position of a positioned element. This property has no effect on non-positioned elements.<br>
   * <p>Set the top edge of the positioned &lt;div&gt; element 50px down from the top edge of its nearest positioned ancestor:</p> 
   * <pre>
   * div {<br>&nbsp; position: absolute;<br>&nbsp;&nbsp;top: 
   * 50px;<br>&nbsp; border: 3px solid green;<br>}
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_pos_top.asp">https://www.w3schools.com/cssref/pr_pos_top.asp</a>
   */
  TOP("top",true,new BrowserSupport (1.0,5.0,1.0,6.0,1.0),2.0 /*default Value = auto */  ),

  /**
   * Applies a 2D or 3D transformation to an element
   * <br><br>
   * The transform property applies a 2D or 3D transformation to an element. This property allows you to rotate, scale, move, skew, etc., elements.<br>
   * To better understand the transform property, view a demo.<br>
   * <p>Rotate, skew, and scale three different &lt;div&gt; elements:</p> 
   * <pre>
   *   
   *     div.a {<br>&nbsp; transform: rotate(20deg);<br>}<br><br>div.b {<br>&nbsp; 
   *     transform: skewY(20deg);<br>}<br><br>div.c {<br>&nbsp; 
   *     transform: scaleY(1.5);<br>}
   *   
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_transform.asp">https://www.w3schools.com/cssref/css3_pr_transform.asp</a>
   */
  TRANSFORM("transform",true,new BrowserSupport (36.0,10.0,16.0,23.0,9.0),3.0 /*default Value = none */  ),

  /**
   * Allows you to change the position on transformed elements
   * <br><br>
   * The transform-origin property allows you to change the position of transformed elements.<br>
   * 2D transformations can change the x- and y-axis of an element. 3D transformations can also change the z-axis of an element.<br>
   * To better understand the transform-origin property, view a demo.<br>
   * Note: This property must be used together with the transform property.<br>
   * Tip: To better understand this property for 3D transforms, view a demo.<br>
   * <p>Set a rotated element's base placement:</p> 
   * <pre>
   *   
   *     div
   *  {<br>&nbsp;
   *  transform: rotate(45deg);<br>
   *     &nbsp;
   *  transform-origin: 20% 40%;<br>
   *  }
   *   
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_transform-origin.asp">https://www.w3schools.com/cssref/css3_pr_transform-origin.asp</a>
   */
  TRANSFORM_ORIGIN("transform-origin",true,new BrowserSupport (36.0,10.0,16.0,23.0,9.0),3.0 /*default Value = 50% 50% 0 */  ),

  /**
   * Specifies how nested elements are rendered in 3D space
   * <br><br>
   * The transform-style property specifies how nested elements are rendered in 3D space.<br>
   * Note: This property must be used together with the transform property.<br>
   * To better understand the transform-style property, view a demo.<br>
   * <p>Let the transformed child elements preserve the 3D transformations:</p> 
   * <pre>
   *   
   *     div
   *  {<br>
   *  &nbsp;&nbsp;transform: rotateY(60deg);<br>
   *     &nbsp;
   *  transform-style: preserve-3d;<br>
   *  }
   *   
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_transform-style.asp">https://www.w3schools.com/cssref/css3_pr_transform-style.asp</a>
   */
  TRANSFORM_STYLE("transform-style",false,new BrowserSupport (36.0,11.0,16.0,23.0,9.0),3.0 /*default Value = flat */  ),

  /**
   * A shorthand property for all the transition-* properties
   * <br><br>
   * The transition property is a shorthand property for:<br>
   * <p>Hover over a &lt;div&gt; element to gradually change the width from 100px to 300px:</p> 
   * <pre>
   *   
   *     div
   *  {<br>
   *  &nbsp;&nbsp;width: 100px;<br>&nbsp;&nbsp;transition: width 2s;<br>
   *  }<br><br>
   *  div:hover {<br>&nbsp;&nbsp;width: 300px;<br>}
   *   
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_transition.asp">https://www.w3schools.com/cssref/css3_pr_transition.asp</a>
   */
  TRANSITION("transition",false,new BrowserSupport (26.0,10.0,16.0,12.1,6.1),3.0 /*default Value = all 0s ease 0s */  ),

  /**
   * Specifies when the transition effect will start
   * <br><br>
   * The transition-delay property specifies when the transition effect will start.<br>
   * The transition-delay value is defined in seconds (s) or milliseconds (ms).<br>
   * <p>Wait 2 seconds before the transition effect starts:</p> 
   * <pre>
   *     div {<br>&nbsp;
   *     transition-delay: 2s;<br>}<br> 
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_transition-delay.asp">https://www.w3schools.com/cssref/css3_pr_transition-delay.asp</a>
   */
  TRANSITION_DELAY("transition-delay",false,new BrowserSupport (26.0,10.0,16.0,12.1,6.1),3.0 /*default Value = 0s */  ),

  /**
   * Specifies how many seconds or milliseconds a transition effect takes to complete
   * <br><br>
   * The transition-duration property specifies how many seconds (s) or milliseconds (ms) a transition effect takes to complete.<br>
   * <p>Let the transition effect last for 5 seconds:</p> 
   * <pre>
   *     div {<br>&nbsp;&nbsp;transition-duration: 5s;<br>
   *     }<br>
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_transition-duration.asp">https://www.w3schools.com/cssref/css3_pr_transition-duration.asp</a>
   */
  TRANSITION_DURATION("transition-duration",false,new BrowserSupport (26.0,10.0,16.0,12.1,6.1),3.0 /*default Value = 0s */  ),

  /**
   * Specifies the name of the CSS property the transition effect is for
   * <br><br>
   * The transition-property property specifies the name of the CSS property the transition effect is for (the transition effect will start when the specified CSS property changes).<br>
   * Tip: A transition effect could typically occur when a user hover over an element.<br>
   * Note: Always specify the transition-duration property, otherwise the duration is 0, and the transition will have no effect.<br>
   * <p>Hover over a &lt;div&gt; element, and change the width with a smooth transition effect:</p> 
   * <pre>
   *     div
   *  {<br>
   *     &nbsp;
   *  transition-property: width;<br>
   *  }<br><br>div:hover {<br>&nbsp; width: 300px;<br>} </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_transition-property.asp">https://www.w3schools.com/cssref/css3_pr_transition-property.asp</a>
   */
  TRANSITION_PROPERTY("transition-property",false,new BrowserSupport (26.0,10.0,16.0,12.1,6.1),3.0 /*default Value = all */  ),

  /**
   * Specifies the speed curve of the transition effect
   * <br><br>
   * The transition-timing-function property specifies the speed curve of the transition effect.<br>
   * This property allows a transition effect to change speed over its duration.<br>
   * <p>A transition effect with the same speed from start to end:</p> 
   * <pre>
   *     div {<br>&nbsp;&nbsp;transition-timing-function: linear;<br>
   *     }<br>  
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_transition-timing-function.asp">https://www.w3schools.com/cssref/css3_pr_transition-timing-function.asp</a>
   */
  TRANSITION_TIMING_FUNCTION("transition-timing-function",false,new BrowserSupport (26.0,10.0,16.0,12.1,6.1),3.0 /*default Value = ease */  ),

  /**
   * Used together with the direction property to set or return whether the text should be overridden to support multiple languages in the same document
   * <br><br>
   * The unicode-bidi property is used together with the direction property to set or return whether the text should be overridden to support multiple languages in the same document.<br>
   * <p>Override text:</p> 
   * <pre>
   *     div
   *  {<br>
   *  &nbsp;&nbsp;direction: rtl;<br>&nbsp; unicode-bidi: bidi-override;<br>
   *  }
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_text_unicode-bidi.asp">https://www.w3schools.com/cssref/pr_text_unicode-bidi.asp</a>
   */
  UNICODE_BIDI("unicode-bidi",false,new BrowserSupport (2.0,5.5,1.0,9.2,1.3),2.0 /*default Value = normal */  ),

  /**
   * Specifies whether the text of an element can be selected
   * <br><br>
   * The user-select property specifies whether the text of an element can be selected.<br>
   * In web browsers, if you double-click on some text it will be selected/highlighted. This property can be used to prevent this.<br>
   * <p>Prevent text selection of a &lt;div&gt; element:</p> 
   * <pre>
   *     div
   *  {<br>
   *     &nbsp; -webkit-user-select: none; // Safari 
   * <br>&nbsp; -ms-user-select: 
   *     none; // IE 10 and IE 11 
   * <br>&nbsp; user-select: none; // Standard 
   *     syntax 
   * <br>
   *  }
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_user-select.asp">https://www.w3schools.com/cssref/css3_pr_user-select.asp</a>
   */
  USER_SELECT("user-select",false,new BrowserSupport (54.0,79.0,69.0,41.0,3.1),3.0 /*default Value = auto */  ),

  /**
   * Sets the vertical alignment of an element
   * <br><br>
   * The vertical-align property sets the vertical alignment of an element.<br>
   * <p>Vertical align an image:</p> 
   * <pre>
   *     img.a {<br>&nbsp;&nbsp;vertical-align: baseline;<br>}<br><br>img.b {<br>&nbsp;&nbsp;vertical-align: text-top;<br>}<br><br>img.c {<br>
   *     &nbsp; 
   *     vertical-align: text-bottom;<br>}<br><br>img.d {<br>&nbsp; 
   *     vertical-align: sub;<br>}<br><br>img.e {<br>&nbsp;&nbsp;vertical-align: super;<br>} </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_pos_vertical-align.asp">https://www.w3schools.com/cssref/pr_pos_vertical-align.asp</a>
   */
  VERTICAL_ALIGN("vertical-align",true,new BrowserSupport (1.0,4.0,1.0,4.0,1.0),1.0 /*default Value = baseline */  ),

  /**
   * Specifies whether or not an element is visible
   * <br><br>
   * The visibility property specifies whether or not an element is visible.<br>
   * Tip: Hidden elements take up space on the page. Use the display property to both hide and remove an element from the document layout!<br>
   * <p>Make &lt;h2&gt; elements visible and hidden:</p> 
   * <pre>
   *     h2.a {<br>&nbsp;&nbsp;visibility: visible;<br>}<br><br>h2.b {<br>&nbsp;&nbsp;visibility: hidden;<br>}
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_class_visibility.asp">https://www.w3schools.com/cssref/pr_class_visibility.asp</a>
   */
  VISIBILITY("visibility",true,new BrowserSupport (1.0,4.0,1.0,4.0,1.0),2.0 /*default Value = visible */  ),

  /**
   * Specifies how white-space inside an element is handled
   * <br><br>
   * The white-space property specifies how white-space inside an element is handled.<br>
   * <p>Demonstrate different values of the white-space property:</p> 
   * <pre>
   *   
   *     p.a {<br>&nbsp;&nbsp;white-space: nowrap;<br>}<br><br>p.b {<br>&nbsp;&nbsp;white-space: normal;<br>}<br><br>p.c {<br>&nbsp;&nbsp;white-space: 
   *     pre;<br>}
   *   
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_text_white-space.asp">https://www.w3schools.com/cssref/pr_text_white-space.asp</a>
   */
  WHITE_SPACE("white-space",false,new BrowserSupport (1.0,8.0,3.5,9.5,3.0),1.0 /*default Value = normal */  ),

  /**
   * Sets the minimum number of lines that must be left at the top of a page when a page break occurs inside an element
   */
  WIDOWS("widows",false,new BrowserSupport (-1.0,-1.0,-1.0,-1.0,-1.0),-1.0 /*default Value = null */  ),

  /**
   * Sets the width of an element
   * <br><br>
   * The width property sets the width of an element.<br>
   * The width of an element does not include padding, borders, or margins!<br>
   * Note: The min-width and max-width properties override the width property.<br>
   * <p>Set the width of three &lt;div&gt; elements:</p> 
   * <pre>
   *     div.a {<br>&nbsp;&nbsp;width: auto;<br>&nbsp; border: 1px 
   *     solid black;<br>}<br><br>div.b {<br>&nbsp; width: 150px;<br>&nbsp; 
   *     border: 1px solid black; <br>}<br><br>div.c {<br>&nbsp;&nbsp;width: 
   *     50%;<br>&nbsp;&nbsp;border: 1px solid black; <br>}
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_dim_width.asp">https://www.w3schools.com/cssref/pr_dim_width.asp</a>
   */
  WIDTH("width",true,new BrowserSupport (1.0,4.0,1.0,3.5,1.0),1.0 /*default Value = auto */  ),

  /**
   * Specifies how words should break when reaching the end of a line
   * <br><br>
   * The word-break property specifies how words should break when reaching the end of a line.<br>
   * <p>Break words at any character:</p> 
   * <pre>
   *   
   *     p.a {<br>&nbsp;&nbsp;word-break: break-all;<br>}
   *   
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_word-break.asp">https://www.w3schools.com/cssref/css3_pr_word-break.asp</a>
   */
  WORD_BREAK("word-break",false,new BrowserSupport (4.0,5.5,15.0,15.0,3.1),3.0 /*default Value = normal */  ),

  /**
   * Increases or decreases the space between words in a text
   * <br><br>
   * The word-spacing property increases or decreases the white space between words.<br>
   * Note: Negative values are allowed.<br>
   * <p>Specify that the space between words in &lt;p&gt; elements should be 30 pixels:</p> 
   * <pre>
   *   
   *     p
   *  { <br>
   *  &nbsp;&nbsp;word-spacing: 30px;<br>
   *  }
   *   
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_text_word-spacing.asp">https://www.w3schools.com/cssref/pr_text_word-spacing.asp</a>
   */
  WORD_SPACING("word-spacing",true,new BrowserSupport (1.0,6.0,1.0,3.5,1.0),1.0 /*default Value = normal */  ),

  /**
   * Allows long, unbreakable words to be broken and wrap to the next line
   * <br><br>
   * The word-wrap property allows long words to be able to be broken and wrap onto the next line.<br>
   * <p>Allow long words to be able to break and wrap onto the next line:</p> 
   * <pre>
   *   
   *     div {<br>&nbsp;&nbsp;word-wrap: break-word;<br>}
   *   
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_word-wrap.asp">https://www.w3schools.com/cssref/css3_pr_word-wrap.asp</a>
   */
  WORD_WRAP("word-wrap",false,new BrowserSupport (4.0,5.5,3.5,10.5,3.1),3.0 /*default Value = normal */  ),

  /**
   * Specifies whether lines of text are laid out horizontally or vertically
   * <br><br>
   * The writing-mode property specifies whether lines of text are laid out horizontally or vertically.<br>
   * <p>Specify whether lines of text are laid out horizontally or vertically:</p> 
   * <pre>
   *   
   *     p.test1 {<br>&nbsp; writing-mode: horizontal-tb; <br>}<br><br>p.test2 {<br>&nbsp; 
   *     writing-mode: vertical-rl; <br>}<br><br>span.test2 {<br>&nbsp; writing-mode: 
   *     vertical-rl; <br>}   
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/css3_pr_writing-mode.asp">https://www.w3schools.com/cssref/css3_pr_writing-mode.asp</a>
   */
  WRITING_MODE("writing-mode",false,new BrowserSupport (48.0,12.0,41.0,35.0,11.0),3.0 /*default Value = horizontal-tb */  ),

  /**
   * Sets the stack order of a positioned element
   * <br><br>
   * The z-index property specifies the stack order of an element.<br>
   * An element with greater stack order is always in front of an element with a lower stack order.<br>
   * Note: z-index only works on positioned elements (position: absolute, position: relative, position: fixed, or position: sticky).<br>
   * <p>Set the z-index for an image:</p> 
   * <pre>
   *   
   *     img
   *  {<br>
   *     &nbsp;
   *  position: absolute;<br>
   *     &nbsp;
   *  left: 0px;<br>
   *     &nbsp;
   *  top: 0px;<br>
   *     &nbsp;
   *  z-index: -1;<br>
   *  }
   *   
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/cssref/pr_pos_z-index.asp">https://www.w3schools.com/cssref/pr_pos_z-index.asp</a>
   */
  Z_INDEX("z-index",true,new BrowserSupport (1.0,4.0,3.0,4.0,1.0),2.0 /*default Value = auto */  );

  public final String propertyName;

  public final boolean animatable;

  public final BrowserSupport browserSupport;

  public final double cssVersion;

  P(String propertyName, boolean animatable, BrowserSupport browserSupport,
      double cssVersion) {
    this.propertyName = propertyName;
    this.animatable = animatable;
    this.browserSupport = browserSupport;
    this.cssVersion = cssVersion;
  }

  @Override
  public final String propertyName() {
    return propertyName;
  }

  @Override
  public final boolean isAnimatable() {
    return animatable;
  }

  @Override
  public final BrowserSupport browserSupport() {
    return browserSupport;
  }

  @Override
  public final double cssVersion() {
    return cssVersion;
  }

  @Override
  public final StyleSegmentType_E type() {
    return StyleSegmentType_E.Property;
  }

  @Override
  public final void writeTo(Out_I o) {
    o.__(propertyName).__(":");
  }
}
