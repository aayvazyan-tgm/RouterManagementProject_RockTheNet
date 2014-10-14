package rtn.gui.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rtn.ICommandCentre;

public class AlertController {
    private static final Logger logger = LoggerFactory.getLogger(AlertController.class);

	private static AlertController instance;
	
	private ICommandCentre commandCentre;

	public void initialize() {
    	instance = this;
    }
}
