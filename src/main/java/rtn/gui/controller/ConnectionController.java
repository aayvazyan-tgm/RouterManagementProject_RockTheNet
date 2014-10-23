package rtn.gui.controller;

/**
 * Controller Class for 'ConnectionWindow.fxml'
 */

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rtn.MainApp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConnectionController {
    private static final Logger logger = LoggerFactory.getLogger(ConnectionController.class);
	
	private String device;
	private String ip;
	private String user;
	private String pass;
	private String port;

    @FXML
    private Button connectButton;

    @FXML
    private TextField snmpTextField;

    @FXML
    private Text errorText;

    @FXML
    private TextField ipTextField;

    @FXML
    private Label descLabel;

    @FXML
    private ComboBox<?> deviceComboBox;

    @FXML
    private Label welcomeLabel;

    @FXML
    private TextField passTextField;

    @FXML
    private TextField userTextField;
    
	private static ConnectionController instance;
    
	/**
	 * Sets the instance
	 */
    public void initialize() {
    	instance = this;
    }
    
    /**
     * Handles the connect Button (connects to Device and closes connectionWindow)
     */
    @FXML
    private void handleConnectButton() {
    	errorText.setText("");
    	if(!checkFormEntries()){}
    	else {
    		readForm();
    		//TODO establish a connection to the device
    		//TODO load rules into table
    		MainApp.getConnectionStage().hide();
    		MainApp.getMainStage().show();
    	}
    	
    }

    /**
     * Reads the values from the form and stores them in the local variables
     */
	private void readForm() {
		device = (String) deviceComboBox.getValue();
		ip = ipTextField.getText();
		user = userTextField.getText();
		pass = passTextField.getText();
		port = snmpTextField.getText();
		
		user.replaceAll("\\s+","");
		pass.replaceAll("\\s+","");
		port.replaceAll("\\s+","");
		
		if(port==null || port.equals("")) {port="161";} //TODO set standard portnumber
	}

	/**
	 * Checks if the form has been filled out sufficiently
	 */
	private boolean checkFormEntries() {
		String device = (String) deviceComboBox.getValue();
		if(device==null || device==""){
			errorText.setText(errorText.getText()+"Please select a device!\n");
			return false;
		}
		
		String ip = ipTextField.getText();
		if(!validIP(ip)){
			errorText.setText(errorText.getText()+"Please enter a valid IPv4 address!\n");
			return false;
		}		
		
		return true;
	}
	
	/**
	 * Checks if a String is a valid IPv4 address
	 * 
	 * @param ip The IP to check
	 * @return true, if the given IP is valid, false otherwise
	 */
	public static boolean validIP(String ip) {
	    if (ip == null || ip.isEmpty()) return false;
	    ip = ip.trim();
	    if ((ip.length() < 6) & (ip.length() > 15)) return false;
	    
	    Pattern pattern = Pattern.compile("^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$");
	    Matcher matcher = pattern.matcher(ip);
	    return matcher.matches();
	}

}
