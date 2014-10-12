package rtn.gui.controller;

import rtn.MainApp;
import rtn.gui.model.DataManager;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.FlowPane;

public class MainController {

	private DataManager dataManager;

	@FXML
    private TableColumn<?, ?> zoneInColumn;
	
    @FXML
    private MenuItem guideMenu;

    @FXML
    private Menu graphMenu;

    @FXML
    private TableColumn<?, ?> zoneOutColumn;

    @FXML
    private MenuBar menuBar;

    @FXML
    private Tab rulesTab;

    @FXML
    private MenuItem changeDeviceMenu;

    @FXML
    private TableColumn<?, ?> nameColumn;

    @FXML
    private MenuItem refreshMenu;

    @FXML
    private MenuItem helpMenuItem;

    @FXML
    private MenuItem displayGraphMenu;

    @FXML
    private TableView<?> table;

    @FXML
    private Menu rulesMenu;

    @FXML
    private TableColumn<?, ?> actionColumn;

    @FXML
    private TableColumn<?, ?> addressInColumn;

    @FXML
    private TableColumn<?, ?> loggedColumn;

    @FXML
    private Tab graphTab;

    @FXML
    private TableColumn<?, ?> serviceColumn;

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
    private TableColumn<?, ?> addressOutColumn;

    @FXML
    private TabPane tabPane;

    @FXML
    private FlowPane graphItemsPane;

    private void handleChangeDeviceMenu() {
    	//TODO disconnect from current device
    	MainApp.getMainStage().hide();
    	MainApp.getConnectionStage().show();
    }
    
    private void handleRefreshMenu() {
    	//TODO perform refresh
    }
    
    private void handleAutoRefreshMenu() {
    	//TODO show Auto-Refresh Window
    }
    
    private void handleDisplayGraphMenu() {
    	tabPane.getSelectionModel().select(graphTab);
    	//TODO add selected values from table to graph
    }
    
    private void handleChangeRuleMenu() {
    	MainApp.getChangeRuleStage().show();
    	//TODO fill current values into changeRule form
    }
    
    private void handleMaxItemsMenu() {
    	//TODO show MaxItemsMenu
    }
    
    private void handleHelpMenu() {
    	//TODO show HelpWindow
    }
    
    private void handleGuideMenu() {
    	//TODO Show GuideWindow
    }
	
}
