package rtn.gui.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.FlowPane;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rtn.IDataSource;
import rtn.MainApp;
import rtn.gui.model.TableRule;

public class MainController {
    private static final Logger logger = LoggerFactory.getLogger(MainController.class);

	private static MainController instance;
	
	private IDataSource dataManager;
	
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
    
    private int maxItems;

    public void initialize() {
    	instance = this;
    	maxItems=1;
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
    	MaxItemController.getInstance().getTextfield().setText(""+maxItems);
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

	/**
	 * @return the instance
	 */
	public static MainController getInstance() {
		return instance;
	}

	/**
	 * @param instance the instance to set
	 */
	public static void setInstance(MainController instance) {
		MainController.instance = instance;
	}

	/**
	 * @return the dataManager
	 */
	public IDataSource getDataManager() {
		return dataManager;
	}

	/**
	 * @param dataManager the dataManager to set
	 */
	public void setDataManager(IDataSource dataManager) {
		this.dataManager = dataManager;
	}

	/**
	 * @return the tableData
	 */
	public ObservableList<TableRule> getTableData() {
		return tableData;
	}

	/**
	 * @param tableData the tableData to set
	 */
	public void setTableData(ObservableList<TableRule> tableData) {
		this.tableData = tableData;
	}

	/**
	 * @return the zoneInColumn
	 */
	public TableColumn<TableRule, String> getZoneInColumn() {
		return zoneInColumn;
	}

	/**
	 * @param zoneInColumn the zoneInColumn to set
	 */
	public void setZoneInColumn(TableColumn<TableRule, String> zoneInColumn) {
		this.zoneInColumn = zoneInColumn;
	}

	/**
	 * @return the guideMenu
	 */
	public MenuItem getGuideMenu() {
		return guideMenu;
	}

	/**
	 * @param guideMenu the guideMenu to set
	 */
	public void setGuideMenu(MenuItem guideMenu) {
		this.guideMenu = guideMenu;
	}

	/**
	 * @return the graphMenu
	 */
	public Menu getGraphMenu() {
		return graphMenu;
	}

	/**
	 * @param graphMenu the graphMenu to set
	 */
	public void setGraphMenu(Menu graphMenu) {
		this.graphMenu = graphMenu;
	}

	/**
	 * @return the zoneOutColumn
	 */
	public TableColumn<TableRule, String> getZoneOutColumn() {
		return zoneOutColumn;
	}

	/**
	 * @param zoneOutColumn the zoneOutColumn to set
	 */
	public void setZoneOutColumn(TableColumn<TableRule, String> zoneOutColumn) {
		this.zoneOutColumn = zoneOutColumn;
	}

	/**
	 * @return the menuBar
	 */
	public MenuBar getMenuBar() {
		return menuBar;
	}

	/**
	 * @param menuBar the menuBar to set
	 */
	public void setMenuBar(MenuBar menuBar) {
		this.menuBar = menuBar;
	}

	/**
	 * @return the rulesTab
	 */
	public Tab getRulesTab() {
		return rulesTab;
	}

	/**
	 * @param rulesTab the rulesTab to set
	 */
	public void setRulesTab(Tab rulesTab) {
		this.rulesTab = rulesTab;
	}

	/**
	 * @return the changeDeviceMenu
	 */
	public MenuItem getChangeDeviceMenu() {
		return changeDeviceMenu;
	}

	/**
	 * @param changeDeviceMenu the changeDeviceMenu to set
	 */
	public void setChangeDeviceMenu(MenuItem changeDeviceMenu) {
		this.changeDeviceMenu = changeDeviceMenu;
	}

	/**
	 * @return the nameColumn
	 */
	public TableColumn<TableRule, String> getNameColumn() {
		return nameColumn;
	}

	/**
	 * @param nameColumn the nameColumn to set
	 */
	public void setNameColumn(TableColumn<TableRule, String> nameColumn) {
		this.nameColumn = nameColumn;
	}

	/**
	 * @return the refreshMenu
	 */
	public MenuItem getRefreshMenu() {
		return refreshMenu;
	}

	/**
	 * @param refreshMenu the refreshMenu to set
	 */
	public void setRefreshMenu(MenuItem refreshMenu) {
		this.refreshMenu = refreshMenu;
	}

	/**
	 * @return the helpMenuItem
	 */
	public MenuItem getHelpMenuItem() {
		return helpMenuItem;
	}

	/**
	 * @param helpMenuItem the helpMenuItem to set
	 */
	public void setHelpMenuItem(MenuItem helpMenuItem) {
		this.helpMenuItem = helpMenuItem;
	}

	/**
	 * @return the displayGraphMenu
	 */
	public MenuItem getDisplayGraphMenu() {
		return displayGraphMenu;
	}

	/**
	 * @param displayGraphMenu the displayGraphMenu to set
	 */
	public void setDisplayGraphMenu(MenuItem displayGraphMenu) {
		this.displayGraphMenu = displayGraphMenu;
	}

	/**
	 * @return the table
	 */
	public TableView<TableRule> getTable() {
		return table;
	}

	/**
	 * @param table the table to set
	 */
	public void setTable(TableView<TableRule> table) {
		this.table = table;
	}

	/**
	 * @return the rulesMenu
	 */
	public Menu getRulesMenu() {
		return rulesMenu;
	}

	/**
	 * @param rulesMenu the rulesMenu to set
	 */
	public void setRulesMenu(Menu rulesMenu) {
		this.rulesMenu = rulesMenu;
	}

	/**
	 * @return the actionColumn
	 */
	public TableColumn<TableRule, String> getActionColumn() {
		return actionColumn;
	}

	/**
	 * @param actionColumn the actionColumn to set
	 */
	public void setActionColumn(TableColumn<TableRule, String> actionColumn) {
		this.actionColumn = actionColumn;
	}

	/**
	 * @return the addressInColumn
	 */
	public TableColumn<TableRule, String> getAddressInColumn() {
		return addressInColumn;
	}

	/**
	 * @param addressInColumn the addressInColumn to set
	 */
	public void setAddressInColumn(TableColumn<TableRule, String> addressInColumn) {
		this.addressInColumn = addressInColumn;
	}

	/**
	 * @return the loggedColumn
	 */
	public TableColumn<TableRule, Boolean> getLoggedColumn() {
		return loggedColumn;
	}

	/**
	 * @param loggedColumn the loggedColumn to set
	 */
	public void setLoggedColumn(TableColumn<TableRule, Boolean> loggedColumn) {
		this.loggedColumn = loggedColumn;
	}

	/**
	 * @return the graphTab
	 */
	public Tab getGraphTab() {
		return graphTab;
	}

	/**
	 * @param graphTab the graphTab to set
	 */
	public void setGraphTab(Tab graphTab) {
		this.graphTab = graphTab;
	}

	/**
	 * @return the serviceColumn
	 */
	public TableColumn<TableRule, String> getServiceColumn() {
		return serviceColumn;
	}

	/**
	 * @param serviceColumn the serviceColumn to set
	 */
	public void setServiceColumn(TableColumn<TableRule, String> serviceColumn) {
		this.serviceColumn = serviceColumn;
	}

	/**
	 * @return the maxItemsMenu
	 */
	public MenuItem getMaxItemsMenu() {
		return maxItemsMenu;
	}

	/**
	 * @param maxItemsMenu the maxItemsMenu to set
	 */
	public void setMaxItemsMenu(MenuItem maxItemsMenu) {
		this.maxItemsMenu = maxItemsMenu;
	}

	/**
	 * @return the helpMenu
	 */
	public Menu getHelpMenu() {
		return helpMenu;
	}

	/**
	 * @param helpMenu the helpMenu to set
	 */
	public void setHelpMenu(Menu helpMenu) {
		this.helpMenu = helpMenu;
	}

	/**
	 * @return the applicationMenu
	 */
	public Menu getApplicationMenu() {
		return applicationMenu;
	}

	/**
	 * @param applicationMenu the applicationMenu to set
	 */
	public void setApplicationMenu(Menu applicationMenu) {
		this.applicationMenu = applicationMenu;
	}

	/**
	 * @return the graph
	 */
	public LineChart<?, ?> getGraph() {
		return graph;
	}

	/**
	 * @param graph the graph to set
	 */
	public void setGraph(LineChart<?, ?> graph) {
		this.graph = graph;
	}

	/**
	 * @return the autoRefreshMenu
	 */
	public MenuItem getAutoRefreshMenu() {
		return autoRefreshMenu;
	}

	/**
	 * @param autoRefreshMenu the autoRefreshMenu to set
	 */
	public void setAutoRefreshMenu(MenuItem autoRefreshMenu) {
		this.autoRefreshMenu = autoRefreshMenu;
	}

	/**
	 * @return the changeRuleMenu
	 */
	public MenuItem getChangeRuleMenu() {
		return changeRuleMenu;
	}

	/**
	 * @param changeRuleMenu the changeRuleMenu to set
	 */
	public void setChangeRuleMenu(MenuItem changeRuleMenu) {
		this.changeRuleMenu = changeRuleMenu;
	}

	/**
	 * @return the addressOutColumn
	 */
	public TableColumn<TableRule, String> getAddressOutColumn() {
		return addressOutColumn;
	}

	/**
	 * @param addressOutColumn the addressOutColumn to set
	 */
	public void setAddressOutColumn(TableColumn<TableRule, String> addressOutColumn) {
		this.addressOutColumn = addressOutColumn;
	}

	/**
	 * @return the tabPane
	 */
	public TabPane getTabPane() {
		return tabPane;
	}

	/**
	 * @param tabPane the tabPane to set
	 */
	public void setTabPane(TabPane tabPane) {
		this.tabPane = tabPane;
	}

	/**
	 * @return the graphItemsPane
	 */
	public FlowPane getGraphItemsPane() {
		return graphItemsPane;
	}

	/**
	 * @param graphItemsPane the graphItemsPane to set
	 */
	public void setGraphItemsPane(FlowPane graphItemsPane) {
		this.graphItemsPane = graphItemsPane;
	}

	/**
	 * @return the maxItems
	 */
	public int getMaxItems() {
		return maxItems;
	}

	/**
	 * @param maxItems the maxItems to set
	 */
	public void setMaxItems(int maxItems) {
		this.maxItems = maxItems;
	}
	
}
