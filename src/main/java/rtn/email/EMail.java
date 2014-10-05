package rtn.email;

import java.util.List;

public class EMail {

	private List<EMailAddress> receipients;

	private String message;

	private String hostName;

	private int smtpPort;

	//private javax.mail.Authentificator authentificator;

	private EMailAddress sender;

	private String subject;

	public void addReceipient(EMailAddress receipient) {

	}

}
