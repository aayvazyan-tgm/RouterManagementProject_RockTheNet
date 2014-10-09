package rtn.networking.admin;

public class SSHProtocol implements IAdminProtocol
{
	/**
	 * @see rtn.networking.admin.IAdminProtocol#connect()
	 */
	public boolean connect() {
		return false;
	}

	/**
	 * @see rtn.networking.admin.IAdminProtocol#sendCommand(java.lang.String)
	 */
	public Object sendCommand(String command) {
		return null;
	}


	/**
	 * @see rtn.networking.admin.IAdminProtocol#disconnect()
	 */
	public boolean disconnect() {
		return false;
	}
}