package rtn.gui.view;

import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * Created by Fabian on 23.10.2014.
 */
public class StageLoader {
    private static StageLoader instance;

    private static Stage mainStage;
    private static Stage connectionStage;
    private static Stage addRuleStage;
    private static Stage deleteRuleStage;
    private static Stage editRuleStage;
    private static Stage maxItemStage;
    private static Stage autoRefreshStage;

    private static Pane mainLayout;
    private static Pane connectionLayout;
    private static Pane addRuleLayout;
    private static Pane deleteRuleLayout;
    private static Pane editRuleLayout;
    private static Pane maxItemLayout;
    private static Pane autoRefreshLayout;

    public static StageLoader getInstance() {
        if(instance==null) {instance=new StageLoader();}
        return instance;
    }

    public void initAll() {
        MainStageLoader.getInstance().init();
        ConnectionStageLoader.getInstance().init();
        MaxItemStageLoader.getInstance().init();
        AutoRefreshStageLoader.getInstance().init();
        AddRuleStageLoader.getInstance().init();
        EditRuleStageLoader.getInstance().init();
        RemoveRuleStageLoader.getInstance().init();
    }

    public static void setInstance(StageLoader instance) {
        StageLoader.instance = instance;
    }

    public static Stage getMainStage() {
        return mainStage;
    }

    public static void setMainStage(Stage mainStage) {
        StageLoader.mainStage = mainStage;
    }

    public static Stage getConnectionStage() {
        return connectionStage;
    }

    public static void setConnectionStage(Stage connectionStage) {
        StageLoader.connectionStage = connectionStage;
    }

    public static Stage getAddRuleStage() {
        return addRuleStage;
    }

    public static void setAddRuleStage(Stage addRuleStage) {
        StageLoader.addRuleStage = addRuleStage;
    }

    public static Stage getDeleteRuleStage() {
        return deleteRuleStage;
    }

    public static void setDeleteRuleStage(Stage deleteRuleStage) {
        StageLoader.deleteRuleStage = deleteRuleStage;
    }

    public static Stage getEditRuleStage() {
        return editRuleStage;
    }

    public static void setEditRuleStage(Stage editRuleStage) {
        StageLoader.editRuleStage = editRuleStage;
    }

    public static Stage getMaxItemStage() {
        return maxItemStage;
    }

    public static void setMaxItemStage(Stage maxItemStage) {
        StageLoader.maxItemStage = maxItemStage;
    }

    public static Stage getAutoRefreshStage() {
        return autoRefreshStage;
    }

    public static void setAutoRefreshStage(Stage autoRefreshStage) {
        StageLoader.autoRefreshStage = autoRefreshStage;
    }

    public static Pane getMainLayout() {
        return mainLayout;
    }

    public static void setMainLayout(Pane mainLayout) {
        StageLoader.mainLayout = mainLayout;
    }

    public static Pane getConnectionLayout() {
        return connectionLayout;
    }

    public static void setConnectionLayout(Pane connectionLayout) {
        StageLoader.connectionLayout = connectionLayout;
    }

    public static Pane getAddRuleLayout() {
        return addRuleLayout;
    }

    public static void setAddRuleLayout(Pane addRuleLayout) {
        StageLoader.addRuleLayout = addRuleLayout;
    }

    public static Pane getDeleteRuleLayout() {
        return deleteRuleLayout;
    }

    public static void setDeleteRuleLayout(Pane deleteRuleLayout) {
        StageLoader.deleteRuleLayout = deleteRuleLayout;
    }

    public static Pane getEditRuleLayout() {
        return editRuleLayout;
    }

    public static void setEditRuleLayout(Pane editRuleLayout) {
        StageLoader.editRuleLayout = editRuleLayout;
    }

    public static Pane getMaxItemLayout() {
        return maxItemLayout;
    }

    public static void setMaxItemLayout(Pane maxItemLayout) {
        StageLoader.maxItemLayout = maxItemLayout;
    }

    public static Pane getAutoRefreshLayout() {
        return autoRefreshLayout;
    }

    public static void setAutoRefreshLayout(Pane autoRefreshLayout) {
        StageLoader.autoRefreshLayout = autoRefreshLayout;
    }
}
