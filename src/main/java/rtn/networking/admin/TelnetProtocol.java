package rtn.networking.admin;

import rtn.networking.Configuration;

/**
 * This class is an implementation of IAdminProtocol, specific for Telnet.
 * 
 * @author Andreas Willinger
 * @version 09.10.2014
 */
public class TelnetProtocol implements IAdminProtocol
{	
	/**
	 * @see rtn.networking.admin.IAdminProtocol#connect()
	 */
	public boolean connect()
	{
		// map our singleton instance to a local variable, so that 
		// we don't have to call it each time we want to use it.
		Configuration configuration = Configuration.getInstance();
		
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