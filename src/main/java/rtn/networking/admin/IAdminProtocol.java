package rtn.networking.admin;

/**
 * Interface exposing methods for sending CLI commands over the network.
 * 
 * @author Andreas Willinger
 * @version 09.10.2014
 */
public interface IAdminProtocol
{
	/**
	 * Establishes a connection to a remote host.
	 * 
	 * @return true on success, false on failure (invalid user/pass, unknown host, ..)
	 */
	public boolean connect();
	
	/**
	 * Sends a CLI command to the remote host.
	 * Please always ensure that {@link #connect()} is called before sending a command!
	 * 
	 * @param command The CLI command to send
	 * @return A String (may be empty, if the command doesn't return anything) containing the result of the command, null on failure
	 */
	public String sendCommand(String command);
	
	/**
	 * Disconnects from the remote host, if there is an open connection.
	 * 
	 * @return true on success, false on failure
	 */
	public boolean disconnect();
}