package rtn.gui.model;

import rtn.networking.IAdminStrategy;
import rtn.networking.AdminStrategyFactory;
import rtn.networking.Policy;

public class ActionManager {

	private IAdminStrategy admin;

	private IAdminStrategy iAdminStrategy;

	private AdminStrategyFactory adminStrategyFactory;

	private boolean sendEmail(String recipetend, String message) {
		return false;
	}

	public boolean enableAlarm() {
		return false;
	}

	public boolean disableAlarm() {
		return false;
	}

	public boolean addPolicy(Policy policy) {
		return false;
	}

	public boolean updatePolicy(Policy policy) {
		return false;
	}

	public boolean deletePolicy(Policy policy) {
		return false;
	}

}
