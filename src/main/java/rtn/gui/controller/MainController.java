package rtn.gui.controller;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Service;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.FlowPane;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rtn.CommandCentreImpl;
import rtn.DataSourceImpl;
import rtn.IDataSource;
import rtn.gui.model.TableRule;
import rtn.gui.view.StageLoader;
import rtn.networking.Policy;

import java.util.List;
import java.util.concurrent.CountDownLatch;

public class MainController {

    private static final Logger logger = LoggerFactory.getLogger(MainController.class);

	private static MainController instance;
	
	private IDataSource dataManager = new DataSourceImpl();;
	
	private ObservableList<TableRule> tableData = FXCollections.observableArrayList();;

    private Service<Void> autoRefresher;

    private int refreshTime;

    @FXML
    private Button delete_b;

    @FXML
    private Button edit_b;

    @FXML
    private ToolBar toolbar;

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
    private MenuItem addRuleMenu;

    @FXML
    private TableColumn<TableRule, String> addressOutColumn;

    @FXML
    private TabPane tabPane;

    @FXML
    private FlowPane graphItemsPane;
    
    private int maxItems;

    /**
	 * Sets the instance
	 */
    public void initialize() {
    	instance = this;
    	maxItems=1;
    	initTable();
    }
    
    /**
     * Handles the changeDevice Button (closes current connection and opens connectionWindow)
     */
    @FXML
    private void handleChangeDeviceMenu() {
    	//TODO disconnect from current device

    	StageLoader.getConnectionStage().show();
    }
    
    /**
     * Refreshes the policyTable
     */
    @FXML
    private void handleRefreshMenu() {
    	refreshTable();
    }
    
    /**
     * Opens the autoRefreshWindow
     */
    @FXML
    private void handleAutoRefreshMenu() {
    	StageLoader.getAutoRefreshStage().show();

    	//TODO insert current refresh-rate
    }
    
    /**
     * Opens the graphTab
     */
    @FXML
    private void handleDisplayGraphMenu() {
    	tabPane.getSelectionModel().select(graphTab);
    	
    	//TODO add selected rule to graph
    }

    /**
     * Opens the addRuleWindow for each selected policy
     */
    @FXML
    private void handleAddRuleMenu() {
        StageLoader.getAddRuleStage().show();
        String t= (String) table.getSelectionModel().getSelectedCells().get(0).getTableColumn().getCellData(table.getSelectionModel().getSelectedIndex());
        if(!RulesAdminController.getAddInstance().isAddDropsFilled()){
            RulesAdminController.getAddInstance().fillAddDropdowns();
        }
        RulesAdminController.getEditInstance().fillChangeValues(Long.parseLong(t));

        //TODO fill current values into addRule form
        //Example: ChangeRuleControler.setNameField(table.getSelectionModel().getSelectedItem().getName());
    }

    /**
     * Opens the changeRuleWindow for each selected policy
     */
    @FXML
    private void handleChangeRuleMenu() {
    	StageLoader.getEditRuleStage().show();
        if(!RulesAdminController.getEditInstance().isEditDropsFilled()){
            RulesAdminController.getEditInstance().fillEditDropdowns();
        }

    	//TODO fill current values into changeRule form
    	//Example: ChangeRuleControler.setNameField(table.getSelectionModel().getSelectedItem().getName());
    }

    /**
     * Opens the removeRuleWindow for each selected policy
     */
    @FXML
    private void handleRemoveRuleMenu() {
        StageLoader.getDeleteRuleStage().show();

        //TODO fill current values into deleteRule form
        //Example: ChangeRuleControler.setNameField(table.getSelectionModel().getSelectedItem().getName());
    }
    
    /**
     * Opens the maxItemsWindow
     */
    @FXML
    private void handleMaxItemsMenu() {
    	StageLoader.getMaxItemStage().show();
    	MaxItemController.getInstance().getTextfield().setText(""+maxItems);
    }
    
    /**
     * Opens the helpWindow
     */
    @FXML
    private void handleHelpMenu() {
    	//TODO show HelpWindow
    }
    
    /**
     * Opens the guideWindow
     */
    @FXML
    private void handleGuideMenu() {
    	//TODO Show GuideWindow
    }
    
    /**
     * Initializes the policyTable, sets the value types to TableRule
     */
    private void initTable() {
    	nameColumn.setCellValueFactory(new PropertyValueFactory<TableRule, String>("name"));
    	zoneInColumn.setCellValueFactory(new PropertyValueFactory<TableRule, String>("zoneIn"));
    	zoneOutColumn.setCellValueFactory(new PropertyValueFactory<TableRule, String>("zoneOut"));
    	serviceColumn.setCellValueFactory(new PropertyValueFactory<TableRule, String>("service"));
    	actionColumn.setCellValueFactory(new PropertyValueFactory<TableRule, String>("action"));
    	addressInColumn.setCellValueFactory(new PropertyValueFactory<TableRule, String>("addressIn"));
    	addressOutColumn.setCellValueFactory(new PropertyValueFactory<TableRule, String>("addressOut"));
    	loggedColumn.setCellValueFactory(new PropertyValueFactory<TableRule, Boolean>("logged"));
    }
    
    /**
     * Refreshes the policyTable
     */
    public void refreshTable() {
		tableData.clear();

        List<Policy> policies= dataManager.getPolicies();

        for(int i=0; i<policies.size(); i++) {
            Policy p = policies.get(i);
            tableData.add(new TableRule(""+p.getId(),p.getInzone().getName(), p.getOutzone().getName(),p.getService().getName(),p.getAction().getName(),p.getSource(),p.getDestination(),p.isLog()));
        }

		table.setItems(tableData);
	}

    public void startAutoRefresh(int refreshTime) {
        this.refreshTime = refreshTime;
        autoRefresher = new Service<Void>() {
            @Override
            protected Task<Void> createTask() {
                return new Task<Void>() {
                    @Override
                    protected Void call() throws Exception {
                        //Background work
                        final CountDownLatch latch = new CountDownLatch(1);
                        Platform.runLater(new Runnable() {
                            @Override
                            public void run() {
                                try {
                                    Thread.sleep(refreshTime*1000);
                                    MainController.getInstance().refreshTable();
                                } catch (InterruptedException e) {
                                } finally {
                                    latch.countDown();
                                }
                            }
                        });
                        latch.await();
                        return null;
                    }
                };
            }
        };
        autoRefresher.start();
    }

    public void stopAutoRefresh() {
        if(autoRefresher!=null && autoRefresher.isRunning()) {
            autoRefresher.cancel();
        }
    }

	/**
	 * Returns the current instance
	 * 
	 * @return the instance
	 */
	public static MainController getInstance() {
		return instance;
	}

	/**
	 * Gets the data manager.
	 *
	 * @return the dataManager
	 */
	public IDataSource getDataManager() {
		return dataManager;
	}

	/**
	 * Sets the data manager.
	 *
	 * @param dataManager the dataManager to set
	 */
	public void setDataManager(IDataSource dataManager) {
		this.dataManager = dataManager;
	}

	/**
	 * Gets the table data.
	 *
	 * @return the tableData
	 */
	public ObservableList<TableRule> getTableData() {
		return tableData;
	}

	/**
	 * Sets the table data.
	 *
	 * @param tableData the tableData to set
	 */
	public void setTableData(ObservableList<TableRule> tableData) {
		this.tableData = tableData;
	}

	/**
	 * Gets the zone in column.
	 *
	 * @return the zoneInColumn
	 */
	public TableColumn<TableRule, String> getZoneInColumn() {
		return zoneInColumn;
	}

	/**
	 * Sets the zone in column.
	 *
	 * @param zoneInColumn the zoneInColumn to set
	 */
	public void setZoneInColumn(TableColumn<TableRule, String> zoneInColumn) {
		this.zoneInColumn = zoneInColumn;
	}

	/**
	 * Gets the guide menu.
	 *
	 * @return the guideMenu
	 */
	public MenuItem getGuideMenu() {
		return guideMenu;
	}

	/**
	 * Sets the guide menu.
	 *
	 * @param guideMenu the guideMenu to set
	 */
	public void setGuideMenu(MenuItem guideMenu) {
		this.guideMenu = guideMenu;
	}

	/**
	 * Gets the graph menu.
	 *
	 * @return the graphMenu
	 */
	public Menu getGraphMenu() {
		return graphMenu;
	}

	/**
	 * Sets the graph menu.
	 *
	 * @param graphMenu the graphMenu to set
	 */
	public void setGraphMenu(Menu graphMenu) {
		this.graphMenu = graphMenu;
	}

	/**
	 * Gets the zone out column.
	 *
	 * @return the zoneOutColumn
	 */
	public TableColumn<TableRule, String> getZoneOutColumn() {
		return zoneOutColumn;
	}

	/**
	 * Sets the zone out column.
	 *
	 * @param zoneOutColumn the zoneOutColumn to set
	 */
	public void setZoneOutColumn(TableColumn<TableRule, String> zoneOutColumn) {
		this.zoneOutColumn = zoneOutColumn;
	}

	/**
	 * Gets the menu bar.
	 *
	 * @return the menuBar
	 */
	public MenuBar getMenuBar() {
		return menuBar;
	}

	/**
	 * Sets the menu bar.
	 *
	 * @param menuBar the menuBar to set
	 */
	public void setMenuBar(MenuBar menuBar) {
		this.menuBar = menuBar;
	}

	/**
	 * Gets the rules tab.
	 *
	 * @return the rulesTab
	 */
	public Tab getRulesTab() {
		return rulesTab;
	}

	/**
	 * Sets the rules tab.
	 *
	 * @param rulesTab the rulesTab to set
	 */
	public void setRulesTab(Tab rulesTab) {
		this.rulesTab = rulesTab;
	}

	/**
	 * Gets the change device menu.
	 *
	 * @return the changeDeviceMenu
	 */
	public MenuItem getChangeDeviceMenu() {
		return changeDeviceMenu;
	}

	/**
	 * Sets the change device menu.
	 *
	 * @param changeDeviceMenu the changeDeviceMenu to set
	 */
	public void setChangeDeviceMenu(MenuItem changeDeviceMenu) {
		this.changeDeviceMenu = changeDeviceMenu;
	}

	/**
	 * Gets the name column.
	 *
	 * @return the nameColumn
	 */
	public TableColumn<TableRule, String> getNameColumn() {
		return nameColumn;
	}

	/**
	 * Sets the name column.
	 *
	 * @param nameColumn the nameColumn to set
	 */
	public void setNameColumn(TableColumn<TableRule, String> nameColumn) {
		this.nameColumn = nameColumn;
	}

	/**
	 * Gets the refresh menu.
	 *
	 * @return the refreshMenu
	 */
	public MenuItem getRefreshMenu() {
		return refreshMenu;
	}

	/**
	 * Sets the refresh menu.
	 *
	 * @param refreshMenu the refreshMenu to set
	 */
	public void setRefreshMenu(MenuItem refreshMenu) {
		this.refreshMenu = refreshMenu;
	}

	/**
	 * Gets the help menu item.
	 *
	 * @return the helpMenuItem
	 */
	public MenuItem getHelpMenuItem() {
		return helpMenuItem;
	}

	/**
	 * Sets the help menu item.
	 *
	 * @param helpMenuItem the helpMenuItem to set
	 */
	public void setHelpMenuItem(MenuItem helpMenuItem) {
		this.helpMenuItem = helpMenuItem;
	}

	/**
	 * Gets the display graph menu.
	 *
	 * @return the displayGraphMenu
	 */
	public MenuItem getDisplayGraphMenu() {
		return displayGraphMenu;
	}

	/**
	 * Sets the display graph menu.
	 *
	 * @param displayGraphMenu the displayGraphMenu to set
	 */
	public void setDisplayGraphMenu(MenuItem displayGraphMenu) {
		this.displayGraphMenu = displayGraphMenu;
	}

	/**
	 * Gets the table.
	 *
	 * @return the table
	 */
	public TableView<TableRule> getTable() {
		return table;
	}

	/**
	 * Sets the table.
	 *
	 * @param table the table to set
	 */
	public void setTable(TableView<TableRule> table) {
		this.table = table;
	}

	/**
	 * Gets the rules menu.
	 *
	 * @return the rulesMenu
	 */
	public Menu getRulesMenu() {
		return rulesMenu;
	}

	/**
	 * Sets the rules menu.
	 *
	 * @param rulesMenu the rulesMenu to set
	 */
	public void setRulesMenu(Menu rulesMenu) {
		this.rulesMenu = rulesMenu;
	}

	/**
	 * Gets the action column.
	 *
	 * @return the actionColumn
	 */
	public TableColumn<TableRule, String> getActionColumn() {
		return actionColumn;
	}

	/**
	 * Sets the action column.
	 *
	 * @param actionColumn the actionColumn to set
	 */
	public void setActionColumn(TableColumn<TableRule, String> actionColumn) {
		this.actionColumn = actionColumn;
	}

	/**
	 * Gets the address in column.
	 *
	 * @return the addressInColumn
	 */
	public TableColumn<TableRule, String> getAddressInColumn() {
		return addressInColumn;
	}

	/**
	 * Sets the address in column.
	 *
	 * @param addressInColumn the addressInColumn to set
	 */
	public void setAddressInColumn(TableColumn<TableRule, String> addressInColumn) {
		this.addressInColumn = addressInColumn;
	}

	/**
	 * Gets the logged column.
	 *
	 * @return the loggedColumn
	 */
	public TableColumn<TableRule, Boolean> getLoggedColumn() {
		return loggedColumn;
	}

	/**
	 * Sets the logged column.
	 *
	 * @param loggedColumn the loggedColumn to set
	 */
	public void setLoggedColumn(TableColumn<TableRule, Boolean> loggedColumn) {
		this.loggedColumn = loggedColumn;
	}

	/**
	 * Gets the graph tab.
	 *
	 * @return the graphTab
	 */
	public Tab getGraphTab() {
		return graphTab;
	}

	/**
	 * Sets the graph tab.
	 *
	 * @param graphTab the graphTab to set
	 */
	public void setGraphTab(Tab graphTab) {
		this.graphTab = graphTab;
	}

	/**
	 * Gets the service column.
	 *
	 * @return the serviceColumn
	 */
	public TableColumn<TableRule, String> getServiceColumn() {
		return serviceColumn;
	}

	/**
	 * Sets the service column.
	 *
	 * @param serviceColumn the serviceColumn to set
	 */
	public void setServiceColumn(TableColumn<TableRule, String> serviceColumn) {
		this.serviceColumn = serviceColumn;
	}

	/**
	 * Gets the max items menu.
	 *
	 * @return the maxItemsMenu
	 */
	public MenuItem getMaxItemsMenu() {
		return maxItemsMenu;
	}

	/**
	 * Sets the max items menu.
	 *
	 * @param maxItemsMenu the maxItemsMenu to set
	 */
	public void setMaxItemsMenu(MenuItem maxItemsMenu) {
		this.maxItemsMenu = maxItemsMenu;
	}

	/**
	 * Gets the help menu.
	 *
	 * @return the helpMenu
	 */
	public Menu getHelpMenu() {
		return helpMenu;
	}

	/**
	 * Sets the help menu.
	 *
	 * @param helpMenu the helpMenu to set
	 */
	public void setHelpMenu(Menu helpMenu) {
		this.helpMenu = helpMenu;
	}

	/**
	 * Gets the application menu.
	 *
	 * @return the applicationMenu
	 */
	public Menu getApplicationMenu() {
		return applicationMenu;
	}

	/**
	 * Sets the application menu.
	 *
	 * @param applicationMenu the applicationMenu to set
	 */
	public void setApplicationMenu(Menu applicationMenu) {
		this.applicationMenu = applicationMenu;
	}

	/**
	 * Gets the graph.
	 *
	 * @return the graph
	 */
	public LineChart<?, ?> getGraph() {
		return graph;
	}

	/**
	 * Sets the graph.
	 *
	 * @param graph the graph to set
	 */
	public void setGraph(LineChart<?, ?> graph) {
		this.graph = graph;
	}

	/**
	 * Gets the auto refresh menu.
	 *
	 * @return the autoRefreshMenu
	 */
	public MenuItem getAutoRefreshMenu() {
		return autoRefreshMenu;
	}

	/**
	 * Sets the auto refresh menu.
	 *
	 * @param autoRefreshMenu the autoRefreshMenu to set
	 */
	public void setAutoRefreshMenu(MenuItem autoRefreshMenu) {
		this.autoRefreshMenu = autoRefreshMenu;
	}

	/**
	 * Gets the change rule menu.
	 *
	 * @return the changeRuleMenu
	 */
	public MenuItem getAddRuleMenu() {
		return addRuleMenu;
	}

	/**
	 * Sets the change rule menu.
	 *
	 * @param changeRuleMenu the changeRuleMenu to set
	 */
	public void setAddRuleMenu(MenuItem changeRuleMenu) {
		this.addRuleMenu = changeRuleMenu;
	}

	/**
	 * Gets the address out column.
	 *
	 * @return the addressOutColumn
	 */
	public TableColumn<TableRule, String> getAddressOutColumn() {
		return addressOutColumn;
	}

	/**
	 * Sets the address out column.
	 *
	 * @param addressOutColumn the addressOutColumn to set
	 */
	public void setAddressOutColumn(TableColumn<TableRule, String> addressOutColumn) {
		this.addressOutColumn = addressOutColumn;
	}

	/**
	 * Gets the tab pane.
	 *
	 * @return the tabPane
	 */
	public TabPane getTabPane() {
		return tabPane;
	}

	/**
	 * Sets the tab pane.
	 *
	 * @param tabPane the tabPane to set
	 */
	public void setTabPane(TabPane tabPane) {
		this.tabPane = tabPane;
	}

	/**
	 * Gets the graph items pane.
	 *
	 * @return the graphItemsPane
	 */
	public FlowPane getGraphItemsPane() {
		return graphItemsPane;
	}

	/**
	 * Sets the graph items pane.
	 *
	 * @param graphItemsPane the graphItemsPane to set
	 */
	public void setGraphItemsPane(FlowPane graphItemsPane) {
		this.graphItemsPane = graphItemsPane;
	}

	/**
	 * Gets the max items.
	 *
	 * @return the maxItems
	 */
	public int getMaxItems() {
		return maxItems;
	}

	/**
	 * Sets the max items.
	 *
	 * @param maxItems the maxItems to set
	 */
	public void setMaxItems(int maxItems) {
		this.maxItems = maxItems;
	}

    public Button getDelete_b() {
        return delete_b;
    }

    public Button getEdit_b() {
        return edit_b;
    }
}
