package rtn.gui.view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import rtn.MainApp;
import rtn.gui.controller.StageLoader;

import java.io.IOException;

/**
 * Created by Fabian on 23.10.2014.
 */
public class RemoveRuleStageLoader {
    private static RemoveRuleStageLoader instance;

    public static RemoveRuleStageLoader getInstance() {
        if(instance==null) {instance=new RemoveRuleStageLoader();}
        return instance;
    }

    public void init() {
        String layoutPath = "rtn/gui/view/RemoveRuleWindow.fxml";
        Stage removeRuleStage = new Stage();
        removeRuleStage.setTitle("RockTheNet - RemoveRuleWindow");

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource(layoutPath));

        try {
            Pane removeRuleLayout = loader.load();
            Scene scene = new Scene(removeRuleLayout);
            removeRuleStage.setScene(scene);
            removeRuleStage.initModality(Modality.WINDOW_MODAL);
            removeRuleStage.initOwner(StageLoader.getMainStage().getScene().getWindow());
            removeRuleStage.hide();
            StageLoader.setRemoveRuleStage(removeRuleStage);
            StageLoader.setRemoveRuleLayout(removeRuleLayout);
        } catch (IOException e) {
            MainApp.getInstance().getLogger().error("Could not load layout: " + layoutPath, e);
        }
    }
}
