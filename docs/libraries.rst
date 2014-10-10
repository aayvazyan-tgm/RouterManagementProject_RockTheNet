Libraries
=========

log4j
~~~~~

Log4j is a java based logging utility. Log4j is one of the most popularest
and best logging-fram.

SNMP4J
~~~~~~

SNMP4J is an enterprise class free open source and state-of-the-art SNMP
implementation for Java SE 1.4 or later. SNMP4J supports command generation
(managers) as well as command responding (agents).

SNMP is a widely accepted technology and is used in to monitor a wide variety
of devices, but as it turns out very few people (at least among java
programmers) seems to know anything about how to build snmp based
solutions. [8]

JSch
~~~~

JSch is a pure Java implementation of SSH2.

JSch allows you to connect to an sshd server and use port forwarding,
X11 forwarding, file transfer, etc., and you can integrate its functionality
into your own Java programs. JSch is licensed under BSD style license. 

Is a java implementation of SSH2, it is able to connect to an sshd server
and use port forwarding, file transfer...  

Apache Commons Email
~~~~~~~~~~~~~~~~~~~~

Commons Email aims to provide a API for sending email. It is built on top of
the Java Mail API, which it aims to simplify.

Some of the mail classes that are provided are as follows:

* SimpleEmail - This class is used to send basic text based emails.
* MultiPartEmail - This class is used to send multipart messages.
  This allows a text message with attachments either inline or attached.
* HtmlEmail - This class is used to send HTML formatted emails.
  It has all of the capabilities as MultiPartEmail allowing attachments to be
  easily added.
  It also supports embedded images.
* ImageHtmlEmail - This class is used to send HTML formatted emails with
  inline images.
  It has all of the capabilities as HtmlEmail but transform all image references
  to inline images.
* EmailAttachment - This is a simple container class to allow for easy handling
  of attachments.
  It is for use with instances of MultiPartEmail and HtmlEmail.[9]

While we currently do not need HTML formatted image or some with attachments,
it may come in handy in the future in case we want to see screenshots of graphs
and/or style the email a bit better.
Another positive aspect is that this library is still being updated, so new
SMTP features/bug fixes are added in-time.

However, there are also some alternatives to this library:

- Spring Mailing Framework
  While this library also seems pretty easy to use, it's more oriented
  around Java EE, as it requires own bean.xml editing.
  And as we aren't going to use Java EE, it's not really an option.

- Simple-Java-Mail
  Smaller in size, but has some not really useful external dependicies.
  As it seems, it's also not being regularly updated anymore since 2012.
  Last, but not least, it doesn't properly support SSL/TLS encryption, whereas
  most of today's mail servers require you to login through an encrypted connection.