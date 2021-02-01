package com.yqs.controller;

import com.yqs.utils.Constants;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 *基本界面
 */
public class BaseController extends Application {

    //主舞台
    public transient static Stage primaryStage;

    //主页面
    public transient static MainController primaryStageController;


    @Override
    public void start(Stage primaryStage) throws Exception {
        BaseController.primaryStage = primaryStage;
        initializeStages();
        primaryStage.setTitle("GUI");
        primaryStage.setMinWidth(1024);
        primaryStage.setMinHeight(720);
        primaryStage.show();
    }
    /**
     * 启动窗口
     */
    public static void launchWindow(String[] args) {
        launch(args);
    }

    /**
     * 启动程序
     */
    private void initializeStages() {
        try {
            //获取FXML 加载器
            FXMLLoader primaryStageLoader =  new FXMLLoader(Thread.currentThread().getContextClassLoader().getResource("layout/main.fxml"));

            primaryStageLoader.setResources(Constants.getResourcesBundle());

            //加载 main.fxml
            Parent primary_stage_scene = primaryStageLoader.load();

            //设置 controller
            primaryStageController = primaryStageLoader.getController();

            //set scene
            primaryStage.setScene(new Scene(primary_stage_scene));


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
