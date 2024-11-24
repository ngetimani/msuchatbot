package com.example.msuai;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        LoginPage loginPage = new LoginPage(primaryStage);

        // Create the scene for the login page
        Scene loginScene = new Scene(loginPage.getLoginPane(), 400, 300);

        // Apply styles if needed
        loginScene.getStylesheets().add(getClass().getResource("/com/example/msuai/style.css").toExternalForm());

        // Set the title and scene
        primaryStage.setTitle("Maseno AI Chatbot");
        primaryStage.setScene(loginScene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
