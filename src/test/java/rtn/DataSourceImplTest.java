package rtn;

import java.util.List;
import rtn.networking.Policy;
import rtn.networking.DataLoad;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DataSourceImplTest</code> contains tests for the class <code>{@link DataSourceImpl}</code>.
 *
 * @generatedBy CodePro at 10/19/14 10:28 PM
 * @author jakob
 * @version $Revision: 1.0 $
 */
public class DataSourceImplTest {
	/**
	 * Run the List<Policy> getPolicies() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testGetPolicies_1()
		throws Exception {
		DataSourceImpl fixture = new DataSourceImpl();

		List<Policy> result = fixture.getPolicies();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the DataLoad getThroughput(Policy) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testGetThroughput_1()
		throws Exception {
		DataSourceImpl fixture = new DataSourceImpl();
		Policy policy = new Policy();

		DataLoad result = fixture.getThroughput(policy);

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
		new org.junit.runner.JUnitCore().run(DataSourceImplTest.class);
	}
}