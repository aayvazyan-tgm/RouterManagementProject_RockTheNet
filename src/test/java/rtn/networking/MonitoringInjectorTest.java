package rtn.networking;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>MonitoringInjectorTest</code> contains tests for the class <code>{@link MonitoringInjector}</code>.
 *
 * @generatedBy CodePro at 10/19/14 10:27 PM
 * @author jakob
 * @version $Revision: 1.0 $
 */
public class MonitoringInjectorTest {
	/**
	 * Run the MonitoringInjector() constructor test.
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testMonitoringInjector_1()
		throws Exception {
		MonitoringInjector result = new MonitoringInjector();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void configure() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testConfigure_1()
		throws Exception {
		MonitoringInjector fixture = new MonitoringInjector();

		fixture.configure();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at org.slf4j.impl.Log4jLoggerFactory.getLogger(Log4jLoggerFactory.java:66)
		//       at org.slf4j.LoggerFactory.getLogger(LoggerFactory.java:277)
		//       at org.slf4j.LoggerFactory.getLogger(LoggerFactory.java:288)
		//       at rtn.networking.MonitoringInjector.<clinit>(MonitoringInjector.java:13)
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
		new org.junit.runner.JUnitCore().run(MonitoringInjectorTest.class);
	}
}