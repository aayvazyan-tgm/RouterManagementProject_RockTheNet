package rtn.gui.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rtn.IDataSource;

public class GraphController {
    private static final Logger logger = LoggerFactory.getLogger(GraphController.class);

	private IDataSource dataSource;
	
	private static GraphController instance;

	public void initialize() {
    	instance = this;
    }
	
}
