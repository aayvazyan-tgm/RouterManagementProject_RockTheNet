package rtn.email;

import java.io.*;
import java.net.URL;
import org.apache.commons.mail.*;

/**
 * This class demonstrates the use of the Apache Commons EMail library.
 * It sends an email of each kind: basic (text), basic (text) w/ attachment and HTML
 */
public class Main
{
    // SMTP host
    private static String host = "";
    // non-encrypted SMTP port (standard 25)
    private static int smtpPort = 25;
    private static String username = "";
    private static String password = "";
    // should be the same as username@domain.tld
    private static String from = "";
    private static String subject = "";
    private static String msg = "";
    private static String to = "";
    
    public static void main(String[] args)
    {
        try
        {
            sendSimpleMail();
            
        }
        catch(Exception ex)
        {
            System.err.println("Could not send basic email, error was:");
            ex.printStackTrace();
        }
        
        try
        {
            sendAttachmentMail(); 
        }
        catch(Exception ex)
        {
            System.err.println("Could not send attachment email, error was:");
            ex.printStackTrace();
        }
        
        try
        {
            sendHTMLMail();
        }
        catch(Exception ex)
        {
            System.err.println("Could not send HTML email, error was:");
            ex.printStackTrace();
        }
    }
    
    private static void sendSimpleMail() throws Exception
    {
        Email email = new SimpleEmail();
        
        // where to send it to
        email.setHostName(host);
        // the UNENCRYPTED SMTP port
        email.setSmtpPort(smtpPort);
        email.setAuthenticator(new DefaultAuthenticator(username, password));
        // tells the library to establish an encrypted connection
        email.setSSLOnConnect(true);
        // if the SSL port is different from standard (465)
        email.setSslSmtpPort(""+smtpPort);
        // sender, subject, message
        email.setFrom(from);
        email.setSubject(subject);
        email.setMsg(msg);
        // where to actually send the mail to
        email.addTo(to);
        // or:
        // email.addTo(email, label), e.g. email.addTo("ad@abc.com," Someone")
        // can also be used in the from method - email.setFrom(email, label)
        
        // send the email
        email.send();
    }
    
    private static void sendAttachmentMail() throws Exception
    {
        // create the attachment
        EmailAttachment attachment = new EmailAttachment();
        attachment.setPath("asf_logo_wide.gif");
        attachment.setDisposition(EmailAttachment.ATTACHMENT);
        attachment.setDescription("Apache logo");
        attachment.setName("Apache logo");

        // create the email message
        // parameters are the same as in the simple email
        MultiPartEmail email = new MultiPartEmail();
        email.setHostName(host);
        email.setSmtpPort(smtpPort);
        email.setAuthenticator(new DefaultAuthenticator(username, password));
        email.setSSLOnConnect(true);
        email.setSslSmtpPort(""+smtpPort);
        email.addTo(to);
        email.setFrom(from);
        email.setSubject(subject);
        email.setMsg(msg);

        // add the attachment
        email.attach(attachment);

        // send the email
        email.send();
    }
    
    private static void sendHTMLMail() throws Exception
    {
        // create the email message
        // parameters are the same as in the simple email
        HtmlEmail email = new HtmlEmail();
        email.setHostName(host);
        email.setSmtpPort(smtpPort);
        email.setAuthenticator(new DefaultAuthenticator(username, password));
        email.setSSLOnConnect(true);
        email.setSslSmtpPort(""+smtpPort);
        email.addTo(to);
        email.setFrom(from);
        email.setSubject(subject);
        email.setMsg(msg);
      
        // embed the image and get the content id
        URL url = new URL("http://www.apache.org/images/asf_logo_wide.gif");
        String cid = email.embed(url, "Apache logo");
      
        // set the html message
        // DO NOT USE .setMsg() (as in the other examples), use the following two methods instead!
        email.setHtmlMsg("<html>The apache logo - <img src=\"cid:"+cid+"\"></html>");
    
        // set the alternative message
        email.setTextMsg(msg);

        // send the email
        email.send();
    }
}