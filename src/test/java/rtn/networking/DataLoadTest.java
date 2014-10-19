package rtn.networking;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DataLoadTest</code> contains tests for the class <code>{@link DataLoad}</code>.
 *
 * @generatedBy CodePro at 10/19/14 10:28 PM
 * @author jakob
 * @version $Revision: 1.0 $
 */
public class DataLoadTest {
	/**
	 * Run the DataLoad() constructor test.
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testDataLoad_1()
		throws Exception {
		DataLoad result = new DataLoad();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the int getDownload() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testGetDownload_1()
		throws Exception {
		DataLoad fixture = new DataLoad();
		fixture.setDownload(1);
		fixture.setUpload(1);

		int result = fixture.getDownload();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.networking.DataLoad
		assertEquals(0, result);
	}

	/**
	 * Run the int getUpload() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testGetUpload_1()
		throws Exception {
		DataLoad fixture = new DataLoad();
		fixture.setDownload(1);
		fixture.setUpload(1);

		int result = fixture.getUpload();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at org.slf4j.impl.Log4jLoggerFactory.getLogger(Log4jLoggerFactory.java:66)
		//       at org.slf4j.LoggerFactory.getLogger(LoggerFactory.java:277)
		//       at org.slf4j.LoggerFactory.getLogger(LoggerFactory.java:288)
		//       at rtn.networking.DataLoad.<clinit>(DataLoad.java:8)
		assertEquals(0, result);
	}

	/**
	 * Run the void setDownload(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testSetDownload_1()
		throws Exception {
		DataLoad fixture = new DataLoad();
		fixture.setDownload(1);
		fixture.setUpload(1);
		int download = 1;

		fixture.setDownload(download);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.networking.DataLoad
	}

	/**
	 * Run the void setUpload(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testSetUpload_1()
		throws Exception {
		DataLoad fixture = new DataLoad();
		fixture.setDownload(1);
		fixture.setUpload(1);
		int upload = 1;

		fixture.setUpload(upload);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.networking.DataLoad
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
		new org.junit.runner.JUnitCore().run(DataLoadTest.class);
	}
}