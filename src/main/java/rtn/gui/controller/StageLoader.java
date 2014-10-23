package rtn.gui.controller;

import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import rtn.gui.view.*;

/**
 * Created by Fabian on 23.10.2014.
 */
public class StageLoader {
    private static StageLoader instance;

    private static Stage mainStage;
    private static Stage connectionStage;
    private static Stage addRuleStage;
    private static Stage removeRuleStage;
    private static Stage changeRuleStage;
    private static Stage maxItemStage;
    private static Stage autoRefreshStage;

    private static Pane mainLayout;
    private static Pane connectionLayout;
    private static Pane addRuleLayout;
    private static Pane removeRuleLayout;
    private static Pane changeRuleLayout;
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
        ChangeRuleStageLoader.getInstance().init();
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

    public static Stage getRemoveRuleStage() {
        return removeRuleStage;
    }

    public static void setRemoveRuleStage(Stage removeRuleStage) {
        StageLoader.removeRuleStage = removeRuleStage;
    }

    public static Stage getChangeRuleStage() {
        return changeRuleStage;
    }

    public static void setChangeRuleStage(Stage changeRuleStage) {
        StageLoader.changeRuleStage = changeRuleStage;
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

    public static Pane getRemoveRuleLayout() {
        return removeRuleLayout;
    }

    public static void setRemoveRuleLayout(Pane removeRuleLayout) {
        StageLoader.removeRuleLayout = removeRuleLayout;
    }

    public static Pane getChangeRuleLayout() {
        return changeRuleLayout;
    }

    public static void setChangeRuleLayout(Pane changeRuleLayout) {
        StageLoader.changeRuleLayout = changeRuleLayout;
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
