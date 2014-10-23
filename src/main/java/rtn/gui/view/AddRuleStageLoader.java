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
public class AddRuleStageLoader {
    private static AddRuleStageLoader instance;

    public static AddRuleStageLoader getInstance() {
        if(instance==null) {instance=new AddRuleStageLoader();}
        return instance;
    }

    public void init() {
        String layoutPath = "rtn/gui/view/AddRuleWindow.fxml";
        Stage addRuleStage = new Stage();
        addRuleStage.setTitle("RockTheNet - AddRuleWindow");

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource(layoutPath));

        try {
            Pane addRuleLayout = loader.load();
            Scene scene = new Scene(addRuleLayout);
            addRuleStage.setScene(scene);
            addRuleStage.initModality(Modality.WINDOW_MODAL);
            addRuleStage.initOwner(StageLoader.getMainStage().getScene().getWindow());
            addRuleStage.hide();
            StageLoader.setAddRuleStage(addRuleStage);
            StageLoader.setAddRuleLayout(addRuleLayout);
        } catch (IOException e) {
            MainApp.getInstance().getLogger().error("Could not load layout: " + layoutPath, e);
        }
    }
}
