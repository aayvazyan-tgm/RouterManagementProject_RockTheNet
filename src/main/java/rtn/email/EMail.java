package rtn.email;

import org.apache.commons.mail.Email;

import java.util.LinkedList;
import java.util.List;

public class EMail implements Cloneable{

	private List<EMailAddress> receipients;

	private String message;

	private String hostName;

	private int smtpPort;

	//private javax.mail.Authentificator authentificator;

	private EMailAddress sender;

	private String subject;

    public EMail(){
        this.receipients=new LinkedList<EMailAddress>();
    }

	public void addReceipient(EMailAddress receipient) {
        this.receipients.add(receipient);
	}

    public List<EMailAddress> getReceipients() {
        return receipients;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public int getSmtpPort() {
        return smtpPort;
    }

    public void setSmtpPort(int smtpPort) {
        this.smtpPort = smtpPort;
    }

    public EMailAddress getSender() {
        return sender;
    }

    public void setSender(EMailAddress sender) {
        this.sender = sender;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public EMail cloneMail() throws CloneNotSupportedException {
        return (EMail) clone();
    }
}
