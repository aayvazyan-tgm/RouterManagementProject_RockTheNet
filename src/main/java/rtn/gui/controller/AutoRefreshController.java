package rtn.gui.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rtn.MainApp;

public class AutoRefreshController {
    private static final Logger logger = LoggerFactory.getLogger(AutoRefreshController.class);

	@FXML
	private Button confirm;

	@FXML
	private TextField textfield;

	@FXML
	private Text title;

	private static AutoRefreshController instance;

	public void initialize() {
    	instance = this;
    }
	
	private void handleConfirm() {
		String text = textfield.getText();
		
		if(text!=null && !text.isEmpty()) {
			try {
				int time = Integer.parseInt(text);
				if(time>=1 && time<=10) {
					//TODO start auto-refresh
					MainApp.getAutoRefreshStage().hide();
				}
				else {
					title.setText("Only numbers from 1-10");
				}
			}
			catch(NumberFormatException nfe) {
				title.setText("Only numbers from 1-10");
			}
			
		}
		else {
			title.setText("Only numbers from 1-10");
		}
		
	}
	
}
