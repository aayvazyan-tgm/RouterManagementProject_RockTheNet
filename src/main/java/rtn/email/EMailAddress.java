package rtn.email;

import java.util.regex.Pattern;

/**
 * Holds a EMail that is rfc2822 conform.
 */
public class EMailAddress implements CharSequence {
    String eMailAddress;
    private static final Pattern rfc2822 = Pattern.compile(
            "^[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?$"
    );

    /**
     * Creates a new eMailAddress by a CharSequence
     * @param eMailAddress the E-Mail Address
     * @throws MalformedEMailAddressException is thrown if the Email is not well formed
     */
	public EMailAddress(CharSequence eMailAddress) throws MalformedEMailAddressException {
        if (!rfc2822.matcher(eMailAddress).matches()) {
            throw new MalformedEMailAddressException();
        }
        this.eMailAddress=eMailAddress.toString();
	}

    @Override
    public int length() {
        return eMailAddress.length();
    }

    @Override
    public char charAt(int index) {
        return eMailAddress.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return eMailAddress.substring(start, end);
    }
}
