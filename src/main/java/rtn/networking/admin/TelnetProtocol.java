package rtn.networking.admin;

/**
 * This class is not yet implemented, but can be used to implement Telnet.
 * 
 * @author Andreas Willinger
 * @version 10.10.2014
 */
public class TelnetProtocol implements IAdminProtocol
{	
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