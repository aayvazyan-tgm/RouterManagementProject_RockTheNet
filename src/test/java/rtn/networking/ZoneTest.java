package rtn.networking;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ZoneTest</code> contains tests for the class <code>{@link Zone}</code>.
 *
 * @generatedBy CodePro at 10/19/14 10:27 PM
 * @author jakob
 * @version $Revision: 1.0 $
 */
public class ZoneTest {
	/**
	 * Run the Zone(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testZone_1()
		throws Exception {
		String name = "";

		Zone result = new Zone(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at org.slf4j.impl.Log4jLoggerFactory.getLogger(Log4jLoggerFactory.java:66)
		//       at org.slf4j.LoggerFactory.getLogger(LoggerFactory.java:277)
		//       at org.slf4j.LoggerFactory.getLogger(LoggerFactory.java:288)
		//       at rtn.networking.Zone.<clinit>(Zone.java:8)
		assertNotNull(result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testGetName_1()
		throws Exception {
		Zone fixture = new Zone("");

		String result = fixture.getName();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.networking.Zone
		assertNotNull(result);
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testSetName_1()
		throws Exception {
		Zone fixture = new Zone("");
		String name = "";

		fixture.setName(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.networking.Zone
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
		new org.junit.runner.JUnitCore().run(ZoneTest.class);
	}
}