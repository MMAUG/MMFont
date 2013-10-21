MMFont
======

Font embedded TextView for Android.

![alt text](https://dl.dropboxusercontent.com/u/2709123/Screenshot_2013-10-09-10-57-56.png "Screenshot")

Goal
----
To create a painless font embedded ready made TextViews rather than setting `typeface` to the text views.

Installing
----------
Clone the repo
```shell
git clone https://github.com/MMODroid/MMFont.git
```
Import it to ADT/Eclipse/AndroidStudio
```
File -> Import Project ...
```

Getting Started
---------------

First, include MMFontLib as a Library by
```
File -> Properties -> Android -> Add -> Choose MMFont
```

Then, either in your activity or fragment xml file, you can use in this way.

```xml
      <org.mmodroid.mmfont.MM3
          android:id="@+id/tv_mm3"
          android:layout_width="wrap_content"
          android:layout_height="wrap_content"
          android:textSize="25sp" />
```
That's it.

TODO
----
- Unicode fonts are not rendering correctly on devices with API version below 4.3
- Embedded WebViews as well ?


Contributing
------------
You are most welcome to contribute to this project. Especially, the font rendering problem needs to be fixed.

If you like to give a suggestion, please open an issue. Or if you can fix it yourself, please fork + pull request and I appreciate it most.


License
-------
MIT
