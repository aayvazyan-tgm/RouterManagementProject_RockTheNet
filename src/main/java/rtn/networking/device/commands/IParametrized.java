package rtn.networking.device.commands;

/**
 * Sets parameters required to execute a command.
 * 
 * @version 12.10.2014
 */
public interface IParametrized extends IDevCommand
{
	/**
	 * Sets parameters required by the implementation for executing the command.
	 * 
	 * @param params 1..* amount of parameters
	 */
	public void setParams(Object... params);
}