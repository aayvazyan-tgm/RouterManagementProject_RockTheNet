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
import rtn.gui.model.ActionManager;
import rtn.networking.Action;
import rtn.networking.Policy;
import rtn.networking.Service;
import rtn.networking.Zone;

public class RulesAdminController
{
	private ActionManager actionManager;
	
	@FXML
	private Label policyId;
	
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
	private Button bCancel;
	
	@FXML
	public void handleButtonAction(ActionEvent event)
	{
		Node source = (Node)event.getSource();
		
		if(source == this.bCreate)
		{
			String displayname = this.txtDisplayname.getText();
			String zoneIn = this.cbZoneIn.getSelectionModel().getSelectedItem();
			String zoneOut = this.cbZoneOut.getSelectionModel().getSelectedItem();
			String service = this.cbService.getSelectionModel().getSelectedItem();
			String action = this.cbAction.getSelectionModel().getSelectedItem();
			String ipInbound = this.txtIpInbound.getText();
			String ipOutbound = this.txtIpOutbound.getText();
			boolean log = this.cLog.isSelected();
			
			Policy policy = new Policy();
			policy.setDisplayname(displayname);
			policy.setSource(ipInbound);
			policy.setDestination(ipOutbound);
			policy.setAction(new Action(action));
			policy.setLog(log);
			policy.setInzone(new Zone(zoneIn));
			policy.setOutzone(new Zone(zoneOut));
			policy.setService(new Service(service));
			
		}
		else if(source == this.bCancel)
		{
			Stage stage = (Stage) source.getScene().getWindow();
			
			stage.close();
		}
	}
	
	@FXML
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