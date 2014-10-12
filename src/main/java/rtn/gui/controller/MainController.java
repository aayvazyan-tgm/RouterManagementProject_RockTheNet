package rtn.gui.controller;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import rtn.MainApp;
import rtn.gui.model.TableRule;
import rtn.gui.model.DataManager;
import javafx.beans.InvalidationListener;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TableView.TableViewSelectionModel;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.FlowPane;

public class MainController {

	MainController instance;
	
	private DataManager dataManager;
	
	private ObservableList<TableRule> tableData = FXCollections.observableArrayList();;

	@FXML
    private TableColumn<TableRule, String> zoneInColumn;
	
    @FXML
    private MenuItem guideMenu;

    @FXML
    private Menu graphMenu;

    @FXML
    private TableColumn<TableRule, String> zoneOutColumn;

    @FXML
    private MenuBar menuBar;

    @FXML
    private Tab rulesTab;

    @FXML
    private MenuItem changeDeviceMenu;

    @FXML
    private TableColumn<TableRule, String> nameColumn;

    @FXML
    private MenuItem refreshMenu;

    @FXML
    private MenuItem helpMenuItem;

    @FXML
    private MenuItem displayGraphMenu;

    @FXML
    private TableView<TableRule> table;

    @FXML
    private Menu rulesMenu;

    @FXML
    private TableColumn<TableRule, String> actionColumn;

    @FXML
    private TableColumn<TableRule, String> addressInColumn;

    @FXML
    private TableColumn<TableRule, Boolean> loggedColumn;

    @FXML
    private Tab graphTab;

    @FXML
    private TableColumn<TableRule, String> serviceColumn;

    @FXML
    private MenuItem maxItemsMenu;

    @FXML
    private Menu helpMenu;

    @FXML
    private Menu applicationMenu;

    @FXML
    private LineChart<?, ?> graph;

    @FXML
    private MenuItem autoRefreshMenu;

    @FXML
    private MenuItem changeRuleMenu;

    @FXML
    private TableColumn<TableRule, String> addressOutColumn;

    @FXML
    private TabPane tabPane;

    @FXML
    private FlowPane graphItemsPane;

    public void initialize() {
    	instance = this;
    	initTable();
    }
    
    @FXML
    private void handleChangeDeviceMenu() {
    	//TODO disconnect from current device
    	MainApp.getMainStage().hide();
    	MainApp.getConnectionStage().show();
    }
    
    @FXML
    private void handleRefreshMenu() {
    	refreshTable();
    }
    
    @FXML
    private void handleAutoRefreshMenu() {
    	MainApp.getAutoRefreshStage().show();
    	//TODO insert current refresh-rate
    }
    
    @FXML
    private void handleDisplayGraphMenu() {
    	tabPane.getSelectionModel().select(graphTab);
    	
    	//TODO add selected rule to graph
    }
    
    @FXML
    private void handleChangeRuleMenu() {
    	MainApp.getChangeRuleStage().show();
    	
    	//TODO fill current values into changeRule form
    	//Example: ChangeRuleControler.setNameField(table.getSelectionModel().getSelectedItem().getName());
    }
    
    @FXML
    private void handleMaxItemsMenu() {
    	MainApp.getMaxItemStage().show();
    	//TODO Insert current max-item number
    }
    
    @FXML
    private void handleHelpMenu() {
    	//TODO show HelpWindow
    }
    
    @FXML
    private void handleGuideMenu() {
    	//TODO Show GuideWindow
    }
    
    private void initTable() {
    	nameColumn.setCellValueFactory(new PropertyValueFactory<TableRule, String>("name"));
    	zoneInColumn.setCellValueFactory(new PropertyValueFactory<TableRule, String>("zoneIn"));
    	zoneOutColumn.setCellValueFactory(new PropertyValueFactory<TableRule, String>("zoneOut"));
    	serviceColumn.setCellValueFactory(new PropertyValueFactory<TableRule, String>("service"));
    	actionColumn.setCellValueFactory(new PropertyValueFactory<TableRule, String>("action"));
    	addressInColumn.setCellValueFactory(new PropertyValueFactory<TableRule, String>("addressIn"));
    	addressOutColumn.setCellValueFactory(new PropertyValueFactory<TableRule, String>("addressOut"));
    	loggedColumn.setCellValueFactory(new PropertyValueFactory<TableRule, Boolean>("logged"));
    	
    	refreshTable();
    }
    
    private void refreshTable() {
		tableData.clear();
		
		tableData.add(new TableRule("Rule#1","abc","def","Service","Action","1.1.1.1","2.2.2.2",true)); //Testrow #1
		tableData.add(new TableRule("Rule#2","abc","def","Service","Action","3.3.3.3","4.4.4.4",false)); //Testrow #2
		
		//TODO load rules from FW and add them to tableData
		
		table.setItems(tableData);
	}
	
}
