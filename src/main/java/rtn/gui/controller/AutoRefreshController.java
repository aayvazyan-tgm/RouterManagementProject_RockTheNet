package rtn.gui.controller;

import rtn.MainApp;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class AutoRefreshController {

	@FXML
	private Button confirm;

	@FXML
	private TextField textfield;

	@FXML
	private Text title;

	private AutoRefreshController instance;

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
