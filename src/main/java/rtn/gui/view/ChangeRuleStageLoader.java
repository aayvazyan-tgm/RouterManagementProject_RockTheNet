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
public class ChangeRuleStageLoader {
    private static ChangeRuleStageLoader instance;

    public static ChangeRuleStageLoader getInstance() {
        if(instance==null) {instance=new ChangeRuleStageLoader();}
        return instance;
    }

    public void init() {
        String layoutPath = "rtn/gui/view/ChangeRuleWindow.fxml";
        Stage changeRuleStage = new Stage();
        changeRuleStage.setTitle("RockTheNet - ChangeRuleWindow");

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource(layoutPath));

        try {
            Pane changeRuleLayout = loader.load();
            Scene scene = new Scene(changeRuleLayout);
            changeRuleStage.setScene(scene);
            changeRuleStage.initModality(Modality.WINDOW_MODAL);
            changeRuleStage.initOwner(StageLoader.getMainStage().getScene().getWindow());
            changeRuleStage.hide();
            StageLoader.setChangeRuleStage(changeRuleStage);
            StageLoader.setChangeRuleLayout(changeRuleLayout);
        } catch (IOException e) {
            MainApp.getInstance().getLogger().error("Could not load layout: " + layoutPath, e);
        }
    }
}
