package rtn.gui.controller;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>AlertControllerTest</code> contains tests for the class <code>{@link AlertController}</code>.
 *
 * @generatedBy CodePro at 10/19/14 10:28 PM
 * @author jakob
 * @version $Revision: 1.0 $
 */
public class AlertControllerTest {
	/**
	 * Run the AlertController() constructor test.
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testAlertController_1()
		throws Exception {
		AlertController result = new AlertController();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void initialize() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testInitialize_1()
		throws Exception {
		AlertController fixture = new AlertController();

		fixture.initialize();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at org.slf4j.impl.Log4jLoggerFactory.getLogger(Log4jLoggerFactory.java:66)
		//       at org.slf4j.LoggerFactory.getLogger(LoggerFactory.java:277)
		//       at org.slf4j.LoggerFactory.getLogger(LoggerFactory.java:288)
		//       at rtn.gui.controller.AlertController.<clinit>(AlertController.java:8)
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
		new org.junit.runner.JUnitCore().run(AlertControllerTest.class);
	}
}