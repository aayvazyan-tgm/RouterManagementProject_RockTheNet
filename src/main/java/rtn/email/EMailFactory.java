package rtn.email;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EMailFactory {
    private static final Logger logger = LoggerFactory.getLogger(EMailFactory.class);

	private static EMail reference;

    /**
     * returns a copy of the set Prototype
     * @return returns a copy of the set Prototype, null if a error occurred while copying
     * @throws CloneNotSupportedException if a sub element is not cloneable
     */

	public static EMail getMail() throws CloneNotSupportedException {
        return reference.cloneMail();
    }

    /**
     * sets the prototype to return when calling getMail()
     * @param prototype the prototype to return when calling getMail()
     */
	public static void setPrototype(EMail prototype) {
        reference=prototype;
	}
}
