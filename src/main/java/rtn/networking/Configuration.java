package rtn.networking;

import rtn.email.EMail;

/**
 * Holds all configuration parameters needed in this application.
 */
public class Configuration
{
	private String device;
	private String remoteip;
	private String community;
	private String username;
	private String password;
	private int snmpport = 161;
	private int adminport;
    private EMail referenceEMail;
    private int trapListeningPort = 13037;
	private static Configuration configuration;

	/**
	 * Gets the device.
	 *
	 * @return the device
	 */
	public String getDevice()
	{
		return device;
	}

	/**
	 * Sets the device.
	 *
	 * @param device the new device
	 */
	public void setDevice(String device)
	{
		this.device = device;
	}
	
	/**
	 * Gets the single instance of Configuration.
	 *
	 * @return single instance of Configuration
	 */
	public static Configuration getInstance()
	{
		if(configuration != null) return configuration;
		
		configuration = new Configuration();
		return configuration;
	}
	
	/**
	 * Sets the instance.
	 *
	 * @param config the new instance
	 */
	public static void setInstance(Configuration config)
	{
		if(config != null) configuration = config;
	}

	/**
	 * Gets the remoteip.
	 *
	 * @return the remoteip
	 */
	public String getRemoteip()
	{
		return remoteip;
	}

	/**
	 * Sets the remoteip.
	 *
	 * @param remoteip the new remoteip
	 */
	public void setRemoteip(String remoteip)
	{
		this.remoteip = remoteip;
	}

	/**
	 * Gets the community.
	 *
	 * @return the community
	 */
	public String getCommunity()
	{
		return community;
	}

	/**
	 * Sets the community.
	 *
	 * @param community the new community
	 */
	public void setCommunity(String community)
	{
		this.community = community;
	}

	/**
	 * Gets the username.
	 *
	 * @return the username
	 */
	public String getUsername()
	{
		return username;
	}

	/**
	 * Sets the username.
	 *
	 * @param username the new username
	 */
	public void setUsername(String username)
	{
		this.username = username;
	}

	/**
	 * Gets the password.
	 *
	 * @return the password
	 */
	public String getPassword()
	{
		return password;
	}

	/**
	 * Sets the password.
	 *
	 * @param password the new password
	 */
	public void setPassword(String password)
	{
		this.password = password;
	}

	/**
	 * Gets the snmpport.
	 *
	 * @return the snmpport
	 */
	public int getSnmpport()
	{
		return snmpport;
	}

	/**
	 * Sets the snmpport.
	 *
	 * @param snmpport the new snmpport
	 */
	public void setSnmpport(int snmpport)
	{
		this.snmpport = snmpport;
	}

	/**
	 * Gets the adminport.
	 *
	 * @return the adminport
	 */
	public int getAdminport()
	{
		return adminport;
	}

	/**
	 * Sets the adminport.
	 *
	 * @param adminport the new adminport
	 */
	public void setAdminport(int adminport)
	{
		this.adminport = adminport;
	}

    /**
     * Gets the reference e mail.
     *
     * @return the reference e mail
     */
    public EMail getReferenceEMail() {
        return referenceEMail;
    }

    /**
     * Sets the reference e mail.
     *
     * @param referenceEMail the new reference e mail
     */
    public void setReferenceEMail(EMail referenceEMail) {
        this.referenceEMail = referenceEMail;
    }

    /**
     * Gets the trap listening port.
     *
     * @return the trap listening port
     */
    public int getTrapListeningPort() {
        return trapListeningPort;
    }

    /**
     * Sets the trap listening port.
     *
     * @param trapListeningPort the new trap listening port
     */
    public void setTrapListeningPort(int trapListeningPort) {
        this.trapListeningPort = trapListeningPort;
    }
}