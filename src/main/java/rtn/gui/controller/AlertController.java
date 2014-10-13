package rtn.gui.controller;

import rtn.ICommandCentre;

public class AlertController {

	private static AlertController instance;
	
	private ICommandCentre commandCentre;

	public void initialize() {
    	instance = this;
    }
}
