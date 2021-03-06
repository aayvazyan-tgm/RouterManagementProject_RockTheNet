package rtn.gui.controller;

/**
 * Controller Class for 'ConnectionWindow.fxml'
 */

import javafx.collections.ObservableList;
import javafx.collections.transformation.SortedList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.controlsfx.dialog.Dialogs;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rtn.email.EMail;
import rtn.gui.view.StageLoader;
import rtn.networking.Configuration;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConnectionController {
    private static final Logger logger = LoggerFactory.getLogger(ConnectionController.class);
	
	private String device;
	private String ip;
    private String com;
	private String user;
	private String pass;
	private String snmp;
    private String trap;
    private String admin;
    private String mail;

    @FXML
    private TextField trap_tf;

    @FXML
    private Button connect_b;

    @FXML
    private TextField snmp_tf;

    @FXML
    private TextField ip_tf;

    @FXML
    private Label desc_l;

    @FXML
    private ComboBox<String> device_cb;

    @FXML
    private Label welcome_l;

    @FXML
    private TextField pass_tf;

    @FXML
    private TextField user_tf;

    @FXML
    private TextField mail_tf;

    @FXML
    private TextField com_tf;

    @FXML
    private TextField admin_tf;

    String error = "";


    private static ConnectionController instance;
    
	/**
	 * Sets the instance
	 */
    public void initialize() {
        device_cb.getItems().add("juniper_netscreen_5gt");
        instance = this;
    }
    
    /**
     * Handles the connect Button (connects to Device and closes connectionWindow)
     */
    @FXML
    private void handleConnectButton() {
        readForm();
        error="";
        MainController.getInstance().getAddRuleMenu().setDisable(true);
        MainController.getInstance().getEdit_b().setDisable(true);
        MainController.getInstance().getDelete_b().setDisable(true);
    	if(!checkFormEntries()){Dialogs.create().owner(StageLoader.getConnectionStage().getScene().getWindow()).title("Rock the Net - Error").masthead("An Error occured").message(error).showError();}
    	else {
            //Required
            Configuration.getInstance().setDevice(device);
            Configuration.getInstance().setRemoteip(ip);
            EMail email = new EMail();
            email.setSubject(mail);
            Configuration.getInstance().setReferenceEMail(email);
            Configuration.getInstance().setCommunity(com);

            //For Admin Access
            try {
                Configuration.getInstance().setUsername(user);
                Configuration.getInstance().setPassword(pass);
                Configuration.getInstance().setAdminport(Integer.parseInt(admin));

                MainController.getInstance().getAddRuleMenu().setDisable(false);
                MainController.getInstance().getEdit_b().setDisable(false);
                MainController.getInstance().getDelete_b().setDisable(false);
            } catch(NumberFormatException e) {
                Configuration.getInstance().setUsername(null);
                Configuration.getInstance().setPassword(null);
            }

            //Changeable Ports
            try {
                Configuration.getInstance().setSnmpport(Integer.parseInt(snmp));
            } catch(NumberFormatException e) {}
            try {
                Configuration.getInstance().setTrapListeningPort(Integer.parseInt(trap));
            } catch(NumberFormatException e) {}


            //GUI-Stuff
            StageLoader.getConnectionStage().hide();
            MainController.getInstance().refreshTable();
        }
    	
    }

    /**
     * Reads the values from the form and stores them in the local variables
     */
	private void readForm() {
		device = (String) device_cb.getValue();
		ip = ip_tf.getText();
        com = com_tf.getText();
		user = user_tf.getText();
		pass = pass_tf.getText();
		snmp = snmp_tf.getText();
        trap = trap_tf.getText();
        admin = admin_tf.getText();
        mail = mail_tf.getText();

        ip=ip.replaceAll("\\s+", "");
        com= com.replaceAll("\\s+", "");
		user=user.replaceAll("\\s+","");
		pass=pass.replaceAll("\\s+","");
		snmp=snmp.replaceAll("\\s+", "");
        trap=trap.replaceAll("\\s+", "");
        admin=admin.replaceAll("\\s+", "");
        mail=mail.replaceAll("\\s+", "");

		
		if(snmp==null || snmp.equals("")) {snmp="161";}
        if(trap==null || trap.equals("")) {trap="13037";}
	}

	/**
	 * Checks if the form has been filled out sufficiently
	 */
	private boolean checkFormEntries() {
  		if(device==null || device.equals("")){
			error+="Please select a device!\n";
		}

		if(!validIP(ip)){
            error+="Please enter a valid ip-address!\n";
		}

        if(com==null || com.equals("")) {
           error+="Please enter a community!\n";
        }

        if (!validMail(mail)) {
            error+="Please enter a valid email-address!\n";
        }

        if(error!="") {return false;}

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

    public static boolean validMail(String email) {
        boolean result = true;
        try {
            InternetAddress emailAddr = new InternetAddress(email);
            emailAddr.validate();
        } catch (AddressException ex) {
            result = false;
        }
        return result;
    }

}
