package rtn.gui.controller;

import rtn.gui.model.DataManager;

public class GraphController {

	private DataManager dataManager;
	
	private static GraphController instance;

	public void initialize() {
    	instance = this;
    }
	
}
