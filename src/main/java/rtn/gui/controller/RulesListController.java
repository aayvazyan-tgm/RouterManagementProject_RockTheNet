package rtn.gui.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rtn.IDataSource;

public class RulesListController {
    private static final Logger logger = LoggerFactory.getLogger(RulesListController.class);

	private IDataSource dataSource;
	
	private static RulesListController instance;

	public void initialize() {
    	instance = this;
    }
	
}
