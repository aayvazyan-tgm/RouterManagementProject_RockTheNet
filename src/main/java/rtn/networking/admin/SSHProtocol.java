package rtn.networking.admin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

import rtn.networking.Configuration;

import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;

/**
 * This class is an implementation of IAdminProtocol, specific for SSH.
 * 
 * @author Andreas Willinger
 * @version 09.10.2014
 */
public class SSHProtocol implements IAdminProtocol
{
	private Session connection;
	
	/**
	 * @see rtn.networking.admin.IAdminProtocol#connect()
	 */
	public boolean connect()
	{
        if(this.connection != null) return true;
        JSch ssh = new JSch();
		
		// map our singleton instance to a local variable, so that 
		// we don't have to call it each time we want to use it.
		Configuration configuration = Configuration.getInstance();
		
		try
		{
			// prepare connection (set username, host, password, port)
			this.connection = ssh.getSession(configuration.getUsername(), configuration.getRemoteip(), configuration.getAdminport());
			this.connection.setPassword(configuration.getPassword());
			
			// in case the host's key changed
			Properties config = new Properties();
			config.put("StrictHostKeyChecking", "no");
			
			this.connection.setConfig(config);
			this.connection.connect();
		}
		catch(JSchException ex)
		{
			System.out.println(ex.getMessage());
			this.connection = null;
			
			return false;
		}
		return true;
	}

	/**
	 * @see rtn.networking.admin.IAdminProtocol#sendCommand(java.lang.String)
	 */
	public String sendCommand(String command)
	{
		if(!this.connect()) return null;
		
		String result = "";
		
		try
		{
			// prepare the channel to execute the specified command
			ChannelExec channel = (ChannelExec) this.connection.openChannel("exec");
			
			if(channel == null) return null;
			
			// set up readers for both the "normal" stream (regular output) and error stream (command not found, wrong parameters, etc.)
			BufferedReader in = new BufferedReader(new InputStreamReader(channel.getInputStream()));
			BufferedReader error = new BufferedReader(new InputStreamReader(channel.getErrStream()));
			
			// actually send the command
			channel.setCommand(command);
			channel.connect();
			
			String response = null;
			
			// read the command's response
			while((response = in.readLine()) != null) result += response + "\n";
			while((response = error.readLine()) != null) result += response + "\n";
			
			in.close();
			error.close();			
			channel.disconnect();
		}
		catch(JSchException | IOException ex)
		{
			this.disconnect();
			
			return null;
		}
		
		this.disconnect();
		return result;
	}

	/**
	 * @see rtn.networking.admin.IAdminProtocol#disconnect()
	 */
	public boolean disconnect()
	{
		if(this.connection != null) this.connection.disconnect();
		return true;
	}
}