package rtn;

import javafx.application.Application;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rtn.gui.view.StageLoader;

public class MainApp extends Application {

    private static MainApp instance;

    private static final Logger logger = LoggerFactory.getLogger(MainApp.class);

	@Override
	public void start(Stage primaryStage) {
        instance=this;
        StageLoader.getInstance().initAll();

	}

	public static void main(String[] args) {
        launch(args);
	}



    public static MainApp getInstance() {
        return instance;
    }

    public static void setInstance(MainApp instance) {
        MainApp.instance = instance;
    }

    public Logger getLogger() {
        return logger;
    }
	
}
