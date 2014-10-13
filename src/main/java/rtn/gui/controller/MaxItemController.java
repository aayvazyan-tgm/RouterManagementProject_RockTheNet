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

	private static MaxItemController instance;

	public void initialize() {
    	instance = this;
    }
	
	private void handleConfirm() {
		String text = textfield.getText();
		
		if(text!=null && !text.isEmpty()) {
			try {
				int max = Integer.parseInt(text);
				if(max>=1 && max<=10) {
					MainController.getInstance().setMaxItems(max);
					//TODO remove items over max number from graph list
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

	/**
	 * @return the confirm
	 */
	public Button getConfirm() {
		return confirm;
	}

	/**
	 * @param confirm the confirm to set
	 */
	public void setConfirm(Button confirm) {
		this.confirm = confirm;
	}

	/**
	 * @return the textfield
	 */
	public TextField getTextfield() {
		return textfield;
	}

	/**
	 * @param textfield the textfield to set
	 */
	public void setTextfield(TextField textfield) {
		this.textfield = textfield;
	}

	/**
	 * @return the title
	 */
	public Text getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(Text title) {
		this.title = title;
	}

	/**
	 * @return the instance
	 */
	public static MaxItemController getInstance() {
		return instance;
	}

	/**
	 * @param instance the instance to set
	 */
	public static void setInstance(MaxItemController instance) {
		MaxItemController.instance = instance;
	}
	
}
