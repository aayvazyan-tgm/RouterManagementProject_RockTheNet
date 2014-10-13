package rtn.gui.controller;

import rtn.MainApp;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class MaxItemController {

	@FXML
	private Button confirm;

	@FXML
	private TextField textfield;

	@FXML
	private Text title;

	private MaxItemController instance;

	public void initialize() {
    	instance = this;
    }
	
	private void handleConfirm() {
		String text = textfield.getText();
		
		if(text!=null && !text.isEmpty()) {
			try {
				int max = Integer.parseInt(text);
				if(max>=1 && max<=10) {
					//TODO remove items over max number from display list
					MainApp.getMaxItemStage().hide();
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
