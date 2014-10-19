package rtn.networking.device.juniper_netscreen_5gt;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * The class <code>TestAll</code> builds a suite that can be used to run all
 * of the tests within its package as well as within any subpackages of its
 * package.
 *
 * @generatedBy CodePro at 10/19/14 10:28 PM
 * @author jakob
 * @version $Revision: 1.0 $
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
	PullServicesTest.class,
	PullThroughputTest.class,
	PullActionsTest.class,
	PullZonesTest.class,
	PullPoliciesTest.class,
	DeletePolicyTest.class,
	AddPolicyTest.class,
	UpdatePolicyTest.class,
})
public class TestAll {

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	public static void main(String[] args) {
		JUnitCore.runClasses(new Class[] { TestAll.class });
	}
}
