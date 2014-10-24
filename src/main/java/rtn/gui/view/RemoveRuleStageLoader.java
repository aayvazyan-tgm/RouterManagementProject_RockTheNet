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
public class RemoveRuleStageLoader {
    private static RemoveRuleStageLoader instance;

    public static RemoveRuleStageLoader getInstance() {
        if(instance==null) {instance=new RemoveRuleStageLoader();}
        return instance;
    }

    public void init() {
        String layoutPath = "rtn/gui/view/DeleteRuleWindow.fxml";
        Stage deleteRuleStage = new Stage();
        deleteRuleStage.setTitle("RockTheNet - DeleteRuleWindow");

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource(layoutPath));

        try {
            Pane deleteRuleLayout = loader.load();
            Scene scene = new Scene(deleteRuleLayout);
            deleteRuleStage.setScene(scene);
            deleteRuleStage.initModality(Modality.WINDOW_MODAL);
            deleteRuleStage.initOwner(StageLoader.getMainStage().getScene().getWindow());
            deleteRuleStage.hide();
            StageLoader.setDeleteRuleStage(deleteRuleStage);
            StageLoader.setDeleteRuleLayout(deleteRuleLayout);
        } catch (IOException e) {
            MainApp.getInstance().getLogger().error("Could not load layout: " + layoutPath, e);
        }
    }
}
