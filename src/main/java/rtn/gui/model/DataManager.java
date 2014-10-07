package rtn.gui.model;

import java.util.List;
import java.util.Map;

import rtn.networking.DataLoad;
import rtn.networking.Policy;

public class DataManager {
	private Map<Policy, Integer> lastchecks;
    private Map<Policy, int> lastloads;
	
	public List getPolicies() {
		return null;
	}

	public DataLoad getThroughput(Policy policy) {
		return null;
	}
}