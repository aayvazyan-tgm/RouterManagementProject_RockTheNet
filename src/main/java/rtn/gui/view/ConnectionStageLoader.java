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
public class ConnectionStageLoader {
    private static ConnectionStageLoader instance;

    public static ConnectionStageLoader getInstance() {
        if(instance==null) {instance=new ConnectionStageLoader();}
        return instance;
    }

    public void init() {
        String layoutPath = "rtn/gui/view/ConnectionWindow.fxml";
        Stage connectionStage = new Stage();
        connectionStage.setTitle("RockTheNet - ConnectionWindow");

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource(layoutPath));

        try {
            Pane connectionLayout = loader.load();
            Scene scene = new Scene(connectionLayout);
            connectionStage.setScene(scene);
            connectionStage.initModality(Modality.WINDOW_MODAL);
            connectionStage.initOwner(StageLoader.getMainStage().getScene().getWindow());
            connectionStage.show();
            StageLoader.setConnectionStage(connectionStage);
            StageLoader.setConnectionLayout(connectionLayout);
        } catch (IOException e) {
            MainApp.getInstance().getLogger().error("Could not load layout: " + layoutPath, e);
        }
    }
}
