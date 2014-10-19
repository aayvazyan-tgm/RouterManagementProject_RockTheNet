package rtn.gui.controller;

import javafx.collections.ObservableList;
import rtn.gui.model.TableRule;
import javafx.scene.chart.Axis;
import javafx.scene.chart.LineChart;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import rtn.DataSourceImpl;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.FlowPane;
import org.junit.*;
import rtn.IDataSource;
import static org.junit.Assert.*;

/**
 * The class <code>MainControllerTest</code> contains tests for the class <code>{@link MainController}</code>.
 *
 * @generatedBy CodePro at 10/19/14 10:28 PM
 * @author jakob
 * @version $Revision: 1.0 $
 */
public class MainControllerTest {
	/**
	 * Run the MainController() constructor test.
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testMainController_1()
		throws Exception {
		MainController result = new MainController();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the TableColumn<TableRule, String> getActionColumn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testGetActionColumn_1()
		throws Exception {
		MainController fixture = new MainController();
		fixture.setServiceColumn(new TableColumn());
		fixture.setAddressInColumn(new TableColumn());
		fixture.setHelpMenuItem(new MenuItem());
		fixture.setGraphTab(new Tab());
		fixture.setDisplayGraphMenu(new MenuItem());
		fixture.setTabPane(new TabPane());
		fixture.setAutoRefreshMenu(new MenuItem());
		fixture.setActionColumn(new TableColumn());
		fixture.setHelpMenu(new Menu());
		fixture.setTableData(null);
		fixture.setGraph(new LineChart((Axis<Object>) null, (Axis<Object>) null));
		fixture.setDataManager(new DataSourceImpl());
		fixture.setApplicationMenu(new Menu());
		fixture.setRefreshMenu(new MenuItem());
		fixture.setChangeDeviceMenu(new MenuItem());
		fixture.setMenuBar(new MenuBar());
		fixture.setGraphItemsPane(new FlowPane());
		fixture.setTable(new TableView());
		fixture.setAddressOutColumn(new TableColumn());
		fixture.setMaxItemsMenu(new MenuItem());
		fixture.setGuideMenu(new MenuItem());
		fixture.setChangeRuleMenu(new MenuItem());
		fixture.setRulesMenu(new Menu());
		fixture.setLoggedColumn(new TableColumn());
		fixture.setZoneOutColumn(new TableColumn());
		fixture.setZoneInColumn(new TableColumn());
		fixture.setMaxItems(1);
		fixture.setNameColumn(new TableColumn());
		fixture.setRulesTab(new Tab());
		fixture.setGraphMenu(new Menu());

		TableColumn<TableRule, String> result = fixture.getActionColumn();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.gui.controller.MainController
		assertNotNull(result);
	}

	/**
	 * Run the TableColumn<TableRule, String> getAddressInColumn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testGetAddressInColumn_1()
		throws Exception {
		MainController fixture = new MainController();
		fixture.setServiceColumn(new TableColumn());
		fixture.setAddressInColumn(new TableColumn());
		fixture.setHelpMenuItem(new MenuItem());
		fixture.setGraphTab(new Tab());
		fixture.setDisplayGraphMenu(new MenuItem());
		fixture.setTabPane(new TabPane());
		fixture.setAutoRefreshMenu(new MenuItem());
		fixture.setActionColumn(new TableColumn());
		fixture.setHelpMenu(new Menu());
		fixture.setTableData(null);
		fixture.setGraph(new LineChart((Axis<Object>) null, (Axis<Object>) null));
		fixture.setDataManager(new DataSourceImpl());
		fixture.setApplicationMenu(new Menu());
		fixture.setRefreshMenu(new MenuItem());
		fixture.setChangeDeviceMenu(new MenuItem());
		fixture.setMenuBar(new MenuBar());
		fixture.setGraphItemsPane(new FlowPane());
		fixture.setTable(new TableView());
		fixture.setAddressOutColumn(new TableColumn());
		fixture.setMaxItemsMenu(new MenuItem());
		fixture.setGuideMenu(new MenuItem());
		fixture.setChangeRuleMenu(new MenuItem());
		fixture.setRulesMenu(new Menu());
		fixture.setLoggedColumn(new TableColumn());
		fixture.setZoneOutColumn(new TableColumn());
		fixture.setZoneInColumn(new TableColumn());
		fixture.setMaxItems(1);
		fixture.setNameColumn(new TableColumn());
		fixture.setRulesTab(new Tab());
		fixture.setGraphMenu(new Menu());

		TableColumn<TableRule, String> result = fixture.getAddressInColumn();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.gui.controller.MainController
		assertNotNull(result);
	}

	/**
	 * Run the TableColumn<TableRule, String> getAddressOutColumn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testGetAddressOutColumn_1()
		throws Exception {
		MainController fixture = new MainController();
		fixture.setServiceColumn(new TableColumn());
		fixture.setAddressInColumn(new TableColumn());
		fixture.setHelpMenuItem(new MenuItem());
		fixture.setGraphTab(new Tab());
		fixture.setDisplayGraphMenu(new MenuItem());
		fixture.setTabPane(new TabPane());
		fixture.setAutoRefreshMenu(new MenuItem());
		fixture.setActionColumn(new TableColumn());
		fixture.setHelpMenu(new Menu());
		fixture.setTableData(null);
		fixture.setGraph(new LineChart((Axis<Object>) null, (Axis<Object>) null));
		fixture.setDataManager(new DataSourceImpl());
		fixture.setApplicationMenu(new Menu());
		fixture.setRefreshMenu(new MenuItem());
		fixture.setChangeDeviceMenu(new MenuItem());
		fixture.setMenuBar(new MenuBar());
		fixture.setGraphItemsPane(new FlowPane());
		fixture.setTable(new TableView());
		fixture.setAddressOutColumn(new TableColumn());
		fixture.setMaxItemsMenu(new MenuItem());
		fixture.setGuideMenu(new MenuItem());
		fixture.setChangeRuleMenu(new MenuItem());
		fixture.setRulesMenu(new Menu());
		fixture.setLoggedColumn(new TableColumn());
		fixture.setZoneOutColumn(new TableColumn());
		fixture.setZoneInColumn(new TableColumn());
		fixture.setMaxItems(1);
		fixture.setNameColumn(new TableColumn());
		fixture.setRulesTab(new Tab());
		fixture.setGraphMenu(new Menu());

		TableColumn<TableRule, String> result = fixture.getAddressOutColumn();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.gui.controller.MainController
		assertNotNull(result);
	}

	/**
	 * Run the Menu getApplicationMenu() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testGetApplicationMenu_1()
		throws Exception {
		MainController fixture = new MainController();
		fixture.setServiceColumn(new TableColumn());
		fixture.setAddressInColumn(new TableColumn());
		fixture.setHelpMenuItem(new MenuItem());
		fixture.setGraphTab(new Tab());
		fixture.setDisplayGraphMenu(new MenuItem());
		fixture.setTabPane(new TabPane());
		fixture.setAutoRefreshMenu(new MenuItem());
		fixture.setActionColumn(new TableColumn());
		fixture.setHelpMenu(new Menu());
		fixture.setTableData(null);
		fixture.setGraph(new LineChart((Axis<Object>) null, (Axis<Object>) null));
		fixture.setDataManager(new DataSourceImpl());
		fixture.setApplicationMenu(new Menu());
		fixture.setRefreshMenu(new MenuItem());
		fixture.setChangeDeviceMenu(new MenuItem());
		fixture.setMenuBar(new MenuBar());
		fixture.setGraphItemsPane(new FlowPane());
		fixture.setTable(new TableView());
		fixture.setAddressOutColumn(new TableColumn());
		fixture.setMaxItemsMenu(new MenuItem());
		fixture.setGuideMenu(new MenuItem());
		fixture.setChangeRuleMenu(new MenuItem());
		fixture.setRulesMenu(new Menu());
		fixture.setLoggedColumn(new TableColumn());
		fixture.setZoneOutColumn(new TableColumn());
		fixture.setZoneInColumn(new TableColumn());
		fixture.setMaxItems(1);
		fixture.setNameColumn(new TableColumn());
		fixture.setRulesTab(new Tab());
		fixture.setGraphMenu(new Menu());

		Menu result = fixture.getApplicationMenu();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.gui.controller.MainController
		assertNotNull(result);
	}

	/**
	 * Run the MenuItem getAutoRefreshMenu() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testGetAutoRefreshMenu_1()
		throws Exception {
		MainController fixture = new MainController();
		fixture.setServiceColumn(new TableColumn());
		fixture.setAddressInColumn(new TableColumn());
		fixture.setHelpMenuItem(new MenuItem());
		fixture.setGraphTab(new Tab());
		fixture.setDisplayGraphMenu(new MenuItem());
		fixture.setTabPane(new TabPane());
		fixture.setAutoRefreshMenu(new MenuItem());
		fixture.setActionColumn(new TableColumn());
		fixture.setHelpMenu(new Menu());
		fixture.setTableData(null);
		fixture.setGraph(new LineChart((Axis<Object>) null, (Axis<Object>) null));
		fixture.setDataManager(new DataSourceImpl());
		fixture.setApplicationMenu(new Menu());
		fixture.setRefreshMenu(new MenuItem());
		fixture.setChangeDeviceMenu(new MenuItem());
		fixture.setMenuBar(new MenuBar());
		fixture.setGraphItemsPane(new FlowPane());
		fixture.setTable(new TableView());
		fixture.setAddressOutColumn(new TableColumn());
		fixture.setMaxItemsMenu(new MenuItem());
		fixture.setGuideMenu(new MenuItem());
		fixture.setChangeRuleMenu(new MenuItem());
		fixture.setRulesMenu(new Menu());
		fixture.setLoggedColumn(new TableColumn());
		fixture.setZoneOutColumn(new TableColumn());
		fixture.setZoneInColumn(new TableColumn());
		fixture.setMaxItems(1);
		fixture.setNameColumn(new TableColumn());
		fixture.setRulesTab(new Tab());
		fixture.setGraphMenu(new Menu());

		MenuItem result = fixture.getAutoRefreshMenu();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.gui.controller.MainController
		assertNotNull(result);
	}

	/**
	 * Run the MenuItem getChangeDeviceMenu() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testGetChangeDeviceMenu_1()
		throws Exception {
		MainController fixture = new MainController();
		fixture.setServiceColumn(new TableColumn());
		fixture.setAddressInColumn(new TableColumn());
		fixture.setHelpMenuItem(new MenuItem());
		fixture.setGraphTab(new Tab());
		fixture.setDisplayGraphMenu(new MenuItem());
		fixture.setTabPane(new TabPane());
		fixture.setAutoRefreshMenu(new MenuItem());
		fixture.setActionColumn(new TableColumn());
		fixture.setHelpMenu(new Menu());
		fixture.setTableData(null);
		fixture.setGraph(new LineChart((Axis<Object>) null, (Axis<Object>) null));
		fixture.setDataManager(new DataSourceImpl());
		fixture.setApplicationMenu(new Menu());
		fixture.setRefreshMenu(new MenuItem());
		fixture.setChangeDeviceMenu(new MenuItem());
		fixture.setMenuBar(new MenuBar());
		fixture.setGraphItemsPane(new FlowPane());
		fixture.setTable(new TableView());
		fixture.setAddressOutColumn(new TableColumn());
		fixture.setMaxItemsMenu(new MenuItem());
		fixture.setGuideMenu(new MenuItem());
		fixture.setChangeRuleMenu(new MenuItem());
		fixture.setRulesMenu(new Menu());
		fixture.setLoggedColumn(new TableColumn());
		fixture.setZoneOutColumn(new TableColumn());
		fixture.setZoneInColumn(new TableColumn());
		fixture.setMaxItems(1);
		fixture.setNameColumn(new TableColumn());
		fixture.setRulesTab(new Tab());
		fixture.setGraphMenu(new Menu());

		MenuItem result = fixture.getChangeDeviceMenu();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.gui.controller.MainController
		assertNotNull(result);
	}

	/**
	 * Run the MenuItem getChangeRuleMenu() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testGetChangeRuleMenu_1()
		throws Exception {
		MainController fixture = new MainController();
		fixture.setServiceColumn(new TableColumn());
		fixture.setAddressInColumn(new TableColumn());
		fixture.setHelpMenuItem(new MenuItem());
		fixture.setGraphTab(new Tab());
		fixture.setDisplayGraphMenu(new MenuItem());
		fixture.setTabPane(new TabPane());
		fixture.setAutoRefreshMenu(new MenuItem());
		fixture.setActionColumn(new TableColumn());
		fixture.setHelpMenu(new Menu());
		fixture.setTableData(null);
		fixture.setGraph(new LineChart((Axis<Object>) null, (Axis<Object>) null));
		fixture.setDataManager(new DataSourceImpl());
		fixture.setApplicationMenu(new Menu());
		fixture.setRefreshMenu(new MenuItem());
		fixture.setChangeDeviceMenu(new MenuItem());
		fixture.setMenuBar(new MenuBar());
		fixture.setGraphItemsPane(new FlowPane());
		fixture.setTable(new TableView());
		fixture.setAddressOutColumn(new TableColumn());
		fixture.setMaxItemsMenu(new MenuItem());
		fixture.setGuideMenu(new MenuItem());
		fixture.setChangeRuleMenu(new MenuItem());
		fixture.setRulesMenu(new Menu());
		fixture.setLoggedColumn(new TableColumn());
		fixture.setZoneOutColumn(new TableColumn());
		fixture.setZoneInColumn(new TableColumn());
		fixture.setMaxItems(1);
		fixture.setNameColumn(new TableColumn());
		fixture.setRulesTab(new Tab());
		fixture.setGraphMenu(new Menu());

		MenuItem result = fixture.getChangeRuleMenu();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.gui.controller.MainController
		assertNotNull(result);
	}

	/**
	 * Run the IDataSource getDataManager() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testGetDataManager_1()
		throws Exception {
		MainController fixture = new MainController();
		fixture.setServiceColumn(new TableColumn());
		fixture.setAddressInColumn(new TableColumn());
		fixture.setHelpMenuItem(new MenuItem());
		fixture.setGraphTab(new Tab());
		fixture.setDisplayGraphMenu(new MenuItem());
		fixture.setTabPane(new TabPane());
		fixture.setAutoRefreshMenu(new MenuItem());
		fixture.setActionColumn(new TableColumn());
		fixture.setHelpMenu(new Menu());
		fixture.setTableData(null);
		fixture.setGraph(new LineChart((Axis<Object>) null, (Axis<Object>) null));
		fixture.setDataManager(new DataSourceImpl());
		fixture.setApplicationMenu(new Menu());
		fixture.setRefreshMenu(new MenuItem());
		fixture.setChangeDeviceMenu(new MenuItem());
		fixture.setMenuBar(new MenuBar());
		fixture.setGraphItemsPane(new FlowPane());
		fixture.setTable(new TableView());
		fixture.setAddressOutColumn(new TableColumn());
		fixture.setMaxItemsMenu(new MenuItem());
		fixture.setGuideMenu(new MenuItem());
		fixture.setChangeRuleMenu(new MenuItem());
		fixture.setRulesMenu(new Menu());
		fixture.setLoggedColumn(new TableColumn());
		fixture.setZoneOutColumn(new TableColumn());
		fixture.setZoneInColumn(new TableColumn());
		fixture.setMaxItems(1);
		fixture.setNameColumn(new TableColumn());
		fixture.setRulesTab(new Tab());
		fixture.setGraphMenu(new Menu());

		IDataSource result = fixture.getDataManager();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.gui.controller.MainController
		assertNotNull(result);
	}

	/**
	 * Run the MenuItem getDisplayGraphMenu() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testGetDisplayGraphMenu_1()
		throws Exception {
		MainController fixture = new MainController();
		fixture.setServiceColumn(new TableColumn());
		fixture.setAddressInColumn(new TableColumn());
		fixture.setHelpMenuItem(new MenuItem());
		fixture.setGraphTab(new Tab());
		fixture.setDisplayGraphMenu(new MenuItem());
		fixture.setTabPane(new TabPane());
		fixture.setAutoRefreshMenu(new MenuItem());
		fixture.setActionColumn(new TableColumn());
		fixture.setHelpMenu(new Menu());
		fixture.setTableData(null);
		fixture.setGraph(new LineChart((Axis<Object>) null, (Axis<Object>) null));
		fixture.setDataManager(new DataSourceImpl());
		fixture.setApplicationMenu(new Menu());
		fixture.setRefreshMenu(new MenuItem());
		fixture.setChangeDeviceMenu(new MenuItem());
		fixture.setMenuBar(new MenuBar());
		fixture.setGraphItemsPane(new FlowPane());
		fixture.setTable(new TableView());
		fixture.setAddressOutColumn(new TableColumn());
		fixture.setMaxItemsMenu(new MenuItem());
		fixture.setGuideMenu(new MenuItem());
		fixture.setChangeRuleMenu(new MenuItem());
		fixture.setRulesMenu(new Menu());
		fixture.setLoggedColumn(new TableColumn());
		fixture.setZoneOutColumn(new TableColumn());
		fixture.setZoneInColumn(new TableColumn());
		fixture.setMaxItems(1);
		fixture.setNameColumn(new TableColumn());
		fixture.setRulesTab(new Tab());
		fixture.setGraphMenu(new Menu());

		MenuItem result = fixture.getDisplayGraphMenu();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.gui.controller.MainController
		assertNotNull(result);
	}

	/**
	 * Run the LineChart<Object, Object> getGraph() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testGetGraph_1()
		throws Exception {
		MainController fixture = new MainController();
		fixture.setServiceColumn(new TableColumn());
		fixture.setAddressInColumn(new TableColumn());
		fixture.setHelpMenuItem(new MenuItem());
		fixture.setGraphTab(new Tab());
		fixture.setDisplayGraphMenu(new MenuItem());
		fixture.setTabPane(new TabPane());
		fixture.setAutoRefreshMenu(new MenuItem());
		fixture.setActionColumn(new TableColumn());
		fixture.setHelpMenu(new Menu());
		fixture.setTableData(null);
		fixture.setGraph(new LineChart((Axis<Object>) null, (Axis<Object>) null));
		fixture.setDataManager(new DataSourceImpl());
		fixture.setApplicationMenu(new Menu());
		fixture.setRefreshMenu(new MenuItem());
		fixture.setChangeDeviceMenu(new MenuItem());
		fixture.setMenuBar(new MenuBar());
		fixture.setGraphItemsPane(new FlowPane());
		fixture.setTable(new TableView());
		fixture.setAddressOutColumn(new TableColumn());
		fixture.setMaxItemsMenu(new MenuItem());
		fixture.setGuideMenu(new MenuItem());
		fixture.setChangeRuleMenu(new MenuItem());
		fixture.setRulesMenu(new Menu());
		fixture.setLoggedColumn(new TableColumn());
		fixture.setZoneOutColumn(new TableColumn());
		fixture.setZoneInColumn(new TableColumn());
		fixture.setMaxItems(1);
		fixture.setNameColumn(new TableColumn());
		fixture.setRulesTab(new Tab());
		fixture.setGraphMenu(new Menu());

		LineChart result = fixture.getGraph();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.gui.controller.MainController
		assertNotNull(result);
	}

	/**
	 * Run the FlowPane getGraphItemsPane() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testGetGraphItemsPane_1()
		throws Exception {
		MainController fixture = new MainController();
		fixture.setServiceColumn(new TableColumn());
		fixture.setAddressInColumn(new TableColumn());
		fixture.setHelpMenuItem(new MenuItem());
		fixture.setGraphTab(new Tab());
		fixture.setDisplayGraphMenu(new MenuItem());
		fixture.setTabPane(new TabPane());
		fixture.setAutoRefreshMenu(new MenuItem());
		fixture.setActionColumn(new TableColumn());
		fixture.setHelpMenu(new Menu());
		fixture.setTableData(null);
		fixture.setGraph(new LineChart((Axis<Object>) null, (Axis<Object>) null));
		fixture.setDataManager(new DataSourceImpl());
		fixture.setApplicationMenu(new Menu());
		fixture.setRefreshMenu(new MenuItem());
		fixture.setChangeDeviceMenu(new MenuItem());
		fixture.setMenuBar(new MenuBar());
		fixture.setGraphItemsPane(new FlowPane());
		fixture.setTable(new TableView());
		fixture.setAddressOutColumn(new TableColumn());
		fixture.setMaxItemsMenu(new MenuItem());
		fixture.setGuideMenu(new MenuItem());
		fixture.setChangeRuleMenu(new MenuItem());
		fixture.setRulesMenu(new Menu());
		fixture.setLoggedColumn(new TableColumn());
		fixture.setZoneOutColumn(new TableColumn());
		fixture.setZoneInColumn(new TableColumn());
		fixture.setMaxItems(1);
		fixture.setNameColumn(new TableColumn());
		fixture.setRulesTab(new Tab());
		fixture.setGraphMenu(new Menu());

		FlowPane result = fixture.getGraphItemsPane();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.gui.controller.MainController
		assertNotNull(result);
	}

	/**
	 * Run the Menu getGraphMenu() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testGetGraphMenu_1()
		throws Exception {
		MainController fixture = new MainController();
		fixture.setServiceColumn(new TableColumn());
		fixture.setAddressInColumn(new TableColumn());
		fixture.setHelpMenuItem(new MenuItem());
		fixture.setGraphTab(new Tab());
		fixture.setDisplayGraphMenu(new MenuItem());
		fixture.setTabPane(new TabPane());
		fixture.setAutoRefreshMenu(new MenuItem());
		fixture.setActionColumn(new TableColumn());
		fixture.setHelpMenu(new Menu());
		fixture.setTableData(null);
		fixture.setGraph(new LineChart((Axis<Object>) null, (Axis<Object>) null));
		fixture.setDataManager(new DataSourceImpl());
		fixture.setApplicationMenu(new Menu());
		fixture.setRefreshMenu(new MenuItem());
		fixture.setChangeDeviceMenu(new MenuItem());
		fixture.setMenuBar(new MenuBar());
		fixture.setGraphItemsPane(new FlowPane());
		fixture.setTable(new TableView());
		fixture.setAddressOutColumn(new TableColumn());
		fixture.setMaxItemsMenu(new MenuItem());
		fixture.setGuideMenu(new MenuItem());
		fixture.setChangeRuleMenu(new MenuItem());
		fixture.setRulesMenu(new Menu());
		fixture.setLoggedColumn(new TableColumn());
		fixture.setZoneOutColumn(new TableColumn());
		fixture.setZoneInColumn(new TableColumn());
		fixture.setMaxItems(1);
		fixture.setNameColumn(new TableColumn());
		fixture.setRulesTab(new Tab());
		fixture.setGraphMenu(new Menu());

		Menu result = fixture.getGraphMenu();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.gui.controller.MainController
		assertNotNull(result);
	}

	/**
	 * Run the Tab getGraphTab() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testGetGraphTab_1()
		throws Exception {
		MainController fixture = new MainController();
		fixture.setServiceColumn(new TableColumn());
		fixture.setAddressInColumn(new TableColumn());
		fixture.setHelpMenuItem(new MenuItem());
		fixture.setGraphTab(new Tab());
		fixture.setDisplayGraphMenu(new MenuItem());
		fixture.setTabPane(new TabPane());
		fixture.setAutoRefreshMenu(new MenuItem());
		fixture.setActionColumn(new TableColumn());
		fixture.setHelpMenu(new Menu());
		fixture.setTableData(null);
		fixture.setGraph(new LineChart((Axis<Object>) null, (Axis<Object>) null));
		fixture.setDataManager(new DataSourceImpl());
		fixture.setApplicationMenu(new Menu());
		fixture.setRefreshMenu(new MenuItem());
		fixture.setChangeDeviceMenu(new MenuItem());
		fixture.setMenuBar(new MenuBar());
		fixture.setGraphItemsPane(new FlowPane());
		fixture.setTable(new TableView());
		fixture.setAddressOutColumn(new TableColumn());
		fixture.setMaxItemsMenu(new MenuItem());
		fixture.setGuideMenu(new MenuItem());
		fixture.setChangeRuleMenu(new MenuItem());
		fixture.setRulesMenu(new Menu());
		fixture.setLoggedColumn(new TableColumn());
		fixture.setZoneOutColumn(new TableColumn());
		fixture.setZoneInColumn(new TableColumn());
		fixture.setMaxItems(1);
		fixture.setNameColumn(new TableColumn());
		fixture.setRulesTab(new Tab());
		fixture.setGraphMenu(new Menu());

		Tab result = fixture.getGraphTab();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.gui.controller.MainController
		assertNotNull(result);
	}

	/**
	 * Run the MenuItem getGuideMenu() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testGetGuideMenu_1()
		throws Exception {
		MainController fixture = new MainController();
		fixture.setServiceColumn(new TableColumn());
		fixture.setAddressInColumn(new TableColumn());
		fixture.setHelpMenuItem(new MenuItem());
		fixture.setGraphTab(new Tab());
		fixture.setDisplayGraphMenu(new MenuItem());
		fixture.setTabPane(new TabPane());
		fixture.setAutoRefreshMenu(new MenuItem());
		fixture.setActionColumn(new TableColumn());
		fixture.setHelpMenu(new Menu());
		fixture.setTableData(null);
		fixture.setGraph(new LineChart((Axis<Object>) null, (Axis<Object>) null));
		fixture.setDataManager(new DataSourceImpl());
		fixture.setApplicationMenu(new Menu());
		fixture.setRefreshMenu(new MenuItem());
		fixture.setChangeDeviceMenu(new MenuItem());
		fixture.setMenuBar(new MenuBar());
		fixture.setGraphItemsPane(new FlowPane());
		fixture.setTable(new TableView());
		fixture.setAddressOutColumn(new TableColumn());
		fixture.setMaxItemsMenu(new MenuItem());
		fixture.setGuideMenu(new MenuItem());
		fixture.setChangeRuleMenu(new MenuItem());
		fixture.setRulesMenu(new Menu());
		fixture.setLoggedColumn(new TableColumn());
		fixture.setZoneOutColumn(new TableColumn());
		fixture.setZoneInColumn(new TableColumn());
		fixture.setMaxItems(1);
		fixture.setNameColumn(new TableColumn());
		fixture.setRulesTab(new Tab());
		fixture.setGraphMenu(new Menu());

		MenuItem result = fixture.getGuideMenu();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.gui.controller.MainController
		assertNotNull(result);
	}

	/**
	 * Run the Menu getHelpMenu() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testGetHelpMenu_1()
		throws Exception {
		MainController fixture = new MainController();
		fixture.setServiceColumn(new TableColumn());
		fixture.setAddressInColumn(new TableColumn());
		fixture.setHelpMenuItem(new MenuItem());
		fixture.setGraphTab(new Tab());
		fixture.setDisplayGraphMenu(new MenuItem());
		fixture.setTabPane(new TabPane());
		fixture.setAutoRefreshMenu(new MenuItem());
		fixture.setActionColumn(new TableColumn());
		fixture.setHelpMenu(new Menu());
		fixture.setTableData(null);
		fixture.setGraph(new LineChart((Axis<Object>) null, (Axis<Object>) null));
		fixture.setDataManager(new DataSourceImpl());
		fixture.setApplicationMenu(new Menu());
		fixture.setRefreshMenu(new MenuItem());
		fixture.setChangeDeviceMenu(new MenuItem());
		fixture.setMenuBar(new MenuBar());
		fixture.setGraphItemsPane(new FlowPane());
		fixture.setTable(new TableView());
		fixture.setAddressOutColumn(new TableColumn());
		fixture.setMaxItemsMenu(new MenuItem());
		fixture.setGuideMenu(new MenuItem());
		fixture.setChangeRuleMenu(new MenuItem());
		fixture.setRulesMenu(new Menu());
		fixture.setLoggedColumn(new TableColumn());
		fixture.setZoneOutColumn(new TableColumn());
		fixture.setZoneInColumn(new TableColumn());
		fixture.setMaxItems(1);
		fixture.setNameColumn(new TableColumn());
		fixture.setRulesTab(new Tab());
		fixture.setGraphMenu(new Menu());

		Menu result = fixture.getHelpMenu();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.gui.controller.MainController
		assertNotNull(result);
	}

	/**
	 * Run the MenuItem getHelpMenuItem() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testGetHelpMenuItem_1()
		throws Exception {
		MainController fixture = new MainController();
		fixture.setServiceColumn(new TableColumn());
		fixture.setAddressInColumn(new TableColumn());
		fixture.setHelpMenuItem(new MenuItem());
		fixture.setGraphTab(new Tab());
		fixture.setDisplayGraphMenu(new MenuItem());
		fixture.setTabPane(new TabPane());
		fixture.setAutoRefreshMenu(new MenuItem());
		fixture.setActionColumn(new TableColumn());
		fixture.setHelpMenu(new Menu());
		fixture.setTableData(null);
		fixture.setGraph(new LineChart((Axis<Object>) null, (Axis<Object>) null));
		fixture.setDataManager(new DataSourceImpl());
		fixture.setApplicationMenu(new Menu());
		fixture.setRefreshMenu(new MenuItem());
		fixture.setChangeDeviceMenu(new MenuItem());
		fixture.setMenuBar(new MenuBar());
		fixture.setGraphItemsPane(new FlowPane());
		fixture.setTable(new TableView());
		fixture.setAddressOutColumn(new TableColumn());
		fixture.setMaxItemsMenu(new MenuItem());
		fixture.setGuideMenu(new MenuItem());
		fixture.setChangeRuleMenu(new MenuItem());
		fixture.setRulesMenu(new Menu());
		fixture.setLoggedColumn(new TableColumn());
		fixture.setZoneOutColumn(new TableColumn());
		fixture.setZoneInColumn(new TableColumn());
		fixture.setMaxItems(1);
		fixture.setNameColumn(new TableColumn());
		fixture.setRulesTab(new Tab());
		fixture.setGraphMenu(new Menu());

		MenuItem result = fixture.getHelpMenuItem();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.gui.controller.MainController
		assertNotNull(result);
	}

	/**
	 * Run the MainController getInstance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testGetInstance_1()
		throws Exception {

		MainController result = MainController.getInstance();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.gui.controller.MainController
		assertNotNull(result);
	}

	/**
	 * Run the TableColumn<TableRule, Boolean> getLoggedColumn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testGetLoggedColumn_1()
		throws Exception {
		MainController fixture = new MainController();
		fixture.setServiceColumn(new TableColumn());
		fixture.setAddressInColumn(new TableColumn());
		fixture.setHelpMenuItem(new MenuItem());
		fixture.setGraphTab(new Tab());
		fixture.setDisplayGraphMenu(new MenuItem());
		fixture.setTabPane(new TabPane());
		fixture.setAutoRefreshMenu(new MenuItem());
		fixture.setActionColumn(new TableColumn());
		fixture.setHelpMenu(new Menu());
		fixture.setTableData(null);
		fixture.setGraph(new LineChart((Axis<Object>) null, (Axis<Object>) null));
		fixture.setDataManager(new DataSourceImpl());
		fixture.setApplicationMenu(new Menu());
		fixture.setRefreshMenu(new MenuItem());
		fixture.setChangeDeviceMenu(new MenuItem());
		fixture.setMenuBar(new MenuBar());
		fixture.setGraphItemsPane(new FlowPane());
		fixture.setTable(new TableView());
		fixture.setAddressOutColumn(new TableColumn());
		fixture.setMaxItemsMenu(new MenuItem());
		fixture.setGuideMenu(new MenuItem());
		fixture.setChangeRuleMenu(new MenuItem());
		fixture.setRulesMenu(new Menu());
		fixture.setLoggedColumn(new TableColumn());
		fixture.setZoneOutColumn(new TableColumn());
		fixture.setZoneInColumn(new TableColumn());
		fixture.setMaxItems(1);
		fixture.setNameColumn(new TableColumn());
		fixture.setRulesTab(new Tab());
		fixture.setGraphMenu(new Menu());

		TableColumn<TableRule, Boolean> result = fixture.getLoggedColumn();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.gui.controller.MainController
		assertNotNull(result);
	}

	/**
	 * Run the int getMaxItems() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testGetMaxItems_1()
		throws Exception {
		MainController fixture = new MainController();
		fixture.setServiceColumn(new TableColumn());
		fixture.setAddressInColumn(new TableColumn());
		fixture.setHelpMenuItem(new MenuItem());
		fixture.setGraphTab(new Tab());
		fixture.setDisplayGraphMenu(new MenuItem());
		fixture.setTabPane(new TabPane());
		fixture.setAutoRefreshMenu(new MenuItem());
		fixture.setActionColumn(new TableColumn());
		fixture.setHelpMenu(new Menu());
		fixture.setTableData(null);
		fixture.setGraph(new LineChart((Axis<Object>) null, (Axis<Object>) null));
		fixture.setDataManager(new DataSourceImpl());
		fixture.setApplicationMenu(new Menu());
		fixture.setRefreshMenu(new MenuItem());
		fixture.setChangeDeviceMenu(new MenuItem());
		fixture.setMenuBar(new MenuBar());
		fixture.setGraphItemsPane(new FlowPane());
		fixture.setTable(new TableView());
		fixture.setAddressOutColumn(new TableColumn());
		fixture.setMaxItemsMenu(new MenuItem());
		fixture.setGuideMenu(new MenuItem());
		fixture.setChangeRuleMenu(new MenuItem());
		fixture.setRulesMenu(new Menu());
		fixture.setLoggedColumn(new TableColumn());
		fixture.setZoneOutColumn(new TableColumn());
		fixture.setZoneInColumn(new TableColumn());
		fixture.setMaxItems(1);
		fixture.setNameColumn(new TableColumn());
		fixture.setRulesTab(new Tab());
		fixture.setGraphMenu(new Menu());

		int result = fixture.getMaxItems();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.gui.controller.MainController
		assertEquals(0, result);
	}

	/**
	 * Run the MenuItem getMaxItemsMenu() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testGetMaxItemsMenu_1()
		throws Exception {
		MainController fixture = new MainController();
		fixture.setServiceColumn(new TableColumn());
		fixture.setAddressInColumn(new TableColumn());
		fixture.setHelpMenuItem(new MenuItem());
		fixture.setGraphTab(new Tab());
		fixture.setDisplayGraphMenu(new MenuItem());
		fixture.setTabPane(new TabPane());
		fixture.setAutoRefreshMenu(new MenuItem());
		fixture.setActionColumn(new TableColumn());
		fixture.setHelpMenu(new Menu());
		fixture.setTableData(null);
		fixture.setGraph(new LineChart((Axis<Object>) null, (Axis<Object>) null));
		fixture.setDataManager(new DataSourceImpl());
		fixture.setApplicationMenu(new Menu());
		fixture.setRefreshMenu(new MenuItem());
		fixture.setChangeDeviceMenu(new MenuItem());
		fixture.setMenuBar(new MenuBar());
		fixture.setGraphItemsPane(new FlowPane());
		fixture.setTable(new TableView());
		fixture.setAddressOutColumn(new TableColumn());
		fixture.setMaxItemsMenu(new MenuItem());
		fixture.setGuideMenu(new MenuItem());
		fixture.setChangeRuleMenu(new MenuItem());
		fixture.setRulesMenu(new Menu());
		fixture.setLoggedColumn(new TableColumn());
		fixture.setZoneOutColumn(new TableColumn());
		fixture.setZoneInColumn(new TableColumn());
		fixture.setMaxItems(1);
		fixture.setNameColumn(new TableColumn());
		fixture.setRulesTab(new Tab());
		fixture.setGraphMenu(new Menu());

		MenuItem result = fixture.getMaxItemsMenu();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.gui.controller.MainController
		assertNotNull(result);
	}

	/**
	 * Run the MenuBar getMenuBar() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testGetMenuBar_1()
		throws Exception {
		MainController fixture = new MainController();
		fixture.setServiceColumn(new TableColumn());
		fixture.setAddressInColumn(new TableColumn());
		fixture.setHelpMenuItem(new MenuItem());
		fixture.setGraphTab(new Tab());
		fixture.setDisplayGraphMenu(new MenuItem());
		fixture.setTabPane(new TabPane());
		fixture.setAutoRefreshMenu(new MenuItem());
		fixture.setActionColumn(new TableColumn());
		fixture.setHelpMenu(new Menu());
		fixture.setTableData(null);
		fixture.setGraph(new LineChart((Axis<Object>) null, (Axis<Object>) null));
		fixture.setDataManager(new DataSourceImpl());
		fixture.setApplicationMenu(new Menu());
		fixture.setRefreshMenu(new MenuItem());
		fixture.setChangeDeviceMenu(new MenuItem());
		fixture.setMenuBar(new MenuBar());
		fixture.setGraphItemsPane(new FlowPane());
		fixture.setTable(new TableView());
		fixture.setAddressOutColumn(new TableColumn());
		fixture.setMaxItemsMenu(new MenuItem());
		fixture.setGuideMenu(new MenuItem());
		fixture.setChangeRuleMenu(new MenuItem());
		fixture.setRulesMenu(new Menu());
		fixture.setLoggedColumn(new TableColumn());
		fixture.setZoneOutColumn(new TableColumn());
		fixture.setZoneInColumn(new TableColumn());
		fixture.setMaxItems(1);
		fixture.setNameColumn(new TableColumn());
		fixture.setRulesTab(new Tab());
		fixture.setGraphMenu(new Menu());

		MenuBar result = fixture.getMenuBar();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.gui.controller.MainController
		assertNotNull(result);
	}

	/**
	 * Run the TableColumn<TableRule, String> getNameColumn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testGetNameColumn_1()
		throws Exception {
		MainController fixture = new MainController();
		fixture.setServiceColumn(new TableColumn());
		fixture.setAddressInColumn(new TableColumn());
		fixture.setHelpMenuItem(new MenuItem());
		fixture.setGraphTab(new Tab());
		fixture.setDisplayGraphMenu(new MenuItem());
		fixture.setTabPane(new TabPane());
		fixture.setAutoRefreshMenu(new MenuItem());
		fixture.setActionColumn(new TableColumn());
		fixture.setHelpMenu(new Menu());
		fixture.setTableData(null);
		fixture.setGraph(new LineChart((Axis<Object>) null, (Axis<Object>) null));
		fixture.setDataManager(new DataSourceImpl());
		fixture.setApplicationMenu(new Menu());
		fixture.setRefreshMenu(new MenuItem());
		fixture.setChangeDeviceMenu(new MenuItem());
		fixture.setMenuBar(new MenuBar());
		fixture.setGraphItemsPane(new FlowPane());
		fixture.setTable(new TableView());
		fixture.setAddressOutColumn(new TableColumn());
		fixture.setMaxItemsMenu(new MenuItem());
		fixture.setGuideMenu(new MenuItem());
		fixture.setChangeRuleMenu(new MenuItem());
		fixture.setRulesMenu(new Menu());
		fixture.setLoggedColumn(new TableColumn());
		fixture.setZoneOutColumn(new TableColumn());
		fixture.setZoneInColumn(new TableColumn());
		fixture.setMaxItems(1);
		fixture.setNameColumn(new TableColumn());
		fixture.setRulesTab(new Tab());
		fixture.setGraphMenu(new Menu());

		TableColumn<TableRule, String> result = fixture.getNameColumn();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.gui.controller.MainController
		assertNotNull(result);
	}

	/**
	 * Run the MenuItem getRefreshMenu() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testGetRefreshMenu_1()
		throws Exception {
		MainController fixture = new MainController();
		fixture.setServiceColumn(new TableColumn());
		fixture.setAddressInColumn(new TableColumn());
		fixture.setHelpMenuItem(new MenuItem());
		fixture.setGraphTab(new Tab());
		fixture.setDisplayGraphMenu(new MenuItem());
		fixture.setTabPane(new TabPane());
		fixture.setAutoRefreshMenu(new MenuItem());
		fixture.setActionColumn(new TableColumn());
		fixture.setHelpMenu(new Menu());
		fixture.setTableData(null);
		fixture.setGraph(new LineChart((Axis<Object>) null, (Axis<Object>) null));
		fixture.setDataManager(new DataSourceImpl());
		fixture.setApplicationMenu(new Menu());
		fixture.setRefreshMenu(new MenuItem());
		fixture.setChangeDeviceMenu(new MenuItem());
		fixture.setMenuBar(new MenuBar());
		fixture.setGraphItemsPane(new FlowPane());
		fixture.setTable(new TableView());
		fixture.setAddressOutColumn(new TableColumn());
		fixture.setMaxItemsMenu(new MenuItem());
		fixture.setGuideMenu(new MenuItem());
		fixture.setChangeRuleMenu(new MenuItem());
		fixture.setRulesMenu(new Menu());
		fixture.setLoggedColumn(new TableColumn());
		fixture.setZoneOutColumn(new TableColumn());
		fixture.setZoneInColumn(new TableColumn());
		fixture.setMaxItems(1);
		fixture.setNameColumn(new TableColumn());
		fixture.setRulesTab(new Tab());
		fixture.setGraphMenu(new Menu());

		MenuItem result = fixture.getRefreshMenu();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.gui.controller.MainController
		assertNotNull(result);
	}

	/**
	 * Run the Menu getRulesMenu() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testGetRulesMenu_1()
		throws Exception {
		MainController fixture = new MainController();
		fixture.setServiceColumn(new TableColumn());
		fixture.setAddressInColumn(new TableColumn());
		fixture.setHelpMenuItem(new MenuItem());
		fixture.setGraphTab(new Tab());
		fixture.setDisplayGraphMenu(new MenuItem());
		fixture.setTabPane(new TabPane());
		fixture.setAutoRefreshMenu(new MenuItem());
		fixture.setActionColumn(new TableColumn());
		fixture.setHelpMenu(new Menu());
		fixture.setTableData(null);
		fixture.setGraph(new LineChart((Axis<Object>) null, (Axis<Object>) null));
		fixture.setDataManager(new DataSourceImpl());
		fixture.setApplicationMenu(new Menu());
		fixture.setRefreshMenu(new MenuItem());
		fixture.setChangeDeviceMenu(new MenuItem());
		fixture.setMenuBar(new MenuBar());
		fixture.setGraphItemsPane(new FlowPane());
		fixture.setTable(new TableView());
		fixture.setAddressOutColumn(new TableColumn());
		fixture.setMaxItemsMenu(new MenuItem());
		fixture.setGuideMenu(new MenuItem());
		fixture.setChangeRuleMenu(new MenuItem());
		fixture.setRulesMenu(new Menu());
		fixture.setLoggedColumn(new TableColumn());
		fixture.setZoneOutColumn(new TableColumn());
		fixture.setZoneInColumn(new TableColumn());
		fixture.setMaxItems(1);
		fixture.setNameColumn(new TableColumn());
		fixture.setRulesTab(new Tab());
		fixture.setGraphMenu(new Menu());

		Menu result = fixture.getRulesMenu();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.gui.controller.MainController
		assertNotNull(result);
	}

	/**
	 * Run the Tab getRulesTab() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testGetRulesTab_1()
		throws Exception {
		MainController fixture = new MainController();
		fixture.setServiceColumn(new TableColumn());
		fixture.setAddressInColumn(new TableColumn());
		fixture.setHelpMenuItem(new MenuItem());
		fixture.setGraphTab(new Tab());
		fixture.setDisplayGraphMenu(new MenuItem());
		fixture.setTabPane(new TabPane());
		fixture.setAutoRefreshMenu(new MenuItem());
		fixture.setActionColumn(new TableColumn());
		fixture.setHelpMenu(new Menu());
		fixture.setTableData(null);
		fixture.setGraph(new LineChart((Axis<Object>) null, (Axis<Object>) null));
		fixture.setDataManager(new DataSourceImpl());
		fixture.setApplicationMenu(new Menu());
		fixture.setRefreshMenu(new MenuItem());
		fixture.setChangeDeviceMenu(new MenuItem());
		fixture.setMenuBar(new MenuBar());
		fixture.setGraphItemsPane(new FlowPane());
		fixture.setTable(new TableView());
		fixture.setAddressOutColumn(new TableColumn());
		fixture.setMaxItemsMenu(new MenuItem());
		fixture.setGuideMenu(new MenuItem());
		fixture.setChangeRuleMenu(new MenuItem());
		fixture.setRulesMenu(new Menu());
		fixture.setLoggedColumn(new TableColumn());
		fixture.setZoneOutColumn(new TableColumn());
		fixture.setZoneInColumn(new TableColumn());
		fixture.setMaxItems(1);
		fixture.setNameColumn(new TableColumn());
		fixture.setRulesTab(new Tab());
		fixture.setGraphMenu(new Menu());

		Tab result = fixture.getRulesTab();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.gui.controller.MainController
		assertNotNull(result);
	}

	/**
	 * Run the TableColumn<TableRule, String> getServiceColumn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testGetServiceColumn_1()
		throws Exception {
		MainController fixture = new MainController();
		fixture.setServiceColumn(new TableColumn());
		fixture.setAddressInColumn(new TableColumn());
		fixture.setHelpMenuItem(new MenuItem());
		fixture.setGraphTab(new Tab());
		fixture.setDisplayGraphMenu(new MenuItem());
		fixture.setTabPane(new TabPane());
		fixture.setAutoRefreshMenu(new MenuItem());
		fixture.setActionColumn(new TableColumn());
		fixture.setHelpMenu(new Menu());
		fixture.setTableData(null);
		fixture.setGraph(new LineChart((Axis<Object>) null, (Axis<Object>) null));
		fixture.setDataManager(new DataSourceImpl());
		fixture.setApplicationMenu(new Menu());
		fixture.setRefreshMenu(new MenuItem());
		fixture.setChangeDeviceMenu(new MenuItem());
		fixture.setMenuBar(new MenuBar());
		fixture.setGraphItemsPane(new FlowPane());
		fixture.setTable(new TableView());
		fixture.setAddressOutColumn(new TableColumn());
		fixture.setMaxItemsMenu(new MenuItem());
		fixture.setGuideMenu(new MenuItem());
		fixture.setChangeRuleMenu(new MenuItem());
		fixture.setRulesMenu(new Menu());
		fixture.setLoggedColumn(new TableColumn());
		fixture.setZoneOutColumn(new TableColumn());
		fixture.setZoneInColumn(new TableColumn());
		fixture.setMaxItems(1);
		fixture.setNameColumn(new TableColumn());
		fixture.setRulesTab(new Tab());
		fixture.setGraphMenu(new Menu());

		TableColumn<TableRule, String> result = fixture.getServiceColumn();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.gui.controller.MainController
		assertNotNull(result);
	}

	/**
	 * Run the TabPane getTabPane() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testGetTabPane_1()
		throws Exception {
		MainController fixture = new MainController();
		fixture.setServiceColumn(new TableColumn());
		fixture.setAddressInColumn(new TableColumn());
		fixture.setHelpMenuItem(new MenuItem());
		fixture.setGraphTab(new Tab());
		fixture.setDisplayGraphMenu(new MenuItem());
		fixture.setTabPane(new TabPane());
		fixture.setAutoRefreshMenu(new MenuItem());
		fixture.setActionColumn(new TableColumn());
		fixture.setHelpMenu(new Menu());
		fixture.setTableData(null);
		fixture.setGraph(new LineChart((Axis<Object>) null, (Axis<Object>) null));
		fixture.setDataManager(new DataSourceImpl());
		fixture.setApplicationMenu(new Menu());
		fixture.setRefreshMenu(new MenuItem());
		fixture.setChangeDeviceMenu(new MenuItem());
		fixture.setMenuBar(new MenuBar());
		fixture.setGraphItemsPane(new FlowPane());
		fixture.setTable(new TableView());
		fixture.setAddressOutColumn(new TableColumn());
		fixture.setMaxItemsMenu(new MenuItem());
		fixture.setGuideMenu(new MenuItem());
		fixture.setChangeRuleMenu(new MenuItem());
		fixture.setRulesMenu(new Menu());
		fixture.setLoggedColumn(new TableColumn());
		fixture.setZoneOutColumn(new TableColumn());
		fixture.setZoneInColumn(new TableColumn());
		fixture.setMaxItems(1);
		fixture.setNameColumn(new TableColumn());
		fixture.setRulesTab(new Tab());
		fixture.setGraphMenu(new Menu());

		TabPane result = fixture.getTabPane();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.gui.controller.MainController
		assertNotNull(result);
	}

	/**
	 * Run the TableView<TableRule> getTable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testGetTable_1()
		throws Exception {
		MainController fixture = new MainController();
		fixture.setServiceColumn(new TableColumn());
		fixture.setAddressInColumn(new TableColumn());
		fixture.setHelpMenuItem(new MenuItem());
		fixture.setGraphTab(new Tab());
		fixture.setDisplayGraphMenu(new MenuItem());
		fixture.setTabPane(new TabPane());
		fixture.setAutoRefreshMenu(new MenuItem());
		fixture.setActionColumn(new TableColumn());
		fixture.setHelpMenu(new Menu());
		fixture.setTableData(null);
		fixture.setGraph(new LineChart((Axis<Object>) null, (Axis<Object>) null));
		fixture.setDataManager(new DataSourceImpl());
		fixture.setApplicationMenu(new Menu());
		fixture.setRefreshMenu(new MenuItem());
		fixture.setChangeDeviceMenu(new MenuItem());
		fixture.setMenuBar(new MenuBar());
		fixture.setGraphItemsPane(new FlowPane());
		fixture.setTable(new TableView());
		fixture.setAddressOutColumn(new TableColumn());
		fixture.setMaxItemsMenu(new MenuItem());
		fixture.setGuideMenu(new MenuItem());
		fixture.setChangeRuleMenu(new MenuItem());
		fixture.setRulesMenu(new Menu());
		fixture.setLoggedColumn(new TableColumn());
		fixture.setZoneOutColumn(new TableColumn());
		fixture.setZoneInColumn(new TableColumn());
		fixture.setMaxItems(1);
		fixture.setNameColumn(new TableColumn());
		fixture.setRulesTab(new Tab());
		fixture.setGraphMenu(new Menu());

		TableView<TableRule> result = fixture.getTable();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.gui.controller.MainController
		assertNotNull(result);
	}

	/**
	 * Run the ObservableList<TableRule> getTableData() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testGetTableData_1()
		throws Exception {
		MainController fixture = new MainController();
		fixture.setServiceColumn(new TableColumn());
		fixture.setAddressInColumn(new TableColumn());
		fixture.setHelpMenuItem(new MenuItem());
		fixture.setGraphTab(new Tab());
		fixture.setDisplayGraphMenu(new MenuItem());
		fixture.setTabPane(new TabPane());
		fixture.setAutoRefreshMenu(new MenuItem());
		fixture.setActionColumn(new TableColumn());
		fixture.setHelpMenu(new Menu());
		fixture.setTableData(null);
		fixture.setGraph(new LineChart((Axis<Object>) null, (Axis<Object>) null));
		fixture.setDataManager(new DataSourceImpl());
		fixture.setApplicationMenu(new Menu());
		fixture.setRefreshMenu(new MenuItem());
		fixture.setChangeDeviceMenu(new MenuItem());
		fixture.setMenuBar(new MenuBar());
		fixture.setGraphItemsPane(new FlowPane());
		fixture.setTable(new TableView());
		fixture.setAddressOutColumn(new TableColumn());
		fixture.setMaxItemsMenu(new MenuItem());
		fixture.setGuideMenu(new MenuItem());
		fixture.setChangeRuleMenu(new MenuItem());
		fixture.setRulesMenu(new Menu());
		fixture.setLoggedColumn(new TableColumn());
		fixture.setZoneOutColumn(new TableColumn());
		fixture.setZoneInColumn(new TableColumn());
		fixture.setMaxItems(1);
		fixture.setNameColumn(new TableColumn());
		fixture.setRulesTab(new Tab());
		fixture.setGraphMenu(new Menu());

		ObservableList<TableRule> result = fixture.getTableData();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.gui.controller.MainController
		assertNotNull(result);
	}

	/**
	 * Run the TableColumn<TableRule, String> getZoneInColumn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testGetZoneInColumn_1()
		throws Exception {
		MainController fixture = new MainController();
		fixture.setServiceColumn(new TableColumn());
		fixture.setAddressInColumn(new TableColumn());
		fixture.setHelpMenuItem(new MenuItem());
		fixture.setGraphTab(new Tab());
		fixture.setDisplayGraphMenu(new MenuItem());
		fixture.setTabPane(new TabPane());
		fixture.setAutoRefreshMenu(new MenuItem());
		fixture.setActionColumn(new TableColumn());
		fixture.setHelpMenu(new Menu());
		fixture.setTableData(null);
		fixture.setGraph(new LineChart((Axis<Object>) null, (Axis<Object>) null));
		fixture.setDataManager(new DataSourceImpl());
		fixture.setApplicationMenu(new Menu());
		fixture.setRefreshMenu(new MenuItem());
		fixture.setChangeDeviceMenu(new MenuItem());
		fixture.setMenuBar(new MenuBar());
		fixture.setGraphItemsPane(new FlowPane());
		fixture.setTable(new TableView());
		fixture.setAddressOutColumn(new TableColumn());
		fixture.setMaxItemsMenu(new MenuItem());
		fixture.setGuideMenu(new MenuItem());
		fixture.setChangeRuleMenu(new MenuItem());
		fixture.setRulesMenu(new Menu());
		fixture.setLoggedColumn(new TableColumn());
		fixture.setZoneOutColumn(new TableColumn());
		fixture.setZoneInColumn(new TableColumn());
		fixture.setMaxItems(1);
		fixture.setNameColumn(new TableColumn());
		fixture.setRulesTab(new Tab());
		fixture.setGraphMenu(new Menu());

		TableColumn<TableRule, String> result = fixture.getZoneInColumn();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.gui.controller.MainController
		assertNotNull(result);
	}

	/**
	 * Run the TableColumn<TableRule, String> getZoneOutColumn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testGetZoneOutColumn_1()
		throws Exception {
		MainController fixture = new MainController();
		fixture.setServiceColumn(new TableColumn());
		fixture.setAddressInColumn(new TableColumn());
		fixture.setHelpMenuItem(new MenuItem());
		fixture.setGraphTab(new Tab());
		fixture.setDisplayGraphMenu(new MenuItem());
		fixture.setTabPane(new TabPane());
		fixture.setAutoRefreshMenu(new MenuItem());
		fixture.setActionColumn(new TableColumn());
		fixture.setHelpMenu(new Menu());
		fixture.setTableData(null);
		fixture.setGraph(new LineChart((Axis<Object>) null, (Axis<Object>) null));
		fixture.setDataManager(new DataSourceImpl());
		fixture.setApplicationMenu(new Menu());
		fixture.setRefreshMenu(new MenuItem());
		fixture.setChangeDeviceMenu(new MenuItem());
		fixture.setMenuBar(new MenuBar());
		fixture.setGraphItemsPane(new FlowPane());
		fixture.setTable(new TableView());
		fixture.setAddressOutColumn(new TableColumn());
		fixture.setMaxItemsMenu(new MenuItem());
		fixture.setGuideMenu(new MenuItem());
		fixture.setChangeRuleMenu(new MenuItem());
		fixture.setRulesMenu(new Menu());
		fixture.setLoggedColumn(new TableColumn());
		fixture.setZoneOutColumn(new TableColumn());
		fixture.setZoneInColumn(new TableColumn());
		fixture.setMaxItems(1);
		fixture.setNameColumn(new TableColumn());
		fixture.setRulesTab(new Tab());
		fixture.setGraphMenu(new Menu());

		TableColumn<TableRule, String> result = fixture.getZoneOutColumn();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.gui.controller.MainController
		assertNotNull(result);
	}

	/**
	 * Run the void initialize() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testInitialize_1()
		throws Exception {
		MainController fixture = new MainController();
		fixture.setServiceColumn(new TableColumn());
		fixture.setAddressInColumn(new TableColumn());
		fixture.setHelpMenuItem(new MenuItem());
		fixture.setGraphTab(new Tab());
		fixture.setDisplayGraphMenu(new MenuItem());
		fixture.setTabPane(new TabPane());
		fixture.setAutoRefreshMenu(new MenuItem());
		fixture.setActionColumn(new TableColumn());
		fixture.setHelpMenu(new Menu());
		fixture.setTableData(null);
		fixture.setGraph(new LineChart((Axis<Object>) null, (Axis<Object>) null));
		fixture.setDataManager(new DataSourceImpl());
		fixture.setApplicationMenu(new Menu());
		fixture.setRefreshMenu(new MenuItem());
		fixture.setChangeDeviceMenu(new MenuItem());
		fixture.setMenuBar(new MenuBar());
		fixture.setGraphItemsPane(new FlowPane());
		fixture.setTable(new TableView());
		fixture.setAddressOutColumn(new TableColumn());
		fixture.setMaxItemsMenu(new MenuItem());
		fixture.setGuideMenu(new MenuItem());
		fixture.setChangeRuleMenu(new MenuItem());
		fixture.setRulesMenu(new Menu());
		fixture.setLoggedColumn(new TableColumn());
		fixture.setZoneOutColumn(new TableColumn());
		fixture.setZoneInColumn(new TableColumn());
		fixture.setMaxItems(1);
		fixture.setNameColumn(new TableColumn());
		fixture.setRulesTab(new Tab());
		fixture.setGraphMenu(new Menu());

		fixture.initialize();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at org.slf4j.impl.Log4jLoggerFactory.getLogger(Log4jLoggerFactory.java:66)
		//       at org.slf4j.LoggerFactory.getLogger(LoggerFactory.java:277)
		//       at org.slf4j.LoggerFactory.getLogger(LoggerFactory.java:288)
		//       at rtn.gui.controller.MainController.<clinit>(MainController.java:17)
	}

	/**
	 * Run the void setActionColumn(TableColumn<TableRule,String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testSetActionColumn_1()
		throws Exception {
		MainController fixture = new MainController();
		fixture.setServiceColumn(new TableColumn());
		fixture.setAddressInColumn(new TableColumn());
		fixture.setHelpMenuItem(new MenuItem());
		fixture.setGraphTab(new Tab());
		fixture.setDisplayGraphMenu(new MenuItem());
		fixture.setTabPane(new TabPane());
		fixture.setAutoRefreshMenu(new MenuItem());
		fixture.setActionColumn(new TableColumn());
		fixture.setHelpMenu(new Menu());
		fixture.setTableData(null);
		fixture.setGraph(new LineChart((Axis<Object>) null, (Axis<Object>) null));
		fixture.setDataManager(new DataSourceImpl());
		fixture.setApplicationMenu(new Menu());
		fixture.setRefreshMenu(new MenuItem());
		fixture.setChangeDeviceMenu(new MenuItem());
		fixture.setMenuBar(new MenuBar());
		fixture.setGraphItemsPane(new FlowPane());
		fixture.setTable(new TableView());
		fixture.setAddressOutColumn(new TableColumn());
		fixture.setMaxItemsMenu(new MenuItem());
		fixture.setGuideMenu(new MenuItem());
		fixture.setChangeRuleMenu(new MenuItem());
		fixture.setRulesMenu(new Menu());
		fixture.setLoggedColumn(new TableColumn());
		fixture.setZoneOutColumn(new TableColumn());
		fixture.setZoneInColumn(new TableColumn());
		fixture.setMaxItems(1);
		fixture.setNameColumn(new TableColumn());
		fixture.setRulesTab(new Tab());
		fixture.setGraphMenu(new Menu());
		TableColumn<TableRule, String> actionColumn = new TableColumn();

		fixture.setActionColumn(actionColumn);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.gui.controller.MainController
	}

	/**
	 * Run the void setAddressInColumn(TableColumn<TableRule,String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testSetAddressInColumn_1()
		throws Exception {
		MainController fixture = new MainController();
		fixture.setServiceColumn(new TableColumn());
		fixture.setAddressInColumn(new TableColumn());
		fixture.setHelpMenuItem(new MenuItem());
		fixture.setGraphTab(new Tab());
		fixture.setDisplayGraphMenu(new MenuItem());
		fixture.setTabPane(new TabPane());
		fixture.setAutoRefreshMenu(new MenuItem());
		fixture.setActionColumn(new TableColumn());
		fixture.setHelpMenu(new Menu());
		fixture.setTableData(null);
		fixture.setGraph(new LineChart((Axis<Object>) null, (Axis<Object>) null));
		fixture.setDataManager(new DataSourceImpl());
		fixture.setApplicationMenu(new Menu());
		fixture.setRefreshMenu(new MenuItem());
		fixture.setChangeDeviceMenu(new MenuItem());
		fixture.setMenuBar(new MenuBar());
		fixture.setGraphItemsPane(new FlowPane());
		fixture.setTable(new TableView());
		fixture.setAddressOutColumn(new TableColumn());
		fixture.setMaxItemsMenu(new MenuItem());
		fixture.setGuideMenu(new MenuItem());
		fixture.setChangeRuleMenu(new MenuItem());
		fixture.setRulesMenu(new Menu());
		fixture.setLoggedColumn(new TableColumn());
		fixture.setZoneOutColumn(new TableColumn());
		fixture.setZoneInColumn(new TableColumn());
		fixture.setMaxItems(1);
		fixture.setNameColumn(new TableColumn());
		fixture.setRulesTab(new Tab());
		fixture.setGraphMenu(new Menu());
		TableColumn<TableRule, String> addressInColumn = new TableColumn();

		fixture.setAddressInColumn(addressInColumn);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.gui.controller.MainController
	}

	/**
	 * Run the void setAddressOutColumn(TableColumn<TableRule,String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testSetAddressOutColumn_1()
		throws Exception {
		MainController fixture = new MainController();
		fixture.setServiceColumn(new TableColumn());
		fixture.setAddressInColumn(new TableColumn());
		fixture.setHelpMenuItem(new MenuItem());
		fixture.setGraphTab(new Tab());
		fixture.setDisplayGraphMenu(new MenuItem());
		fixture.setTabPane(new TabPane());
		fixture.setAutoRefreshMenu(new MenuItem());
		fixture.setActionColumn(new TableColumn());
		fixture.setHelpMenu(new Menu());
		fixture.setTableData(null);
		fixture.setGraph(new LineChart((Axis<Object>) null, (Axis<Object>) null));
		fixture.setDataManager(new DataSourceImpl());
		fixture.setApplicationMenu(new Menu());
		fixture.setRefreshMenu(new MenuItem());
		fixture.setChangeDeviceMenu(new MenuItem());
		fixture.setMenuBar(new MenuBar());
		fixture.setGraphItemsPane(new FlowPane());
		fixture.setTable(new TableView());
		fixture.setAddressOutColumn(new TableColumn());
		fixture.setMaxItemsMenu(new MenuItem());
		fixture.setGuideMenu(new MenuItem());
		fixture.setChangeRuleMenu(new MenuItem());
		fixture.setRulesMenu(new Menu());
		fixture.setLoggedColumn(new TableColumn());
		fixture.setZoneOutColumn(new TableColumn());
		fixture.setZoneInColumn(new TableColumn());
		fixture.setMaxItems(1);
		fixture.setNameColumn(new TableColumn());
		fixture.setRulesTab(new Tab());
		fixture.setGraphMenu(new Menu());
		TableColumn<TableRule, String> addressOutColumn = new TableColumn();

		fixture.setAddressOutColumn(addressOutColumn);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.gui.controller.MainController
	}

	/**
	 * Run the void setApplicationMenu(Menu) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testSetApplicationMenu_1()
		throws Exception {
		MainController fixture = new MainController();
		fixture.setServiceColumn(new TableColumn());
		fixture.setAddressInColumn(new TableColumn());
		fixture.setHelpMenuItem(new MenuItem());
		fixture.setGraphTab(new Tab());
		fixture.setDisplayGraphMenu(new MenuItem());
		fixture.setTabPane(new TabPane());
		fixture.setAutoRefreshMenu(new MenuItem());
		fixture.setActionColumn(new TableColumn());
		fixture.setHelpMenu(new Menu());
		fixture.setTableData(null);
		fixture.setGraph(new LineChart((Axis<Object>) null, (Axis<Object>) null));
		fixture.setDataManager(new DataSourceImpl());
		fixture.setApplicationMenu(new Menu());
		fixture.setRefreshMenu(new MenuItem());
		fixture.setChangeDeviceMenu(new MenuItem());
		fixture.setMenuBar(new MenuBar());
		fixture.setGraphItemsPane(new FlowPane());
		fixture.setTable(new TableView());
		fixture.setAddressOutColumn(new TableColumn());
		fixture.setMaxItemsMenu(new MenuItem());
		fixture.setGuideMenu(new MenuItem());
		fixture.setChangeRuleMenu(new MenuItem());
		fixture.setRulesMenu(new Menu());
		fixture.setLoggedColumn(new TableColumn());
		fixture.setZoneOutColumn(new TableColumn());
		fixture.setZoneInColumn(new TableColumn());
		fixture.setMaxItems(1);
		fixture.setNameColumn(new TableColumn());
		fixture.setRulesTab(new Tab());
		fixture.setGraphMenu(new Menu());
		Menu applicationMenu = new Menu();

		fixture.setApplicationMenu(applicationMenu);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.gui.controller.MainController
	}

	/**
	 * Run the void setAutoRefreshMenu(MenuItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testSetAutoRefreshMenu_1()
		throws Exception {
		MainController fixture = new MainController();
		fixture.setServiceColumn(new TableColumn());
		fixture.setAddressInColumn(new TableColumn());
		fixture.setHelpMenuItem(new MenuItem());
		fixture.setGraphTab(new Tab());
		fixture.setDisplayGraphMenu(new MenuItem());
		fixture.setTabPane(new TabPane());
		fixture.setAutoRefreshMenu(new MenuItem());
		fixture.setActionColumn(new TableColumn());
		fixture.setHelpMenu(new Menu());
		fixture.setTableData(null);
		fixture.setGraph(new LineChart((Axis<Object>) null, (Axis<Object>) null));
		fixture.setDataManager(new DataSourceImpl());
		fixture.setApplicationMenu(new Menu());
		fixture.setRefreshMenu(new MenuItem());
		fixture.setChangeDeviceMenu(new MenuItem());
		fixture.setMenuBar(new MenuBar());
		fixture.setGraphItemsPane(new FlowPane());
		fixture.setTable(new TableView());
		fixture.setAddressOutColumn(new TableColumn());
		fixture.setMaxItemsMenu(new MenuItem());
		fixture.setGuideMenu(new MenuItem());
		fixture.setChangeRuleMenu(new MenuItem());
		fixture.setRulesMenu(new Menu());
		fixture.setLoggedColumn(new TableColumn());
		fixture.setZoneOutColumn(new TableColumn());
		fixture.setZoneInColumn(new TableColumn());
		fixture.setMaxItems(1);
		fixture.setNameColumn(new TableColumn());
		fixture.setRulesTab(new Tab());
		fixture.setGraphMenu(new Menu());
		MenuItem autoRefreshMenu = new MenuItem();

		fixture.setAutoRefreshMenu(autoRefreshMenu);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.gui.controller.MainController
	}

	/**
	 * Run the void setChangeDeviceMenu(MenuItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testSetChangeDeviceMenu_1()
		throws Exception {
		MainController fixture = new MainController();
		fixture.setServiceColumn(new TableColumn());
		fixture.setAddressInColumn(new TableColumn());
		fixture.setHelpMenuItem(new MenuItem());
		fixture.setGraphTab(new Tab());
		fixture.setDisplayGraphMenu(new MenuItem());
		fixture.setTabPane(new TabPane());
		fixture.setAutoRefreshMenu(new MenuItem());
		fixture.setActionColumn(new TableColumn());
		fixture.setHelpMenu(new Menu());
		fixture.setTableData(null);
		fixture.setGraph(new LineChart((Axis<Object>) null, (Axis<Object>) null));
		fixture.setDataManager(new DataSourceImpl());
		fixture.setApplicationMenu(new Menu());
		fixture.setRefreshMenu(new MenuItem());
		fixture.setChangeDeviceMenu(new MenuItem());
		fixture.setMenuBar(new MenuBar());
		fixture.setGraphItemsPane(new FlowPane());
		fixture.setTable(new TableView());
		fixture.setAddressOutColumn(new TableColumn());
		fixture.setMaxItemsMenu(new MenuItem());
		fixture.setGuideMenu(new MenuItem());
		fixture.setChangeRuleMenu(new MenuItem());
		fixture.setRulesMenu(new Menu());
		fixture.setLoggedColumn(new TableColumn());
		fixture.setZoneOutColumn(new TableColumn());
		fixture.setZoneInColumn(new TableColumn());
		fixture.setMaxItems(1);
		fixture.setNameColumn(new TableColumn());
		fixture.setRulesTab(new Tab());
		fixture.setGraphMenu(new Menu());
		MenuItem changeDeviceMenu = new MenuItem();

		fixture.setChangeDeviceMenu(changeDeviceMenu);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.gui.controller.MainController
	}

	/**
	 * Run the void setChangeRuleMenu(MenuItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testSetChangeRuleMenu_1()
		throws Exception {
		MainController fixture = new MainController();
		fixture.setServiceColumn(new TableColumn());
		fixture.setAddressInColumn(new TableColumn());
		fixture.setHelpMenuItem(new MenuItem());
		fixture.setGraphTab(new Tab());
		fixture.setDisplayGraphMenu(new MenuItem());
		fixture.setTabPane(new TabPane());
		fixture.setAutoRefreshMenu(new MenuItem());
		fixture.setActionColumn(new TableColumn());
		fixture.setHelpMenu(new Menu());
		fixture.setTableData(null);
		fixture.setGraph(new LineChart((Axis<Object>) null, (Axis<Object>) null));
		fixture.setDataManager(new DataSourceImpl());
		fixture.setApplicationMenu(new Menu());
		fixture.setRefreshMenu(new MenuItem());
		fixture.setChangeDeviceMenu(new MenuItem());
		fixture.setMenuBar(new MenuBar());
		fixture.setGraphItemsPane(new FlowPane());
		fixture.setTable(new TableView());
		fixture.setAddressOutColumn(new TableColumn());
		fixture.setMaxItemsMenu(new MenuItem());
		fixture.setGuideMenu(new MenuItem());
		fixture.setChangeRuleMenu(new MenuItem());
		fixture.setRulesMenu(new Menu());
		fixture.setLoggedColumn(new TableColumn());
		fixture.setZoneOutColumn(new TableColumn());
		fixture.setZoneInColumn(new TableColumn());
		fixture.setMaxItems(1);
		fixture.setNameColumn(new TableColumn());
		fixture.setRulesTab(new Tab());
		fixture.setGraphMenu(new Menu());
		MenuItem changeRuleMenu = new MenuItem();

		fixture.setChangeRuleMenu(changeRuleMenu);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.gui.controller.MainController
	}

	/**
	 * Run the void setDataManager(IDataSource) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testSetDataManager_1()
		throws Exception {
		MainController fixture = new MainController();
		fixture.setServiceColumn(new TableColumn());
		fixture.setAddressInColumn(new TableColumn());
		fixture.setHelpMenuItem(new MenuItem());
		fixture.setGraphTab(new Tab());
		fixture.setDisplayGraphMenu(new MenuItem());
		fixture.setTabPane(new TabPane());
		fixture.setAutoRefreshMenu(new MenuItem());
		fixture.setActionColumn(new TableColumn());
		fixture.setHelpMenu(new Menu());
		fixture.setTableData(null);
		fixture.setGraph(new LineChart((Axis<Object>) null, (Axis<Object>) null));
		fixture.setDataManager(new DataSourceImpl());
		fixture.setApplicationMenu(new Menu());
		fixture.setRefreshMenu(new MenuItem());
		fixture.setChangeDeviceMenu(new MenuItem());
		fixture.setMenuBar(new MenuBar());
		fixture.setGraphItemsPane(new FlowPane());
		fixture.setTable(new TableView());
		fixture.setAddressOutColumn(new TableColumn());
		fixture.setMaxItemsMenu(new MenuItem());
		fixture.setGuideMenu(new MenuItem());
		fixture.setChangeRuleMenu(new MenuItem());
		fixture.setRulesMenu(new Menu());
		fixture.setLoggedColumn(new TableColumn());
		fixture.setZoneOutColumn(new TableColumn());
		fixture.setZoneInColumn(new TableColumn());
		fixture.setMaxItems(1);
		fixture.setNameColumn(new TableColumn());
		fixture.setRulesTab(new Tab());
		fixture.setGraphMenu(new Menu());
		IDataSource dataManager = new DataSourceImpl();

		fixture.setDataManager(dataManager);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.gui.controller.MainController
	}

	/**
	 * Run the void setDisplayGraphMenu(MenuItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testSetDisplayGraphMenu_1()
		throws Exception {
		MainController fixture = new MainController();
		fixture.setServiceColumn(new TableColumn());
		fixture.setAddressInColumn(new TableColumn());
		fixture.setHelpMenuItem(new MenuItem());
		fixture.setGraphTab(new Tab());
		fixture.setDisplayGraphMenu(new MenuItem());
		fixture.setTabPane(new TabPane());
		fixture.setAutoRefreshMenu(new MenuItem());
		fixture.setActionColumn(new TableColumn());
		fixture.setHelpMenu(new Menu());
		fixture.setTableData(null);
		fixture.setGraph(new LineChart((Axis<Object>) null, (Axis<Object>) null));
		fixture.setDataManager(new DataSourceImpl());
		fixture.setApplicationMenu(new Menu());
		fixture.setRefreshMenu(new MenuItem());
		fixture.setChangeDeviceMenu(new MenuItem());
		fixture.setMenuBar(new MenuBar());
		fixture.setGraphItemsPane(new FlowPane());
		fixture.setTable(new TableView());
		fixture.setAddressOutColumn(new TableColumn());
		fixture.setMaxItemsMenu(new MenuItem());
		fixture.setGuideMenu(new MenuItem());
		fixture.setChangeRuleMenu(new MenuItem());
		fixture.setRulesMenu(new Menu());
		fixture.setLoggedColumn(new TableColumn());
		fixture.setZoneOutColumn(new TableColumn());
		fixture.setZoneInColumn(new TableColumn());
		fixture.setMaxItems(1);
		fixture.setNameColumn(new TableColumn());
		fixture.setRulesTab(new Tab());
		fixture.setGraphMenu(new Menu());
		MenuItem displayGraphMenu = new MenuItem();

		fixture.setDisplayGraphMenu(displayGraphMenu);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.gui.controller.MainController
	}

	/**
	 * Run the void setGraph(LineChart<?,?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testSetGraph_1()
		throws Exception {
		MainController fixture = new MainController();
		fixture.setServiceColumn(new TableColumn());
		fixture.setAddressInColumn(new TableColumn());
		fixture.setHelpMenuItem(new MenuItem());
		fixture.setGraphTab(new Tab());
		fixture.setDisplayGraphMenu(new MenuItem());
		fixture.setTabPane(new TabPane());
		fixture.setAutoRefreshMenu(new MenuItem());
		fixture.setActionColumn(new TableColumn());
		fixture.setHelpMenu(new Menu());
		fixture.setTableData(null);
		fixture.setGraph(new LineChart((Axis<Object>) null, (Axis<Object>) null));
		fixture.setDataManager(new DataSourceImpl());
		fixture.setApplicationMenu(new Menu());
		fixture.setRefreshMenu(new MenuItem());
		fixture.setChangeDeviceMenu(new MenuItem());
		fixture.setMenuBar(new MenuBar());
		fixture.setGraphItemsPane(new FlowPane());
		fixture.setTable(new TableView());
		fixture.setAddressOutColumn(new TableColumn());
		fixture.setMaxItemsMenu(new MenuItem());
		fixture.setGuideMenu(new MenuItem());
		fixture.setChangeRuleMenu(new MenuItem());
		fixture.setRulesMenu(new Menu());
		fixture.setLoggedColumn(new TableColumn());
		fixture.setZoneOutColumn(new TableColumn());
		fixture.setZoneInColumn(new TableColumn());
		fixture.setMaxItems(1);
		fixture.setNameColumn(new TableColumn());
		fixture.setRulesTab(new Tab());
		fixture.setGraphMenu(new Menu());
		LineChart<Object, Object> graph = new LineChart((Axis<Object>) null, (Axis<Object>) null);

		fixture.setGraph(graph);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.gui.controller.MainController
	}

	/**
	 * Run the void setGraphItemsPane(FlowPane) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testSetGraphItemsPane_1()
		throws Exception {
		MainController fixture = new MainController();
		fixture.setServiceColumn(new TableColumn());
		fixture.setAddressInColumn(new TableColumn());
		fixture.setHelpMenuItem(new MenuItem());
		fixture.setGraphTab(new Tab());
		fixture.setDisplayGraphMenu(new MenuItem());
		fixture.setTabPane(new TabPane());
		fixture.setAutoRefreshMenu(new MenuItem());
		fixture.setActionColumn(new TableColumn());
		fixture.setHelpMenu(new Menu());
		fixture.setTableData(null);
		fixture.setGraph(new LineChart((Axis<Object>) null, (Axis<Object>) null));
		fixture.setDataManager(new DataSourceImpl());
		fixture.setApplicationMenu(new Menu());
		fixture.setRefreshMenu(new MenuItem());
		fixture.setChangeDeviceMenu(new MenuItem());
		fixture.setMenuBar(new MenuBar());
		fixture.setGraphItemsPane(new FlowPane());
		fixture.setTable(new TableView());
		fixture.setAddressOutColumn(new TableColumn());
		fixture.setMaxItemsMenu(new MenuItem());
		fixture.setGuideMenu(new MenuItem());
		fixture.setChangeRuleMenu(new MenuItem());
		fixture.setRulesMenu(new Menu());
		fixture.setLoggedColumn(new TableColumn());
		fixture.setZoneOutColumn(new TableColumn());
		fixture.setZoneInColumn(new TableColumn());
		fixture.setMaxItems(1);
		fixture.setNameColumn(new TableColumn());
		fixture.setRulesTab(new Tab());
		fixture.setGraphMenu(new Menu());
		FlowPane graphItemsPane = new FlowPane();

		fixture.setGraphItemsPane(graphItemsPane);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.gui.controller.MainController
	}

	/**
	 * Run the void setGraphMenu(Menu) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testSetGraphMenu_1()
		throws Exception {
		MainController fixture = new MainController();
		fixture.setServiceColumn(new TableColumn());
		fixture.setAddressInColumn(new TableColumn());
		fixture.setHelpMenuItem(new MenuItem());
		fixture.setGraphTab(new Tab());
		fixture.setDisplayGraphMenu(new MenuItem());
		fixture.setTabPane(new TabPane());
		fixture.setAutoRefreshMenu(new MenuItem());
		fixture.setActionColumn(new TableColumn());
		fixture.setHelpMenu(new Menu());
		fixture.setTableData(null);
		fixture.setGraph(new LineChart((Axis<Object>) null, (Axis<Object>) null));
		fixture.setDataManager(new DataSourceImpl());
		fixture.setApplicationMenu(new Menu());
		fixture.setRefreshMenu(new MenuItem());
		fixture.setChangeDeviceMenu(new MenuItem());
		fixture.setMenuBar(new MenuBar());
		fixture.setGraphItemsPane(new FlowPane());
		fixture.setTable(new TableView());
		fixture.setAddressOutColumn(new TableColumn());
		fixture.setMaxItemsMenu(new MenuItem());
		fixture.setGuideMenu(new MenuItem());
		fixture.setChangeRuleMenu(new MenuItem());
		fixture.setRulesMenu(new Menu());
		fixture.setLoggedColumn(new TableColumn());
		fixture.setZoneOutColumn(new TableColumn());
		fixture.setZoneInColumn(new TableColumn());
		fixture.setMaxItems(1);
		fixture.setNameColumn(new TableColumn());
		fixture.setRulesTab(new Tab());
		fixture.setGraphMenu(new Menu());
		Menu graphMenu = new Menu();

		fixture.setGraphMenu(graphMenu);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.gui.controller.MainController
	}

	/**
	 * Run the void setGraphTab(Tab) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testSetGraphTab_1()
		throws Exception {
		MainController fixture = new MainController();
		fixture.setServiceColumn(new TableColumn());
		fixture.setAddressInColumn(new TableColumn());
		fixture.setHelpMenuItem(new MenuItem());
		fixture.setGraphTab(new Tab());
		fixture.setDisplayGraphMenu(new MenuItem());
		fixture.setTabPane(new TabPane());
		fixture.setAutoRefreshMenu(new MenuItem());
		fixture.setActionColumn(new TableColumn());
		fixture.setHelpMenu(new Menu());
		fixture.setTableData(null);
		fixture.setGraph(new LineChart((Axis<Object>) null, (Axis<Object>) null));
		fixture.setDataManager(new DataSourceImpl());
		fixture.setApplicationMenu(new Menu());
		fixture.setRefreshMenu(new MenuItem());
		fixture.setChangeDeviceMenu(new MenuItem());
		fixture.setMenuBar(new MenuBar());
		fixture.setGraphItemsPane(new FlowPane());
		fixture.setTable(new TableView());
		fixture.setAddressOutColumn(new TableColumn());
		fixture.setMaxItemsMenu(new MenuItem());
		fixture.setGuideMenu(new MenuItem());
		fixture.setChangeRuleMenu(new MenuItem());
		fixture.setRulesMenu(new Menu());
		fixture.setLoggedColumn(new TableColumn());
		fixture.setZoneOutColumn(new TableColumn());
		fixture.setZoneInColumn(new TableColumn());
		fixture.setMaxItems(1);
		fixture.setNameColumn(new TableColumn());
		fixture.setRulesTab(new Tab());
		fixture.setGraphMenu(new Menu());
		Tab graphTab = new Tab();

		fixture.setGraphTab(graphTab);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.gui.controller.MainController
	}

	/**
	 * Run the void setGuideMenu(MenuItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testSetGuideMenu_1()
		throws Exception {
		MainController fixture = new MainController();
		fixture.setServiceColumn(new TableColumn());
		fixture.setAddressInColumn(new TableColumn());
		fixture.setHelpMenuItem(new MenuItem());
		fixture.setGraphTab(new Tab());
		fixture.setDisplayGraphMenu(new MenuItem());
		fixture.setTabPane(new TabPane());
		fixture.setAutoRefreshMenu(new MenuItem());
		fixture.setActionColumn(new TableColumn());
		fixture.setHelpMenu(new Menu());
		fixture.setTableData(null);
		fixture.setGraph(new LineChart((Axis<Object>) null, (Axis<Object>) null));
		fixture.setDataManager(new DataSourceImpl());
		fixture.setApplicationMenu(new Menu());
		fixture.setRefreshMenu(new MenuItem());
		fixture.setChangeDeviceMenu(new MenuItem());
		fixture.setMenuBar(new MenuBar());
		fixture.setGraphItemsPane(new FlowPane());
		fixture.setTable(new TableView());
		fixture.setAddressOutColumn(new TableColumn());
		fixture.setMaxItemsMenu(new MenuItem());
		fixture.setGuideMenu(new MenuItem());
		fixture.setChangeRuleMenu(new MenuItem());
		fixture.setRulesMenu(new Menu());
		fixture.setLoggedColumn(new TableColumn());
		fixture.setZoneOutColumn(new TableColumn());
		fixture.setZoneInColumn(new TableColumn());
		fixture.setMaxItems(1);
		fixture.setNameColumn(new TableColumn());
		fixture.setRulesTab(new Tab());
		fixture.setGraphMenu(new Menu());
		MenuItem guideMenu = new MenuItem();

		fixture.setGuideMenu(guideMenu);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.gui.controller.MainController
	}

	/**
	 * Run the void setHelpMenu(Menu) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testSetHelpMenu_1()
		throws Exception {
		MainController fixture = new MainController();
		fixture.setServiceColumn(new TableColumn());
		fixture.setAddressInColumn(new TableColumn());
		fixture.setHelpMenuItem(new MenuItem());
		fixture.setGraphTab(new Tab());
		fixture.setDisplayGraphMenu(new MenuItem());
		fixture.setTabPane(new TabPane());
		fixture.setAutoRefreshMenu(new MenuItem());
		fixture.setActionColumn(new TableColumn());
		fixture.setHelpMenu(new Menu());
		fixture.setTableData(null);
		fixture.setGraph(new LineChart((Axis<Object>) null, (Axis<Object>) null));
		fixture.setDataManager(new DataSourceImpl());
		fixture.setApplicationMenu(new Menu());
		fixture.setRefreshMenu(new MenuItem());
		fixture.setChangeDeviceMenu(new MenuItem());
		fixture.setMenuBar(new MenuBar());
		fixture.setGraphItemsPane(new FlowPane());
		fixture.setTable(new TableView());
		fixture.setAddressOutColumn(new TableColumn());
		fixture.setMaxItemsMenu(new MenuItem());
		fixture.setGuideMenu(new MenuItem());
		fixture.setChangeRuleMenu(new MenuItem());
		fixture.setRulesMenu(new Menu());
		fixture.setLoggedColumn(new TableColumn());
		fixture.setZoneOutColumn(new TableColumn());
		fixture.setZoneInColumn(new TableColumn());
		fixture.setMaxItems(1);
		fixture.setNameColumn(new TableColumn());
		fixture.setRulesTab(new Tab());
		fixture.setGraphMenu(new Menu());
		Menu helpMenu = new Menu();

		fixture.setHelpMenu(helpMenu);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.gui.controller.MainController
	}

	/**
	 * Run the void setHelpMenuItem(MenuItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testSetHelpMenuItem_1()
		throws Exception {
		MainController fixture = new MainController();
		fixture.setServiceColumn(new TableColumn());
		fixture.setAddressInColumn(new TableColumn());
		fixture.setHelpMenuItem(new MenuItem());
		fixture.setGraphTab(new Tab());
		fixture.setDisplayGraphMenu(new MenuItem());
		fixture.setTabPane(new TabPane());
		fixture.setAutoRefreshMenu(new MenuItem());
		fixture.setActionColumn(new TableColumn());
		fixture.setHelpMenu(new Menu());
		fixture.setTableData(null);
		fixture.setGraph(new LineChart((Axis<Object>) null, (Axis<Object>) null));
		fixture.setDataManager(new DataSourceImpl());
		fixture.setApplicationMenu(new Menu());
		fixture.setRefreshMenu(new MenuItem());
		fixture.setChangeDeviceMenu(new MenuItem());
		fixture.setMenuBar(new MenuBar());
		fixture.setGraphItemsPane(new FlowPane());
		fixture.setTable(new TableView());
		fixture.setAddressOutColumn(new TableColumn());
		fixture.setMaxItemsMenu(new MenuItem());
		fixture.setGuideMenu(new MenuItem());
		fixture.setChangeRuleMenu(new MenuItem());
		fixture.setRulesMenu(new Menu());
		fixture.setLoggedColumn(new TableColumn());
		fixture.setZoneOutColumn(new TableColumn());
		fixture.setZoneInColumn(new TableColumn());
		fixture.setMaxItems(1);
		fixture.setNameColumn(new TableColumn());
		fixture.setRulesTab(new Tab());
		fixture.setGraphMenu(new Menu());
		MenuItem helpMenuItem = new MenuItem();

		fixture.setHelpMenuItem(helpMenuItem);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.gui.controller.MainController
	}

	/**
	 * Run the void setInstance(MainController) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testSetInstance_1()
		throws Exception {
		MainController instance = new MainController();

		MainController.setInstance(instance);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.gui.controller.MainController
	}

	/**
	 * Run the void setLoggedColumn(TableColumn<TableRule,Boolean>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testSetLoggedColumn_1()
		throws Exception {
		MainController fixture = new MainController();
		fixture.setServiceColumn(new TableColumn());
		fixture.setAddressInColumn(new TableColumn());
		fixture.setHelpMenuItem(new MenuItem());
		fixture.setGraphTab(new Tab());
		fixture.setDisplayGraphMenu(new MenuItem());
		fixture.setTabPane(new TabPane());
		fixture.setAutoRefreshMenu(new MenuItem());
		fixture.setActionColumn(new TableColumn());
		fixture.setHelpMenu(new Menu());
		fixture.setTableData(null);
		fixture.setGraph(new LineChart((Axis<Object>) null, (Axis<Object>) null));
		fixture.setDataManager(new DataSourceImpl());
		fixture.setApplicationMenu(new Menu());
		fixture.setRefreshMenu(new MenuItem());
		fixture.setChangeDeviceMenu(new MenuItem());
		fixture.setMenuBar(new MenuBar());
		fixture.setGraphItemsPane(new FlowPane());
		fixture.setTable(new TableView());
		fixture.setAddressOutColumn(new TableColumn());
		fixture.setMaxItemsMenu(new MenuItem());
		fixture.setGuideMenu(new MenuItem());
		fixture.setChangeRuleMenu(new MenuItem());
		fixture.setRulesMenu(new Menu());
		fixture.setLoggedColumn(new TableColumn());
		fixture.setZoneOutColumn(new TableColumn());
		fixture.setZoneInColumn(new TableColumn());
		fixture.setMaxItems(1);
		fixture.setNameColumn(new TableColumn());
		fixture.setRulesTab(new Tab());
		fixture.setGraphMenu(new Menu());
		TableColumn<TableRule, Boolean> loggedColumn = new TableColumn();

		fixture.setLoggedColumn(loggedColumn);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.gui.controller.MainController
	}

	/**
	 * Run the void setMaxItems(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testSetMaxItems_1()
		throws Exception {
		MainController fixture = new MainController();
		fixture.setServiceColumn(new TableColumn());
		fixture.setAddressInColumn(new TableColumn());
		fixture.setHelpMenuItem(new MenuItem());
		fixture.setGraphTab(new Tab());
		fixture.setDisplayGraphMenu(new MenuItem());
		fixture.setTabPane(new TabPane());
		fixture.setAutoRefreshMenu(new MenuItem());
		fixture.setActionColumn(new TableColumn());
		fixture.setHelpMenu(new Menu());
		fixture.setTableData(null);
		fixture.setGraph(new LineChart((Axis<Object>) null, (Axis<Object>) null));
		fixture.setDataManager(new DataSourceImpl());
		fixture.setApplicationMenu(new Menu());
		fixture.setRefreshMenu(new MenuItem());
		fixture.setChangeDeviceMenu(new MenuItem());
		fixture.setMenuBar(new MenuBar());
		fixture.setGraphItemsPane(new FlowPane());
		fixture.setTable(new TableView());
		fixture.setAddressOutColumn(new TableColumn());
		fixture.setMaxItemsMenu(new MenuItem());
		fixture.setGuideMenu(new MenuItem());
		fixture.setChangeRuleMenu(new MenuItem());
		fixture.setRulesMenu(new Menu());
		fixture.setLoggedColumn(new TableColumn());
		fixture.setZoneOutColumn(new TableColumn());
		fixture.setZoneInColumn(new TableColumn());
		fixture.setMaxItems(1);
		fixture.setNameColumn(new TableColumn());
		fixture.setRulesTab(new Tab());
		fixture.setGraphMenu(new Menu());
		int maxItems = 1;

		fixture.setMaxItems(maxItems);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.gui.controller.MainController
	}

	/**
	 * Run the void setMaxItemsMenu(MenuItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testSetMaxItemsMenu_1()
		throws Exception {
		MainController fixture = new MainController();
		fixture.setServiceColumn(new TableColumn());
		fixture.setAddressInColumn(new TableColumn());
		fixture.setHelpMenuItem(new MenuItem());
		fixture.setGraphTab(new Tab());
		fixture.setDisplayGraphMenu(new MenuItem());
		fixture.setTabPane(new TabPane());
		fixture.setAutoRefreshMenu(new MenuItem());
		fixture.setActionColumn(new TableColumn());
		fixture.setHelpMenu(new Menu());
		fixture.setTableData(null);
		fixture.setGraph(new LineChart((Axis<Object>) null, (Axis<Object>) null));
		fixture.setDataManager(new DataSourceImpl());
		fixture.setApplicationMenu(new Menu());
		fixture.setRefreshMenu(new MenuItem());
		fixture.setChangeDeviceMenu(new MenuItem());
		fixture.setMenuBar(new MenuBar());
		fixture.setGraphItemsPane(new FlowPane());
		fixture.setTable(new TableView());
		fixture.setAddressOutColumn(new TableColumn());
		fixture.setMaxItemsMenu(new MenuItem());
		fixture.setGuideMenu(new MenuItem());
		fixture.setChangeRuleMenu(new MenuItem());
		fixture.setRulesMenu(new Menu());
		fixture.setLoggedColumn(new TableColumn());
		fixture.setZoneOutColumn(new TableColumn());
		fixture.setZoneInColumn(new TableColumn());
		fixture.setMaxItems(1);
		fixture.setNameColumn(new TableColumn());
		fixture.setRulesTab(new Tab());
		fixture.setGraphMenu(new Menu());
		MenuItem maxItemsMenu = new MenuItem();

		fixture.setMaxItemsMenu(maxItemsMenu);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.gui.controller.MainController
	}

	/**
	 * Run the void setMenuBar(MenuBar) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testSetMenuBar_1()
		throws Exception {
		MainController fixture = new MainController();
		fixture.setServiceColumn(new TableColumn());
		fixture.setAddressInColumn(new TableColumn());
		fixture.setHelpMenuItem(new MenuItem());
		fixture.setGraphTab(new Tab());
		fixture.setDisplayGraphMenu(new MenuItem());
		fixture.setTabPane(new TabPane());
		fixture.setAutoRefreshMenu(new MenuItem());
		fixture.setActionColumn(new TableColumn());
		fixture.setHelpMenu(new Menu());
		fixture.setTableData(null);
		fixture.setGraph(new LineChart((Axis<Object>) null, (Axis<Object>) null));
		fixture.setDataManager(new DataSourceImpl());
		fixture.setApplicationMenu(new Menu());
		fixture.setRefreshMenu(new MenuItem());
		fixture.setChangeDeviceMenu(new MenuItem());
		fixture.setMenuBar(new MenuBar());
		fixture.setGraphItemsPane(new FlowPane());
		fixture.setTable(new TableView());
		fixture.setAddressOutColumn(new TableColumn());
		fixture.setMaxItemsMenu(new MenuItem());
		fixture.setGuideMenu(new MenuItem());
		fixture.setChangeRuleMenu(new MenuItem());
		fixture.setRulesMenu(new Menu());
		fixture.setLoggedColumn(new TableColumn());
		fixture.setZoneOutColumn(new TableColumn());
		fixture.setZoneInColumn(new TableColumn());
		fixture.setMaxItems(1);
		fixture.setNameColumn(new TableColumn());
		fixture.setRulesTab(new Tab());
		fixture.setGraphMenu(new Menu());
		MenuBar menuBar = new MenuBar();

		fixture.setMenuBar(menuBar);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.gui.controller.MainController
	}

	/**
	 * Run the void setNameColumn(TableColumn<TableRule,String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testSetNameColumn_1()
		throws Exception {
		MainController fixture = new MainController();
		fixture.setServiceColumn(new TableColumn());
		fixture.setAddressInColumn(new TableColumn());
		fixture.setHelpMenuItem(new MenuItem());
		fixture.setGraphTab(new Tab());
		fixture.setDisplayGraphMenu(new MenuItem());
		fixture.setTabPane(new TabPane());
		fixture.setAutoRefreshMenu(new MenuItem());
		fixture.setActionColumn(new TableColumn());
		fixture.setHelpMenu(new Menu());
		fixture.setTableData(null);
		fixture.setGraph(new LineChart((Axis<Object>) null, (Axis<Object>) null));
		fixture.setDataManager(new DataSourceImpl());
		fixture.setApplicationMenu(new Menu());
		fixture.setRefreshMenu(new MenuItem());
		fixture.setChangeDeviceMenu(new MenuItem());
		fixture.setMenuBar(new MenuBar());
		fixture.setGraphItemsPane(new FlowPane());
		fixture.setTable(new TableView());
		fixture.setAddressOutColumn(new TableColumn());
		fixture.setMaxItemsMenu(new MenuItem());
		fixture.setGuideMenu(new MenuItem());
		fixture.setChangeRuleMenu(new MenuItem());
		fixture.setRulesMenu(new Menu());
		fixture.setLoggedColumn(new TableColumn());
		fixture.setZoneOutColumn(new TableColumn());
		fixture.setZoneInColumn(new TableColumn());
		fixture.setMaxItems(1);
		fixture.setNameColumn(new TableColumn());
		fixture.setRulesTab(new Tab());
		fixture.setGraphMenu(new Menu());
		TableColumn<TableRule, String> nameColumn = new TableColumn();

		fixture.setNameColumn(nameColumn);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.gui.controller.MainController
	}

	/**
	 * Run the void setRefreshMenu(MenuItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testSetRefreshMenu_1()
		throws Exception {
		MainController fixture = new MainController();
		fixture.setServiceColumn(new TableColumn());
		fixture.setAddressInColumn(new TableColumn());
		fixture.setHelpMenuItem(new MenuItem());
		fixture.setGraphTab(new Tab());
		fixture.setDisplayGraphMenu(new MenuItem());
		fixture.setTabPane(new TabPane());
		fixture.setAutoRefreshMenu(new MenuItem());
		fixture.setActionColumn(new TableColumn());
		fixture.setHelpMenu(new Menu());
		fixture.setTableData(null);
		fixture.setGraph(new LineChart((Axis<Object>) null, (Axis<Object>) null));
		fixture.setDataManager(new DataSourceImpl());
		fixture.setApplicationMenu(new Menu());
		fixture.setRefreshMenu(new MenuItem());
		fixture.setChangeDeviceMenu(new MenuItem());
		fixture.setMenuBar(new MenuBar());
		fixture.setGraphItemsPane(new FlowPane());
		fixture.setTable(new TableView());
		fixture.setAddressOutColumn(new TableColumn());
		fixture.setMaxItemsMenu(new MenuItem());
		fixture.setGuideMenu(new MenuItem());
		fixture.setChangeRuleMenu(new MenuItem());
		fixture.setRulesMenu(new Menu());
		fixture.setLoggedColumn(new TableColumn());
		fixture.setZoneOutColumn(new TableColumn());
		fixture.setZoneInColumn(new TableColumn());
		fixture.setMaxItems(1);
		fixture.setNameColumn(new TableColumn());
		fixture.setRulesTab(new Tab());
		fixture.setGraphMenu(new Menu());
		MenuItem refreshMenu = new MenuItem();

		fixture.setRefreshMenu(refreshMenu);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.gui.controller.MainController
	}

	/**
	 * Run the void setRulesMenu(Menu) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testSetRulesMenu_1()
		throws Exception {
		MainController fixture = new MainController();
		fixture.setServiceColumn(new TableColumn());
		fixture.setAddressInColumn(new TableColumn());
		fixture.setHelpMenuItem(new MenuItem());
		fixture.setGraphTab(new Tab());
		fixture.setDisplayGraphMenu(new MenuItem());
		fixture.setTabPane(new TabPane());
		fixture.setAutoRefreshMenu(new MenuItem());
		fixture.setActionColumn(new TableColumn());
		fixture.setHelpMenu(new Menu());
		fixture.setTableData(null);
		fixture.setGraph(new LineChart((Axis<Object>) null, (Axis<Object>) null));
		fixture.setDataManager(new DataSourceImpl());
		fixture.setApplicationMenu(new Menu());
		fixture.setRefreshMenu(new MenuItem());
		fixture.setChangeDeviceMenu(new MenuItem());
		fixture.setMenuBar(new MenuBar());
		fixture.setGraphItemsPane(new FlowPane());
		fixture.setTable(new TableView());
		fixture.setAddressOutColumn(new TableColumn());
		fixture.setMaxItemsMenu(new MenuItem());
		fixture.setGuideMenu(new MenuItem());
		fixture.setChangeRuleMenu(new MenuItem());
		fixture.setRulesMenu(new Menu());
		fixture.setLoggedColumn(new TableColumn());
		fixture.setZoneOutColumn(new TableColumn());
		fixture.setZoneInColumn(new TableColumn());
		fixture.setMaxItems(1);
		fixture.setNameColumn(new TableColumn());
		fixture.setRulesTab(new Tab());
		fixture.setGraphMenu(new Menu());
		Menu rulesMenu = new Menu();

		fixture.setRulesMenu(rulesMenu);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.gui.controller.MainController
	}

	/**
	 * Run the void setRulesTab(Tab) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testSetRulesTab_1()
		throws Exception {
		MainController fixture = new MainController();
		fixture.setServiceColumn(new TableColumn());
		fixture.setAddressInColumn(new TableColumn());
		fixture.setHelpMenuItem(new MenuItem());
		fixture.setGraphTab(new Tab());
		fixture.setDisplayGraphMenu(new MenuItem());
		fixture.setTabPane(new TabPane());
		fixture.setAutoRefreshMenu(new MenuItem());
		fixture.setActionColumn(new TableColumn());
		fixture.setHelpMenu(new Menu());
		fixture.setTableData(null);
		fixture.setGraph(new LineChart((Axis<Object>) null, (Axis<Object>) null));
		fixture.setDataManager(new DataSourceImpl());
		fixture.setApplicationMenu(new Menu());
		fixture.setRefreshMenu(new MenuItem());
		fixture.setChangeDeviceMenu(new MenuItem());
		fixture.setMenuBar(new MenuBar());
		fixture.setGraphItemsPane(new FlowPane());
		fixture.setTable(new TableView());
		fixture.setAddressOutColumn(new TableColumn());
		fixture.setMaxItemsMenu(new MenuItem());
		fixture.setGuideMenu(new MenuItem());
		fixture.setChangeRuleMenu(new MenuItem());
		fixture.setRulesMenu(new Menu());
		fixture.setLoggedColumn(new TableColumn());
		fixture.setZoneOutColumn(new TableColumn());
		fixture.setZoneInColumn(new TableColumn());
		fixture.setMaxItems(1);
		fixture.setNameColumn(new TableColumn());
		fixture.setRulesTab(new Tab());
		fixture.setGraphMenu(new Menu());
		Tab rulesTab = new Tab();

		fixture.setRulesTab(rulesTab);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.gui.controller.MainController
	}

	/**
	 * Run the void setServiceColumn(TableColumn<TableRule,String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testSetServiceColumn_1()
		throws Exception {
		MainController fixture = new MainController();
		fixture.setServiceColumn(new TableColumn());
		fixture.setAddressInColumn(new TableColumn());
		fixture.setHelpMenuItem(new MenuItem());
		fixture.setGraphTab(new Tab());
		fixture.setDisplayGraphMenu(new MenuItem());
		fixture.setTabPane(new TabPane());
		fixture.setAutoRefreshMenu(new MenuItem());
		fixture.setActionColumn(new TableColumn());
		fixture.setHelpMenu(new Menu());
		fixture.setTableData(null);
		fixture.setGraph(new LineChart((Axis<Object>) null, (Axis<Object>) null));
		fixture.setDataManager(new DataSourceImpl());
		fixture.setApplicationMenu(new Menu());
		fixture.setRefreshMenu(new MenuItem());
		fixture.setChangeDeviceMenu(new MenuItem());
		fixture.setMenuBar(new MenuBar());
		fixture.setGraphItemsPane(new FlowPane());
		fixture.setTable(new TableView());
		fixture.setAddressOutColumn(new TableColumn());
		fixture.setMaxItemsMenu(new MenuItem());
		fixture.setGuideMenu(new MenuItem());
		fixture.setChangeRuleMenu(new MenuItem());
		fixture.setRulesMenu(new Menu());
		fixture.setLoggedColumn(new TableColumn());
		fixture.setZoneOutColumn(new TableColumn());
		fixture.setZoneInColumn(new TableColumn());
		fixture.setMaxItems(1);
		fixture.setNameColumn(new TableColumn());
		fixture.setRulesTab(new Tab());
		fixture.setGraphMenu(new Menu());
		TableColumn<TableRule, String> serviceColumn = new TableColumn();

		fixture.setServiceColumn(serviceColumn);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.gui.controller.MainController
	}

	/**
	 * Run the void setTabPane(TabPane) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testSetTabPane_1()
		throws Exception {
		MainController fixture = new MainController();
		fixture.setServiceColumn(new TableColumn());
		fixture.setAddressInColumn(new TableColumn());
		fixture.setHelpMenuItem(new MenuItem());
		fixture.setGraphTab(new Tab());
		fixture.setDisplayGraphMenu(new MenuItem());
		fixture.setTabPane(new TabPane());
		fixture.setAutoRefreshMenu(new MenuItem());
		fixture.setActionColumn(new TableColumn());
		fixture.setHelpMenu(new Menu());
		fixture.setTableData(null);
		fixture.setGraph(new LineChart((Axis<Object>) null, (Axis<Object>) null));
		fixture.setDataManager(new DataSourceImpl());
		fixture.setApplicationMenu(new Menu());
		fixture.setRefreshMenu(new MenuItem());
		fixture.setChangeDeviceMenu(new MenuItem());
		fixture.setMenuBar(new MenuBar());
		fixture.setGraphItemsPane(new FlowPane());
		fixture.setTable(new TableView());
		fixture.setAddressOutColumn(new TableColumn());
		fixture.setMaxItemsMenu(new MenuItem());
		fixture.setGuideMenu(new MenuItem());
		fixture.setChangeRuleMenu(new MenuItem());
		fixture.setRulesMenu(new Menu());
		fixture.setLoggedColumn(new TableColumn());
		fixture.setZoneOutColumn(new TableColumn());
		fixture.setZoneInColumn(new TableColumn());
		fixture.setMaxItems(1);
		fixture.setNameColumn(new TableColumn());
		fixture.setRulesTab(new Tab());
		fixture.setGraphMenu(new Menu());
		TabPane tabPane = new TabPane();

		fixture.setTabPane(tabPane);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.gui.controller.MainController
	}

	/**
	 * Run the void setTable(TableView<TableRule>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testSetTable_1()
		throws Exception {
		MainController fixture = new MainController();
		fixture.setServiceColumn(new TableColumn());
		fixture.setAddressInColumn(new TableColumn());
		fixture.setHelpMenuItem(new MenuItem());
		fixture.setGraphTab(new Tab());
		fixture.setDisplayGraphMenu(new MenuItem());
		fixture.setTabPane(new TabPane());
		fixture.setAutoRefreshMenu(new MenuItem());
		fixture.setActionColumn(new TableColumn());
		fixture.setHelpMenu(new Menu());
		fixture.setTableData(null);
		fixture.setGraph(new LineChart((Axis<Object>) null, (Axis<Object>) null));
		fixture.setDataManager(new DataSourceImpl());
		fixture.setApplicationMenu(new Menu());
		fixture.setRefreshMenu(new MenuItem());
		fixture.setChangeDeviceMenu(new MenuItem());
		fixture.setMenuBar(new MenuBar());
		fixture.setGraphItemsPane(new FlowPane());
		fixture.setTable(new TableView());
		fixture.setAddressOutColumn(new TableColumn());
		fixture.setMaxItemsMenu(new MenuItem());
		fixture.setGuideMenu(new MenuItem());
		fixture.setChangeRuleMenu(new MenuItem());
		fixture.setRulesMenu(new Menu());
		fixture.setLoggedColumn(new TableColumn());
		fixture.setZoneOutColumn(new TableColumn());
		fixture.setZoneInColumn(new TableColumn());
		fixture.setMaxItems(1);
		fixture.setNameColumn(new TableColumn());
		fixture.setRulesTab(new Tab());
		fixture.setGraphMenu(new Menu());
		TableView<TableRule> table = new TableView();

		fixture.setTable(table);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.gui.controller.MainController
	}

	/**
	 * Run the void setTableData(ObservableList<TableRule>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testSetTableData_1()
		throws Exception {
		MainController fixture = new MainController();
		fixture.setServiceColumn(new TableColumn());
		fixture.setAddressInColumn(new TableColumn());
		fixture.setHelpMenuItem(new MenuItem());
		fixture.setGraphTab(new Tab());
		fixture.setDisplayGraphMenu(new MenuItem());
		fixture.setTabPane(new TabPane());
		fixture.setAutoRefreshMenu(new MenuItem());
		fixture.setActionColumn(new TableColumn());
		fixture.setHelpMenu(new Menu());
		fixture.setTableData(null);
		fixture.setGraph(new LineChart((Axis<Object>) null, (Axis<Object>) null));
		fixture.setDataManager(new DataSourceImpl());
		fixture.setApplicationMenu(new Menu());
		fixture.setRefreshMenu(new MenuItem());
		fixture.setChangeDeviceMenu(new MenuItem());
		fixture.setMenuBar(new MenuBar());
		fixture.setGraphItemsPane(new FlowPane());
		fixture.setTable(new TableView());
		fixture.setAddressOutColumn(new TableColumn());
		fixture.setMaxItemsMenu(new MenuItem());
		fixture.setGuideMenu(new MenuItem());
		fixture.setChangeRuleMenu(new MenuItem());
		fixture.setRulesMenu(new Menu());
		fixture.setLoggedColumn(new TableColumn());
		fixture.setZoneOutColumn(new TableColumn());
		fixture.setZoneInColumn(new TableColumn());
		fixture.setMaxItems(1);
		fixture.setNameColumn(new TableColumn());
		fixture.setRulesTab(new Tab());
		fixture.setGraphMenu(new Menu());
		ObservableList<TableRule> tableData = null;

		fixture.setTableData(tableData);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.gui.controller.MainController
	}

	/**
	 * Run the void setZoneInColumn(TableColumn<TableRule,String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testSetZoneInColumn_1()
		throws Exception {
		MainController fixture = new MainController();
		fixture.setServiceColumn(new TableColumn());
		fixture.setAddressInColumn(new TableColumn());
		fixture.setHelpMenuItem(new MenuItem());
		fixture.setGraphTab(new Tab());
		fixture.setDisplayGraphMenu(new MenuItem());
		fixture.setTabPane(new TabPane());
		fixture.setAutoRefreshMenu(new MenuItem());
		fixture.setActionColumn(new TableColumn());
		fixture.setHelpMenu(new Menu());
		fixture.setTableData(null);
		fixture.setGraph(new LineChart((Axis<Object>) null, (Axis<Object>) null));
		fixture.setDataManager(new DataSourceImpl());
		fixture.setApplicationMenu(new Menu());
		fixture.setRefreshMenu(new MenuItem());
		fixture.setChangeDeviceMenu(new MenuItem());
		fixture.setMenuBar(new MenuBar());
		fixture.setGraphItemsPane(new FlowPane());
		fixture.setTable(new TableView());
		fixture.setAddressOutColumn(new TableColumn());
		fixture.setMaxItemsMenu(new MenuItem());
		fixture.setGuideMenu(new MenuItem());
		fixture.setChangeRuleMenu(new MenuItem());
		fixture.setRulesMenu(new Menu());
		fixture.setLoggedColumn(new TableColumn());
		fixture.setZoneOutColumn(new TableColumn());
		fixture.setZoneInColumn(new TableColumn());
		fixture.setMaxItems(1);
		fixture.setNameColumn(new TableColumn());
		fixture.setRulesTab(new Tab());
		fixture.setGraphMenu(new Menu());
		TableColumn<TableRule, String> zoneInColumn = new TableColumn();

		fixture.setZoneInColumn(zoneInColumn);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.gui.controller.MainController
	}

	/**
	 * Run the void setZoneOutColumn(TableColumn<TableRule,String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Test
	public void testSetZoneOutColumn_1()
		throws Exception {
		MainController fixture = new MainController();
		fixture.setServiceColumn(new TableColumn());
		fixture.setAddressInColumn(new TableColumn());
		fixture.setHelpMenuItem(new MenuItem());
		fixture.setGraphTab(new Tab());
		fixture.setDisplayGraphMenu(new MenuItem());
		fixture.setTabPane(new TabPane());
		fixture.setAutoRefreshMenu(new MenuItem());
		fixture.setActionColumn(new TableColumn());
		fixture.setHelpMenu(new Menu());
		fixture.setTableData(null);
		fixture.setGraph(new LineChart((Axis<Object>) null, (Axis<Object>) null));
		fixture.setDataManager(new DataSourceImpl());
		fixture.setApplicationMenu(new Menu());
		fixture.setRefreshMenu(new MenuItem());
		fixture.setChangeDeviceMenu(new MenuItem());
		fixture.setMenuBar(new MenuBar());
		fixture.setGraphItemsPane(new FlowPane());
		fixture.setTable(new TableView());
		fixture.setAddressOutColumn(new TableColumn());
		fixture.setMaxItemsMenu(new MenuItem());
		fixture.setGuideMenu(new MenuItem());
		fixture.setChangeRuleMenu(new MenuItem());
		fixture.setRulesMenu(new Menu());
		fixture.setLoggedColumn(new TableColumn());
		fixture.setZoneOutColumn(new TableColumn());
		fixture.setZoneInColumn(new TableColumn());
		fixture.setMaxItems(1);
		fixture.setNameColumn(new TableColumn());
		fixture.setRulesTab(new Tab());
		fixture.setGraphMenu(new Menu());
		TableColumn<TableRule, String> zoneOutColumn = new TableColumn();

		fixture.setZoneOutColumn(zoneOutColumn);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.gui.controller.MainController
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 10/19/14 10:28 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(MainControllerTest.class);
	}
}