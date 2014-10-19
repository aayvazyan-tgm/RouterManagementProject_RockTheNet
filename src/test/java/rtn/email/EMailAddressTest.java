package rtn.email;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>EMailAddressTest</code> contains tests for the class <code>{@link EMailAddress}</code>.
 *
 * @generatedBy CodePro at 10/19/14 10:27 PM
 * @author jakob
 * @version $Revision: 1.0 $
 */
public class EMailAddressTest {
	/**
	 * Run the EMailAddress(CharSequence) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testEMailAddress_1()
		throws Exception {
		CharSequence eMailAddress = new String();

		EMailAddress result = new EMailAddress(eMailAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at org.slf4j.impl.Log4jLoggerFactory.getLogger(Log4jLoggerFactory.java:66)
		//       at org.slf4j.LoggerFactory.getLogger(LoggerFactory.java:277)
		//       at org.slf4j.LoggerFactory.getLogger(LoggerFactory.java:288)
		//       at rtn.email.EMailAddress.<clinit>(EMailAddress.java:12)
		assertNotNull(result);
	}

	/**
	 * Run the EMailAddress(CharSequence) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testEMailAddress_2()
		throws Exception {
		CharSequence eMailAddress = new String();

		EMailAddress result = new EMailAddress(eMailAddress);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.email.EMailAddress
		assertNotNull(result);
	}

	/**
	 * Run the char charAt(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testCharAt_1()
		throws Exception {
		EMailAddress fixture = new EMailAddress(new String());
		fixture.eMailAddress = "aa";
		int index = 1;

		char result = fixture.charAt(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.email.EMailAddress
		assertEquals(' ', result);
	}

	/**
	 * Run the int length() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testLength_1()
		throws Exception {
		EMailAddress fixture = new EMailAddress(new String());
		fixture.eMailAddress = "";

		int result = fixture.length();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.email.EMailAddress
		assertEquals(0, result);
	}

	/**
	 * Run the CharSequence subSequence(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testSubSequence_1()
		throws Exception {
		EMailAddress fixture = new EMailAddress(new String());
		fixture.eMailAddress = "";
		int start = 1;
		int end = 1;

		CharSequence result = fixture.subSequence(start, end);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.email.EMailAddress
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
		new org.junit.runner.JUnitCore().run(EMailAddressTest.class);
	}
}