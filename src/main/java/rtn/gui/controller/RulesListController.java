package rtn.gui.controller;

import rtn.IDataSource;

public class RulesListController {

	private IDataSource dataSource;
	
	private static RulesListController instance;

	public void initialize() {
    	instance = this;
    }
	
}
