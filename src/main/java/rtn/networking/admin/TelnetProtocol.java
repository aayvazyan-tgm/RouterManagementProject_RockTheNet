package rtn.networking.admin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class is not yet implemented, but can be used to implement Telnet.
 * 
 * @author Andreas Willinger
 * @version 10.10.2014
 */
public class TelnetProtocol implements IAdminProtocol
{
    private static final Logger logger = LoggerFactory.getLogger(TelnetProtocol.class);

	/**
	 * @see rtn.networking.admin.IAdminProtocol#connect()
	 */
	public boolean connect()
	{
		return false;
	}

	/**
	 * @see rtn.networking.admin.IAdminProtocol#sendCommand(java.lang.String)
	 */
	public String sendCommand(String command)
	{
		return null;
	}

	/**
	 * @see rtn.networking.admin.IAdminProtocol#disconnect()
	 */
	public boolean disconnect()
	{
		return false;
	}
}