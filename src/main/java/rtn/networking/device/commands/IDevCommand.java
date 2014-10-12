package rtn.networking.device.commands;

/**
 * Interface defining commands being sent to the device, various implementations. 
 * @version 12.10.2014
 */
public interface IDevCommand
{
	/**
	 * Executes the given command on the device and throws an Exception if there were any failures doing so.
	 * @throws Exception Thrown if any errors occured while executing the command.
	 */
	public void execute() throws Exception;
}