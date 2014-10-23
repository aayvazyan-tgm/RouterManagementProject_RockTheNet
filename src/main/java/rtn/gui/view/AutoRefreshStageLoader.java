package rtn.gui.view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import rtn.MainApp;

import java.io.IOException;

/**
 * Created by Fabian on 23.10.2014.
 */
public class AutoRefreshStageLoader {
    private static AutoRefreshStageLoader instance;

    public static AutoRefreshStageLoader getInstance() {
        if(instance==null) {instance=new AutoRefreshStageLoader();}
        return instance;
    }

    public void init() {
        String layoutPath = "rtn/gui/view/AutoRefreshWindow.fxml";
        Stage autoRefreshStage = new Stage();
        autoRefreshStage.setTitle("RockTheNet - AutoRefreshWindow");

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource(layoutPath));

        try {
            Pane autoRefreshLayout = loader.load();
            Scene scene = new Scene(autoRefreshLayout);
            autoRefreshStage.setScene(scene);
            autoRefreshStage.initModality(Modality.WINDOW_MODAL);
            autoRefreshStage.initOwner(StageLoader.getMainStage().getScene().getWindow());
            autoRefreshStage.hide();
            StageLoader.setAutoRefreshStage(autoRefreshStage);
            StageLoader.setAutoRefreshLayout(autoRefreshLayout);
        } catch (IOException e) {
            MainApp.getInstance().getLogger().error("Could not load layout: " + layoutPath, e);
        }
    }
}
