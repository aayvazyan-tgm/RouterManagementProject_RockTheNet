package rtn.gui.view;

import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import rtn.MainApp;

import java.io.IOException;

/**
 * Created by Fabian on 23.10.2014.
 */
public class MainStageLoader {
    private static MainStageLoader instance;

    public static MainStageLoader getInstance() {
        if(instance==null) {instance=new MainStageLoader();}
        return instance;
    }

    public void init() {
        String layoutPath = "rtn/gui/view/MainWindow.fxml";
        Stage mainStage = new Stage();
        mainStage.setTitle("RockTheNet");

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource(layoutPath));

        try {
            Pane mainLayout = loader.load();
            Scene scene = new Scene(mainLayout);
            mainStage.setScene(scene);
            mainStage.show();
            mainStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
                public void handle(WindowEvent we) {
                    //TODO close all the connection stuff;
                }
            });
            StageLoader.setMainStage(mainStage);
            StageLoader.setMainLayout(mainLayout);
        } catch (IOException e) {
            MainApp.getInstance().getLogger().error("Could not load layout: " + layoutPath, e);
        }
    }
}
