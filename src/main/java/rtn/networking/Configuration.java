package rtn.networking;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Configuration
{
    private static final Logger logger = LoggerFactory.getLogger(Configuration.class);

	private String device;

	private String remoteip;

	private String community;

	private String username;

	private String password;

	private int snmpport;

	private int adminport;
	
	private static Configuration configuration;

	public String getDevice()
	{
		return device;
	}

	public void setDevice(String device)
	{
		this.device = device;
	}
	
	public static Configuration getInstance()
	{
		if(configuration != null) return configuration;
		
		configuration = new Configuration();
		return configuration;
	}
	
	public static void setInstance(Configuration config)
	{
		if(config != null) configuration = config;
	}

	public String getRemoteip()
	{
		return remoteip;
	}

	public void setRemoteip(String remoteip)
	{
		this.remoteip = remoteip;
	}

	public String getCommunity()
	{
		return community;
	}

	public void setCommunity(String community)
	{
		this.community = community;
	}

	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public int getSnmpport()
	{
		return snmpport;
	}

	public void setSnmpport(int snmpport)
	{
		this.snmpport = snmpport;
	}

	public int getAdminport()
	{
		return adminport;
	}

	public void setAdminport(int adminport)
	{
		this.adminport = adminport;
	}
}