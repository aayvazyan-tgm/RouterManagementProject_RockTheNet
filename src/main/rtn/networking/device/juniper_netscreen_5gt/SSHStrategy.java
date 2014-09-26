package rtn.networking.device.juniper_netscreen_5gt;

import rtn.networking.IAdminStrategy;
import rtn.networking.Policy;

public class SSHStrategy implements IAdminStrategy {


	/**
	 * @see rtn.networking.IAdminStrategy#enableTrap()
	 */
	public boolean enableTrap() {
		return false;
	}


	/**
	 * @see rtn.networking.IAdminStrategy#disableTrap()
	 */
	public boolean disableTrap() {
		return false;
	}


	/**
	 * @see rtn.networking.IAdminStrategy#addPolicy(rtn.networking.Policy)
	 */
	public boolean addPolicy(Policy policy) {
		return false;
	}


	/**
	 * @see rtn.networking.IAdminStrategy#updatePolicy(rtn.networking.Policy, rtn.networking.Policy)
	 */
	public boolean updatePolicy(Policy newPolicy, Policy oldPolicy) {
		return false;
	}


	/**
	 * @see rtn.networking.IAdminStrategy#deletePolicy(rtn.networking.Policy)
	 */
	public boolean deletePolicy(Policy policy) {
		return false;
	}

}
