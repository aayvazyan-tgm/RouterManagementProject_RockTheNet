package rtn.gui.controller;

import rtn.IDataSource;

public class GraphController {

	private IDataSource dataSource;
	
	private static GraphController instance;

	public void initialize() {
    	instance = this;
    }
	
}
