package rtn.email;

import org.apache.commons.mail.*;

import javax.mail.Authenticator;
import java.util.Iterator;

public class EMailWorker {
    /**
     * Sends a Email using a configured Authentication method
     * @param mail the Mail to be sent.
     */
	public void send(EMail mail) throws EmailException {
        Authenticator aut=new DefaultAuthenticator("Username","Password");
        sendSimpleMail(mail,aut);
	}

    /**
     * Sends a Mail with the information given by the EMail Parameters
     * @param m the EMail to send
     * @param authenticator the authenticator used to login to the server
     * @throws org.apache.commons.mail.EmailException
     */
    private static void sendSimpleMail(EMail m,Authenticator authenticator) throws EmailException {
        Email email = new SimpleEmail();
        // where to send it to
        email.setHostName(m.getHostName());
        // the UNENCRYPTED SMTP port
        email.setSmtpPort(m.getSmtpPort());
        email.setAuthenticator(authenticator);
        // tells the library to establish an encrypted connection
        email.setSSLOnConnect(true);
        // if the SSL port is different from standard (465)
        email.setSslSmtpPort(""+m.getSmtpPort());
        // sender, subject, message
        email.setFrom(m.getSender().toString());
        email.setSubject(m.getSubject());
        email.setMsg(m.getMessage());
        // where to actually send the mail to
        Iterator<EMailAddress> receipients=m.getRecipients().iterator();
        while (receipients.hasNext()) {
            EMailAddress next =  receipients.next();
            email.addTo(next.toString());
        }
        // or:
        // email.addTo(email, label), e.g. email.addTo("ad@abc.com," Someone")
        // can also be used in the from method - email.setFrom(email, label)

        // send the email
        email.send();
    }

    /**
     * NOT IMPLEMENTED YET
     * @param m
     * @throws EmailException

    private static void sendAttachmentMail(EMail m) throws EmailException {
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
    }*/

    /**private static void sendHTMLMail(EMail m) throws MalformedURLException, EmailException {
        // create the email message
        // parameters are the same as in the simple email
        HtmlEmail email = new HtmlEmail();
        email.setHostName(m.getHostName());
        email.setSmtpPort(m.getSmtpPort());
        email.setAuthenticator(new DefaultAuthenticator("username", "password"));
        email.setSSLOnConnect(true);
        email.setSslSmtpPort(""+m.getSmtpPort());
        Iterator<EMailAddress> receipients=m.getRecipients().iterator();
        while (receipients.hasNext()) {
            EMailAddress next =  receipients.next();
            email.addTo(next.toString());
        }
        email.setFrom(m.getSender().toString());
        email.setSubject(m.getSubject());
        email.setMsg(m.getMessage());

        // embed the image and get the content id
        //URL url = new URL("http://www.apache.org/images/asf_logo_wide.gif");
        //String cid = email.embed(url, "Apache logo");

        // set the html message
        // DO NOT USE .setMsg() (as in the other examples), use the following two methods instead!
        //email.setHtmlMsg("<html>The apache logo - <img src=\"cid:"+cid+"\"></html>");

        // set the alternative message
        email.setTextMsg(m.getMessage());

        // send the email
        email.send();
    }*/

}
