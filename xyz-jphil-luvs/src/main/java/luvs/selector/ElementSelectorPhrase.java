package luvs.selector;

import java.lang.Override;
import java.lang.String;
import luvs.TagNameProvider;

public enum ElementSelectorPhrase implements TagNameProvider {
  /**
   * Defines embedded sound content
   * <br>Browser support : <ul>
   * <li>IE/Edge: 9.0</li>
   * <li>Firefox: 3.5</li>
   * <li>Chrome: 4.0</li>
   * <li>Safari: 4.0</li>
   * <li>Opera: 11.5</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>Play a sound file:</p> 
   * <pre>
   *     &lt;audio controls&gt;<br>
   * &nbsp; &lt;source src="horse.ogg" type="audio/ogg"&gt;<br>
   * &nbsp; &lt;source src="horse.mp3" type="audio/mpeg"&gt;<br>
   * &nbsp; Your browser does not support the audio tag.<br>
   *  &lt;/audio&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_audio.asp">https://www.w3schools.com/tags/tag_audio.asp</a>
   */
  AUDIO("audio"),

  /**
   * Defines a visible heading for a <details> element
   * <br>Browser support : <ul>
   * <li>IE/Edge: 79.0</li>
   * <li>Firefox: 49.0</li>
   * <li>Chrome: 12.0</li>
   * <li>Safari: 6.0</li>
   * <li>Opera: 15.0</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>Using the &lt;summary&gt; element:</p> 
   * <pre>
   *     &lt;details&gt;<br>&nbsp; &lt;summary&gt;Epcot Center&lt;/summary&gt;<br>&nbsp; &lt;p&gt;Epcot is a 
   *     theme park at Walt Disney World Resort featuring exciting attractions, 
   *     international pavilions, award-winning fireworks and seasonal special 
   *     events.&lt;/p&gt;<br>&lt;/details&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_summary.asp">https://www.w3schools.com/tags/tag_summary.asp</a>
   */
  SUMMARY("summary"),

  /**
   * Defines an inline frame
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>An inline frame is marked up as follows:</p> 
   * <pre>
   *     &lt;iframe src="https://www.w3schools.com" title="W3Schools Free 
   *     Online Web Tutorials"&gt;&lt;/iframe&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_iframe.asp">https://www.w3schools.com/tags/tag_iframe.asp</a>
   */
  IFRAME("iframe"),

  /**
   * Defines a table
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>A simple HTML table, containing two columns and two rows:</p> 
   * <pre>
   *     &lt;table&gt;<br>
   *       &nbsp;
   *       &lt;tr&gt;<br>
   *       &nbsp;&nbsp;&nbsp;
   *       &lt;th&gt;Month&lt;/th&gt;<br>
   *       &nbsp;&nbsp;&nbsp;
   *       &lt;th&gt;Savings&lt;/th&gt;<br>
   *       &nbsp;
   *       &lt;/tr&gt;<br>
   *       &nbsp;
   *       &lt;tr&gt;<br>
   *       &nbsp;&nbsp;&nbsp;
   *       &lt;td&gt;January&lt;/td&gt;<br>
   *       &nbsp;&nbsp;&nbsp;
   *       &lt;td&gt;$100&lt;/td&gt;<br>
   *       &nbsp;
   *       &lt;/tr&gt;<br>
   *       &lt;/table&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_table.asp">https://www.w3schools.com/tags/tag_table.asp</a>
   */
  TABLE("table"),

  /**
   * Defines a text that has been inserted into a document
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>A text with a deleted part, and a new, inserted part:</p> 
   * <pre>
   *     &lt;p&gt;My favorite color is &lt;del&gt;blue&lt;/del&gt; &lt;ins&gt;red&lt;/ins&gt;!&lt;/p&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_ins.asp">https://www.w3schools.com/tags/tag_ins.asp</a>
   */
  INS("ins"),

  /**
   * Defines smaller text
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>Define a smaller text:</p> 
   * <pre>
   *     &lt;p&gt;This is some normal text.&lt;/p&gt;<br>&lt;p&gt;&lt;small&gt;This is some smaller 
   *     text.&lt;/small&gt;&lt;/p&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_small.asp">https://www.w3schools.com/tags/tag_small.asp</a>
   */
  SMALL("small"),

  /**
   * Specifies the base URL/target for all relative URLs in a document
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>Specify a default URL and a default target for all links on a page:</p> 
   * <pre>
   *     &lt;head&gt;<br>
   *  &nbsp;
   *  &lt;base href="https://www.w3schools.com/" target="_blank"&gt;<br>
   *  &lt;/head&gt;<br><br>&lt;body&gt;<br>
   *  &lt;img src="images/stickman.gif" width="24" height="39" alt="Stickman"&gt;<br>
   *  &lt;a href="tags/tag_base.asp"&gt;HTML base Tag&lt;/a&gt;<br>
   *  &lt;/body&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_base.asp">https://www.w3schools.com/tags/tag_base.asp</a>
   */
  BASE("base"),

  /**
   * Specifies column properties for each column within a <colgroup> element
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>Set the background color of the three columns with the &lt;colgroup&gt; and &lt;col&gt; tags:</p> 
   * <pre>
   *     &lt;table&gt;<br>
   * &nbsp; &lt;colgroup&gt;<br>
   * &nbsp;&nbsp;&nbsp; &lt;col span="2" style="background-color:red"&gt;<br>
   * &nbsp;&nbsp;&nbsp; &lt;col style="background-color:yellow"&gt;<br>
   * &nbsp; &lt;/colgroup&gt;<br>
   * &nbsp; &lt;tr&gt;<br>
   * &nbsp;&nbsp;&nbsp; &lt;th&gt;ISBN&lt;/th&gt;<br>
   * &nbsp;&nbsp;&nbsp; &lt;th&gt;Title&lt;/th&gt;<br>
   * &nbsp;&nbsp;&nbsp; &lt;th&gt;Price&lt;/th&gt;<br>
   * &nbsp; &lt;/tr&gt;<br>
   * &nbsp; &lt;tr&gt;<br>
   * &nbsp;&nbsp;&nbsp; &lt;td&gt;3476896&lt;/td&gt;<br>
   * &nbsp;&nbsp;&nbsp; &lt;td&gt;My first HTML&lt;/td&gt;<br>
   * &nbsp;&nbsp;&nbsp; &lt;td&gt;$53&lt;/td&gt;<br>
   * &nbsp; &lt;/tr&gt;<br>
   *  &lt;/table&gt;</pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_col.asp">https://www.w3schools.com/tags/tag_col.asp</a>
   */
  COL("col"),

  /**
   * Defines a section in a document
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>A &lt;div&gt; section in a document that is styled with CSS:</p> 
   * <pre>
   *   &lt;html&gt;<br>&lt;head&gt;<br>&lt;style&gt;<br>.myDiv {<br>&nbsp; border: 5px outset red;<br>&nbsp; 
   *   background-color: lightblue; <br>&nbsp; text-align: center;<br>}<br>&lt;/style&gt;<br>
   *   &lt;/head&gt;<br>&lt;body&gt;<br><br>&lt;div class="myDiv"&gt;<br>&nbsp; &lt;h2&gt;This is a heading 
   *   in a div element&lt;/h2&gt;<br>&nbsp; &lt;p&gt;This is some text in a div element.&lt;/p&gt;<br>
   *   &lt;/div&gt;<br><br>&lt;/body&gt;<br>&lt;/html&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_div.asp">https://www.w3schools.com/tags/tag_div.asp</a>
   */
  DIV("div"),

  /**
   * Defines an unordered list
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>An unordered HTML list:</p> 
   * <pre>
   *     &lt;ul&gt;<br>
   *       &nbsp;
   *       &lt;li&gt;Coffee&lt;/li&gt;<br>
   *       &nbsp;
   *       &lt;li&gt;Tea&lt;/li&gt;<br>
   *       &nbsp;
   *       &lt;li&gt;Milk&lt;/li&gt;<br>
   *       &lt;/ul&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_ul.asp">https://www.w3schools.com/tags/tag_ul.asp</a>
   */
  UL("ul"),

  /**
   * Defines style information for a document
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>Use of the &lt;style&gt; element to apply a simple style sheet to an HTML document:</p> 
   * <pre>
   *     &lt;html&gt;<br>
   *  &lt;head&gt;<br>
   *  &lt;style&gt;<br>
   *  &nbsp;
   *  h1 {color:red;}<br>
   *  &nbsp;
   *  p {color:blue;}<br>
   *  &lt;/style&gt;<br>
   *  &lt;/head&gt;<br>
   *  &lt;body&gt;<br><br>
   *  &lt;h1&gt;A heading&lt;/h1&gt;<br>
   *  &lt;p&gt;A paragraph.&lt;/p&gt;<br><br>
   *  &lt;/body&gt;<br>
   *  &lt;/html&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_style.asp">https://www.w3schools.com/tags/tag_style.asp</a>
   */
  STYLE("style"),

  /**
   * Specifies a list of pre-defined options for input controls
   * <br>Browser support : <ul>
   * <li>IE/Edge: 10.0</li>
   * <li>Firefox: 4.0</li>
   * <li>Chrome: 20.0</li>
   * <li>Safari: 12.1</li>
   * <li>Opera: 9.5</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>A datalist with pre-defined options (connected to an &lt;input&gt; element):</p> 
   * <pre>
   * &lt;label for="browser"&gt;Choose your browser from the list:&lt;/label&gt;<br>
   * &lt;input list="browsers" name="browser" id="browser"&gt;<br><br>&lt;datalist id="browsers"&gt;<br>
   * &nbsp; &lt;option value="Edge"&gt;<br>
   * &nbsp; &lt;option value="Firefox"&gt;<br>
   * &nbsp; &lt;option value="Chrome"&gt;<br>
   * &nbsp; &lt;option value="Opera"&gt;<br>
   * &nbsp; &lt;option value="Safari"&gt;<br>
   *  &lt;/datalist&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_datalist.asp">https://www.w3schools.com/tags/tag_datalist.asp</a>
   */
  DATALIST("datalist"),

  /**
   * Defines a container for content that should be hidden when the page loads
   * <br>Browser support : <ul>
   * <li>IE/Edge: 13.0</li>
   * <li>Firefox: 22.0</li>
   * <li>Chrome: 26.0</li>
   * <li>Safari: 8.0</li>
   * <li>Opera: 15.0</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>Use &lt;template&gt; to hold some content that will be hidden when the page loads. Use JavaScript to display it:</p> 
   * <pre>
   *   &lt;button onclick="showContent()"&gt;Show hidden content&lt;/button&gt;<br><br>&lt;template&gt;<br>&nbsp; 
   *   &lt;h2&gt;Flower&lt;/h2&gt;<br>&nbsp; &lt;img src="img_white_flower.jpg" width="214" 
   *   height="204"&gt;<br>&lt;/template&gt;<br><br>&lt;script&gt;<br>function showContent() {<br>&nbsp; var temp = 
   *   document.getElementsByTagName("template")[0];<br>&nbsp; var clon = 
   *   temp.content.cloneNode(true);<br>&nbsp; document.body.appendChild(clon);<br>}<br>
   *   &lt;/script&gt; </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_template.asp">https://www.w3schools.com/tags/tag_template.asp</a>
   */
  TEMPLATE("template"),

  /**
   * Specifies the main content of a document
   * <br>Browser support : <ul>
   * <li>IE/Edge: 12.0</li>
   * <li>Firefox: 21.0</li>
   * <li>Chrome: 26.0</li>
   * <li>Safari: 7.0</li>
   * <li>Opera: 16.0</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>Specify the main content of the document:</p> 
   * <pre>
   *     &lt;main&gt;<br>&nbsp; &lt;h1&gt;Most Popular Browsers&lt;/h1&gt;<br>&nbsp; &lt;p&gt;Chrome, Firefox, and 
   *     Edge are the most used browsers today.&lt;/p&gt;<br><br>&nbsp;
   *   &lt;article&gt;<br>&nbsp;&nbsp;&nbsp; &lt;h2&gt;Google Chrome&lt;/h2&gt;<br>&nbsp;&nbsp;&nbsp; &lt;p&gt;Google Chrome is a web browser 
   *   developed by Google, released in 2008. Chrome is the world's most popular web 
   *   browser today!&lt;/p&gt;<br>&nbsp; &lt;/article&gt;<br><br>&nbsp; &lt;article&gt;<br>&nbsp;&nbsp;&nbsp; &lt;h2&gt;Mozilla 
   *   Firefox&lt;/h2&gt;<br>&nbsp;&nbsp;&nbsp; &lt;p&gt;Mozilla Firefox is an open-source web browser developed by 
   *   Mozilla. Firefox has been the second most popular web browser since January, 
   *   2018.&lt;/p&gt;<br>&nbsp; &lt;/article&gt;<br><br>&nbsp; &lt;article&gt;<br>&nbsp;&nbsp;&nbsp; &lt;h2&gt;Microsoft Edge&lt;/h2&gt;<br>
   *   &nbsp;&nbsp;&nbsp;
   *   &lt;p&gt;Microsoft Edge is a web browser developed by Microsoft, released in 2015. 
   *   Microsoft Edge replaced Internet Explorer.&lt;/p&gt;<br>&nbsp; &lt;/article&gt;<br>&lt;/main&gt; </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_main.asp">https://www.w3schools.com/tags/tag_main.asp</a>
   */
  MAIN("main"),

  /**
   * Not supported in HTML5. Use <embed> or <object> instead. Defines an embedded applet
   * <br>Browser support : <ul>
   * <li>IE/Edge: Unknown</li>
   * <li>Firefox: Unknown</li>
   * <li>Chrome: Unknown</li>
   * <li>Safari: Unknown</li>
   * <li>Opera: Unknown</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <pre>
   *     &lt;video width="320" height="240" controls&gt;<br>
   * &nbsp; &lt;source src="movie.mp4" type="video/mp4"&gt;<br>
   * &nbsp; &lt;source src="movie.ogg" type="video/ogg"&gt;<br>
   * &nbsp; Your browser does not support the video tag.<br>
   *  &lt;/video&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_applet.asp">https://www.w3schools.com/tags/tag_applet.asp</a>
   */
  APPLET("applet"),

  /**
   * Defines a table caption
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>A table with a caption:</p> 
   * <pre>
   * &lt;table&gt;<br>
   * &nbsp;
   *     &lt;caption&gt;Monthly savings&lt;/caption&gt;<br>
   *     &nbsp; &lt;tr&gt;<br>
   * &nbsp;&nbsp;&nbsp; &lt;th&gt;Month&lt;/th&gt;<br>
   * &nbsp;&nbsp;&nbsp; &lt;th&gt;Savings&lt;/th&gt;<br>
   * &nbsp; &lt;/tr&gt;<br>
   * &nbsp; &lt;tr&gt;<br>
   * &nbsp;&nbsp;&nbsp; &lt;td&gt;January&lt;/td&gt;<br>
   * &nbsp;&nbsp;&nbsp; &lt;td&gt;$100&lt;/td&gt;<br>
   * &nbsp; &lt;/tr&gt;<br>
   * &lt;/table&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_caption.asp">https://www.w3schools.com/tags/tag_caption.asp</a>
   */
  CAPTION("caption"),

  /**
   * Defines a paragraph
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>A paragraph is marked up as follows:</p> 
   * <pre>
   * &lt;p&gt;This is some text in a paragraph.&lt;/p&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_p.asp">https://www.w3schools.com/tags/tag_p.asp</a>
   */
  P("p"),

  /**
   * Defines the document's body
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>A simple HTML document:</p> 
   * <pre>
   *     &lt;html&gt;<br>
   *  &lt;head&gt;<br>
   *  &nbsp;
   *  &lt;title&gt;Title of the document&lt;/title&gt;<br>
   *  &lt;/head&gt;<br><br>&lt;body&gt;<br>&nbsp; &lt;h1&gt;This is a heading&lt;/h1&gt;<br>&nbsp; 
   *     &lt;p&gt;This is a paragraph.&lt;/p&gt;<br>&lt;/body&gt;<br><br>&lt;/html&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_body.asp">https://www.w3schools.com/tags/tag_body.asp</a>
   */
  BODY("body"),

  /**
   * Defines a client-side script
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>Write "Hello JavaScript!" with JavaScript:</p> 
   * <pre>
   *     &lt;script&gt;<br>document.getElementById("demo").innerHTML = "Hello JavaScript!";<br>
   *  &lt;/script&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_script.asp">https://www.w3schools.com/tags/tag_script.asp</a>
   */
  SCRIPT("script"),

  /**
   * Defines a container for SVG graphics
   * <br>Browser support : <ul>
   * <li>IE/Edge: 9.0</li>
   * <li>Firefox: 3.0</li>
   * <li>Chrome: 4.0</li>
   * <li>Safari: 3.2</li>
   * <li>Opera: 10.1</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>Draw a circle:</p> 
   * <pre>
   *   &lt;svg width="100" height="100"&gt;<br>&nbsp; &lt;circle cx="50" cy="50" r="40" 
   *   stroke="green" stroke-width="4" fill="yellow" /&gt;<br>&lt;/svg&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_svg.asp">https://www.w3schools.com/tags/tag_svg.asp</a>
   */
  SVG("svg"),

  /**
   * Groups related elements in a form
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>Group related elements in a form:</p> 
   * <pre>
   *     &lt;form action="/action_page.php"&gt;<br>&nbsp; &lt;fieldset&gt;<br>&nbsp;&nbsp;&nbsp; 
   *     &lt;legend&gt;Personalia:&lt;/legend&gt;<br>&nbsp;&nbsp;&nbsp; &lt;label for="fname"&gt;First 
   *     name:&lt;/label&gt;<br>&nbsp;&nbsp;&nbsp; &lt;input type="text" id="fname" name="fname"&gt;&lt;br&gt;&lt;br&gt;<br>&nbsp;&nbsp;&nbsp; 
   *     &lt;label for="lname"&gt;Last name:&lt;/label&gt;<br>&nbsp;&nbsp;&nbsp; &lt;input 
   *     type="text" id="lname" name="lname"&gt;&lt;br&gt;&lt;br&gt;<br>&nbsp;&nbsp;&nbsp; &lt;label 
   *     for="email"&gt;Email:&lt;/label&gt;<br>&nbsp;&nbsp;&nbsp; &lt;input type="email" 
   *     id="email" name="email"&gt;&lt;br&gt;&lt;br&gt;<br>&nbsp;&nbsp;&nbsp; &lt;label 
   *     for="birthday"&gt;Birthday:&lt;/label&gt;<br>&nbsp;&nbsp;&nbsp; &lt;input type="date" 
   *     id="birthday" name="birthday"&gt;&lt;br&gt;&lt;br&gt;<br>&nbsp;&nbsp;&nbsp; &lt;input 
   *     type="submit" value="Submit"&gt;<br>&nbsp; &lt;/fieldset&gt;<br>&lt;/form&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_fieldset.asp">https://www.w3schools.com/tags/tag_fieldset.asp</a>
   */
  FIELDSET("fieldset"),

  /**
   * Defines an option in a drop-down list
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>A drop-down list with four options:</p> 
   * <pre>
   *     &lt;label for="cars"&gt;Choose a car:&lt;/label&gt;<br><br>&lt;select id="cars"&gt;<br>
   *       &nbsp;
   *       &lt;option value="volvo"&gt;Volvo&lt;/option&gt;<br>
   *       &nbsp;
   *       &lt;option value="saab"&gt;Saab&lt;/option&gt;<br>
   *       &nbsp;
   *       &lt;option value="opel"&gt;Opel&lt;/option&gt;<br>
   *       &nbsp;
   *       &lt;option value="audi"&gt;Audi&lt;/option&gt;<br>
   *       &lt;/select&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_option.asp">https://www.w3schools.com/tags/tag_option.asp</a>
   */
  OPTION("option"),

  /**
   * Defines a header for a document or section
   * <br>Browser support : <ul>
   * <li>IE/Edge: 9.0</li>
   * <li>Firefox: 4.0</li>
   * <li>Chrome: 5.0</li>
   * <li>Safari: 5.0</li>
   * <li>Opera: 11.1</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>A header for an &lt;article&gt;:</p> 
   * <pre>
   *     &lt;article&gt;<br>
   * &nbsp; &lt;header&gt;<br>
   *  &nbsp;&nbsp;&nbsp;
   *  &lt;h1&gt;A heading here&lt;/h1&gt;<br>&nbsp;&nbsp;&nbsp; &lt;p&gt;Posted by John 
   *     Doe&lt;/p&gt;<br>&nbsp;&nbsp;&nbsp; &lt;p&gt;Some additional information here&lt;/p&gt;<br>
   * &nbsp; &lt;/header&gt;<br>
   *  &nbsp; &lt;p&gt;Lorem Ipsum dolor set amet....&lt;/p&gt;<br>
   *  &lt;/article&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_header.asp">https://www.w3schools.com/tags/tag_header.asp</a>
   */
  HEADER("header"),

  /**
   * Defines a container for an external application
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>An embedded image:</p> 
   * <pre>
   *     &lt;object data="pic_trulli.jpg" width="300" height="200"&gt;&lt;/object&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_object.asp">https://www.w3schools.com/tags/tag_object.asp</a>
   */
  OBJECT("object"),

  /**
   * Defines a hyperlink
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>Create a link to W3Schools.com:</p> 
   * <pre>
   * &lt;a href="https://www.w3schools.com"&gt;Visit W3Schools.com!&lt;/a&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_a.asp">https://www.w3schools.com/tags/tag_a.asp</a>
   */
  A("a"),

  /**
   * Defines a description/value of a term in a description list
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>A description list, with terms and descriptions:</p> 
   * <pre>
   *     &lt;dl&gt;<br>
   *  &nbsp;
   *  &lt;dt&gt;Coffee&lt;/dt&gt;<br>
   *  &nbsp;&nbsp;&lt;dd&gt;Black hot drink&lt;/dd&gt;<br>
   *  &nbsp;
   *  &lt;dt&gt;Milk&lt;/dt&gt;<br>
   *  &nbsp;&nbsp;&lt;dd&gt;White cold drink&lt;/dd&gt;<br>
   *  &lt;/dl&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_dd.asp">https://www.w3schools.com/tags/tag_dd.asp</a>
   */
  DD("dd"),

  /**
   * Defines a ruby annotation (for East Asian typography)
   * <br>Browser support : <ul>
   * <li>IE/Edge: 5.5</li>
   * <li>Firefox: 38.0</li>
   * <li>Chrome: 5.0</li>
   * <li>Safari: 5.0</li>
   * <li>Opera: 15.0</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>A ruby annotation:</p> 
   * <pre>
   *     &lt;ruby&gt;<br>
   *  漢 &lt;rt&gt; ㄏㄢˋ &lt;/rt&gt;<br>
   *  &lt;/ruby&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_ruby.asp">https://www.w3schools.com/tags/tag_ruby.asp</a>
   */
  RUBY("ruby"),

  /**
   * Not supported in HTML5. Use <del> or <s> instead. Defines strikethrough text
   * <br>Browser support : <ul>
   * <li>IE/Edge: Unknown</li>
   * <li>Firefox: Unknown</li>
   * <li>Chrome: Unknown</li>
   * <li>Safari: Unknown</li>
   * <li>Opera: Unknown</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>Use the <a href="tag_del.asp">&lt;del&gt;</a> tag to define deleted text:</p> 
   * <pre>
   * &lt;p&gt;My favorite color is &lt;del&gt;blue&lt;/del&gt; &lt;ins&gt;red&lt;/ins&gt;!&lt;/p&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_strike.asp">https://www.w3schools.com/tags/tag_strike.asp</a>
   */
  STRIKE("strike"),

  /**
   * Not supported in HTML5. Use CSS instead. Defines big text
   * <br>Browser support : <ul>
   * <li>IE/Edge: Unknown</li>
   * <li>Firefox: Unknown</li>
   * <li>Chrome: Unknown</li>
   * <li>Safari: Unknown</li>
   * <li>Opera: Unknown</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>Specify different font-sizes for HTML elements (with CSS):</p> 
   * <pre>
   *     &lt;html&gt;<br>&lt;head&gt;<br>&lt;style&gt;<br>p.ex1 {<br>&nbsp; font-size: 30px;<br>}<br>p.ex2 {<br>&nbsp; 
   *     font-size: 50px;<br>}<br>&lt;/style&gt;<br>&lt;/head&gt;<br>&lt;body&gt;<br><br>&lt;p&gt;This is a normal paragraph.&lt;/p&gt;<br>&lt;p 
   *     class="ex1"&gt;This is a bigger paragraph.&lt;/p&gt;<br>&lt;p class="ex2"&gt;This is a much 
   *     bigger paragraph.&lt;/p&gt;<br><br>&lt;/body&gt;<br>&lt;/html&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_big.asp">https://www.w3schools.com/tags/tag_big.asp</a>
   */
  BIG("big"),

  /**
   * Defines a drop-down list
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>Create a drop-down list with four options:</p> 
   * <pre>
   *     &lt;label for="cars"&gt;Choose a car:&lt;/label&gt;<br><br>&lt;select 
   *     name="cars" id="cars"&gt;<br>
   *       &nbsp;
   *       &lt;option value="volvo"&gt;Volvo&lt;/option&gt;<br>
   *       &nbsp;
   *       &lt;option value="saab"&gt;Saab&lt;/option&gt;<br>
   *       &nbsp;
   *       &lt;option value="mercedes"&gt;Mercedes&lt;/option&gt;<br>
   *       &nbsp;
   *       &lt;option value="audi"&gt;Audi&lt;/option&gt;<br>
   *       &lt;/select&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_select.asp">https://www.w3schools.com/tags/tag_select.asp</a>
   */
  SELECT("select"),

  /**
   * Defines an article
   * <br>Browser support : <ul>
   * <li>IE/Edge: 9.0</li>
   * <li>Firefox: 4.0</li>
   * <li>Chrome: 6.0</li>
   * <li>Safari: 5.0</li>
   * <li>Opera: 11.1</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>Three articles with independent, self-contained content:</p> 
   * <pre>
   *   &lt;article&gt;<br>&lt;h2&gt;Google Chrome&lt;/h2&gt;<br>&lt;p&gt;Google Chrome is a web browser 
   *   developed by Google, released in 2008. Chrome is the world's most popular web 
   *   browser today!&lt;/p&gt;<br>&lt;/article&gt;<br><br>&lt;article&gt;<br>&lt;h2&gt;Mozilla 
   *   Firefox&lt;/h2&gt;<br>&lt;p&gt;Mozilla Firefox is an open-source web browser developed by 
   *   Mozilla. Firefox has been the second most popular web browser since January, 
   *   2018.&lt;/p&gt;<br>&lt;/article&gt;<br><br>&lt;article&gt;<br>&lt;h2&gt;Microsoft Edge&lt;/h2&gt;<br>
   *   &lt;p&gt;Microsoft Edge is a web browser developed by Microsoft, released in 2015. 
   *   Microsoft Edge replaced Internet Explorer.&lt;/p&gt;<br>&lt;/article&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_article.asp">https://www.w3schools.com/tags/tag_article.asp</a>
   */
  ARTICLE("article"),

  /**
   * Defines a short quotation
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>Mark up a short quotation:</p> 
   * <pre>
   *     &lt;p&gt;WWF's goal is to: <br>
   *  &lt;q&gt;Build a future where people live in harmony with nature.&lt;/q&gt;<br>
   *  We hope they succeed.&lt;/p&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_q.asp">https://www.w3schools.com/tags/tag_q.asp</a>
   */
  Q("q"),

  /**
   * Defines subscripted text
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>Subscript text:</p> 
   * <pre>
   *     &lt;p&gt;This text contains &lt;sub&gt;subscript&lt;/sub&gt; text.&lt;/p&gt;<br>
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_sub.asp">https://www.w3schools.com/tags/tag_sub.asp</a>
   */
  SUB("sub"),

  /**
   * Contains metadata/information for the document
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>A simple HTML document, with a &lt;title&gt; tag inside the head section:</p> 
   * <pre>
   *     &lt;!DOCTYPE html&gt;<br>&lt;html lang="en"&gt;<br>
   *  &lt;head&gt;<br>
   *  &nbsp;
   *  &lt;title&gt;Title of the document&lt;/title&gt;<br>
   *  &lt;/head&gt;<br>&lt;body&gt;<br><br>&lt;h1&gt;This is a heading&lt;/h1&gt;<br>&lt;p&gt;This is a 
   *     paragraph.&lt;/p&gt;<br><br>&lt;/body&gt;<br>&lt;/html&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_head.asp">https://www.w3schools.com/tags/tag_head.asp</a>
   */
  HEAD("head"),

  /**
   * Defines a header cell in a table
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>A simple HTML table with three rows, two header cells and four data cells:</p> 
   * <pre>
   *   &lt;table&gt;<br>&nbsp; &lt;tr&gt;<br>&nbsp;&nbsp;&nbsp; &lt;th&gt;Month&lt;/th&gt;<br>&nbsp;&nbsp;&nbsp; 
   *   &lt;th&gt;Savings&lt;/th&gt;<br>&nbsp; &lt;/tr&gt;<br>&nbsp; &lt;tr&gt;<br>&nbsp;&nbsp;&nbsp; 
   *   &lt;td&gt;January&lt;/td&gt;<br>&nbsp;&nbsp;&nbsp; &lt;td&gt;$100&lt;/td&gt;<br>&nbsp; &lt;/tr&gt;<br>&nbsp; 
   *   &lt;tr&gt;<br>&nbsp;&nbsp;&nbsp; &lt;td&gt;February&lt;/td&gt;<br>&nbsp;&nbsp;&nbsp; 
   *   &lt;td&gt;$80&lt;/td&gt;<br>&nbsp; &lt;/tr&gt;<br>&lt;/table&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_th.asp">https://www.w3schools.com/tags/tag_th.asp</a>
   */
  TH("th"),

  /**
   * Groups the header content in a table
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>An HTML table with a &lt;thead&gt;, &lt;tbody&gt;, and a &lt;tfoot&gt; element:</p> 
   * <pre>
   * &lt;table&gt;<br>
   * &nbsp; &lt;thead&gt;<br>
   * &nbsp;&nbsp;&nbsp; &lt;tr&gt;<br>
   * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &lt;th&gt;Month&lt;/th&gt;<br>
   * &nbsp;
   * &nbsp;&nbsp;&nbsp;&nbsp;&lt;th&gt;Savings&lt;/th&gt;<br>
   * &nbsp;&nbsp;&nbsp; &lt;/tr&gt;<br>
   * &nbsp; &lt;/thead&gt;<br>
   * &nbsp; &lt;tbody&gt;<br>
   * &nbsp;&nbsp;&nbsp; &lt;tr&gt;<br>
   * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &lt;td&gt;January&lt;/td&gt;<br>
   * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &lt;td&gt;$100&lt;/td&gt;<br>
   * &nbsp;&nbsp;&nbsp; &lt;/tr&gt;<br>
   * &nbsp;&nbsp;&nbsp; &lt;tr&gt;<br>
   * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &lt;td&gt;February&lt;/td&gt;<br>
   * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &lt;td&gt;$80&lt;/td&gt;<br>
   * &nbsp;&nbsp;&nbsp; &lt;/tr&gt;<br>
   * &nbsp; &lt;/tbody&gt;<br>
   * &nbsp; &lt;tfoot&gt;<br>
   * &nbsp;&nbsp;&nbsp; &lt;tr&gt;<br>
   * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &lt;td&gt;Sum&lt;/td&gt;<br>
   * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &lt;td&gt;$180&lt;/td&gt;<br>
   * &nbsp;&nbsp;&nbsp; &lt;/tr&gt;<br>
   * &nbsp; &lt;/tfoot&gt;<br>
   * &lt;/table&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_thead.asp">https://www.w3schools.com/tags/tag_thead.asp</a>
   */
  THEAD("thead"),

  /**
   * Defines a thematic change in the content
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>Use the &lt;hr&gt; tag to define thematic changes in the content:</p> 
   * <pre>
   *     &lt;h1&gt;The Main Languages of the Web&lt;/h1&gt;<br><br>&lt;p&gt;HTML is the standard markup 
   *     language for creating Web pages. HTML describes the structure of a Web page, 
   *     and consists of a series of elements. HTML elements tell the browser how to 
   *     display the content.&lt;/p&gt;<br><br>&lt;hr&gt;<br><br>&lt;p&gt;CSS is a language that 
   *     describes how HTML elements are to be displayed on screen, paper, or in 
   *     other media. CSS saves a lot of work, because it can control the layout of 
   *     multiple web pages all at once.&lt;/p&gt;<br><br>&lt;hr&gt;<br><br>&lt;p&gt;JavaScript is the 
   *     programming language of HTML and the Web. JavaScript can change HTML content 
   *     and attribute values. JavaScript can change CSS. JavaScript can hide and 
   *     show HTML elements, and more.&lt;/p&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_hr.asp">https://www.w3schools.com/tags/tag_hr.asp</a>
   */
  HR("hr"),

  /**
   * Defines an area inside an image map
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>An image map, with clickable areas:</p> 
   * <pre>
   * &lt;img src="workplace.jpg" alt="Workplace" usemap="#workmap" width="400" 
   *     height="379"&gt;<br><br>&lt;map name="workmap"&gt;<br>&nbsp; &lt;area shape="rect" 
   *     coords="34,44,270,350" alt="Computer" href="computer.htm"&gt;<br>&nbsp; &lt;area 
   *     shape="rect" coords="290,172,333,250" alt="Phone" href="phone.htm"&gt;<br>&nbsp; &lt;area 
   *     shape="circle" coords="337,300,44" alt="Cup of coffee" href="coffee.htm"&gt;<br>
   *     &lt;/map&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_area.asp">https://www.w3schools.com/tags/tag_area.asp</a>
   */
  AREA("area"),

  /**
   * Not supported in HTML5. Use CSS instead. Specifies a default color, size, and font for all text in a document
   * <br>Browser support : <ul>
   * <li>IE/Edge: Unknown</li>
   * <li>Firefox: Unknown</li>
   * <li>Chrome: Unknown</li>
   * <li>Safari: Unknown</li>
   * <li>Opera: Unknown</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>Specify a default text-color for a page (with CSS):</p> 
   * <pre>
   *     &lt;html&gt;<br>&lt;head&gt;<br>&lt;style&gt;<br>body {<br>&nbsp; color: red;<br>}<br>
   *     &lt;/style&gt;<br>&lt;/head&gt;<br>&lt;body&gt;<br><br>&lt;h1&gt;This is a heading&lt;/h1&gt;<br>&lt;p&gt;This 
   *     is a paragraph.&lt;/p&gt;<br><br>&lt;/body&gt;<br>&lt;/html&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_basefont.asp">https://www.w3schools.com/tags/tag_basefont.asp</a>
   */
  BASEFONT("basefont"),

  /**
   * Defines additional details that the user can view or hide
   * <br>Browser support : <ul>
   * <li>IE/Edge: 79.0</li>
   * <li>Firefox: 49.0</li>
   * <li>Chrome: 12.0</li>
   * <li>Safari: 6.0</li>
   * <li>Opera: 15.0</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>Specify details that the user can open and close on demand:</p> 
   * <pre>
   *     &lt;details&gt;<br>&nbsp; &lt;summary&gt;Epcot Center&lt;/summary&gt;<br>&nbsp; &lt;p&gt;Epcot is a 
   *     theme park at Walt Disney World Resort featuring exciting attractions, 
   *     international pavilions, award-winning fireworks and seasonal special 
   *     events.&lt;/p&gt;<br>&lt;/details&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_details.asp">https://www.w3schools.com/tags/tag_details.asp</a>
   */
  DETAILS("details"),

  /**
   * Defines an explanation/pronunciation of characters (for East Asian typography)
   * <br>Browser support : <ul>
   * <li>IE/Edge: 5.5</li>
   * <li>Firefox: 38.0</li>
   * <li>Chrome: 5.0</li>
   * <li>Safari: 5.0</li>
   * <li>Opera: 15.0</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>A ruby annotation:</p> 
   * <pre>
   *     &lt;ruby&gt;<br>
   *  漢 &lt;rt&gt; ㄏㄢˋ &lt;/rt&gt;<br>
   *  &lt;/ruby&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_rt.asp">https://www.w3schools.com/tags/tag_rt.asp</a>
   */
  RT("rt"),

  /**
   * Defines an ordered list
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>Two different ordered lists (the first list starts at 1, and the second starts at 50):</p> 
   * <pre>
   *     &lt;ol&gt;<br>
   *  &nbsp;
   *  &lt;li&gt;Coffee&lt;/li&gt;<br>
   *  &nbsp;
   *  &lt;li&gt;Tea&lt;/li&gt;<br>
   *  &nbsp;
   *  &lt;li&gt;Milk&lt;/li&gt;<br>
   *  &lt;/ol&gt;<br>
   *  <br>
   *  &lt;ol start="50"&gt;<br>
   *  &nbsp;
   *  &lt;li&gt;Coffee&lt;/li&gt;<br>
   *  &nbsp;
   *  &lt;li&gt;Tea&lt;/li&gt;<br>
   *  &nbsp;
   *  &lt;li&gt;Milk&lt;/li&gt;<br>
   *  &lt;/ol&gt;</pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_ol.asp">https://www.w3schools.com/tags/tag_ol.asp</a>
   */
  OL("ol"),

  /**
   * Not supported in HTML5. Use <abbr> instead. Defines an acronym
   * <br>Browser support : <ul>
   * <li>IE/Edge: Unknown</li>
   * <li>Firefox: Unknown</li>
   * <li>Chrome: Unknown</li>
   * <li>Safari: Unknown</li>
   * <li>Opera: Unknown</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>An acronym or abbreviation should be marked up with the <a href="tag_abbr.asp">&lt;abbr&gt;</a> tag:</p> 
   * <pre>
   *     The &lt;abbr title="World Health Organization"&gt;WHO&lt;/abbr&gt; was founded in 1948.
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_acronym.asp">https://www.w3schools.com/tags/tag_acronym.asp</a>
   */
  ACRONYM("acronym"),

  /**
   * Defines a piece of computer code
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>Define some text as computer code in a document:</p> 
   * <pre>
   *   &lt;p&gt;The HTML &lt;code&gt;button&lt;/code&gt; tag defines a clickable button.&lt;/p&gt;<br><br>
   *   &lt;p&gt;The CSS &lt;code&gt;background-color&lt;/code&gt; property defines the background color 
   *   of an element.&lt;/p&gt;</pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_code.asp">https://www.w3schools.com/tags/tag_code.asp</a>
   */
  CODE("code"),

  /**
   * Represents the progress of a task
   * <br>Browser support : <ul>
   * <li>IE/Edge: 10.0</li>
   * <li>Firefox: 16.0</li>
   * <li>Chrome: 8.0</li>
   * <li>Safari: 6.0</li>
   * <li>Opera: 11.0</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>Show a progress bar:</p> 
   * <pre>
   *     &lt;label for="file"&gt;Downloading progress:&lt;/label&gt;<br>&lt;progress id="file" 
   *     value="32" max="100"&gt; 32% &lt;/progress&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_progress.asp">https://www.w3schools.com/tags/tag_progress.asp</a>
   */
  PROGRESS("progress"),

  /**
   * Specifies a group of one or more columns in a table for formatting
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>Set the background color of the three columns with the &lt;colgroup&gt; and &lt;col&gt; tags:</p> 
   * <pre>
   *   
   *     &lt;table&gt;<br>
   * &nbsp; &lt;colgroup&gt;<br>
   * &nbsp;&nbsp;&nbsp; &lt;col span="2" style="background-color:red"&gt;<br>
   * &nbsp;&nbsp;&nbsp; &lt;col style="background-color:yellow"&gt;<br>
   * &nbsp; &lt;/colgroup&gt;<br>
   * &nbsp; &lt;tr&gt;<br>
   * &nbsp;&nbsp;&nbsp; &lt;th&gt;ISBN&lt;/th&gt;<br>
   * &nbsp;&nbsp;&nbsp; &lt;th&gt;Title&lt;/th&gt;<br>
   * &nbsp;&nbsp;&nbsp; &lt;th&gt;Price&lt;/th&gt;<br>
   * &nbsp; &lt;/tr&gt;<br>
   * &nbsp; &lt;tr&gt;<br>
   * &nbsp;&nbsp;&nbsp; &lt;td&gt;3476896&lt;/td&gt;<br>
   * &nbsp;&nbsp;&nbsp; &lt;td&gt;My first HTML&lt;/td&gt;<br>
   * &nbsp;&nbsp;&nbsp; &lt;td&gt;$53&lt;/td&gt;<br>
   * &nbsp; &lt;/tr&gt;<br>
   * &lt;/table&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_colgroup.asp">https://www.w3schools.com/tags/tag_colgroup.asp</a>
   */
  COLGROUP("colgroup"),

  /**
   * Defines the root of an HTML document
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>A simple HTML document:</p> 
   * <pre>
   *     &lt;!DOCTYPE html&gt;<br>
   *     &lt;html lang="en"&gt;<br>
   *  &lt;head&gt;<br>
   *  &nbsp;
   *  &lt;title&gt;Title of the document&lt;/title&gt;<br>
   *  &lt;/head&gt;<br>
   *  &lt;body&gt;<br><br>&lt;h1&gt;This is a heading&lt;/h1&gt;<br>&lt;p&gt;This is a paragraph.&lt;/p&gt;<br><br>
   *  &lt;/body&gt;<br>
   *  &lt;/html&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_html.asp">https://www.w3schools.com/tags/tag_html.asp</a>
   */
  HTML("html"),

  /**
   * Defines content aside from the page content
   * <br>Browser support : <ul>
   * <li>IE/Edge: 9.0</li>
   * <li>Firefox: 4.0</li>
   * <li>Chrome: 6.0</li>
   * <li>Safari: 5.0</li>
   * <li>Opera: 11.1</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>Display some content aside from the content it is placed in:</p> 
   * <pre>
   *     &lt;p&gt;My family and I visited The Epcot center this summer. The weather was 
   *     nice, and Epcot was amazing! I had a great summer together with my 
   *     family!&lt;/p&gt;<br><br>&lt;aside&gt;<br>&lt;h4&gt;Epcot Center&lt;/h4&gt;<br>&lt;p&gt;Epcot is a theme 
   *     park at Walt Disney World Resort featuring exciting attractions, 
   *     international pavilions, award-winning fireworks and seasonal special 
   *     events.&lt;/p&gt;<br>&lt;/aside&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_aside.asp">https://www.w3schools.com/tags/tag_aside.asp</a>
   */
  ASIDE("aside"),

  /**
   * Defines multiple media resources for media elements (<video> and <audio>)
   * <br>Browser support : <ul>
   * <li>IE/Edge: 9.0</li>
   * <li>Firefox: 3.5</li>
   * <li>Chrome: 4.0</li>
   * <li>Safari: 4.0</li>
   * <li>Opera: 10.5</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>An audio player with two source files. The browser will choose the first &lt;source&gt; it supports:</p> 
   * <pre>
   *     &lt;audio controls&gt;<br>
   *  &nbsp; &lt;source src="horse.ogg" type="audio/ogg"&gt;<br>
   *  &nbsp; &lt;source src="horse.mp3" type="audio/mpeg"&gt;<br>
   *  &nbsp;
   *  Your browser does not support the audio element.<br>
   *  &lt;/audio&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_source.asp">https://www.w3schools.com/tags/tag_source.asp</a>
   */
  SOURCE("source"),

  /**
   * Defines a part of text in an alternate voice or mood
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>Mark up text that is set off from the normal prose in a document:&nbsp;</p> 
   * <pre>
   *     &lt;p&gt;&lt;i&gt;Lorem ipsum&lt;/i&gt; is the most popular filler text in history.&lt;/p&gt;<br>
   *     <br>&lt;p&gt;The &lt;i&gt;RMS Titanic&lt;/i&gt;, a luxury steamship, sank on April 15, 1912 
   *     after striking an iceberg.&lt;/p&gt;</pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_i.asp">https://www.w3schools.com/tags/tag_i.asp</a>
   */
  I("i"),

  /**
   * Overrides the current text direction
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>Specify the text direction:</p> 
   * <pre>
   *     &lt;bdo dir="rtl"&gt;<br>This text will go right-to-left.<br>&lt;/bdo&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_bdo.asp">https://www.w3schools.com/tags/tag_bdo.asp</a>
   */
  BDO("bdo"),

  /**
   * Adds a machine-readable translation of a given content
   * <br>Browser support : <ul>
   * <li>IE/Edge: 13.0</li>
   * <li>Firefox: 22.0</li>
   * <li>Chrome: 62.0</li>
   * <li>Safari: Not supported</li>
   * <li>Opera: 49.0</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>The following example displays product names but also associates each name with a product number:</p> 
   * <pre>
   *   &lt;ul&gt;<br>&nbsp; &lt;li&gt;&lt;data value="21053"&gt;Cherry 
   *   Tomato&lt;/data&gt;&lt;/li&gt;<br>&nbsp; &lt;li&gt;&lt;data value="21054"&gt;Beef 
   *   Tomato&lt;/data&gt;&lt;/li&gt;<br>&nbsp; &lt;li&gt;&lt;data value="21055"&gt;Snack 
   *   Tomato&lt;/data&gt;&lt;/li&gt;<br>&lt;/ul&gt; </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_data.asp">https://www.w3schools.com/tags/tag_data.asp</a>
   */
  DATA("data"),

  /**
   * Defines text that has been deleted from a document
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>A text with a deleted part, and a new, inserted part:</p> 
   * <pre>
   * &lt;p&gt;My favorite color is &lt;del&gt;blue&lt;/del&gt; &lt;ins&gt;red&lt;/ins&gt;!&lt;/p&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_del.asp">https://www.w3schools.com/tags/tag_del.asp</a>
   */
  DEL("del"),

  /**
   * Defines a description list
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>A description list, with terms and descriptions:</p> 
   * <pre>
   *     &lt;dl&gt;<br>
   *  &nbsp;
   *  &lt;dt&gt;Coffee&lt;/dt&gt;<br>
   *  &nbsp;&nbsp;&lt;dd&gt;Black hot drink&lt;/dd&gt;<br>
   *  &nbsp;
   *  &lt;dt&gt;Milk&lt;/dt&gt;<br>
   *  &nbsp;&nbsp;&lt;dd&gt;White cold drink&lt;/dd&gt;<br>
   *  &lt;/dl&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_dl.asp">https://www.w3schools.com/tags/tag_dl.asp</a>
   */
  DL("dl"),

  /**
   * Defines a row in a table
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>A simple HTML table with three rows; one header row and two data rows:</p> 
   * <pre>
   *     &lt;table&gt;<br>&nbsp; &lt;tr&gt;<br>&nbsp;&nbsp;&nbsp; &lt;th&gt;Month&lt;/th&gt;<br>&nbsp;&nbsp;&nbsp; 
   *     &lt;th&gt;Savings&lt;/th&gt;<br>&nbsp; &lt;/tr&gt;<br>&nbsp; &lt;tr&gt;<br>&nbsp;&nbsp;&nbsp; 
   *     &lt;td&gt;January&lt;/td&gt;<br>&nbsp;&nbsp;&nbsp; &lt;td&gt;$100&lt;/td&gt;<br>&nbsp; &lt;/tr&gt;<br>&nbsp; 
   *     &lt;tr&gt;<br>&nbsp;&nbsp;&nbsp; &lt;td&gt;February&lt;/td&gt;<br>&nbsp;&nbsp;&nbsp; 
   *     &lt;td&gt;$80&lt;/td&gt;<br>&nbsp; &lt;/tr&gt;<br>&lt;/table&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_tr.asp">https://www.w3schools.com/tags/tag_tr.asp</a>
   */
  TR("tr"),

  /**
   * Defines a clickable button
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>A clickable button is marked up as follows:</p> 
   * <pre>
   *     &lt;button type="button"&gt;Click Me!&lt;/button&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_button.asp">https://www.w3schools.com/tags/tag_button.asp</a>
   */
  BUTTON("button"),

  /**
   * Not supported in HTML5. Use CSS instead. Defines centered text
   * <br>Browser support : <ul>
   * <li>IE/Edge: Unknown</li>
   * <li>Firefox: Unknown</li>
   * <li>Chrome: Unknown</li>
   * <li>Safari: Unknown</li>
   * <li>Opera: Unknown</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>Center-align text (with CSS):</p> 
   * <pre>
   *     &lt;html&gt;<br>&lt;head&gt;<br>&lt;style&gt;<br>h1 {text-align: center;}<br>p {text-align: 
   *     center;}<br>div {text-align: center;}<br>&lt;/style&gt;<br>&lt;/head&gt;<br>&lt;body&gt;<br><br>&lt;h1&gt;This is a 
   *     heading&lt;/h1&gt;<br>&lt;p&gt;This is a paragraph.&lt;/p&gt;<br>&lt;div&gt;This 
   *     is a div.&lt;/div&gt;<br><br>&lt;/body&gt;<br>&lt;/html&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_center.asp">https://www.w3schools.com/tags/tag_center.asp</a>
   */
  CENTER("center"),

  /**
   * Defines a section in a document
   * <br>Browser support : <ul>
   * <li>IE/Edge: 9.0</li>
   * <li>Firefox: 4.0</li>
   * <li>Chrome: 5.0</li>
   * <li>Safari: 5.0</li>
   * <li>Opera: 11.5</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>Two sections in a document:</p> 
   * <pre>
   *     &lt;section&gt;<br>&lt;h2&gt;WWF History&lt;/h2&gt;<br>&lt;p&gt;The World Wide Fund for Nature (WWF) 
   *     is an international organization working on issues regarding the 
   *     conservation, research and restoration of the environment, formerly named 
   *     the World Wildlife Fund. WWF was founded in 1961.&lt;/p&gt;<br>&lt;/section&gt;<br><br>
   *     &lt;section&gt;<br>&lt;h2&gt;WWF's Symbol&lt;/h2&gt;<br>&lt;p&gt;The Panda has become the symbol of 
   *     WWF. The well-known panda logo of WWF originated from a panda named Chi Chi 
   *     that was transferred from the Beijing Zoo to the London Zoo in the same year 
   *     of the establishment of WWF.&lt;/p&gt;<br>&lt;/section&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_section.asp">https://www.w3schools.com/tags/tag_section.asp</a>
   */
  SECTION("section"),

  /**
   * Defines superscripted text
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>Superscript text:</p> 
   * <pre>
   *  &lt;p&gt;This text contains &lt;sup&gt;superscript&lt;/sup&gt; text.&lt;/p&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_sup.asp">https://www.w3schools.com/tags/tag_sup.asp</a>
   */
  SUP("sup"),

  /**
   * Defines a cell in a table
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>A simple HTML table, with two rows and four table cells:</p> 
   * <pre>
   *     &lt;table&gt;<br>
   *  &nbsp;
   *  &lt;tr&gt;<br>
   *  &nbsp;&nbsp;&nbsp;
   *  &lt;td&gt;Cell A&lt;/td&gt;<br>
   *  &nbsp;&nbsp;&nbsp;
   *  &lt;td&gt;Cell B&lt;/td&gt;<br>
   *  &nbsp;
   *  &lt;/tr&gt;<br>
   *  &nbsp;
   *  &lt;tr&gt;<br>
   *  &nbsp;&nbsp;&nbsp;
   *  &lt;td&gt;Cell C&lt;/td&gt;<br>
   *  &nbsp;&nbsp;&nbsp;
   *  &lt;td&gt;Cell D&lt;/td&gt;<br>
   *  &nbsp;
   *  &lt;/tr&gt;<br>
   *  &lt;/table&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_td.asp">https://www.w3schools.com/tags/tag_td.asp</a>
   */
  TD("td"),

  /**
   * Defines contact information for the author/owner of a document
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>Contact information for Example.com:</p> 
   * <pre>
   *     &lt;address&gt;<br>
   *  Written by &lt;a href="mailto:webmaster@example.com"&gt;Jon Doe&lt;/a&gt;.&lt;br&gt; <br>
   *  Visit us at:&lt;br&gt;<br>
   *  Example.com&lt;br&gt;<br>
   *  Box 564, Disneyland&lt;br&gt;<br>
   *  USA<br>
   *  &lt;/address&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_address.asp">https://www.w3schools.com/tags/tag_address.asp</a>
   */
  ADDRESS("address"),

  /**
   * Defines metadata about an HTML document
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>Describe metadata within an HTML document:</p> 
   * <pre>
   *     &lt;head&gt;<br>
   *  &nbsp;
   *  &lt;meta charset="UTF-8"&gt;<br>
   *  &nbsp;
   *  &lt;meta name="description" content="Free Web tutorials"&gt;<br>
   *  &nbsp;
   *  &lt;meta name="keywords" content="HTML, CSS, JavaScript"&gt;<br>
   *  &nbsp;
   *  &lt;meta name="author" content="John Doe"&gt;<br>&nbsp; &lt;meta 
   *     name="viewport" content="width=device-width, initial-scale=1.0"&gt;<br>
   *  &lt;/head&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_meta.asp">https://www.w3schools.com/tags/tag_meta.asp</a>
   */
  META("meta"),

  /**
   * Defines a group of related options in a drop-down list
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>Group related options with &lt;optgroup&gt; tags:</p> 
   * <pre>
   *     &lt;label for="cars"&gt;Choose a car:&lt;/label&gt;<br>&lt;select&nbsp; 
   *     name="cars" id="cars"&gt;<br>
   *       &nbsp;
   *       &lt;optgroup label="Swedish Cars"&gt;<br>
   *       &nbsp;&nbsp;&nbsp;
   *       &lt;option value="volvo"&gt;Volvo&lt;/option&gt;<br>
   *       &nbsp;&nbsp;&nbsp;
   *       &lt;option value="saab"&gt;Saab&lt;/option&gt;<br>
   *       &nbsp;
   *       &lt;/optgroup&gt;<br>
   *       &nbsp;
   *       &lt;optgroup label="German Cars"&gt;<br>
   *       &nbsp;&nbsp;&nbsp;
   *       &lt;option value="mercedes"&gt;Mercedes&lt;/option&gt;<br>
   *       &nbsp;&nbsp;&nbsp;
   *       &lt;option value="audi"&gt;Audi&lt;/option&gt;<br>
   *       &nbsp;
   *       &lt;/optgroup&gt;<br>
   *       &lt;/select&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_optgroup.asp">https://www.w3schools.com/tags/tag_optgroup.asp</a>
   */
  OPTGROUP("optgroup"),

  /**
   * Specifies a term that is going to be defined within the content
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>Mark up a term with &lt;dfn&gt;:</p> 
   * <pre>
   *  &lt;p&gt;&lt;dfn&gt;HTML&lt;/dfn&gt; is the standard markup language for creating web pages.&lt;/p&gt;</pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_dfn.asp">https://www.w3schools.com/tags/tag_dfn.asp</a>
   */
  DFN("dfn"),

  /**
   * Defines emphasized text
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>Mark up emphasized text in a document:</p> 
   * <pre>
   *   &lt;p&gt;You &lt;em&gt;have&lt;/em&gt; to hurry up!&lt;/p&gt;<br><br>&lt;p&gt;We &lt;em&gt;cannot&lt;/em&gt; live like 
   *   this.&lt;/p&gt;<br>
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_em.asp">https://www.w3schools.com/tags/tag_em.asp</a>
   */
  EM("em"),

  /**
   * Defines an abbreviation or an acronym
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>An abbreviation is marked up as follows:</p> 
   * <pre>
   *     The &lt;abbr title="World Health Organization"&gt;WHO&lt;/abbr&gt; was founded in 1948.
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_abbr.asp">https://www.w3schools.com/tags/tag_abbr.asp</a>
   */
  ABBR("abbr"),

  /**
   * Defines a container for an external application
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>An embedded image:</p> 
   * <pre>
   * &lt;embed type="image/jpg" src="pic_trulli.jpg" width="300" height="200"&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_embed.asp">https://www.w3schools.com/tags/tag_embed.asp</a>
   */
  EMBED("embed"),

  /**
   * Defines some text that is unarticulated and styled differently from normal text
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>Mark up a misspelled word with the &lt;u&gt; tag:</p> 
   * <pre>
   *     &lt;p&gt;This is some &lt;u&gt;mispeled&lt;/u&gt; text.&lt;/p&gt;</pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_u.asp">https://www.w3schools.com/tags/tag_u.asp</a>
   */
  U("u"),

  /**
   * Defines a caption for a <fieldset> element
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>Group related elements in a form:</p> 
   * <pre>
   *     &lt;form action="/action_page.php"&gt;<br>&nbsp; &lt;fieldset&gt;<br>&nbsp;&nbsp;&nbsp; 
   *     &lt;legend&gt;Personalia:&lt;/legend&gt;<br>&nbsp;&nbsp;&nbsp; &lt;label for="fname"&gt;First 
   *     name:&lt;/label&gt;<br>&nbsp;&nbsp;&nbsp; &lt;input type="text" id="fname" name="fname"&gt;&lt;br&gt;&lt;br&gt;<br>&nbsp;&nbsp;&nbsp; 
   *     &lt;label for="lname"&gt;Last name:&lt;/label&gt;<br>&nbsp;&nbsp;&nbsp; &lt;input 
   *     type="text" id="lname" name="lname"&gt;&lt;br&gt;&lt;br&gt;<br>&nbsp;&nbsp;&nbsp; &lt;label 
   *     for="email"&gt;Email:&lt;/label&gt;<br>&nbsp;&nbsp;&nbsp; &lt;input type="email" 
   *     id="email" name="email"&gt;&lt;br&gt;&lt;br&gt;<br>&nbsp;&nbsp;&nbsp; &lt;label 
   *     for="birthday"&gt;Birthday:&lt;/label&gt;<br>&nbsp;&nbsp;&nbsp; &lt;input type="date" 
   *     id="birthday" name="birthday"&gt;&lt;br&gt;&lt;br&gt;<br>&nbsp;&nbsp;&nbsp; &lt;input 
   *     type="submit" value="Submit"&gt;<br>&nbsp; &lt;/fieldset&gt;<br>&lt;/form&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_legend.asp">https://www.w3schools.com/tags/tag_legend.asp</a>
   */
  LEGEND("legend"),

  /**
   * Defines a specific time (or datetime)
   * <br>Browser support : <ul>
   * <li>IE/Edge: 18.0</li>
   * <li>Firefox: 22.0</li>
   * <li>Chrome: 62.0</li>
   * <li>Safari: 7.0</li>
   * <li>Opera: 49.0</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>How to define a time and a date:</p> 
   * <pre>
   *     &lt;p&gt;Open from
   *  &lt;time&gt;10:00&lt;/time&gt; to &lt;time&gt;21:00&lt;/time&gt; every weekday.&lt;/p&gt;<br><br>
   *  &lt;p&gt;I have a date on
   *  &lt;time datetime="2008-02-14 20:00"&gt;Valentines day&lt;/time&gt;.&lt;/p&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_time.asp">https://www.w3schools.com/tags/tag_time.asp</a>
   */
  TIME("time"),

  /**
   * Defines a variable
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>Define some text as variables in a document:</p> 
   * <pre>
   *       &lt;p&gt;The area of a triangle is: 1/2 x &lt;var&gt;b&lt;/var&gt; x &lt;var&gt;h&lt;/var&gt;, where &lt;var&gt;b&lt;/var&gt; 
   *       is the base, and &lt;var&gt;h&lt;/var&gt; is the vertical height.&lt;/p&gt;<br>
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_var.asp">https://www.w3schools.com/tags/tag_var.asp</a>
   */
  VAR("var"),

  /**
   * Defines a term/name in a description list
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>A description list, with terms and descriptions:</p> 
   * <pre>
   *     &lt;dl&gt;<br>
   *  &nbsp;
   *  &lt;dt&gt;Coffee&lt;/dt&gt;<br>
   *  &nbsp;
   *  &lt;dd&gt;Black hot drink&lt;/dd&gt;<br>
   *  &nbsp;
   *  &lt;dt&gt;Milk&lt;/dt&gt;<br>
   *  &nbsp;
   *  &lt;dd&gt;White cold drink&lt;/dd&gt;<br>
   *  &lt;/dl&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_dt.asp">https://www.w3schools.com/tags/tag_dt.asp</a>
   */
  DT("dt"),

  /**
   * Defines a container for multiple image resources
   * <br>Browser support : <ul>
   * <li>IE/Edge: 13.0</li>
   * <li>Firefox: 38.0</li>
   * <li>Chrome: 38.0</li>
   * <li>Safari: 9.1</li>
   * <li>Opera: 25.0</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>How to use the &lt;picture&gt; tag:</p> 
   * <pre>
   *   &lt;picture&gt;<br>&nbsp; &lt;source media="(min-width:650px)" srcset="img_pink_flowers.jpg"&gt;<br>&nbsp; 
   *   &lt;source media="(min-width:465px)" srcset="img_white_flower.jpg"&gt;<br>&nbsp; &lt;img 
   *   src="img_orange_flowers.jpg" alt="Flowers" style="width:auto;"&gt;<br>&lt;/picture&gt; </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_picture.asp">https://www.w3schools.com/tags/tag_picture.asp</a>
   */
  PICTURE("picture"),

  /**
   * Not supported in HTML5. Defines a set of frames
   * <br>Browser support : <ul>
   * <li>IE/Edge: Unknown</li>
   * <li>Firefox: Unknown</li>
   * <li>Chrome: Unknown</li>
   * <li>Safari: Unknown</li>
   * <li>Opera: Unknown</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>Use the <a href="tag_iframe.asp">&lt;iframe&gt;</a> tag to embed another document within the current HTML document:</p> 
   * <pre>
   *     &lt;iframe src="https://www.w3schools.com"&gt;&lt;/iframe&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_frameset.asp">https://www.w3schools.com/tags/tag_frameset.asp</a>
   */
  FRAMESET("frameset"),

  /**
   * Defines an input control
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>An HTML form with three input fields; two text fields and one submit button:</p> 
   * <pre>
   *     &lt;form 
   *     action="/action_page.php"&gt;<br>
   * &nbsp;
   *     &lt;label for="fname"&gt;First name:&lt;/label&gt;<br>&nbsp; &lt;input type="text" 
   *     id="fname" name="fname"&gt;&lt;br&gt;&lt;br&gt;<br>
   *     &nbsp;
   *     &lt;label for="lname"&gt;Last name:&lt;/label&gt;<br>&nbsp; &lt;input type="text" 
   *     id="lname" name="lname"&gt;&lt;br&gt;&lt;br&gt;<br>
   *     &nbsp;
   *     &lt;input type="submit" value="Submit"&gt;<br>
   *     &lt;/form&gt;
   * </pre> 
   * <br><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_input.asp">https://www.w3schools.com/tags/tag_input.asp</a>
   */
  INPUT("input"),

  /**
   * Defines an alternate content for users that do not support client-side scripts
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>Use of the &lt;noscript&gt; tag:</p> 
   * <pre>
   * &lt;script&gt;<br>
   * document.write("Hello World!")<br>
   * &lt;/script&gt;<br>
   * &lt;noscript&gt;Your browser does not support JavaScript!&lt;/noscript&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_noscript.asp">https://www.w3schools.com/tags/tag_noscript.asp</a>
   */
  NOSCRIPT("noscript"),

  /**
   * Defines what to show in browsers that do not support ruby annotations
   * <br>Browser support : <ul>
   * <li>IE/Edge: 5.5</li>
   * <li>Firefox: 38.0</li>
   * <li>Chrome: 5.0</li>
   * <li>Safari: 5.0</li>
   * <li>Opera: 15.0</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>A ruby annotation:</p> 
   * <pre>
   *     &lt;ruby&gt;<br>
   *  漢 &lt;rt&gt;&lt;rp&gt;(&lt;/rp&gt;ㄏㄢˋ&lt;rp&gt;)&lt;/rp&gt;&lt;/rt&gt;<br>
   *  &lt;/ruby&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_rp.asp">https://www.w3schools.com/tags/tag_rp.asp</a>
   */
  RP("rp"),

  /**
   * Isolates a part of text that might be formatted in a different direction from other text outside it
   * <br>Browser support : <ul>
   * <li>IE/Edge: Unknown</li>
   * <li>Firefox: Unknown</li>
   * <li>Chrome: Unknown</li>
   * <li>Safari: Unknown</li>
   * <li>Opera: Unknown</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>Isolate the usernames from the surrounding text-direction settings:</p> 
   * <pre>
   * &lt;ul&gt;<br>
   * &nbsp;
   * &lt;li&gt;User &lt;bdi&gt;hrefs&lt;/bdi&gt;: 60 points&lt;/li&gt;<br>
   * &nbsp;
   * &lt;li&gt;User &lt;bdi&gt;jdoe&lt;/bdi&gt;: 80 points&lt;/li&gt;<br>
   * &nbsp;
   * &lt;li&gt;User &lt;bdi&gt;إيان&lt;/bdi&gt;: 90 points&lt;/li&gt;<br>
   * &lt;/ul&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_bdi.asp">https://www.w3schools.com/tags/tag_bdi.asp</a>
   */
  BDI("bdi"),

  /**
   * Defines text tracks for media elements (<video> and <audio>)
   * <br>Browser support : <ul>
   * <li>IE/Edge: 10.0</li>
   * <li>Firefox: 31.0</li>
   * <li>Chrome: 23.0</li>
   * <li>Safari: 6.0</li>
   * <li>Opera: 12.1</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>A video with subtitle tracks for two languages:</p> 
   * <pre>
   *     &lt;video width="320" height="240" controls&gt;<br>
   * &nbsp; &lt;source src="forrest_gump.mp4" type="video/mp4"&gt;<br>
   * &nbsp; &lt;source src="forrest_gump.ogg" type="video/ogg"&gt;<br>
   * &nbsp; &lt;track src="fgsubtitles_en.vtt" kind="subtitles" srclang="en" label="English"&gt;<br>
   * &nbsp; &lt;track src="fgsubtitles_no.vtt" kind="subtitles" srclang="no" label="Norwegian"&gt;<br>
   *  &lt;/video&gt;<br>
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_track.asp">https://www.w3schools.com/tags/tag_track.asp</a>
   */
  TRACK("track"),

  /**
   * Not supported in HTML5. Defines an alternate content for users that do not support frames
   * <br>Browser support : <ul>
   * <li>IE/Edge: Unknown</li>
   * <li>Firefox: Unknown</li>
   * <li>Chrome: Unknown</li>
   * <li>Safari: Unknown</li>
   * <li>Opera: Unknown</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>Use the <a href="tag_iframe.asp">&lt;iframe&gt;</a> tag to embed another document within the current HTML document:</p> 
   * <pre>
   *     &lt;iframe src="https://www.w3schools.com"&gt;&lt;/iframe&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_noframes.asp">https://www.w3schools.com/tags/tag_noframes.asp</a>
   */
  NOFRAMES("noframes"),

  /**
   * Defines the relationship between a document and an external resource (most used to link to style sheets)
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>Link to an external style sheet:</p> 
   * <pre>
   *     &lt;head&gt;<br>
   *       &nbsp;
   *       &lt;link rel="stylesheet" href="styles.css"&gt;<br>
   *     &lt;/head&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_link.asp">https://www.w3schools.com/tags/tag_link.asp</a>
   */
  LINK("link"),

  /**
   * Not supported in HTML5. Use <ul> instead. Defines a directory list
   * <br>Browser support : <ul>
   * <li>IE/Edge: Unknown</li>
   * <li>Firefox: Unknown</li>
   * <li>Chrome: Unknown</li>
   * <li>Safari: Unknown</li>
   * <li>Opera: Unknown</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>Use <a href="tag_ul.asp">&lt;ul&gt;</a> to create a directory list:</p> 
   * <pre>
   *     &lt;ul&gt;<br>
   *       &nbsp;
   *       &lt;li&gt;html&lt;/li&gt;<br>
   *       &nbsp;
   *       &lt;li&gt;xhtml&lt;/li&gt;<br>
   *       &nbsp;
   *       &lt;li&gt;css&lt;/li&gt;<br>
   *       &lt;/ul&gt;&nbsp;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_dir.asp">https://www.w3schools.com/tags/tag_dir.asp</a>
   */
  DIR("dir"),

  /**
   * Defines HTML headings
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>The six different HTML headings:</p> 
   * <pre>
   *     &lt;h1&gt;This is heading 1&lt;/h1&gt;<br>
   *       &lt;h2&gt;This is heading 2&lt;/h2&gt;<br>
   *       &lt;h3&gt;This is heading 3&lt;/h3&gt;<br>
   *       &lt;h4&gt;This is heading 4&lt;/h4&gt;<br>
   *       &lt;h5&gt;This is heading 5&lt;/h5&gt;<br>
   *       &lt;h6&gt;This is heading 6&lt;/h6&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_hn.asp">https://www.w3schools.com/tags/tag_hn.asp</a>
   */
  H1("h1"),

  /**
   * Defines HTML headings
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>The six different HTML headings:</p> 
   * <pre>
   *     &lt;h1&gt;This is heading 1&lt;/h1&gt;<br>
   *       &lt;h2&gt;This is heading 2&lt;/h2&gt;<br>
   *       &lt;h3&gt;This is heading 3&lt;/h3&gt;<br>
   *       &lt;h4&gt;This is heading 4&lt;/h4&gt;<br>
   *       &lt;h5&gt;This is heading 5&lt;/h5&gt;<br>
   *       &lt;h6&gt;This is heading 6&lt;/h6&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_hn.asp">https://www.w3schools.com/tags/tag_hn.asp</a>
   */
  H2("h2"),

  /**
   * Defines HTML headings
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>The six different HTML headings:</p> 
   * <pre>
   *     &lt;h1&gt;This is heading 1&lt;/h1&gt;<br>
   *       &lt;h2&gt;This is heading 2&lt;/h2&gt;<br>
   *       &lt;h3&gt;This is heading 3&lt;/h3&gt;<br>
   *       &lt;h4&gt;This is heading 4&lt;/h4&gt;<br>
   *       &lt;h5&gt;This is heading 5&lt;/h5&gt;<br>
   *       &lt;h6&gt;This is heading 6&lt;/h6&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_hn.asp">https://www.w3schools.com/tags/tag_hn.asp</a>
   */
  H3("h3"),

  /**
   * Defines HTML headings
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>The six different HTML headings:</p> 
   * <pre>
   *     &lt;h1&gt;This is heading 1&lt;/h1&gt;<br>
   *       &lt;h2&gt;This is heading 2&lt;/h2&gt;<br>
   *       &lt;h3&gt;This is heading 3&lt;/h3&gt;<br>
   *       &lt;h4&gt;This is heading 4&lt;/h4&gt;<br>
   *       &lt;h5&gt;This is heading 5&lt;/h5&gt;<br>
   *       &lt;h6&gt;This is heading 6&lt;/h6&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_hn.asp">https://www.w3schools.com/tags/tag_hn.asp</a>
   */
  H4("h4"),

  /**
   * Defines HTML headings
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>The six different HTML headings:</p> 
   * <pre>
   *     &lt;h1&gt;This is heading 1&lt;/h1&gt;<br>
   *       &lt;h2&gt;This is heading 2&lt;/h2&gt;<br>
   *       &lt;h3&gt;This is heading 3&lt;/h3&gt;<br>
   *       &lt;h4&gt;This is heading 4&lt;/h4&gt;<br>
   *       &lt;h5&gt;This is heading 5&lt;/h5&gt;<br>
   *       &lt;h6&gt;This is heading 6&lt;/h6&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_hn.asp">https://www.w3schools.com/tags/tag_hn.asp</a>
   */
  H5("h5"),

  /**
   * Defines HTML headings
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>The six different HTML headings:</p> 
   * <pre>
   *     &lt;h1&gt;This is heading 1&lt;/h1&gt;<br>
   *       &lt;h2&gt;This is heading 2&lt;/h2&gt;<br>
   *       &lt;h3&gt;This is heading 3&lt;/h3&gt;<br>
   *       &lt;h4&gt;This is heading 4&lt;/h4&gt;<br>
   *       &lt;h5&gt;This is heading 5&lt;/h5&gt;<br>
   *       &lt;h6&gt;This is heading 6&lt;/h6&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_hn.asp">https://www.w3schools.com/tags/tag_hn.asp</a>
   */
  H6("h6"),

  /**
   * Groups the body content in a table
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>An HTML table with a &lt;thead&gt;, &lt;tbody&gt;, and a &lt;tfoot&gt; element:</p> 
   * <pre>
   * &lt;table&gt;<br>
   * &nbsp; &lt;thead&gt;<br>
   * &nbsp;&nbsp;&nbsp; &lt;tr&gt;<br>
   * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &lt;th&gt;Month&lt;/th&gt;<br>
   * &nbsp;
   * &nbsp;&nbsp;&nbsp;&nbsp;&lt;th&gt;Savings&lt;/th&gt;<br>
   * &nbsp;&nbsp;&nbsp; &lt;/tr&gt;<br>
   * &nbsp; &lt;/thead&gt;<br>
   * &nbsp; &lt;tbody&gt;<br>
   * &nbsp;&nbsp;&nbsp; &lt;tr&gt;<br>
   * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &lt;td&gt;January&lt;/td&gt;<br>
   * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &lt;td&gt;$100&lt;/td&gt;<br>
   * &nbsp;&nbsp;&nbsp; &lt;/tr&gt;<br>
   * &nbsp;&nbsp;&nbsp; &lt;tr&gt;<br>
   * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &lt;td&gt;February&lt;/td&gt;<br>
   * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &lt;td&gt;$80&lt;/td&gt;<br>
   * &nbsp;&nbsp;&nbsp; &lt;/tr&gt;<br>
   * &nbsp; &lt;/tbody&gt;<br>
   * &nbsp; &lt;tfoot&gt;<br>
   * &nbsp;&nbsp;&nbsp; &lt;tr&gt;<br>
   * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &lt;td&gt;Sum&lt;/td&gt;<br>
   * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &lt;td&gt;$180&lt;/td&gt;<br>
   * &nbsp;&nbsp;&nbsp; &lt;/tr&gt;<br>
   * &nbsp; &lt;/tfoot&gt;<br>
   * &lt;/table&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_tbody.asp">https://www.w3schools.com/tags/tag_tbody.asp</a>
   */
  TBODY("tbody"),

  /**
   * Defines a title for the document
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>Define a title for your HTML document:</p> 
   * <pre>
   *     &lt;!DOCTYPE html&gt;<br>&lt;html&gt;<br>&lt;head&gt;<br>
   *  &nbsp;
   *  &lt;title&gt;HTML Elements Reference&lt;/title&gt;<br>
   *  &lt;/head&gt;<br>&lt;body&gt;<br>
   *     <br>&lt;h1&gt;This is a heading&lt;/h1&gt;<br>&lt;p&gt;This is a paragraph.&lt;/p&gt;<br><br>&lt;/body&gt;<br>&lt;/html&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_title.asp">https://www.w3schools.com/tags/tag_title.asp</a>
   */
  TITLE("title"),

  /**
   * Defines navigation links
   * <br>Browser support : <ul>
   * <li>IE/Edge: 9.0</li>
   * <li>Firefox: 4.0</li>
   * <li>Chrome: 5.0</li>
   * <li>Safari: 5.0</li>
   * <li>Opera: 11.1</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>A set of navigation links:</p> 
   * <pre>
   *     &lt;nav&gt;<br>
   *  &nbsp; &lt;a href="/html/"&gt;HTML&lt;/a&gt; |<br>
   * &nbsp; &lt;a href="/css/"&gt;CSS&lt;/a&gt; |<br>
   * &nbsp; &lt;a href="/js/"&gt;JavaScript&lt;/a&gt; |<br>
   * &nbsp; &lt;a href="/python/"&gt;Python&lt;/a&gt;<br>
   *  &lt;/nav&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_nav.asp">https://www.w3schools.com/tags/tag_nav.asp</a>
   */
  NAV("nav"),

  /**
   * Used to draw graphics, on the fly, via scripting (usually JavaScript)
   * <br>Browser support : <ul>
   * <li>IE/Edge: 9.0</li>
   * <li>Firefox: 2.0</li>
   * <li>Chrome: 4.0</li>
   * <li>Safari: 3.1</li>
   * <li>Opera: 9.0</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>Draw a red rectangle on the fly, and show it inside the &lt;canvas&gt; element:</p> 
   * <pre>
   *     &lt;canvas id="myCanvas"&gt;<br>Your browser 
   *     does not support the canvas tag.<br>&lt;/canvas&gt;<br>
   *  <br>
   *  &lt;script&gt;<br>
   *  var canvas = document.getElementById("myCanvas");<br>
   *  var ctx = canvas.getContext("2d");<br>
   *  ctx.fillStyle = "#FF0000";<br>
   *  ctx.fillRect(0, 0, 80, 80);<br>
   *  &lt;/script&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_canvas.asp">https://www.w3schools.com/tags/tag_canvas.asp</a>
   */
  CANVAS("canvas"),

  /**
   * Defines a list item
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>One ordered (&lt;ol&gt;) and one unordered (&lt;ul&gt;) HTML list:</p> 
   * <pre>
   *     &lt;ol&gt;<br>
   *       &nbsp;
   *       &lt;li&gt;Coffee&lt;/li&gt;<br>
   *       &nbsp;
   *       &lt;li&gt;Tea&lt;/li&gt;<br>
   *       &nbsp;
   *       &lt;li&gt;Milk&lt;/li&gt;<br>
   *       &lt;/ol&gt;<br><br>
   *       &lt;ul&gt;<br>
   *       &nbsp;
   *       &lt;li&gt;Coffee&lt;/li&gt;<br>
   *       &nbsp;
   *       &lt;li&gt;Tea&lt;/li&gt;<br>
   *       &nbsp;
   *       &lt;li&gt;Milk&lt;/li&gt;<br>
   *       &lt;/ul&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_li.asp">https://www.w3schools.com/tags/tag_li.asp</a>
   */
  LI("li"),

  /**
   * Defines a scalar measurement within a known range (a gauge)
   * <br>Browser support : <ul>
   * <li>IE/Edge: 13.0</li>
   * <li>Firefox: 16.0</li>
   * <li>Chrome: 8.0</li>
   * <li>Safari: 6.0</li>
   * <li>Opera: 11.5</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>Use the meter element to measure data within a given range (a gauge):</p> 
   * <pre>
   *     &lt;label for="disk_c"&gt;Disk usage C:&lt;/label&gt;<br>&lt;meter id="disk_c" value="2" 
   *     min="0" max="10"&gt;2 out of 10&lt;/meter&gt;&lt;br&gt;<br><br>&lt;label for="disk_d"&gt;Disk 
   *     usage D:&lt;/label&gt;<br>&lt;meter id="disk_d" value="0.6"&gt;60%&lt;/meter&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_meter.asp">https://www.w3schools.com/tags/tag_meter.asp</a>
   */
  METER("meter"),

  /**
   * Defines the title of a work
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>Define the title of a work with the &lt;cite&gt; tag:</p> 
   * <pre>
   *     &lt;p&gt;&lt;cite&gt;The Scream&lt;/cite&gt; by Edward Munch. Painted in 1893.&lt;/p&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_cite.asp">https://www.w3schools.com/tags/tag_cite.asp</a>
   */
  CITE("cite"),

  /**
   * Defines preformatted text
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>Preformatted text:</p> 
   * <pre>
   *     &lt;pre&gt;<br>
   *       Text in a pre element<br>
   *   is displayed in a fixed-width<br>
   *  font, and it preserves<br>
   *  both&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
   *       spaces and<br>
   *  line breaks<br>
   *       &lt;/pre&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_pre.asp">https://www.w3schools.com/tags/tag_pre.asp</a>
   */
  PRE("pre"),

  /**
   * Defines a section that is quoted from another source
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>A section that is quoted from another source:</p> 
   * <pre>
   *     &lt;blockquote cite="http://www.worldwildlife.org/who/index.html"&gt;<br>
   *  For 50 years, WWF has been protecting the future of nature. The world's leading conservation organization, WWF works in 100 countries and is supported by 1.2 million members in the United States and close to 5 million globally.<br>
   *  &lt;/blockquote&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_blockquote.asp">https://www.w3schools.com/tags/tag_blockquote.asp</a>
   */
  BLOCKQUOTE("blockquote"),

  /**
   * Not supported in HTML5. Defines a window (a frame) in a frameset
   * <br>Browser support : <ul>
   * <li>IE/Edge: Unknown</li>
   * <li>Firefox: Unknown</li>
   * <li>Chrome: Unknown</li>
   * <li>Safari: Unknown</li>
   * <li>Opera: Unknown</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>Use the <a href="tag_iframe.asp">&lt;iframe&gt;</a> tag to embed another document within the current HTML document:</p> 
   * <pre>
   *     &lt;iframe src="https://www.w3schools.com"&gt;&lt;/iframe&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_frame.asp">https://www.w3schools.com/tags/tag_frame.asp</a>
   */
  FRAME("frame"),

  /**
   * Defines a dialog box or window
   * <br>Browser support : <ul>
   * <li>IE/Edge: 79.0</li>
   * <li>Firefox: Unknown</li>
   * <li>Chrome: 37.0</li>
   * <li>Safari: Not supported</li>
   * <li>Opera: 24.0</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>Using the &lt;dialog&gt; element:</p> 
   * <pre>
   *     &lt;dialog open&gt;This is an open dialog window&lt;/dialog&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_dialog.asp">https://www.w3schools.com/tags/tag_dialog.asp</a>
   */
  DIALOG("dialog"),

  /**
   * Defines a section in a document
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>A &lt;span&gt; element which is used to color a part of a text:</p> 
   * <pre>
   *     &lt;p&gt;My mother has &lt;span style="color:blue"&gt;blue&lt;/span&gt;
   *       eyes.&lt;/p&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_span.asp">https://www.w3schools.com/tags/tag_span.asp</a>
   */
  SPAN("span"),

  /**
   * Defines a single line break
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>Insert single line breaks in a text:</p> 
   * <pre>
   *     &lt;p&gt;To force&lt;br&gt; line breaks&lt;br&gt; in a text,&lt;br&gt; use the br&lt;br&gt; element.&lt;/p&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_br.asp">https://www.w3schools.com/tags/tag_br.asp</a>
   */
  BR("br"),

  /**
   * Defines an image
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>How to insert an image:</p> 
   * <pre>
   *   &lt;img src="img_girl.jpg" alt="Girl in a jacket" width="500" height="600"&gt;</pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_img.asp">https://www.w3schools.com/tags/tag_img.asp</a>
   */
  IMG("img"),

  /**
   * Defines a footer for a document or section
   * <br>Browser support : <ul>
   * <li>IE/Edge: 9.0</li>
   * <li>Firefox: 4.0</li>
   * <li>Chrome: 5.0</li>
   * <li>Safari: 5.0</li>
   * <li>Opera: 11.1</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>A footer section in a document:</p> 
   * <pre>
   *     &lt;footer&gt;<br>
   * &nbsp; &lt;p&gt;Author: Hege Refsnes&lt;/p&gt;<br>
   * &nbsp; &lt;p&gt;&lt;a href="mailto:hege@example.com"&gt;hege@example.com&lt;/a&gt;&lt;/p&gt;<br>&lt;/footer&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_footer.asp">https://www.w3schools.com/tags/tag_footer.asp</a>
   */
  FOOTER("footer"),

  /**
   * Specifies self-contained content
   * <br>Browser support : <ul>
   * <li>IE/Edge: 9.0</li>
   * <li>Firefox: 4.0</li>
   * <li>Chrome: 8.0</li>
   * <li>Safari: 5.1</li>
   * <li>Opera: 11.0</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>Use a &lt;figure&gt; element to mark up a photo in a document, and a &lt;figcaption&gt; element to define a caption for the photo:</p> 
   * <pre>
   *     &lt;figure&gt;<br>
   *     &nbsp; &lt;img src="pic_trulli.jpg" alt="Trulli" 
   *     style="width:100%"&gt;<br>&nbsp; &lt;figcaption&gt;Fig.1 - Trulli, Puglia, 
   *     Italy.&lt;/figcaption&gt;<br>
   *  &lt;/figure&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_figure.asp">https://www.w3schools.com/tags/tag_figure.asp</a>
   */
  FIGURE("figure"),

  /**
   * Defines keyboard input
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>Define some text as keyboard input in a document:</p> 
   * <pre>
   *   &lt;p&gt;Press &lt;kbd&gt;Ctrl&lt;/kbd&gt; + &lt;kbd&gt;C&lt;/kbd&gt; to copy text (Windows).&lt;/p&gt;<br><br>
   *   &lt;p&gt;Press &lt;kbd&gt;Cmd&lt;/kbd&gt; + &lt;kbd&gt;C&lt;/kbd&gt; to copy text (Mac OS).&lt;/p&gt;</pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_kbd.asp">https://www.w3schools.com/tags/tag_kbd.asp</a>
   */
  KBD("kbd"),

  /**
   * Defines marked/highlighted text
   * <br>Browser support : <ul>
   * <li>IE/Edge: 9.0</li>
   * <li>Firefox: 4.0</li>
   * <li>Chrome: 6.0</li>
   * <li>Safari: 5.0</li>
   * <li>Opera: 11.1</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>Highlight parts of a text:</p> 
   * <pre>
   *     &lt;p&gt;Do not forget to buy &lt;mark&gt;milk&lt;/mark&gt; today.&lt;/p&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_mark.asp">https://www.w3schools.com/tags/tag_mark.asp</a>
   */
  MARK("mark"),

  /**
   * Not supported in HTML5. Use CSS instead. Defines font, color, and size for text
   * <br>Browser support : <ul>
   * <li>IE/Edge: Unknown</li>
   * <li>Firefox: Unknown</li>
   * <li>Chrome: Unknown</li>
   * <li>Safari: Unknown</li>
   * <li>Opera: Unknown</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>Set the color of text (with CSS):</p> 
   * <pre>
   *     &lt;p style="color:red"&gt;This is a paragraph.&lt;/p&gt;<br>&lt;p style="color:blue"&gt;This 
   *     is another paragraph.&lt;/p&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_font.asp">https://www.w3schools.com/tags/tag_font.asp</a>
   */
  FONT("font"),

  /**
   * Defines an HTML form for user input
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>An HTML form with two input fields and one submit button:</p> 
   * <pre>
   *     &lt;form 
   *     action="/action_page.php"
   *     method="get"&gt;<br>
   * &nbsp; &lt;label for="fname"&gt;First name:&lt;/label&gt;<br>&nbsp; &lt;input type="text" id="fname" 
   *     name="fname"&gt;&lt;br&gt;&lt;br&gt;<br>&nbsp; &lt;label for="lname"&gt;Last name:&lt;/label&gt;<br>&nbsp; 
   *     &lt;input type="text" id="lname" name="lname"&gt;&lt;br&gt;&lt;br&gt;<br>&nbsp; &lt;input 
   *     type="submit" value="Submit"&gt;<br>
   *     &lt;/form&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_form.asp">https://www.w3schools.com/tags/tag_form.asp</a>
   */
  FORM("form"),

  /**
   * Defines a multiline input control (text area)
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>A multi-line text input control (text area):</p> 
   * <pre>
   *     &lt;label for="w3review"&gt;Review of W3Schools:&lt;/label&gt;<br><br>&lt;textarea 
   *     id="w3review" name="w3review" rows="4" cols="50"&gt;<br>
   *       At w3schools.com you will learn how to make a website. They offer free tutorials in all web development technologies. <br>
   *       &lt;/textarea&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_textarea.asp">https://www.w3schools.com/tags/tag_textarea.asp</a>
   */
  TEXTAREA("textarea"),

  /**
   * Groups the footer content in a table
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>An HTML table with a &lt;thead&gt;, &lt;tbody&gt;, and a &lt;tfoot&gt; element:</p> 
   * <pre>
   *     &lt;table&gt;<br>
   *       &nbsp;
   *       &lt;thead&gt;<br>
   *       &nbsp;
   *       &nbsp;
   *       &lt;tr&gt;<br>
   *       &nbsp;&nbsp;&nbsp; &nbsp;
   *       &lt;th&gt;Month&lt;/th&gt;<br>
   *       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &lt;th&gt;Savings&lt;/th&gt;<br>
   *       &nbsp;
   *       &nbsp;
   *       &lt;/tr&gt;<br>
   *       &nbsp;
   *       &lt;/thead&gt;<br>
   *       &nbsp;
   *       &lt;tbody&gt;<br>
   *       &nbsp;&nbsp;&nbsp; &lt;tr&gt;<br>
   *       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &lt;td&gt;January&lt;/td&gt;<br>
   *       &nbsp;
   *       &nbsp;&nbsp;&nbsp;
   *       &lt;td&gt;$100&lt;/td&gt;<br>
   *       &nbsp;&nbsp;&nbsp; &lt;/tr&gt;<br>
   *       &nbsp;&nbsp;&nbsp; &lt;tr&gt;<br>
   *       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &lt;td&gt;February&lt;/td&gt;<br>
   *       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &lt;td&gt;$80&lt;/td&gt;<br>
   *       &nbsp;
   *       &nbsp;
   *       &lt;/tr&gt;<br>
   *       &nbsp;
   *       &lt;/tbody&gt;<br>
   *       &nbsp;
   *       &lt;tfoot&gt;<br>
   *       &nbsp;&nbsp;&nbsp; &lt;tr&gt;<br>
   *       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &lt;td&gt;Sum&lt;/td&gt;<br>
   *       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &lt;td&gt;$180&lt;/td&gt;<br>
   *       &nbsp;&nbsp;&nbsp; &lt;/tr&gt;<br>
   *       &nbsp;
   *       &lt;/tfoot&gt;<br>
   *       &lt;/table&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_tfoot.asp">https://www.w3schools.com/tags/tag_tfoot.asp</a>
   */
  TFOOT("tfoot"),

  /**
   * Defines the result of a calculation
   * <br>Browser support : <ul>
   * <li>IE/Edge: 13.0</li>
   * <li>Firefox: 4.0</li>
   * <li>Chrome: 10.0</li>
   * <li>Safari: 5.1</li>
   * <li>Opera: 11.0</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>Perform a calculation and show the result in an &lt;output&gt; element:</p> 
   * <pre>
   *     &lt;form oninput="x.value=parseInt(a.value)+parseInt(b.value)"&gt;<br>
   * &nbsp; &lt;input type="range" id="a" value="50"&gt;<br>
   * &nbsp; +&lt;input type="number" id="b" value="25"&gt;<br>
   * &nbsp; =&lt;output name="x" for="a b"&gt;&lt;/output&gt;<br>
   *  &lt;/form&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_output.asp">https://www.w3schools.com/tags/tag_output.asp</a>
   */
  OUTPUT("output"),

  /**
   * Defines a parameter for an object
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>Set the "autoplay" parameter to "true", so the sound will start playing as soon as the page loads:</p> 
   * <pre>
   *     &lt;object data="horse.wav"&gt;<br>
   * &nbsp; &lt;param name="autoplay" value="true"&gt;<br>
   *  &lt;/object&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_param.asp">https://www.w3schools.com/tags/tag_param.asp</a>
   */
  PARAM("param"),

  /**
   * Defines sample output from a computer program
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>Define some text as sample output from a computer program in a document:</p> 
   * <pre>
   *       &lt;p&gt;Message from my computer:&lt;/p&gt;<br><br>&lt;p&gt;&lt;samp&gt;File not found.&lt;br&gt;Press 
   *       F1 to continue&lt;/samp&gt;&lt;/p&gt;<br>
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_samp.asp">https://www.w3schools.com/tags/tag_samp.asp</a>
   */
  SAMP("samp"),

  /**
   * Not supported in HTML5. Use CSS instead. Defines teletype text
   * <br>Browser support : <ul>
   * <li>IE/Edge: Unknown</li>
   * <li>Firefox: Unknown</li>
   * <li>Chrome: Unknown</li>
   * <li>Safari: Unknown</li>
   * <li>Opera: Unknown</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>Define a teletype/monospace font for a &lt;p&gt; element (with CSS):</p> 
   * <pre>
   *     &lt;p style="font-family:'Lucida Console', monospace"&gt;This text is monospace 
   *     text.&lt;/p&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_tt.asp">https://www.w3schools.com/tags/tag_tt.asp</a>
   */
  TT("tt"),

  /**
   * Defines a possible line-break
   * <br>Browser support : <ul>
   * <li>IE/Edge: 12.0</li>
   * <li>Firefox: 3.0</li>
   * <li>Chrome: 1.0</li>
   * <li>Safari: 4.0</li>
   * <li>Opera: 11.7</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>A text with word break opportunities:</p> 
   * <pre>
   *     &lt;p&gt;To learn AJAX, you must be familiar with the XML&lt;wbr&gt;Http&lt;wbr&gt;Request Object.<wbr>&lt;/p&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_wbr.asp">https://www.w3schools.com/tags/tag_wbr.asp</a>
   */
  WBR("wbr"),

  /**
   * Defines embedded video content
   * <br>Browser support : <ul>
   * <li>IE/Edge: 9.0</li>
   * <li>Firefox: 3.5</li>
   * <li>Chrome: 4.0</li>
   * <li>Safari: 3.1</li>
   * <li>Opera: 11.5</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>Play a video:</p> 
   * <pre>
   *     &lt;video width="320" height="240" controls&gt;<br>
   * &nbsp; &lt;source src="movie.mp4" type="video/mp4"&gt;<br>
   * &nbsp; &lt;source src="movie.ogg" type="video/ogg"&gt;<br>
   * &nbsp; Your browser does not support the video tag.<br>
   *  &lt;/video&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_video.asp">https://www.w3schools.com/tags/tag_video.asp</a>
   */
  VIDEO("video"),

  /**
   * Defines a caption for a <figure> element
   * <br>Browser support : <ul>
   * <li>IE/Edge: 9.0</li>
   * <li>Firefox: 4.0</li>
   * <li>Chrome: 8.0</li>
   * <li>Safari: 5.1</li>
   * <li>Opera: 11.0</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>Use a &lt;figure&gt; element to mark up a photo in a document, and a &lt;figcaption&gt; element to define a caption for the photo:</p> 
   * <pre>
   *     &lt;figure&gt;<br>&nbsp; &lt;img src="pic_trulli.jpg" alt="Trulli" 
   *     style="width:100%"&gt;<br>&nbsp; &lt;figcaption&gt;Fig.1 - Trulli, Puglia, 
   *     Italy.&lt;/figcaption&gt;<br>&lt;/figure&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_figcaption.asp">https://www.w3schools.com/tags/tag_figcaption.asp</a>
   */
  FIGCAPTION("figcaption"),

  /**
   * Defines an image map
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>An image map, with clickable areas:</p> 
   * <pre>
   *     &lt;img src="workplace.jpg" alt="Workplace" usemap="#workmap" width="400" 
   *     height="379"&gt;<br><br>&lt;map name="workmap"&gt;<br>&nbsp; &lt;area shape="rect" 
   *     coords="34,44,270,350" alt="Computer" href="computer.htm"&gt;<br>&nbsp; &lt;area 
   *     shape="rect" coords="290,172,333,250" alt="Phone" href="phone.htm"&gt;<br>&nbsp; 
   *     &lt;area shape="circle" coords="337,300,44" alt="Cup of coffee" href="coffee.htm"&gt;<br>
   *     &lt;/map&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_map.asp">https://www.w3schools.com/tags/tag_map.asp</a>
   */
  MAP("map"),

  /**
   * Defines bold text
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>Make some text bold <span lang="no-bok">(without marking it as important)</span>:</p> 
   * <pre>
   * &lt;p&gt;This is normal text - &lt;b&gt;and this is bold text&lt;/b&gt;.&lt;/p&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_b.asp">https://www.w3schools.com/tags/tag_b.asp</a>
   */
  B("b"),

  /**
   * Defines important text
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>Define important text in a document:</p> 
   * <pre>
   *       &lt;strong&gt;This text is important!&lt;/strong&gt;<br>
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_strong.asp">https://www.w3schools.com/tags/tag_strong.asp</a>
   */
  STRONG("strong"),

  /**
   * Defines a label for an <input> element
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>Three radio buttons with labels:</p> 
   * <pre>
   *     &lt;form action="/action_page.php"&gt;<br>
   *  &nbsp; &lt;label for="male"&gt;Male&lt;/label&gt;<br>&nbsp; &lt;input type="radio" name="gender" id="male" value="male"&gt;&lt;br&gt;<br>&nbsp; &lt;label for="female"&gt;Female&lt;/label&gt;<br>&nbsp; &lt;input type="radio" name="gender" id="female" value="female"&gt;&lt;br&gt;<br>&nbsp; &lt;label for="other"&gt;Other&lt;/label&gt;<br>&nbsp; &lt;input type="radio" name="gender" id="other" value="other"&gt;&lt;br&gt;&lt;br&gt;<br>&nbsp; &lt;input type="submit" value="Submit"&gt;<br>&lt;/form&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_label.asp">https://www.w3schools.com/tags/tag_label.asp</a>
   */
  LABEL("label"),

  /**
   * Defines text that is no longer correct
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>Mark up text that is no longer correct:</p> 
   * <pre>
   *     &lt;p&gt;&lt;s&gt;Only 50 tickets left!&lt;/s&gt;&lt;/p&gt;<br>&lt;p&gt;SOLD OUT!&lt;/p&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_s.asp">https://www.w3schools.com/tags/tag_s.asp</a>
   */
  S("s");

  public final String tag;

  ElementSelectorPhrase(String tag) {
    this.tag = tag;
  }

  @Override
  public final String tagName() {
    return tag;
  }

  /**
   * Defines HTML headings
   * <br>Browser support : <ul>
   * <li>IE/Edge: Yes</li>
   * <li>Firefox: Yes</li>
   * <li>Chrome: Yes</li>
   * <li>Safari: Yes</li>
   * <li>Opera: Yes</li>
   * </ul>
   * <br><br>
   * <h3>Example : </h3>
   * <p>The six different HTML headings:</p> 
   * <pre>
   *     &lt;h1&gt;This is heading 1&lt;/h1&gt;<br>
   *       &lt;h2&gt;This is heading 2&lt;/h2&gt;<br>
   *       &lt;h3&gt;This is heading 3&lt;/h3&gt;<br>
   *       &lt;h4&gt;This is heading 4&lt;/h4&gt;<br>
   *       &lt;h5&gt;This is heading 5&lt;/h5&gt;<br>
   *       &lt;h6&gt;This is heading 6&lt;/h6&gt;
   * </pre><br>
   *  From : <a href="https://www.w3schools.com/tags/tag_hn.asp">https://www.w3schools.com/tags/tag_hn.asp</a>
   */
  public static final ElementSelectorPhrase h(int i) {
    assert i<7 && i > 0;
    switch(i){
        case 1: return H1;
        case 2: return H2;
        case 3: return H3;
        case 4: return H4;
        case 5: return H5;
        case 6: return H6;
        };
    return null;
  }
}
