package rtn.email;

import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>EMailTest</code> contains tests for the class <code>{@link EMail}</code>.
 *
 * @generatedBy CodePro at 10/19/14 10:27 PM
 * @author jakob
 * @version $Revision: 1.0 $
 */
public class EMailTest {
	/**
	 * Run the EMail() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testEMail_1()
		throws Exception {

		EMail result = new EMail();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at org.slf4j.impl.Log4jLoggerFactory.getLogger(Log4jLoggerFactory.java:66)
		//       at org.slf4j.LoggerFactory.getLogger(LoggerFactory.java:277)
		//       at org.slf4j.LoggerFactory.getLogger(LoggerFactory.java:288)
		//       at rtn.email.EMail.<clinit>(EMail.java:10)
		assertNotNull(result);
	}

	/**
	 * Run the void addRecipient(EMailAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testAddRecipient_1()
		throws Exception {
		EMail fixture = new EMail();
		fixture.setSmtpPort(1);
		fixture.setSender(new EMailAddress(new String()));
		fixture.setSubject("");
		fixture.setHostName("");
		fixture.setMessage("");
		fixture.addRecipient(new EMailAddress(new String()));
		EMailAddress recipient = new EMailAddress(new String());

		fixture.addRecipient(recipient);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.email.EMail
	}

	/**
	 * Run the EMail cloneMail() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testCloneMail_1()
		throws Exception {
		EMail fixture = new EMail();
		fixture.setSmtpPort(1);
		fixture.setSender(new EMailAddress(new String()));
		fixture.setSubject("");
		fixture.setHostName("");
		fixture.setMessage("");
		fixture.addRecipient(new EMailAddress(new String()));

		EMail result = fixture.cloneMail();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.email.EMail
		assertNotNull(result);
	}

	/**
	 * Run the EMail cloneMail() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testCloneMail_2()
		throws Exception {
		EMail fixture = new EMail();
		fixture.setSmtpPort(1);
		fixture.setSender(new EMailAddress(new String()));
		fixture.setSubject("");
		fixture.setHostName("");
		fixture.setMessage("");
		fixture.addRecipient(new EMailAddress(new String()));

		EMail result = fixture.cloneMail();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.email.EMail
		assertNotNull(result);
	}

	/**
	 * Run the String getHostName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testGetHostName_1()
		throws Exception {
		EMail fixture = new EMail();
		fixture.setSmtpPort(1);
		fixture.setSender(new EMailAddress(new String()));
		fixture.setSubject("");
		fixture.setHostName("");
		fixture.setMessage("");
		fixture.addRecipient(new EMailAddress(new String()));

		String result = fixture.getHostName();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.email.EMail
		assertNotNull(result);
	}

	/**
	 * Run the String getMessage() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testGetMessage_1()
		throws Exception {
		EMail fixture = new EMail();
		fixture.setSmtpPort(1);
		fixture.setSender(new EMailAddress(new String()));
		fixture.setSubject("");
		fixture.setHostName("");
		fixture.setMessage("");
		fixture.addRecipient(new EMailAddress(new String()));

		String result = fixture.getMessage();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.email.EMail
		assertNotNull(result);
	}

	/**
	 * Run the List<EMailAddress> getRecipients() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testGetRecipients_1()
		throws Exception {
		EMail fixture = new EMail();
		fixture.setSmtpPort(1);
		fixture.setSender(new EMailAddress(new String()));
		fixture.setSubject("");
		fixture.setHostName("");
		fixture.setMessage("");
		fixture.addRecipient(new EMailAddress(new String()));

		List<EMailAddress> result = fixture.getRecipients();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.email.EMail
		assertNotNull(result);
	}

	/**
	 * Run the EMailAddress getSender() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testGetSender_1()
		throws Exception {
		EMail fixture = new EMail();
		fixture.setSmtpPort(1);
		fixture.setSender(new EMailAddress(new String()));
		fixture.setSubject("");
		fixture.setHostName("");
		fixture.setMessage("");
		fixture.addRecipient(new EMailAddress(new String()));

		EMailAddress result = fixture.getSender();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.email.EMail
		assertNotNull(result);
	}

	/**
	 * Run the int getSmtpPort() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testGetSmtpPort_1()
		throws Exception {
		EMail fixture = new EMail();
		fixture.setSmtpPort(1);
		fixture.setSender(new EMailAddress(new String()));
		fixture.setSubject("");
		fixture.setHostName("");
		fixture.setMessage("");
		fixture.addRecipient(new EMailAddress(new String()));

		int result = fixture.getSmtpPort();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.email.EMail
		assertEquals(0, result);
	}

	/**
	 * Run the String getSubject() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testGetSubject_1()
		throws Exception {
		EMail fixture = new EMail();
		fixture.setSmtpPort(1);
		fixture.setSender(new EMailAddress(new String()));
		fixture.setSubject("");
		fixture.setHostName("");
		fixture.setMessage("");
		fixture.addRecipient(new EMailAddress(new String()));

		String result = fixture.getSubject();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.email.EMail
		assertNotNull(result);
	}

	/**
	 * Run the void setHostName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testSetHostName_1()
		throws Exception {
		EMail fixture = new EMail();
		fixture.setSmtpPort(1);
		fixture.setSender(new EMailAddress(new String()));
		fixture.setSubject("");
		fixture.setHostName("");
		fixture.setMessage("");
		fixture.addRecipient(new EMailAddress(new String()));
		String hostName = "";

		fixture.setHostName(hostName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.email.EMail
	}

	/**
	 * Run the void setMessage(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testSetMessage_1()
		throws Exception {
		EMail fixture = new EMail();
		fixture.setSmtpPort(1);
		fixture.setSender(new EMailAddress(new String()));
		fixture.setSubject("");
		fixture.setHostName("");
		fixture.setMessage("");
		fixture.addRecipient(new EMailAddress(new String()));
		String message = "";

		fixture.setMessage(message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.email.EMail
	}

	/**
	 * Run the void setSender(EMailAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testSetSender_1()
		throws Exception {
		EMail fixture = new EMail();
		fixture.setSmtpPort(1);
		fixture.setSender(new EMailAddress(new String()));
		fixture.setSubject("");
		fixture.setHostName("");
		fixture.setMessage("");
		fixture.addRecipient(new EMailAddress(new String()));
		EMailAddress sender = new EMailAddress(new String());

		fixture.setSender(sender);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.email.EMail
	}

	/**
	 * Run the void setSmtpPort(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testSetSmtpPort_1()
		throws Exception {
		EMail fixture = new EMail();
		fixture.setSmtpPort(1);
		fixture.setSender(new EMailAddress(new String()));
		fixture.setSubject("");
		fixture.setHostName("");
		fixture.setMessage("");
		fixture.addRecipient(new EMailAddress(new String()));
		int smtpPort = 1;

		fixture.setSmtpPort(smtpPort);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.email.EMail
	}

	/**
	 * Run the void setSubject(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testSetSubject_1()
		throws Exception {
		EMail fixture = new EMail();
		fixture.setSmtpPort(1);
		fixture.setSender(new EMailAddress(new String()));
		fixture.setSubject("");
		fixture.setHostName("");
		fixture.setMessage("");
		fixture.addRecipient(new EMailAddress(new String()));
		String subject = "";

		fixture.setSubject(subject);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.email.EMail
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
		new org.junit.runner.JUnitCore().run(EMailTest.class);
	}
}