package rtn.gui.controller;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ConnectionControllerTest</code> contains tests for the class <code>{@link ConnectionController}</code>.
 *
 * @generatedBy CodePro at 10/19/14 10:27 PM
 * @author jakob
 * @version $Revision: 1.0 $
 */
public class ConnectionControllerTest {
	/**
	 * Run the ConnectionController() constructor test.
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testConnectionController_1()
		throws Exception {
		ConnectionController result = new ConnectionController();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void initialize() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testInitialize_1()
		throws Exception {
		ConnectionController fixture = new ConnectionController();

		fixture.initialize();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at org.slf4j.impl.Log4jLoggerFactory.getLogger(Log4jLoggerFactory.java:66)
		//       at org.slf4j.LoggerFactory.getLogger(LoggerFactory.java:277)
		//       at org.slf4j.LoggerFactory.getLogger(LoggerFactory.java:288)
		//       at rtn.gui.controller.ConnectionController.<clinit>(ConnectionController.java:21)
	}

	/**
	 * Run the boolean validIP(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testValidIP_1()
		throws Exception {
		String ip = null;

		boolean result = ConnectionController.validIP(ip);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.gui.controller.ConnectionController
		assertTrue(result);
	}

	/**
	 * Run the boolean validIP(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testValidIP_2()
		throws Exception {
		String ip = "";

		boolean result = ConnectionController.validIP(ip);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.gui.controller.ConnectionController
		assertTrue(result);
	}

	/**
	 * Run the boolean validIP(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testValidIP_3()
		throws Exception {
		String ip = "";

		boolean result = ConnectionController.validIP(ip);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.gui.controller.ConnectionController
		assertTrue(result);
	}

	/**
	 * Run the boolean validIP(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testValidIP_4()
		throws Exception {
		String ip = "";

		boolean result = ConnectionController.validIP(ip);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.gui.controller.ConnectionController
		assertTrue(result);
	}

	/**
	 * Run the boolean validIP(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testValidIP_5()
		throws Exception {
		String ip = "";

		boolean result = ConnectionController.validIP(ip);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.gui.controller.ConnectionController
		assertTrue(result);
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
		new org.junit.runner.JUnitCore().run(ConnectionControllerTest.class);
	}
}