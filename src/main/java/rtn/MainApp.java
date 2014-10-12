package rtn;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MainApp extends Application {

	private static Stage mainStage;
	private static Stage connectionStage;
	private static Stage addRuleStage;
	private static Stage removeRuleStage;
	private static Stage changeRuleStage;
	private static Stage maxItemStage;
	private static Stage autoRefreshStage;
	
	private static Pane mainLayout;
	private static Pane connectionLayout;
	private static Pane addRuleLayout;
	private static Pane removeRuleLayout;
	private static Pane changeRuleLayout;
	private static Pane maxItemLayout;
	private static Pane autoRefreshLayout;
	
	@Override
	public void start(Stage primaryStage) {
	     initMainStage();
	     initConnectionStage();
	     initAddRuleStage();
	     initRemoveRuleStage();
	     initChangeRuleStage();
	     initMaxItemStage();
	     initAutoRefreshStage();
	}
	
	/**
	 * Loads the .fxml file and initializes the mainStage
	 */
	private void initMainStage() {
		mainStage = new Stage();
		mainStage.setTitle("RockTheNet - MainWindow");
		
		FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource("rtn/gui/view/MainWindow.fxml"));
        
        try {
			mainLayout = loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
        
        Scene scene = new Scene(mainLayout);
        mainStage.setScene(scene);
        mainStage.hide();
	}

	/**
	 * Loads the .fxml file and initializes the connectionStage
	 */
	private void initConnectionStage() {
		connectionStage = new Stage();
		connectionStage.setTitle("RockTheNet - ConnectionWindow");
		
		FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("rtn/gui/view/ConnectionWindow.fxml"));
        
        try {
			connectionLayout = loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
        
        Scene scene = new Scene(connectionLayout);
        connectionStage.setScene(scene);
        connectionStage.show();
	}
	
	/**
	 * Loads the .fxml file and initializes the mainStage
	 */
	private void initMaxItemStage() {
		maxItemStage = new Stage();
		maxItemStage.setTitle("RockTheNet - MaxItemWindow");
		
		FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource("rtn/gui/view/MaxItemWindow.fxml"));
        
        try {
			maxItemLayout = loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
        
        Scene scene = new Scene(maxItemLayout);
        maxItemStage.setScene(scene);
        maxItemStage.hide();
	}
	
	/**
	 * Loads the .fxml file and initializes the mainStage
	 */
	private void initAutoRefreshStage() {
		autoRefreshStage = new Stage();
		autoRefreshStage.setTitle("RockTheNet - AutoRefreshWindow");
		
		FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource("rtn/gui/view/AutoRefreshWindow.fxml"));
        
        try {
			autoRefreshLayout = loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
        
        Scene scene = new Scene(autoRefreshLayout);
        autoRefreshStage.setScene(scene);
        autoRefreshStage.hide();
	}

	/**
	 * Loads the .fxml file and initializes the addRuleStage
	 */
	private void initAddRuleStage() {
		addRuleStage = new Stage();
		addRuleStage.setTitle("RokTheNet - AddRuleWindow");
		
		FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource("rtn/gui/view/AddRuleWindow.fxml"));
        
        try {
			addRuleLayout = loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
        
        Scene scene = new Scene(addRuleLayout);
        addRuleStage.setScene(scene);
        addRuleStage.hide();
	}
	
	/**
	 * Loads the .fxml file and initializes the removeRuleStage
	 */
	private void initRemoveRuleStage() {
		removeRuleStage = new Stage();
		removeRuleStage.setTitle("RokTheNet - RemoveRuleWindow");
		
		FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource("rtn/gui/view/RemoveRuleWindow.fxml"));
        
        try {
			removeRuleLayout = loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
        
        Scene scene = new Scene(removeRuleLayout);
        removeRuleStage.setScene(scene);
        removeRuleStage.hide();
	}
	
	/**
	 * Loads the .fxml file and initializes the changeRuleStage
	 */
	private void initChangeRuleStage() {
		changeRuleStage = new Stage();
		changeRuleStage.setTitle("RokTheNet - ChangeRuleWindow");
		
		FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource("rtn/gui/view/ChangeRuleWindow.fxml"));
        
        try {
			changeRuleLayout = loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
        
        Scene scene = new Scene(changeRuleLayout);
        changeRuleStage.setScene(scene);
        changeRuleStage.hide();
	}

	public static void main(String[] args) {
		launch(args);
	}

	/**
	 * @return the mainStage
	 */
	public static Stage getMainStage() {
		return mainStage;
	}

	/**
	 * @param mainStage the mainStage to set
	 */
	public static void setMainStage(Stage mainStage) {
		MainApp.mainStage = mainStage;
	}

	/**
	 * @return the connectionStage
	 */
	public static Stage getConnectionStage() {
		return connectionStage;
	}

	/**
	 * @param connectionStage the connectionStage to set
	 */
	public static void setConnectionStage(Stage connectionStage) {
		MainApp.connectionStage = connectionStage;
	}

	/**
	 * @return the addRuleStage
	 */
	public static Stage getAddRuleStage() {
		return addRuleStage;
	}

	/**
	 * @param addRuleStage the addRuleStage to set
	 */
	public static void setAddRuleStage(Stage addRuleStage) {
		MainApp.addRuleStage = addRuleStage;
	}

	/**
	 * @return the removeRuleStage
	 */
	public static Stage getRemoveRuleStage() {
		return removeRuleStage;
	}

	/**
	 * @param removeRuleStage the removeRuleStage to set
	 */
	public static void setRemoveRuleStage(Stage removeRuleStage) {
		MainApp.removeRuleStage = removeRuleStage;
	}

	/**
	 * @return the changeRuleStage
	 */
	public static Stage getChangeRuleStage() {
		return changeRuleStage;
	}

	/**
	 * @param changeRuleStage the changeRuleStage to set
	 */
	public static void setChangeRuleStage(Stage changeRuleStage) {
		MainApp.changeRuleStage = changeRuleStage;
	}

	/**
	 * @return the mainLayout
	 */
	public static Pane getMainLayout() {
		return mainLayout;
	}

	/**
	 * @param mainLayout the mainLayout to set
	 */
	public static void setMainLayout(Pane mainLayout) {
		MainApp.mainLayout = mainLayout;
	}

	/**
	 * @return the connectionLayout
	 */
	public static Pane getConnectionLayout() {
		return connectionLayout;
	}

	/**
	 * @param connectionLayout the connectionLayout to set
	 */
	public static void setConnectionLayout(Pane connectionLayout) {
		MainApp.connectionLayout = connectionLayout;
	}

	/**
	 * @return the addRuleLayout
	 */
	public static Pane getAddRuleLayout() {
		return addRuleLayout;
	}

	/**
	 * @param addRuleLayout the addRuleLayout to set
	 */
	public static void setAddRuleLayout(Pane addRuleLayout) {
		MainApp.addRuleLayout = addRuleLayout;
	}

	/**
	 * @return the removeRuleLayout
	 */
	public static Pane getRemoveRuleLayout() {
		return removeRuleLayout;
	}

	/**
	 * @param removeRuleLayout the removeRuleLayout to set
	 */
	public static void setRemoveRuleLayout(Pane removeRuleLayout) {
		MainApp.removeRuleLayout = removeRuleLayout;
	}

	/**
	 * @return the changeRuleLayout
	 */
	public static Pane getChangeRuleLayout() {
		return changeRuleLayout;
	}

	/**
	 * @param changeRuleLayout the changeRuleLayout to set
	 */
	public static void setChangeRuleLayout(Pane changeRuleLayout) {
		MainApp.changeRuleLayout = changeRuleLayout;
	}

	/**
	 * @return the maxItemStage
	 */
	public static Stage getMaxItemStage() {
		return maxItemStage;
	}

	/**
	 * @param maxItemStage the maxItemStage to set
	 */
	public static void setMaxItemStage(Stage maxItemStage) {
		MainApp.maxItemStage = maxItemStage;
	}

	/**
	 * @return the maxItemLayout
	 */
	public static Pane getMaxItemLayout() {
		return maxItemLayout;
	}

	/**
	 * @param maxItemLayout the maxItemLayout to set
	 */
	public static void setMaxItemLayout(Pane maxItemLayout) {
		MainApp.maxItemLayout = maxItemLayout;
	}

	/**
	 * @return the autoRefreshStage
	 */
	public static Stage getAutoRefreshStage() {
		return autoRefreshStage;
	}

	/**
	 * @param autoRefreshStage the autoRefreshStage to set
	 */
	public static void setAutoRefreshStage(Stage autoRefreshStage) {
		MainApp.autoRefreshStage = autoRefreshStage;
	}

	/**
	 * @return the autoRefreshLayout
	 */
	public static Pane getAutoRefreshLayout() {
		return autoRefreshLayout;
	}

	/**
	 * @param autoRefreshLayout the autoRefreshLayout to set
	 */
	public static void setAutoRefreshLayout(Pane autoRefreshLayout) {
		MainApp.autoRefreshLayout = autoRefreshLayout;
	}

	
}
