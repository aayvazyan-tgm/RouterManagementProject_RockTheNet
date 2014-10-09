package rtn.gui.controller;

/**
 * Controller Class for 'ConnectionWindow.fxml'
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class ConnectionWindowController {

    @FXML
    private Button connect_b;

    @FXML
    private TextField snmp_tf;

    @FXML
    private Text error_t;

    @FXML
    private TextField ip_tf;

    @FXML
    private Label desc_l;

    @FXML
    private ComboBox<?> device_cb;

    @FXML
    private Label welcome_l;

    @FXML
    private TextField pass_tf;

    @FXML
    private TextField user_tf;
    
    

}
