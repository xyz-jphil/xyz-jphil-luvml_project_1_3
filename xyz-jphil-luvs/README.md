# Luvs is the CSS Version of Luvml

Write **CSS in Java itself**, and yet it looks like CSS, and it IS pure old Java. **Luvs is a CSS DSL for Java**. 

You will get some decent Javadoc which will help you write to write css. Javadoc is based on description and examples from www.w3schools.com. So from the comfort of your IDE itself, you will be able to write some decent code. That is nothing new of great, to be honest, that is basic. But I am just saying, this basic is available.

There is also some information about browser compatibility in the Javadoc and/or the API.

Personally for me the best thing is writing my entire web-stack in Java. And it is not extra code, it is almost same code, and lesser. 

It is not intended to compete with LESS, SASS or anything. Here we are doing everything in Java, without changing the language, reusing class, variables, concepts, refactoring across the board etc. This is the main selling point for me.

Besides this you can can use Java variables in CSS.
You can do things like : <code>darker(custom_color)</code> and you get the darker version of that Color. 

You can make your own theme object

```java
class Theme {
	public Color primary, secondary, accent;
}
Theme t1 = new Theme();
t1.primary = ....;
t1.secondary = ....;
t1.accent = ....;
```

And then use it in Luvs ( CSS ) as 

```java
background_color(theme.primary);
```

Some of these things are already there in Less, Sass, etc, some might not be there, whatever it is, **there is no need to learn anything new, use the same old Java, and same old CSS**.

It is compatible with JSweet, so it will work in browser js also. Although you might not really benefit from this, as mostly css is not written dynamically. Luvml is more useful in that sense for front-end js.

But then there are things like Tailwind which are machine generated. Same way the CSS for even bootstrap columns are machine generated. All of them use several tools from the JS and CSS world. Here are using a similar tool Java, plain old Java. No template, no processor, it is just plain old Java.

Break your CSS into smaller parts.

Auto-generate them, using plain old simple logic.

Use CSS class names like variables in Java, Html, CSS all of them being statically connected. Refactor anywhere changes reflect everywhere.



**Backward compatibility**

Writing `display(flex)` should result in `display: -webkit-box; display: -webkit-flex; display: -ms-flexbox; display: flex;`. But this is one of the intended features. Even while it is absent, for now you can simply use the most obvious simple and Java CSS while these features are implement and published in future releases.



## The main selling point

**It is in plain Java** and **looks very much like CSS**. You don't need to learn anything new, and there are no best practises or bad practises. Try it, you will know what I mean. The whole thing will feel very familiar. You will feel that this API is written by your college roommate.

I think since it is written by a non-front-end developer like me, it will help others like me. I think the learning curve will be lesser. Of-course you still need to practise. CSS is all about practise. It is surely the toughest thing I found. I think some simple utilities written on top of 

![Backend Java Develop](https://i.redd.it/1mq0xodq3if21.jpg)

## Why named as Luvs

Luvml implies Luv (Love) Markup Language, a word play on XML. Luvml the parent project is a XHtml compatible Html5 DSL in Java. It is compatible with JSweet, so you can write web front end Java and Html with it.

Luvs is a CSS version of the same thing.

Luvs is a word play on Luvml, where S stands for style.



## Why Luv (love) ?

Because I hate markup languages like XML and HTML. I find them verbose and stupid. But then they are some of the most useful thing on the planet. So there is something in me which needs to change. I need to see the good side of things, and need to Love them, have gratitude for them as they are. Hopefully this DSL allows me to love the web technologies which I was not very familiar with at the time of writing these utility libraries.

#### But still why Luv

Luv is shorter than love, and love sounds quiet lame. For that matter even Luv sounds lame. Somehow Luvml sounds good (to me at-least). And thus this discussion is closed. And besides it reminds me not to blame my tools. There is a saying, "A poor craftsman blames his tools." I do not intend to continue being that. I would rather love my tools than blame them.



## Short-commings


When u write `display( ... )` the suggestions will give all 422 options
In VSCode or Netbeans when you use plain simple CSS and write `display : ` and press `Ctrl+space`, it shows only the relevant options such as `flex`, `relative` etc.

For making only the relevant options show up when Ctrl+Space is pressed will make the library quiet big (which is ok, because this will is supposedly going to be more of a server side library, unlikely to be used in browser). But there is a development time cost, of 48 hrs I am estimating. So I am thinking may be I can try Luvs as it is for this year and if it looks good and promising, will add strict types in properties values and function parameters.

It will be quiet ellaborate. I don't want people to do millions of static imports, may be just a few. It will surely work, but right now no time to write all this. It should be used more than written. Which is presently not the case.