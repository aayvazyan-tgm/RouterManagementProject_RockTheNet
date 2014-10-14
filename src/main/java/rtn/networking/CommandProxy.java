package rtn.networking;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rtn.networking.device.commands.IDevCommand;

/**
 * This class provides a way to access commands specified by command and device name.
 * 
 * @author Andreas Willinger
 * @version 10.10.2014
 */
public class CommandProxy
{
    private static final Logger logger = LoggerFactory.getLogger(CommandProxy.class);

	private CommandProxy(){}
	/**
	 * Creates a new instance of a IDevCommand implementation, based on command (implementing class) and device name.
	 * 
	 * @param command The name (command) of the implementing class (e.g. AddPolicy)
	 * @param device The device package where the command is implemented.
	 * 
	 * @return An IDevCommand instance implemented by the specified parameters.
	 * @throws ClassNotFoundException Thrown when there was either no class supplied or the class could not be found.
	 * @throws InstantiationException Thrown when Java couldn't instantiate the given class.
	 * @throws IllegalAccessException Thrown when the class or constructor is private.
	 */
	public static IDevCommand getCommand(String command, String device) throws ClassNotFoundException, InstantiationException, IllegalAccessException
	{
		if(command == null || command.isEmpty()) throw new ClassNotFoundException("Command is a required parameter!");
		if(device == null || device.isEmpty()) throw new ClassNotFoundException("Device is a required parameter!");
		
		String classPath = "rtn.networking.device." + device + "." + command;

		return (IDevCommand)Class.forName(classPath).newInstance();
	}
}