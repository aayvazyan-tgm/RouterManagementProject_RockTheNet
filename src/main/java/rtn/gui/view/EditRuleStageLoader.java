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
public class EditRuleStageLoader {
    private static EditRuleStageLoader instance;

    public static EditRuleStageLoader getInstance() {
        if(instance==null) {instance=new EditRuleStageLoader();}
        return instance;
    }

    public void init() {
        String layoutPath = "rtn/gui/view/EditRuleWindow.fxml";
        Stage editRuleStage = new Stage();
        editRuleStage.setTitle("RockTheNet - EditRuleWindow");

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource(layoutPath));

        try {
            Pane editRuleLayout = loader.load();
            Scene scene = new Scene(editRuleLayout);
            editRuleStage.setScene(scene);
            editRuleStage.initModality(Modality.WINDOW_MODAL);
            editRuleStage.initOwner(StageLoader.getMainStage().getScene().getWindow());
            editRuleStage.hide();
            StageLoader.setEditRuleStage(editRuleStage);
            StageLoader.setEditRuleLayout(editRuleLayout);
        } catch (IOException e) {
            MainApp.getInstance().getLogger().error("Could not load layout: " + layoutPath, e);
        }
    }
}
