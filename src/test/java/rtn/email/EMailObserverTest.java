package rtn.email;

import org.junit.*;
import rtn.observer.Observable;
import static org.junit.Assert.*;

/**
 * The class <code>EMailObserverTest</code> contains tests for the class <code>{@link EMailObserver}</code>.
 *
 * @generatedBy CodePro at 10/19/14 10:28 PM
 * @author jakob
 * @version $Revision: 1.0 $
 */
public class EMailObserverTest {
	/**
	 * Run the EMailObserver() constructor test.
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testEMailObserver_1()
		throws Exception {
		EMailObserver result = new EMailObserver();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void notify(Observable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testNotify_1()
		throws Exception {
		EMailObserver fixture = new EMailObserver();
		Observable observable = null;

		fixture.notify(observable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at org.slf4j.impl.Log4jLoggerFactory.getLogger(Log4jLoggerFactory.java:66)
		//       at org.slf4j.LoggerFactory.getLogger(LoggerFactory.java:277)
		//       at org.slf4j.LoggerFactory.getLogger(LoggerFactory.java:288)
		//       at rtn.email.EMailObserver.<clinit>(EMailObserver.java:11)
	}

	/**
	 * Run the void notify(Observable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testNotify_2()
		throws Exception {
		EMailObserver fixture = new EMailObserver();
		Observable observable = null;

		fixture.notify(observable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.email.EMailObserver
	}

	/**
	 * Run the void notify(Observable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testNotify_3()
		throws Exception {
		EMailObserver fixture = new EMailObserver();
		Observable observable = null;

		fixture.notify(observable);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.email.EMailObserver
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
		new org.junit.runner.JUnitCore().run(EMailObserverTest.class);
	}
}