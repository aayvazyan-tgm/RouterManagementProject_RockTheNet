package rtn.networking.device.juniper_netscreen_5gt;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>PullPoliciesTest</code> contains tests for the class <code>{@link PullPolicies}</code>.
 *
 * @generatedBy CodePro at 10/19/14 10:27 PM
 * @author jakob
 * @version $Revision: 1.0 $
 */
public class PullPoliciesTest {
	/**
	 * Run the PullPolicies() constructor test.
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testPullPolicies_1()
		throws Exception {
		PullPolicies result = new PullPolicies();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void execute() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testExecute_1()
		throws Exception {
		PullPolicies fixture = new PullPolicies();

		fixture.execute();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.networking.device.juniper_netscreen_5gt.PullPolicies
	}

	/**
	 * Run the Object getResult() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testGetResult_1()
		throws Exception {
		PullPolicies fixture = new PullPolicies();

		Object result = fixture.getResult();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at org.slf4j.impl.Log4jLoggerFactory.getLogger(Log4jLoggerFactory.java:66)
		//       at org.slf4j.LoggerFactory.getLogger(LoggerFactory.java:277)
		//       at org.slf4j.LoggerFactory.getLogger(LoggerFactory.java:288)
		//       at rtn.networking.device.juniper_netscreen_5gt.PullPolicies.<clinit>(PullPolicies.java:8)
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
		new org.junit.runner.JUnitCore().run(PullPoliciesTest.class);
	}
}