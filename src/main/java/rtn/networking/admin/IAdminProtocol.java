package rtn.networking.admin;

public interface IAdminProtocol {

	public boolean connect();

	public Object sendCommand(String command);

	public boolean disconnect();

}
