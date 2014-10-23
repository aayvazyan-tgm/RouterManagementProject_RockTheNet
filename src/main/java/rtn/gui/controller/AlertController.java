package rtn.gui.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rtn.ICommandCentre;

/**
 * Controller that handles the AlertWIndow
 * @author Fabian Freudensprung
 */
public class AlertController {
    private static final Logger logger = LoggerFactory.getLogger(AlertController.class);

	private static AlertController instance;
	
	private ICommandCentre commandCentre;

	/**
	 * Sets the instance
	 */
	public void initialize() {
    	instance = this;
    }
}
