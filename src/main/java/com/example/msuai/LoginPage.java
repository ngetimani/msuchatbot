package com.example.msuai;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class LoginPage {
    private Stage stage;

    public LoginPage(Stage stage) {
        this.stage = stage;
    }

    public Pane getLoginPane() {
        VBox loginPane = new VBox(10);
        loginPane.setPadding(new Insets(20));

        Label lblUsername = new Label("Username:");
        TextField txtUsername = new TextField();

        Label lblPassword = new Label("Password:");
        PasswordField txtPassword = new PasswordField();

        Button btnLogin = new Button("Login");
        Button btnSignUp = new Button("Sign Up");
        Hyperlink forgotPassword = new Hyperlink("Forgot Password?");

        btnLogin.setOnAction(e -> {
            String username = txtUsername.getText();
            String password = txtPassword.getText();
            if (com.example.msuai.DatabaseHelper.validateUser(username, password)) {
                com.example.msuai.ChatScreen chatScreen = new com.example.msuai.ChatScreen(stage);
                stage.setScene(new Scene(chatScreen.getChatPane(), 600, 400));
            } else {
                showAlert("Invalid credentials", "Username or password is incorrect.");
            }
        });

        btnSignUp.setOnAction(e -> {
            SignUpPage signUpPage = new SignUpPage(stage);
            stage.setScene(new Scene(signUpPage.getSignUpPane(), 400, 300));
        });

        forgotPassword.setOnAction(e -> {
            showAlert("Forgot Password", "Send your username to masenoaichat@gmail.com for reset.");
        });

        loginPane.getChildren().addAll(lblUsername, txtUsername, lblPassword, txtPassword, btnLogin, btnSignUp, forgotPassword);
        return loginPane;
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
