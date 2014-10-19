package rtn;

import java.util.List;
import rtn.networking.Service;
import rtn.networking.Policy;
import rtn.networking.Zone;
import rtn.networking.Action;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>CommandCentreImplTest</code> contains tests for the class <code>{@link CommandCentreImpl}</code>.
 *
 * @generatedBy CodePro at 10/19/14 10:27 PM
 * @author jakob
 * @version $Revision: 1.0 $
 */
public class CommandCentreImplTest {
	/**
	 * Run the boolean addPolicy(Policy) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testAddPolicy_1()
		throws Exception {
		CommandCentreImpl fixture = new CommandCentreImpl();
		Policy policy = new Policy();

		boolean result = fixture.addPolicy(policy);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at org.slf4j.impl.Log4jLoggerFactory.getLogger(Log4jLoggerFactory.java:66)
		//       at org.slf4j.LoggerFactory.getLogger(LoggerFactory.java:277)
		//       at org.slf4j.LoggerFactory.getLogger(LoggerFactory.java:288)
		//       at rtn.networking.Policy.<clinit>(Policy.java:8)
		assertTrue(result);
	}

	/**
	 * Run the boolean deletePolicy(Policy) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testDeletePolicy_1()
		throws Exception {
		CommandCentreImpl fixture = new CommandCentreImpl();
		Policy policy = new Policy();

		boolean result = fixture.deletePolicy(policy);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.networking.Policy
		assertTrue(result);
	}

	/**
	 * Run the boolean disableAlarm() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testDisableAlarm_1()
		throws Exception {
		CommandCentreImpl fixture = new CommandCentreImpl();

		boolean result = fixture.disableAlarm();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean enableAlarm() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testEnableAlarm_1()
		throws Exception {
		CommandCentreImpl fixture = new CommandCentreImpl();

		boolean result = fixture.enableAlarm();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the List<Action> getActions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testGetActions_1()
		throws Exception {
		CommandCentreImpl fixture = new CommandCentreImpl();

		List<Action> result = fixture.getActions();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<Service> getServices() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testGetServices_1()
		throws Exception {
		CommandCentreImpl fixture = new CommandCentreImpl();

		List<Service> result = fixture.getServices();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<Zone> getZones() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testGetZones_1()
		throws Exception {
		CommandCentreImpl fixture = new CommandCentreImpl();

		List<Zone> result = fixture.getZones();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the boolean updatePolicy(Policy,Policy) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testUpdatePolicy_1()
		throws Exception {
		CommandCentreImpl fixture = new CommandCentreImpl();
		Policy newPolicy = new Policy();
		Policy oldPolicy = new Policy();

		boolean result = fixture.updatePolicy(newPolicy, oldPolicy);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.networking.Policy
		assertTrue(result);
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
		new org.junit.runner.JUnitCore().run(CommandCentreImplTest.class);
	}
}