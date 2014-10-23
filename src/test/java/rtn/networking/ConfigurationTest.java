package rtn.networking;

import org.junit.*;
import static org.junit.Assert.*;
import rtn.email.EMail;

/**
 * The class ConfigurationTest contains tests for the class Configuration.
 *
 * @generatedBy CodePro at 23.10.14 15:12
 * @author Andreas Willinger
 */
public class ConfigurationTest
{
	/**
	 * Run the Configuration() constructor test.
	 */
	@Test
	public void testConfiguration_1()
		throws Exception
	{
		Configuration result = new Configuration();
		assertNotNull(result);
	}

	/**
	 * Run the int getAdminport() method test.
	 *
	 * @throws Exception An Exception
	 */
	@Test
	public void testGetAdminport_1()
		throws Exception
	{
		Configuration fixture = new Configuration();
		fixture.setRemoteip("");
		fixture.setSnmpport(1);
		fixture.setAdminport(1);
		fixture.setUsername("");
		fixture.setPassword("");
		fixture.setCommunity("");
		fixture.setReferenceEMail(new EMail());
		fixture.setDevice("");
		fixture.setTrapListeningPort(1);

		int result = fixture.getAdminport();
		assertEquals(1, result);
	}

	/**
	 * Run the String getCommunity() method test.
	 *
	 * @throws Exception An Exception
	 */
	@Test
	public void testGetCommunity_1()
		throws Exception
	{
		Configuration fixture = new Configuration();
		fixture.setRemoteip("");
		fixture.setSnmpport(1);
		fixture.setAdminport(1);
		fixture.setUsername("");
		fixture.setPassword("");
		fixture.setCommunity("");
		fixture.setReferenceEMail(new EMail());
		fixture.setDevice("");
		fixture.setTrapListeningPort(1);

		String result = fixture.getCommunity();
		assertNotNull(result);
	}

	/**
	 * Run the String getDevice() method test.
	 *
	 * @throws Exception An Exception
	 */
	@Test
	public void testGetDevice_1()
		throws Exception
	{
		Configuration fixture = new Configuration();
		fixture.setRemoteip("");
		fixture.setSnmpport(1);
		fixture.setAdminport(1);
		fixture.setUsername("");
		fixture.setPassword("");
		fixture.setCommunity("");
		fixture.setReferenceEMail(new EMail());
		fixture.setDevice("");
		fixture.setTrapListeningPort(1);

		String result = fixture.getDevice();
		assertNotNull(result);
	}

	/**
	 * Run the Configuration getInstance() method test.
	 *
	 * @throws Exception An Exception
	 */
	@Test
	public void testGetInstance_1()
		throws Exception
	{
		Configuration conf = new Configuration();
		conf.setTrapListeningPort(13037);
		conf.setSnmpport(161);
		conf.setAdminport(0);
		Configuration.setInstance(conf);
		Configuration result = Configuration.getInstance();

		assertNotNull(result);
		assertEquals(null, result.getUsername());
		assertEquals(null, result.getDevice());
		assertEquals(13037, result.getTrapListeningPort());
		assertEquals(null, result.getReferenceEMail());
		assertEquals(null, result.getPassword());
		assertEquals(161, result.getSnmpport());
		assertEquals(0, result.getAdminport());
		assertEquals(null, result.getRemoteip());
		assertEquals(null, result.getCommunity()); 
	}

	/**
	 * Run the Configuration getInstance() method test.
	 *
	 * @throws Exception An Exception
	 */
	@Test
	public void testGetInstance_2()
		throws Exception
	{
		Configuration conf = new Configuration();
		conf.setTrapListeningPort(13037);
		conf.setSnmpport(161);
		conf.setAdminport(0);
		Configuration.setInstance(conf);
		Configuration result = Configuration.getInstance();

		assertNotNull(result);
		assertEquals(null, result.getUsername());
		assertEquals(null, result.getDevice());
		assertEquals(13037, result.getTrapListeningPort());
		assertEquals(null, result.getReferenceEMail());
		assertEquals(null, result.getPassword());
		assertEquals(161, result.getSnmpport());
		assertEquals(0, result.getAdminport());
		assertEquals(null, result.getRemoteip());
		assertEquals(null, result.getCommunity());
	}

	/**
	 * Run the String getPassword() method test.
	 *
	 * @throws Exception An Exception
	 */
	@Test
	public void testGetPassword_1()
		throws Exception
	{
		Configuration fixture = new Configuration();
		fixture.setRemoteip("");
		fixture.setSnmpport(1);
		fixture.setAdminport(1);
		fixture.setUsername("");
		fixture.setPassword("");
		fixture.setCommunity("");
		fixture.setReferenceEMail(new EMail());
		fixture.setDevice("");
		fixture.setTrapListeningPort(1);

		String result = fixture.getPassword();
		assertNotNull(result);
	}

	/**
	 * Run the EMail getReferenceEMail() method test.
	 *
	 * @throws Exception An Exception
	 */
	@Test
	public void testGetReferenceEMail_1()
		throws Exception
	{
		Configuration fixture = new Configuration();
		fixture.setRemoteip("");
		fixture.setSnmpport(1);
		fixture.setAdminport(1);
		fixture.setUsername("");
		fixture.setPassword("");
		fixture.setCommunity("");
		fixture.setReferenceEMail(new EMail());
		fixture.setDevice("");
		fixture.setTrapListeningPort(1);

		EMail result = fixture.getReferenceEMail();
		assertNotNull(result);
	}

	/**
	 * Run the String getRemoteip() method test.
	 *
	 * @throws Exception An Exception
	 */
	@Test
	public void testGetRemoteip_1()
		throws Exception
	{
		Configuration fixture = new Configuration();
		fixture.setRemoteip("");
		fixture.setSnmpport(1);
		fixture.setAdminport(1);
		fixture.setUsername("");
		fixture.setPassword("");
		fixture.setCommunity("");
		fixture.setReferenceEMail(new EMail());
		fixture.setDevice("");
		fixture.setTrapListeningPort(1);

		String result = fixture.getRemoteip();
		assertNotNull(result);
	}

	/**
	 * Run the int getSnmpport() method test.
	 *
	 * @throws Exception An Exception
	 */
	@Test
	public void testGetSnmpport_1()
		throws Exception
	{
		Configuration fixture = new Configuration();
		fixture.setRemoteip("");
		fixture.setSnmpport(1);
		fixture.setAdminport(1);
		fixture.setUsername("");
		fixture.setPassword("");
		fixture.setCommunity("");
		fixture.setReferenceEMail(new EMail());
		fixture.setDevice("");
		fixture.setTrapListeningPort(1);

		int result = fixture.getSnmpport();
		assertEquals(1, result);
	}

	/**
	 * Run the int getTrapListeningPort() method test.
	 *
	 * @throws Exception An Exception
	 */
	@Test
	public void testGetTrapListeningPort_1()
		throws Exception
	{
		Configuration fixture = new Configuration();
		fixture.setRemoteip("");
		fixture.setSnmpport(1);
		fixture.setAdminport(1);
		fixture.setUsername("");
		fixture.setPassword("");
		fixture.setCommunity("");
		fixture.setReferenceEMail(new EMail());
		fixture.setDevice("");
		fixture.setTrapListeningPort(1);

		int result = fixture.getTrapListeningPort();
		assertEquals(1, result);
	}

	/**
	 * Run the String getUsername() method test.
	 *
	 * @throws Exception An Exception
	 */
	@Test
	public void testGetUsername_1()
		throws Exception
	{
		Configuration fixture = new Configuration();
		fixture.setRemoteip("");
		fixture.setSnmpport(1);
		fixture.setAdminport(1);
		fixture.setUsername("");
		fixture.setPassword("");
		fixture.setCommunity("");
		fixture.setReferenceEMail(new EMail());
		fixture.setDevice("");
		fixture.setTrapListeningPort(1);

		String result = fixture.getUsername();
		assertNotNull(result);
	}

	/**
	 * Run the void setAdminport(int) method test.
	 *
	 * @throws Exception An Exception
	 */
	@Test
	public void testSetAdminport_1()
		throws Exception
	{
		Configuration fixture = new Configuration();
		fixture.setRemoteip("");
		fixture.setSnmpport(1);
		fixture.setAdminport(1);
		fixture.setUsername("");
		fixture.setPassword("");
		fixture.setCommunity("");
		fixture.setReferenceEMail(new EMail());
		fixture.setDevice("");
		fixture.setTrapListeningPort(1);
		int adminport = 1;

		fixture.setAdminport(adminport);
	}

	/**
	 * Run the void setCommunity(String) method test.
	 *
	 * @throws Exception An Exception
	 */
	@Test
	public void testSetCommunity_1()
		throws Exception
	{
		Configuration fixture = new Configuration();
		fixture.setRemoteip("");
		fixture.setSnmpport(1);
		fixture.setAdminport(1);
		fixture.setUsername("");
		fixture.setPassword("");
		fixture.setCommunity("");
		fixture.setReferenceEMail(new EMail());
		fixture.setDevice("");
		fixture.setTrapListeningPort(1);
		String community = "";

		fixture.setCommunity(community);
	}

	/**
	 * Run the void setDevice(String) method test.
	 *
	 * @throws Exception An Exception
	 */
	@Test
	public void testSetDevice_1()
		throws Exception
	{
		Configuration fixture = new Configuration();
		fixture.setRemoteip("");
		fixture.setSnmpport(1);
		fixture.setAdminport(1);
		fixture.setUsername("");
		fixture.setPassword("");
		fixture.setCommunity("");
		fixture.setReferenceEMail(new EMail());
		fixture.setDevice("");
		fixture.setTrapListeningPort(1);
		String device = "";

		fixture.setDevice(device);
	}

	/**
	 * Run the void setInstance(Configuration) method test.
	 *
	 * @throws Exception An Exception
	 */
	@Test
	public void testSetInstance_1()
		throws Exception
	{
		Configuration config = new Configuration();
		Configuration.setInstance(config);
	}

	/**
	 * Run the void setInstance(Configuration) method test.
	 *
	 * @throws Exception An Exception
	 */
	@Test
	public void testSetInstance_2()
		throws Exception
	{
		Configuration config = null;
		Configuration.setInstance(config);
	}

	/**
	 * Run the void setPassword(String) method test.
	 *
	 * @throws Exception An Exception
	 */
	@Test
	public void testSetPassword_1()
		throws Exception
	{
		Configuration fixture = new Configuration();
		fixture.setRemoteip("");
		fixture.setSnmpport(1);
		fixture.setAdminport(1);
		fixture.setUsername("");
		fixture.setPassword("");
		fixture.setCommunity("");
		fixture.setReferenceEMail(new EMail());
		fixture.setDevice("");
		fixture.setTrapListeningPort(1);
		String password = "";

		fixture.setPassword(password);
	}

	/**
	 * Run the void setReferenceEMail(EMail) method test.
	 *
	 * @throws Exception An Exception
	 */
	@Test
	public void testSetReferenceEMail_1()
		throws Exception
	{
		Configuration fixture = new Configuration();
		fixture.setRemoteip("");
		fixture.setSnmpport(1);
		fixture.setAdminport(1);
		fixture.setUsername("");
		fixture.setPassword("");
		fixture.setCommunity("");
		fixture.setReferenceEMail(new EMail());
		fixture.setDevice("");
		fixture.setTrapListeningPort(1);
		EMail referenceEMail = new EMail();

		fixture.setReferenceEMail(referenceEMail);
	}

	/**
	 * Run the void setRemoteip(String) method test.
	 *
	 * @throws Exception An Exception
	 */
	@Test
	public void testSetRemoteip_1()
		throws Exception
	{
		Configuration fixture = new Configuration();
		fixture.setRemoteip("");
		fixture.setSnmpport(1);
		fixture.setAdminport(1);
		fixture.setUsername("");
		fixture.setPassword("");
		fixture.setCommunity("");
		fixture.setReferenceEMail(new EMail());
		fixture.setDevice("");
		fixture.setTrapListeningPort(1);
		String remoteip = "";

		fixture.setRemoteip(remoteip);
	}

	/**
	 * Run the void setSnmpport(int) method test.
	 *
	 * @throws Exception An Exception
	 */
	@Test
	public void testSetSnmpport_1()
		throws Exception
	{
		Configuration fixture = new Configuration();
		fixture.setRemoteip("");
		fixture.setSnmpport(1);
		fixture.setAdminport(1);
		fixture.setUsername("");
		fixture.setPassword("");
		fixture.setCommunity("");
		fixture.setReferenceEMail(new EMail());
		fixture.setDevice("");
		fixture.setTrapListeningPort(1);
		int snmpport = 1;

		fixture.setSnmpport(snmpport);
	}

	/**
	 * Run the void setTrapListeningPort(int) method test.
	 *
	 * @throws Exception An Exception
	 */
	@Test
	public void testSetTrapListeningPort_1()
		throws Exception
	{
		Configuration fixture = new Configuration();
		fixture.setRemoteip("");
		fixture.setSnmpport(1);
		fixture.setAdminport(1);
		fixture.setUsername("");
		fixture.setPassword("");
		fixture.setCommunity("");
		fixture.setReferenceEMail(new EMail());
		fixture.setDevice("");
		fixture.setTrapListeningPort(1);
		int trapListeningPort = 1;

		fixture.setTrapListeningPort(trapListeningPort);
	}

	/**
	 * Run the void setUsername(String) method test.
	 *
	 * @throws Exception An Exception
	 */
	@Test
	public void testSetUsername_1()
		throws Exception
	{
		Configuration fixture = new Configuration();
		fixture.setRemoteip("");
		fixture.setSnmpport(1);
		fixture.setAdminport(1);
		fixture.setUsername("");
		fixture.setPassword("");
		fixture.setCommunity("");
		fixture.setReferenceEMail(new EMail());
		fixture.setDevice("");
		fixture.setTrapListeningPort(1);
		String username = "";

		fixture.setUsername(username);
	}
}