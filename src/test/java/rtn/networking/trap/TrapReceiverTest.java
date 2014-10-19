package rtn.networking.trap;

import org.junit.*;
import static org.junit.Assert.*;
import org.snmp4j.CommandResponder;
import org.snmp4j.CommunityTarget;
import org.snmp4j.Snmp;
import org.snmp4j.TransportMapping;
import org.snmp4j.transport.DummyTransport;

/**
 * The class <code>TrapReceiverTest</code> contains tests for the class <code>{@link TrapReceiver}</code>.
 *
 * @generatedBy CodePro at 10/19/14 10:27 PM
 * @author jakob
 * @version $Revision: 1.0 $
 */
public class TrapReceiverTest {
	/**
	 * Run the TrapReceiver(CommandResponder,TransportMapping,CommunityTarget) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testTrapReceiver_1()
		throws Exception {
		CommandResponder commandResponder = new Snmp();
		TransportMapping transport = new DummyTransport();
		CommunityTarget target = new CommunityTarget();

		TrapReceiver result = new TrapReceiver(commandResponder, transport, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at org.slf4j.impl.Log4jLoggerFactory.getLogger(Log4jLoggerFactory.java:66)
		//       at org.slf4j.LoggerFactory.getLogger(LoggerFactory.java:277)
		//       at org.slf4j.LoggerFactory.getLogger(LoggerFactory.java:288)
		//       at rtn.networking.trap.TrapReceiver.<clinit>(TrapReceiver.java:17)
		assertNotNull(result);
	}

	/**
	 * Run the void listen() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testListen_1()
		throws Exception {
		TrapReceiver fixture = new TrapReceiver(new Snmp(), new DummyTransport(), new CommunityTarget());

		fixture.listen();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.networking.trap.TrapReceiver
	}

	/**
	 * Run the void listen() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testListen_2()
		throws Exception {
		TrapReceiver fixture = new TrapReceiver(new Snmp(), new DummyTransport(), new CommunityTarget());

		fixture.listen();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.networking.trap.TrapReceiver
	}

	/**
	 * Run the void listen() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testListen_3()
		throws Exception {
		TrapReceiver fixture = new TrapReceiver(new Snmp(), new DummyTransport(), new CommunityTarget());

		fixture.listen();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.networking.trap.TrapReceiver
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
		new org.junit.runner.JUnitCore().run(TrapReceiverTest.class);
	}
}