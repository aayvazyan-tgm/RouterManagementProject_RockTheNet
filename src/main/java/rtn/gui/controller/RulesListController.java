package rtn.gui.controller;

import rtn.gui.model.DataManager;

public class RulesListController {

	private DataManager dataManager;
	
	private static RulesListController instance;

	public void initialize() {
    	instance = this;
    }
	
}
