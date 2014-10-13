package rtn.gui.controller;

import rtn.gui.model.ActionManager;

public class AlertController {

	private static AlertController instance;
	
	private ActionManager actionManager;

	public void initialize() {
    	instance = this;
    }
}
