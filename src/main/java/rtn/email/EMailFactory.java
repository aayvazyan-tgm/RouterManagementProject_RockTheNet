package rtn.email;

public class EMailFactory {

	private static EMail reference;

    /**
     * returns a copy of the set Prototype
     * @return returns a copy of the set Prototype, null if a error occurred while copying
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
