package rtn.email;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>EMailFactoryTest</code> contains tests for the class <code>{@link EMailFactory}</code>.
 *
 * @generatedBy CodePro at 10/19/14 10:27 PM
 * @author jakob
 * @version $Revision: 1.0 $
 */
public class EMailFactoryTest {
	/**
	 * Run the EMailFactory() constructor test.
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testEMailFactory_1()
		throws Exception {
		EMailFactory result = new EMailFactory();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the EMail getMail() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testGetMail_1()
		throws Exception {

		EMail result = EMailFactory.getMail();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at org.slf4j.impl.Log4jLoggerFactory.getLogger(Log4jLoggerFactory.java:66)
		//       at org.slf4j.LoggerFactory.getLogger(LoggerFactory.java:277)
		//       at org.slf4j.LoggerFactory.getLogger(LoggerFactory.java:288)
		//       at rtn.email.EMailFactory.<clinit>(EMailFactory.java:9)
		assertNotNull(result);
	}

	/**
	 * Run the EMail getMail() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testGetMail_2()
		throws Exception {

		EMail result = EMailFactory.getMail();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.email.EMailFactory
		assertNotNull(result);
	}

	/**
	 * Run the void setPrototype(EMail) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testSetPrototype_1()
		throws Exception {
		EMail prototype = new EMail();

		EMailFactory.setPrototype(prototype);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.apache.log4j.LogManager
		//       at org.slf4j.impl.Log4jLoggerFactory.getLogger(Log4jLoggerFactory.java:66)
		//       at org.slf4j.LoggerFactory.getLogger(LoggerFactory.java:277)
		//       at org.slf4j.LoggerFactory.getLogger(LoggerFactory.java:288)
		//       at rtn.email.EMail.<clinit>(EMail.java:10)
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
		new org.junit.runner.JUnitCore().run(EMailFactoryTest.class);
	}
}