package rtn.email;

import java.util.LinkedList;
import java.util.List;

public class EMail implements Cloneable{

	private List<EMailAddress> recipients;

	private String message;

	private String hostName;

	private int smtpPort;

	//private javax.mail.Authentificator authentificator;

	private EMailAddress sender;

	private String subject;

    /**
     * A Email, storing all needed information to be sent
     */
    public EMail(){
        this.recipients =new LinkedList<EMailAddress>();
    }

    /**
     * adds a new recipient to the recipients of this Email
     * @param recipient the recipient to add
     */
	public void addRecipient(EMailAddress recipient) {
        this.recipients.add(recipient);
	}

    /**
     * gets the recipients of this Email
     * @return the recipients of this Email
     */
    public List<EMailAddress> getRecipients() {
        return recipients;
    }
    /**
     * gets the message of this Email
     * @return the message of this Email
     */
    public String getMessage() {
        return message;
    }
    /**
     * sets the message of this Email
     * @return the message to set.
     */
    public void setMessage(String message) {
        this.message = message;
    }
    /**
     * gets the host name of this Email
     * @return the host name of this Email
     */
    public String getHostName() {
        return hostName;
    }

    /**
     * sets the host name of this Email
     * @param hostName the host name to set to
     */
    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    /**
     * gets the smtp port of this Email
     * @return the smtp port of this Email
     */
    public int getSmtpPort() {
        return smtpPort;
    }

    /**
     * sets the smtp port of this Email
     * @param smtpPort the smtp port to set.
     */
    public void setSmtpPort(int smtpPort) {
        this.smtpPort = smtpPort;
    }

    /**
     * get the sender of this Email
     * @return the sender of this Email
     */
    public EMailAddress getSender() {
        return sender;
    }

    /**
     * sets the sender of this Email
     * @param sender the sender of this Email
     */
    public void setSender(EMailAddress sender) {
        this.sender = sender;
    }

    /**
     * get the subject of this Email
     * @return the subject of this Email
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the subject of this Email
     * @param subject the subject
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * Clones this Email
     * @return a copy of this object
     * @throws CloneNotSupportedException is thrown if a sub element of Email does not support cloneable
     */
    public EMail cloneMail() throws CloneNotSupportedException {
        return (EMail) clone();
    }
}
