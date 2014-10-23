package rtn.gui.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rtn.gui.view.StageLoader;

public class MaxItemController {
    private static final Logger logger = LoggerFactory.getLogger(MaxItemController.class);

	@FXML
	private Button confirm;

	@FXML
	private TextField textfield;

	@FXML
	private Text title;

	private static MaxItemController instance;

	/**
	 * Sets the instance
	 */
	public void initialize() {
    	instance = this;
    }
	
	/**
	 * Handles the confirm button, checks if a correct value has been entered
	 * (int, range:1-10)
	 */
	@FXML
	private void handleConfirm() {
		String text = textfield.getText();
		
		if(text!=null && !text.isEmpty()) {
			try {
				int max = Integer.parseInt(text);
				if(max>=1 && max<=10) {
					MainController.getInstance().setMaxItems(max);
					//TODO remove items over max number from graph list
					StageLoader.getMaxItemStage().hide();
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
	 * Gets the confirm.
	 *
	 * @return the confirm
	 */
	public Button getConfirm() {
		return confirm;
	}

	/**
	 * Sets the confirm.
	 *
	 * @param confirm the confirm to set
	 */
	public void setConfirm(Button confirm) {
		this.confirm = confirm;
	}

	/**
	 * Gets the textfield.
	 *
	 * @return the textfield
	 */
	public TextField getTextfield() {
		return textfield;
	}

	/**
	 * Sets the textfield.
	 *
	 * @param textfield the textfield to set
	 */
	public void setTextfield(TextField textfield) {
		this.textfield = textfield;
	}

	/**
	 * Gets the title.
	 *
	 * @return the title
	 */
	public Text getTitle() {
		return title;
	}

	/**
	 * Sets the title.
	 *
	 * @param title the title to set
	 */
	public void setTitle(Text title) {
		this.title = title;
	}

	/**
	 * Gets the single instance of MaxItemController.
	 *
	 * @return the instance
	 */
	public static MaxItemController getInstance() {
		return instance;
	}

	/**
	 * Sets the instance.
	 *
	 * @param instance the instance to set
	 */
	public static void setInstance(MaxItemController instance) {
		MaxItemController.instance = instance;
	}
	
}
