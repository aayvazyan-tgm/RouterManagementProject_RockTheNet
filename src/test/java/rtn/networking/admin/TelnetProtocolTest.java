package rtn.networking.admin;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>TelnetProtocolTest</code> contains tests for the class <code>{@link TelnetProtocol}</code>.
 *
 * @generatedBy CodePro at 10/19/14 10:27 PM
 * @author jakob
 * @version $Revision: 1.0 $
 */
public class TelnetProtocolTest {
	/**
	 * Run the TelnetProtocol() constructor test.
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testTelnetProtocol_1()
		throws Exception {
		TelnetProtocol result = new TelnetProtocol();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the boolean connect() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testConnect_1()
		throws Exception {
		TelnetProtocol fixture = new TelnetProtocol();

		boolean result = fixture.connect();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at org.slf4j.impl.Log4jLoggerFactory.getLogger(Log4jLoggerFactory.java:66)
		//       at org.slf4j.LoggerFactory.getLogger(LoggerFactory.java:277)
		//       at org.slf4j.LoggerFactory.getLogger(LoggerFactory.java:288)
		//       at rtn.networking.admin.TelnetProtocol.<clinit>(TelnetProtocol.java:14)
		assertTrue(result);
	}

	/**
	 * Run the boolean disconnect() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testDisconnect_1()
		throws Exception {
		TelnetProtocol fixture = new TelnetProtocol();

		boolean result = fixture.disconnect();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.networking.admin.TelnetProtocol
		assertTrue(result);
	}

	/**
	 * Run the String sendCommand(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testSendCommand_1()
		throws Exception {
		TelnetProtocol fixture = new TelnetProtocol();
		String command = "";

		String result = fixture.sendCommand(command);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.networking.admin.TelnetProtocol
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
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
	 * @generatedBy CodePro at 10/19/14 10:27 PM
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
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(TelnetProtocolTest.class);
	}
}