package rtn.networking;

import org.junit.*;
import rtn.networking.device.commands.IDevCommand;
import static org.junit.Assert.*;

/**
 * The class <code>CommandProxyTest</code> contains tests for the class <code>{@link CommandProxy}</code>.
 *
 * @generatedBy CodePro at 10/19/14 10:28 PM
 * @author jakob
 * @version $Revision: 1.0 $
 */
public class CommandProxyTest {
	/**
	 * Run the IDevCommand getCommand(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testGetCommand_1()
		throws Exception {
		String command = null;
		String device = "";

		IDevCommand result = CommandProxy.getCommand(command, device);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at org.slf4j.impl.Log4jLoggerFactory.getLogger(Log4jLoggerFactory.java:66)
		//       at org.slf4j.LoggerFactory.getLogger(LoggerFactory.java:277)
		//       at org.slf4j.LoggerFactory.getLogger(LoggerFactory.java:288)
		//       at rtn.networking.CommandProxy.<clinit>(CommandProxy.java:15)
		assertNotNull(result);
	}

	/**
	 * Run the IDevCommand getCommand(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testGetCommand_2()
		throws Exception {
		String command = "";
		String device = "";

		IDevCommand result = CommandProxy.getCommand(command, device);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.networking.CommandProxy
		assertNotNull(result);
	}

	/**
	 * Run the IDevCommand getCommand(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testGetCommand_3()
		throws Exception {
		String command = "";
		String device = null;

		IDevCommand result = CommandProxy.getCommand(command, device);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.networking.CommandProxy
		assertNotNull(result);
	}

	/**
	 * Run the IDevCommand getCommand(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testGetCommand_4()
		throws Exception {
		String command = "";
		String device = "";

		IDevCommand result = CommandProxy.getCommand(command, device);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.networking.CommandProxy
		assertNotNull(result);
	}

	/**
	 * Run the IDevCommand getCommand(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testGetCommand_5()
		throws Exception {
		String command = "";
		String device = "";

		IDevCommand result = CommandProxy.getCommand(command, device);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.networking.CommandProxy
		assertNotNull(result);
	}

	/**
	 * Run the IDevCommand getCommand(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testGetCommand_6()
		throws Exception {
		String command = "";
		String device = "";

		IDevCommand result = CommandProxy.getCommand(command, device);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.networking.CommandProxy
		assertNotNull(result);
	}

	/**
	 * Run the IDevCommand getCommand(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testGetCommand_7()
		throws Exception {
		String command = "";
		String device = "";

		IDevCommand result = CommandProxy.getCommand(command, device);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.networking.CommandProxy
		assertNotNull(result);
	}

	/**
	 * Run the IDevCommand getCommand(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testGetCommand_8()
		throws Exception {
		String command = "";
		String device = "";

		IDevCommand result = CommandProxy.getCommand(command, device);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.networking.CommandProxy
		assertNotNull(result);
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
		new org.junit.runner.JUnitCore().run(CommandProxyTest.class);
	}
}