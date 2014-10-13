package rtn.networking.admin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Properties;

import rtn.networking.Configuration;

import com.jcraft.jsch.ChannelShell;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;

/**
 * This class is an implementation of IAdminProtocol, specific for SSH.
 * 
 * @author Andreas Willinger
 * @version 10.10.2014
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
			ChannelShell channel = (ChannelShell) this.connection.openChannel("shell");
			
			if(channel == null) return null;
			
			// connect the channel and wait a second for the header
			channel.setInputStream(null);
			channel.setOutputStream(null);
			channel.connect();
			Thread.sleep(1000);
			
			// set up the streams
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(channel.getOutputStream()));
			BufferedReader reader = new BufferedReader(new InputStreamReader(channel.getInputStream()));
			
			// actually send the command
			writer.write(command);
			writer.flush();
			writer.close();
			
			// read the command's response
			char[] buffer = new char[1024];
			while (true)
			{
				int resp = reader.read(buffer);
				System.out.println("sent command");
				if(resp == 0) break;
				result += new String(buffer) + "\n";
				System.out.println(result);
				// close channel
			    channel.disconnect();

			    if (channel.isClosed()) break;
			    try{Thread.sleep(1000);}catch(Exception ee){}
			}
			
			reader.close();
		}
		catch(JSchException | IOException | InterruptedException ex)
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