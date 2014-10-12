=================
JavaFX Evaluation
=================

Description
~~~~~~~~~~~
JavaFX is a Java library for developing GUIs, which is included in the JDK as
of now. JavaFX offers much better multimedia and animation support than Swing
and allows developers to model and style the UI using CSS + FXML. JavaFX is
used to develop RIAs (Rich Internet Applications), which means, that the
programs most of the time either run in the Browser (as Applet) or are started
via Java Web Start.


IDE Integration
~~~~~~~~~~~~~~~
Netbeans and IntelliJ both support JavaFX and offer a few tools for JavaFX
developers, like the GUI editor for JavaFX that is included in Netbeans.

For Eclipse there is the plugin e(fx)clipse available, that also includes
tools like a FXML-editor or a specialized classpath container.

To be honest, there isn't really that much need for a plugin, because JavaFX
is just a Library that can be used.


GUI Testing
~~~~~~~~~~~

You can test it using those tests that only repeat things you did and there
is a library for testing JavaFX applications (TestFX)
https://github.com/TestFX/TestFX

Advantages
~~~~~~~~~~
+ Going to be the standard for Java GUI development
+ Can be integrated into Swing or SWT applications
+ CSS for "Look and Feel"
+ UI Design with FXML
+ Good Animation Support (unimportant for this exercise)

Disadvantages
~~~~~~~~~~~~~
- No GUI Builder for Eclipse (but Scene Builder available)
- Different API than Swing/AWT (maybe more work)
- Does not ship with every Java distribution
  * Newer versions of Oracle have it included
  - Older java versions and OpenJDK, don't
  * There is a project called OpenJFX making it available for OpenJDK users.

Conclusion
~~~~~~~~~~
I think it is definitely a viable option to use JavaFX instead of Swing/SWT.
It doesn't seem promise too much extra work, but looks rather easy because of
things like UI-modelling in FXML and so on.
