package rtn.gui.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rtn.gui.view.StageLoader;

public class AutoRefreshController {
    private static final Logger logger = LoggerFactory.getLogger(AutoRefreshController.class);

	@FXML
	private Button confirm;

	@FXML
	private TextField textfield;

	@FXML
	private Text title;

	private static AutoRefreshController instance;

	/**
	 * Sets the instance
	 */
	public void initialize() {
    	instance = this;
    }
	
	/**
	 * Handles the confirm button and checks if a correct value has been entered 
	 * (int, range: 0-10) <s>
	 * 
	 * no auto-refresh, if 0 was entered
	 */
    @FXML
	private void handleConfirm() {
		String text = textfield.getText();

		//Checks if the textfield is empty
		if(text!=null && !text.isEmpty()) {
			try {
				int time = Integer.parseInt(text);
				if(time>=0 && time<=10) {
                    if(time==0) {
                        MainController.getInstance().stopAutoRefresh();
                    }
					else {
                        MainController.getInstance().startAutoRefresh(time);
                    }
					StageLoader.getAutoRefreshStage().hide();
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
