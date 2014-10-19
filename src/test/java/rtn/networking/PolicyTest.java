package rtn.networking;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>PolicyTest</code> contains tests for the class <code>{@link Policy}</code>.
 *
 * @generatedBy CodePro at 10/19/14 10:27 PM
 * @author jakob
 * @version $Revision: 1.0 $
 */
public class PolicyTest {
	/**
	 * Run the Policy() constructor test.
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testPolicy_1()
		throws Exception {
		Policy result = new Policy();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the Action getAction() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testGetAction_1()
		throws Exception {
		Policy fixture = new Policy();
		fixture.setLog(true);
		fixture.setInzone(new Zone(""));
		fixture.setOutzone(new Zone(""));
		fixture.setAction(new Action(""));
		fixture.setId(new Long(1L));
		fixture.setService(new Service(""));
		fixture.setDestination("");
		fixture.setDisplayname("");
		fixture.setSource("");

		Action result = fixture.getAction();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.networking.Policy
		assertNotNull(result);
	}

	/**
	 * Run the String getDestination() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testGetDestination_1()
		throws Exception {
		Policy fixture = new Policy();
		fixture.setLog(true);
		fixture.setInzone(new Zone(""));
		fixture.setOutzone(new Zone(""));
		fixture.setAction(new Action(""));
		fixture.setId(new Long(1L));
		fixture.setService(new Service(""));
		fixture.setDestination("");
		fixture.setDisplayname("");
		fixture.setSource("");

		String result = fixture.getDestination();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.networking.Policy
		assertNotNull(result);
	}

	/**
	 * Run the String getDisplayname() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testGetDisplayname_1()
		throws Exception {
		Policy fixture = new Policy();
		fixture.setLog(true);
		fixture.setInzone(new Zone(""));
		fixture.setOutzone(new Zone(""));
		fixture.setAction(new Action(""));
		fixture.setId(new Long(1L));
		fixture.setService(new Service(""));
		fixture.setDestination("");
		fixture.setDisplayname("");
		fixture.setSource("");

		String result = fixture.getDisplayname();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.networking.Policy
		assertNotNull(result);
	}

	/**
	 * Run the Long getId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testGetId_1()
		throws Exception {
		Policy fixture = new Policy();
		fixture.setLog(true);
		fixture.setInzone(new Zone(""));
		fixture.setOutzone(new Zone(""));
		fixture.setAction(new Action(""));
		fixture.setId(new Long(1L));
		fixture.setService(new Service(""));
		fixture.setDestination("");
		fixture.setDisplayname("");
		fixture.setSource("");

		Long result = fixture.getId();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at org.slf4j.impl.Log4jLoggerFactory.getLogger(Log4jLoggerFactory.java:66)
		//       at org.slf4j.LoggerFactory.getLogger(LoggerFactory.java:277)
		//       at org.slf4j.LoggerFactory.getLogger(LoggerFactory.java:288)
		//       at rtn.networking.Policy.<clinit>(Policy.java:8)
		assertNotNull(result);
	}

	/**
	 * Run the Zone getInzone() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testGetInzone_1()
		throws Exception {
		Policy fixture = new Policy();
		fixture.setLog(true);
		fixture.setInzone(new Zone(""));
		fixture.setOutzone(new Zone(""));
		fixture.setAction(new Action(""));
		fixture.setId(new Long(1L));
		fixture.setService(new Service(""));
		fixture.setDestination("");
		fixture.setDisplayname("");
		fixture.setSource("");

		Zone result = fixture.getInzone();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.networking.Policy
		assertNotNull(result);
	}

	/**
	 * Run the Zone getOutzone() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testGetOutzone_1()
		throws Exception {
		Policy fixture = new Policy();
		fixture.setLog(true);
		fixture.setInzone(new Zone(""));
		fixture.setOutzone(new Zone(""));
		fixture.setAction(new Action(""));
		fixture.setId(new Long(1L));
		fixture.setService(new Service(""));
		fixture.setDestination("");
		fixture.setDisplayname("");
		fixture.setSource("");

		Zone result = fixture.getOutzone();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.networking.Policy
		assertNotNull(result);
	}

	/**
	 * Run the Service getService() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testGetService_1()
		throws Exception {
		Policy fixture = new Policy();
		fixture.setLog(true);
		fixture.setInzone(new Zone(""));
		fixture.setOutzone(new Zone(""));
		fixture.setAction(new Action(""));
		fixture.setId(new Long(1L));
		fixture.setService(new Service(""));
		fixture.setDestination("");
		fixture.setDisplayname("");
		fixture.setSource("");

		Service result = fixture.getService();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.networking.Policy
		assertNotNull(result);
	}

	/**
	 * Run the String getSource() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testGetSource_1()
		throws Exception {
		Policy fixture = new Policy();
		fixture.setLog(true);
		fixture.setInzone(new Zone(""));
		fixture.setOutzone(new Zone(""));
		fixture.setAction(new Action(""));
		fixture.setId(new Long(1L));
		fixture.setService(new Service(""));
		fixture.setDestination("");
		fixture.setDisplayname("");
		fixture.setSource("");

		String result = fixture.getSource();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.networking.Policy
		assertNotNull(result);
	}

	/**
	 * Run the boolean isLog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testIsLog_1()
		throws Exception {
		Policy fixture = new Policy();
		fixture.setLog(true);
		fixture.setInzone(new Zone(""));
		fixture.setOutzone(new Zone(""));
		fixture.setAction(new Action(""));
		fixture.setId(new Long(1L));
		fixture.setService(new Service(""));
		fixture.setDestination("");
		fixture.setDisplayname("");
		fixture.setSource("");

		boolean result = fixture.isLog();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.networking.Policy
		assertTrue(result);
	}

	/**
	 * Run the boolean isLog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testIsLog_2()
		throws Exception {
		Policy fixture = new Policy();
		fixture.setLog(false);
		fixture.setInzone(new Zone(""));
		fixture.setOutzone(new Zone(""));
		fixture.setAction(new Action(""));
		fixture.setId(new Long(1L));
		fixture.setService(new Service(""));
		fixture.setDestination("");
		fixture.setDisplayname("");
		fixture.setSource("");

		boolean result = fixture.isLog();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.networking.Policy
		assertTrue(result);
	}

	/**
	 * Run the void setAction(Action) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testSetAction_1()
		throws Exception {
		Policy fixture = new Policy();
		fixture.setLog(true);
		fixture.setInzone(new Zone(""));
		fixture.setOutzone(new Zone(""));
		fixture.setAction(new Action(""));
		fixture.setId(new Long(1L));
		fixture.setService(new Service(""));
		fixture.setDestination("");
		fixture.setDisplayname("");
		fixture.setSource("");
		Action action = new Action("");

		fixture.setAction(action);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.networking.Policy
	}

	/**
	 * Run the void setDestination(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testSetDestination_1()
		throws Exception {
		Policy fixture = new Policy();
		fixture.setLog(true);
		fixture.setInzone(new Zone(""));
		fixture.setOutzone(new Zone(""));
		fixture.setAction(new Action(""));
		fixture.setId(new Long(1L));
		fixture.setService(new Service(""));
		fixture.setDestination("");
		fixture.setDisplayname("");
		fixture.setSource("");
		String destination = "";

		fixture.setDestination(destination);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.networking.Policy
	}

	/**
	 * Run the void setDisplayname(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testSetDisplayname_1()
		throws Exception {
		Policy fixture = new Policy();
		fixture.setLog(true);
		fixture.setInzone(new Zone(""));
		fixture.setOutzone(new Zone(""));
		fixture.setAction(new Action(""));
		fixture.setId(new Long(1L));
		fixture.setService(new Service(""));
		fixture.setDestination("");
		fixture.setDisplayname("");
		fixture.setSource("");
		String displayname = "";

		fixture.setDisplayname(displayname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.networking.Policy
	}

	/**
	 * Run the void setId(Long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testSetId_1()
		throws Exception {
		Policy fixture = new Policy();
		fixture.setLog(true);
		fixture.setInzone(new Zone(""));
		fixture.setOutzone(new Zone(""));
		fixture.setAction(new Action(""));
		fixture.setId(new Long(1L));
		fixture.setService(new Service(""));
		fixture.setDestination("");
		fixture.setDisplayname("");
		fixture.setSource("");
		Long id = new Long(1L);

		fixture.setId(id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.networking.Policy
	}

	/**
	 * Run the void setInzone(Zone) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testSetInzone_1()
		throws Exception {
		Policy fixture = new Policy();
		fixture.setLog(true);
		fixture.setInzone(new Zone(""));
		fixture.setOutzone(new Zone(""));
		fixture.setAction(new Action(""));
		fixture.setId(new Long(1L));
		fixture.setService(new Service(""));
		fixture.setDestination("");
		fixture.setDisplayname("");
		fixture.setSource("");
		Zone inzone = new Zone("");

		fixture.setInzone(inzone);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.networking.Policy
	}

	/**
	 * Run the void setLog(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testSetLog_1()
		throws Exception {
		Policy fixture = new Policy();
		fixture.setLog(true);
		fixture.setInzone(new Zone(""));
		fixture.setOutzone(new Zone(""));
		fixture.setAction(new Action(""));
		fixture.setId(new Long(1L));
		fixture.setService(new Service(""));
		fixture.setDestination("");
		fixture.setDisplayname("");
		fixture.setSource("");
		boolean log = true;

		fixture.setLog(log);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.networking.Policy
	}

	/**
	 * Run the void setOutzone(Zone) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testSetOutzone_1()
		throws Exception {
		Policy fixture = new Policy();
		fixture.setLog(true);
		fixture.setInzone(new Zone(""));
		fixture.setOutzone(new Zone(""));
		fixture.setAction(new Action(""));
		fixture.setId(new Long(1L));
		fixture.setService(new Service(""));
		fixture.setDestination("");
		fixture.setDisplayname("");
		fixture.setSource("");
		Zone outzone = new Zone("");

		fixture.setOutzone(outzone);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.networking.Policy
	}

	/**
	 * Run the void setService(Service) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testSetService_1()
		throws Exception {
		Policy fixture = new Policy();
		fixture.setLog(true);
		fixture.setInzone(new Zone(""));
		fixture.setOutzone(new Zone(""));
		fixture.setAction(new Action(""));
		fixture.setId(new Long(1L));
		fixture.setService(new Service(""));
		fixture.setDestination("");
		fixture.setDisplayname("");
		fixture.setSource("");
		Service service = new Service("");

		fixture.setService(service);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.networking.Policy
	}

	/**
	 * Run the void setSource(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testSetSource_1()
		throws Exception {
		Policy fixture = new Policy();
		fixture.setLog(true);
		fixture.setInzone(new Zone(""));
		fixture.setOutzone(new Zone(""));
		fixture.setAction(new Action(""));
		fixture.setId(new Long(1L));
		fixture.setService(new Service(""));
		fixture.setDestination("");
		fixture.setDisplayname("");
		fixture.setSource("");
		String source = "";

		fixture.setSource(source);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.networking.Policy
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
		new org.junit.runner.JUnitCore().run(PolicyTest.class);
	}
}