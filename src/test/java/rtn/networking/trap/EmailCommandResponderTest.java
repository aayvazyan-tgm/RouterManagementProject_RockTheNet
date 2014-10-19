package rtn.networking.trap;

import org.junit.*;
import static org.junit.Assert.*;
import org.snmp4j.CommandResponderEvent;
import org.snmp4j.MessageDispatcher;
import org.snmp4j.MessageDispatcherImpl;
import org.snmp4j.PDU;
import org.snmp4j.TransportMapping;
import org.snmp4j.mp.PduHandle;
import org.snmp4j.mp.StateReference;
import org.snmp4j.smi.Address;
import org.snmp4j.smi.GenericAddress;
import org.snmp4j.transport.DummyTransport;

/**
 * The class <code>EmailCommandResponderTest</code> contains tests for the class <code>{@link EmailCommandResponder}</code>.
 *
 * @generatedBy CodePro at 10/19/14 10:27 PM
 * @author jakob
 * @version $Revision: 1.0 $
 */
public class EmailCommandResponderTest {
	/**
	 * Run the EmailCommandResponder() constructor test.
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testEmailCommandResponder_1()
		throws Exception {
		EmailCommandResponder result = new EmailCommandResponder();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void processPdu(CommandResponderEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testProcessPdu_1()
		throws Exception {
		EmailCommandResponder fixture = new EmailCommandResponder();
		CommandResponderEvent event = new CommandResponderEvent(new MessageDispatcherImpl(), new DummyTransport(), new GenericAddress(), 1, 1, new byte[] {}, 1, new PduHandle(), new PDU(), 1, new StateReference());

		fixture.processPdu(event);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at org.slf4j.impl.Log4jLoggerFactory.getLogger(Log4jLoggerFactory.java:66)
		//       at org.slf4j.LoggerFactory.getLogger(LoggerFactory.java:277)
		//       at org.slf4j.LoggerFactory.getLogger(LoggerFactory.java:288)
		//       at rtn.networking.trap.EmailCommandResponder.<clinit>(EmailCommandResponder.java:20)
	}

	/**
	 * Run the void processPdu(CommandResponderEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testProcessPdu_2()
		throws Exception {
		EmailCommandResponder fixture = new EmailCommandResponder();
		CommandResponderEvent event = new CommandResponderEvent(new MessageDispatcherImpl(), new DummyTransport(), new GenericAddress(), 1, 1, new byte[] {}, 1, new PduHandle(), new PDU(), 1, new StateReference());

		fixture.processPdu(event);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.networking.trap.EmailCommandResponder
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
		new org.junit.runner.JUnitCore().run(EmailCommandResponderTest.class);
	}
}