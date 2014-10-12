package rtn.networking.device.commands;

/**
 * Defines a function to retrieve results from executing a command.
 * 
 * @version 12.10.2014
 */
public interface IResult extends IDevCommand
{
	/**
	 * Retrieves results returned by executing the command.
	 * 
	 * @return The results returned by executing the command.
	 */
	public Object getResult();
}