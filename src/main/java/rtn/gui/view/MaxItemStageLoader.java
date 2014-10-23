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
public class MaxItemStageLoader {
    private static MaxItemStageLoader instance;

    public static MaxItemStageLoader getInstance() {
        if(instance==null) {instance=new MaxItemStageLoader();}
        return instance;
    }

    public void init() {
        String layoutPath = "rtn/gui/view/MaxItemWindow.fxml";
        Stage maxItemStage = new Stage();
        maxItemStage.setTitle("RockTheNet - MaxItemWindow");

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource(layoutPath));

        try {
            Pane maxItemLayout = loader.load();
            Scene scene = new Scene(maxItemLayout);
            maxItemStage.setScene(scene);
            maxItemStage.initModality(Modality.WINDOW_MODAL);
            maxItemStage.initOwner(StageLoader.getMainStage().getScene().getWindow());
            maxItemStage.hide();
            StageLoader.setMaxItemStage(maxItemStage);
            StageLoader.setMaxItemLayout(maxItemLayout);
        } catch (IOException e) {
            MainApp.getInstance().getLogger().error("Could not load layout: " + layoutPath, e);
        }
    }
}
