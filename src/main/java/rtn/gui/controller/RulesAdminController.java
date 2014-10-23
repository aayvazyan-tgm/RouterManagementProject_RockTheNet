package rtn.gui.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import org.controlsfx.dialog.Dialogs;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import rtn.GuiceModule;
import rtn.ICommandCentre;
import rtn.networking.Action;
import rtn.networking.Policy;
import rtn.networking.Service;
import rtn.networking.Zone;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Controller class for AddRuleWindow, EditRuleWindow and DeleteRuleWindow
 * 
 * @author Andreas Willinger
 */
@SuppressWarnings("deprecation")
public class RulesAdminController
{
    @SuppressWarnings("unused")
	private static final Logger logger = LoggerFactory.getLogger(RulesAdminController.class);

	private ICommandCentre commandCentre;
	
	// the various fields exposed on the GUI are linked below
	@FXML
	private Label txtpolicyId;
	
	@FXML
	private VBox addPolicyWindow;
	
	@FXML
	private TextField txtDisplayname;
	
	@FXML
	private ComboBox<String> cbZoneIn;
	
	@FXML
	private ComboBox<String> cbZoneOut;
	
	@FXML
	private ComboBox<String> cbService;
	
	@FXML
	private ComboBox<String> cbAction;

	@FXML
	private TextField txtIpInbound;
	
	@FXML
	private TextField txtIpOutbound;
	
	@FXML
	private CheckBox cLog;
	
	@FXML
	private Button bCreate;
	
	@FXML
	private Button bUpdate;
	
	@FXML
	private Button bConfirm;
	
	@FXML
	private Button bCancel;
	
	public void initialize()
	{
		Injector injector = Guice.createInjector(new GuiceModule());
	    this.commandCentre = injector.getInstance(ICommandCentre.class);
    }
	
	/**
	 * Called when the "Cancel" button is pressed.
	 * Closes the window where the button lies in.
	 * 
	 * @param event The source event
	 */
	@FXML
	public void handleButtonCancel(ActionEvent event)
	{
		Node source = (Node)event.getSource();
		
		if(source == this.bCancel)
		{
			Stage stage = (Stage)source.getScene().getWindow();
			
			stage.close();
		}
	}
	
	/**
	 * Called when the edit or update button(s) are pressed.
	 * Depending whether the source was the UpdateRuleWindow or EditRuleWindow,
	 * it either creates a new policy or updates an existing one.
	 * 
	 * @param event The source event
	 */
	@FXML
	public void handleButtonEditOrNew(ActionEvent event)
	{
		Node source = (Node)event.getSource();
		
		if(source != this.bCreate && source != this.bUpdate) return;
		
		int policyId = -1;
		
		// read the input field values
		if(source == this.bUpdate) policyId = Integer.parseInt(this.txtpolicyId.getText());
		String displayname = this.txtDisplayname.getText();
		String zoneIn = this.cbZoneIn.getSelectionModel().getSelectedItem();
		String zoneOut = this.cbZoneOut.getSelectionModel().getSelectedItem();
		String service = this.cbService.getSelectionModel().getSelectedItem();
		String action = this.cbAction.getSelectionModel().getSelectedItem();
		String ipInbound = this.txtIpInbound.getText();
		String ipOutbound = this.txtIpOutbound.getText();
		boolean log = this.cLog.isSelected();
		
		if(isNullOrEmpty(zoneIn) || isNullOrEmpty(zoneOut) || isNullOrEmpty(service) || isNullOrEmpty(action) || isNullOrEmpty(ipInbound) || isNullOrEmpty(ipOutbound))
		{	
			Dialogs.create().owner(source.getScene().getWindow()).title("Rock the Net - Error").masthead("An Error occured").message("All fields with the exception of displayname are mandatory!")
			.showError();
			return;
		}
		
		// prepare the object
		Policy policy = new Policy();
		policy.setId((long)policyId);
		policy.setDisplayname(displayname);
		policy.setSource(ipInbound);
		policy.setDestination(ipOutbound);
		policy.setAction(new Action(action));
		policy.setLog(log);
		policy.setInzone(new Zone(zoneIn));
		policy.setOutzone(new Zone(zoneOut));
		policy.setService(new Service(service));
		
		// actually execute the action
		if(source == this.bUpdate)
		{
			if(!this.commandCentre.updatePolicy(policy)) Dialogs.create().owner(source.getScene().getWindow()).title("Rock the Net - Error").masthead("An Error occured").message("Could not update policy on the device!\nPlease check whether or not your network/access settings are correct!")
			.showError();
		}
		else if(source == this.bCreate)
		{
			if(!this.commandCentre.addPolicy(policy)) Dialogs.create().owner(source.getScene().getWindow()).title("Rock the Net - Error").masthead("An Error occured").message("Could not create policy on the device!\nPlease check whether or not your network/access settings are correct!")
			.showError();
		}
	}
	
	/**
	 * Called when the delete button is pressed.
	 * This removes an existing policy from the device.
	 * 
	 * @param event The source event
	 */
	@FXML
	public void handleButtonDelete(ActionEvent event)
	{
		Node source = (Node)event.getSource();
		
		if(source != this.bConfirm) return;
		
		int policyId = Integer.parseInt(this.txtpolicyId.getText());
		
		// in case we have negative policy IDs (which usually never happens)
		// remove this check
		if(policyId < 0) return;
		
		Policy policy = new Policy();
		policy.setId((long)policyId);
		
		if(!this.commandCentre.deletePolicy(policy)) Dialogs.create().owner(source.getScene().getWindow()).title("Rock the Net - Error").masthead("An Error occured").message("Could not delete policy from the device!\nPlease check whether or not your network/access settings are correct!")
		.showError();
	}
	
	/**
	 * A short hand function checking if a String is not null and non-empty.
	 * 
	 * @param value The String to check
	 * @return true, if the String is ok, false if it's either null or empty
	 */
	private boolean isNullOrEmpty(String value)
	{
		return (value == null || value.isEmpty());
	}
	
	/**
	 * TO BE REMOVED
	 * 
	 * @param event The source event
	 */
	public void handleCheckBoxAction(ActionEvent event)
	{
		ObservableList<String> zoneData = FXCollections.observableArrayList();
		ObservableList<String> serviceData = FXCollections.observableArrayList();
		ObservableList<String> actionData = FXCollections.observableArrayList();
		
		zoneData.add("untrusted");
		zoneData.add("trusted");
		zoneData.add("special");
		
		serviceData.add("SSH");
		serviceData.add("FTP");
		
		actionData.add("permit");
		actionData.add("deny");
		actionData.add("tunnel");
		
		this.cbZoneIn.setItems(zoneData);
		this.cbZoneOut.setItems(zoneData);
		this.cbService.setItems(serviceData);
		this.cbAction.setItems(actionData);
	}
}