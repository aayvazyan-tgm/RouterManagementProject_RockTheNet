package rtn.email;

import com.google.inject.Provides;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rtn.networking.Configuration;

public class EMailFactory {
    private static final Logger logger = LoggerFactory.getLogger(EMailFactory.class);

	private static EMail reference;

    /**
     * returns a copy of the set Prototype
     * @return returns a copy of the set Prototype, null if a error occurred while copying
     * @throws CloneNotSupportedException if a sub element is not cloneable
     */
    @Provides
	public static EMail getMail() throws CloneNotSupportedException {
        if(reference==null) {
            logger.error("EMailFactory not initialised");
        }
        return Configuration.getInstance().getReferenceEMail().cloneMail();
    }

    /**
     * sets the prototype to return when calling getMail()
     * @param prototype the prototype to return when calling getMail()
     */
	public static void setPrototype(EMail prototype) {
        Configuration.getInstance().setReferenceEMail(prototype);
	}
}
