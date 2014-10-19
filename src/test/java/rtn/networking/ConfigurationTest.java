package rtn.networking;

import org.junit.*;
import rtn.email.EMail;
import static org.junit.Assert.*;

/**
 * The class <code>ConfigurationTest</code> contains tests for the class <code>{@link Configuration}</code>.
 *
 * @generatedBy CodePro at 10/19/14 10:28 PM
 * @author jakob
 * @version $Revision: 1.0 $
 */
public class ConfigurationTest {
	/**
	 * Run the Configuration() constructor test.
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testConfiguration_1()
		throws Exception {
		Configuration result = new Configuration();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the int getAdminport() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testGetAdminport_1()
		throws Exception {
		Configuration fixture = new Configuration();
		fixture.setUsername("");
		fixture.setRemoteip("");
		fixture.setDevice("");
		fixture.setCommunity("");
		fixture.setPassword("");
		fixture.setReferenceEMail(new EMail());
		fixture.setAdminport(1);
		fixture.setSnmpport(1);

		int result = fixture.getAdminport();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.networking.Configuration
		assertEquals(0, result);
	}

	/**
	 * Run the String getCommunity() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testGetCommunity_1()
		throws Exception {
		Configuration fixture = new Configuration();
		fixture.setUsername("");
		fixture.setRemoteip("");
		fixture.setDevice("");
		fixture.setCommunity("");
		fixture.setPassword("");
		fixture.setReferenceEMail(new EMail());
		fixture.setAdminport(1);
		fixture.setSnmpport(1);

		String result = fixture.getCommunity();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.networking.Configuration
		assertNotNull(result);
	}

	/**
	 * Run the String getDevice() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testGetDevice_1()
		throws Exception {
		Configuration fixture = new Configuration();
		fixture.setUsername("");
		fixture.setRemoteip("");
		fixture.setDevice("");
		fixture.setCommunity("");
		fixture.setPassword("");
		fixture.setReferenceEMail(new EMail());
		fixture.setAdminport(1);
		fixture.setSnmpport(1);

		String result = fixture.getDevice();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at org.slf4j.impl.Log4jLoggerFactory.getLogger(Log4jLoggerFactory.java:66)
		//       at org.slf4j.LoggerFactory.getLogger(LoggerFactory.java:277)
		//       at org.slf4j.LoggerFactory.getLogger(LoggerFactory.java:288)
		//       at rtn.networking.Configuration.<clinit>(Configuration.java:9)
		assertNotNull(result);
	}

	/**
	 * Run the Configuration getInstance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testGetInstance_1()
		throws Exception {

		Configuration result = Configuration.getInstance();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.networking.Configuration
		assertNotNull(result);
	}

	/**
	 * Run the Configuration getInstance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testGetInstance_2()
		throws Exception {

		Configuration result = Configuration.getInstance();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.networking.Configuration
		assertNotNull(result);
	}

	/**
	 * Run the String getPassword() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testGetPassword_1()
		throws Exception {
		Configuration fixture = new Configuration();
		fixture.setUsername("");
		fixture.setRemoteip("");
		fixture.setDevice("");
		fixture.setCommunity("");
		fixture.setPassword("");
		fixture.setReferenceEMail(new EMail());
		fixture.setAdminport(1);
		fixture.setSnmpport(1);

		String result = fixture.getPassword();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.networking.Configuration
		assertNotNull(result);
	}

	/**
	 * Run the EMail getReferenceEMail() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testGetReferenceEMail_1()
		throws Exception {
		Configuration fixture = new Configuration();
		fixture.setUsername("");
		fixture.setRemoteip("");
		fixture.setDevice("");
		fixture.setCommunity("");
		fixture.setPassword("");
		fixture.setReferenceEMail(new EMail());
		fixture.setAdminport(1);
		fixture.setSnmpport(1);

		EMail result = fixture.getReferenceEMail();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.networking.Configuration
		assertNotNull(result);
	}

	/**
	 * Run the String getRemoteip() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testGetRemoteip_1()
		throws Exception {
		Configuration fixture = new Configuration();
		fixture.setUsername("");
		fixture.setRemoteip("");
		fixture.setDevice("");
		fixture.setCommunity("");
		fixture.setPassword("");
		fixture.setReferenceEMail(new EMail());
		fixture.setAdminport(1);
		fixture.setSnmpport(1);

		String result = fixture.getRemoteip();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.networking.Configuration
		assertNotNull(result);
	}

	/**
	 * Run the int getSnmpport() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testGetSnmpport_1()
		throws Exception {
		Configuration fixture = new Configuration();
		fixture.setUsername("");
		fixture.setRemoteip("");
		fixture.setDevice("");
		fixture.setCommunity("");
		fixture.setPassword("");
		fixture.setReferenceEMail(new EMail());
		fixture.setAdminport(1);
		fixture.setSnmpport(1);

		int result = fixture.getSnmpport();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.networking.Configuration
		assertEquals(0, result);
	}

	/**
	 * Run the String getUsername() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testGetUsername_1()
		throws Exception {
		Configuration fixture = new Configuration();
		fixture.setUsername("");
		fixture.setRemoteip("");
		fixture.setDevice("");
		fixture.setCommunity("");
		fixture.setPassword("");
		fixture.setReferenceEMail(new EMail());
		fixture.setAdminport(1);
		fixture.setSnmpport(1);

		String result = fixture.getUsername();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.networking.Configuration
		assertNotNull(result);
	}

	/**
	 * Run the void setAdminport(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testSetAdminport_1()
		throws Exception {
		Configuration fixture = new Configuration();
		fixture.setUsername("");
		fixture.setRemoteip("");
		fixture.setDevice("");
		fixture.setCommunity("");
		fixture.setPassword("");
		fixture.setReferenceEMail(new EMail());
		fixture.setAdminport(1);
		fixture.setSnmpport(1);
		int adminport = 1;

		fixture.setAdminport(adminport);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.networking.Configuration
	}

	/**
	 * Run the void setCommunity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testSetCommunity_1()
		throws Exception {
		Configuration fixture = new Configuration();
		fixture.setUsername("");
		fixture.setRemoteip("");
		fixture.setDevice("");
		fixture.setCommunity("");
		fixture.setPassword("");
		fixture.setReferenceEMail(new EMail());
		fixture.setAdminport(1);
		fixture.setSnmpport(1);
		String community = "";

		fixture.setCommunity(community);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.networking.Configuration
	}

	/**
	 * Run the void setDevice(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testSetDevice_1()
		throws Exception {
		Configuration fixture = new Configuration();
		fixture.setUsername("");
		fixture.setRemoteip("");
		fixture.setDevice("");
		fixture.setCommunity("");
		fixture.setPassword("");
		fixture.setReferenceEMail(new EMail());
		fixture.setAdminport(1);
		fixture.setSnmpport(1);
		String device = "";

		fixture.setDevice(device);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.networking.Configuration
	}

	/**
	 * Run the void setInstance(Configuration) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testSetInstance_1()
		throws Exception {
		Configuration config = new Configuration();

		Configuration.setInstance(config);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.networking.Configuration
	}

	/**
	 * Run the void setInstance(Configuration) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testSetInstance_2()
		throws Exception {
		Configuration config = null;

		Configuration.setInstance(config);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.networking.Configuration
	}

	/**
	 * Run the void setPassword(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testSetPassword_1()
		throws Exception {
		Configuration fixture = new Configuration();
		fixture.setUsername("");
		fixture.setRemoteip("");
		fixture.setDevice("");
		fixture.setCommunity("");
		fixture.setPassword("");
		fixture.setReferenceEMail(new EMail());
		fixture.setAdminport(1);
		fixture.setSnmpport(1);
		String password = "";

		fixture.setPassword(password);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.networking.Configuration
	}

	/**
	 * Run the void setReferenceEMail(EMail) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testSetReferenceEMail_1()
		throws Exception {
		Configuration fixture = new Configuration();
		fixture.setUsername("");
		fixture.setRemoteip("");
		fixture.setDevice("");
		fixture.setCommunity("");
		fixture.setPassword("");
		fixture.setReferenceEMail(new EMail());
		fixture.setAdminport(1);
		fixture.setSnmpport(1);
		EMail referenceEMail = new EMail();

		fixture.setReferenceEMail(referenceEMail);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.networking.Configuration
	}

	/**
	 * Run the void setRemoteip(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testSetRemoteip_1()
		throws Exception {
		Configuration fixture = new Configuration();
		fixture.setUsername("");
		fixture.setRemoteip("");
		fixture.setDevice("");
		fixture.setCommunity("");
		fixture.setPassword("");
		fixture.setReferenceEMail(new EMail());
		fixture.setAdminport(1);
		fixture.setSnmpport(1);
		String remoteip = "";

		fixture.setRemoteip(remoteip);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.networking.Configuration
	}

	/**
	 * Run the void setSnmpport(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testSetSnmpport_1()
		throws Exception {
		Configuration fixture = new Configuration();
		fixture.setUsername("");
		fixture.setRemoteip("");
		fixture.setDevice("");
		fixture.setCommunity("");
		fixture.setPassword("");
		fixture.setReferenceEMail(new EMail());
		fixture.setAdminport(1);
		fixture.setSnmpport(1);
		int snmpport = 1;

		fixture.setSnmpport(snmpport);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.networking.Configuration
	}

	/**
	 * Run the void setUsername(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testSetUsername_1()
		throws Exception {
		Configuration fixture = new Configuration();
		fixture.setUsername("");
		fixture.setRemoteip("");
		fixture.setDevice("");
		fixture.setCommunity("");
		fixture.setPassword("");
		fixture.setReferenceEMail(new EMail());
		fixture.setAdminport(1);
		fixture.setSnmpport(1);
		String username = "";

		fixture.setUsername(username);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.networking.Configuration
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ConfigurationTest.class);
	}
}