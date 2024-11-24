package com.example.msuai;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class SignUpPage {
    private Stage stage;

    public SignUpPage(Stage stage) {
        this.stage = stage;
    }

    public Pane getSignUpPane() {
        VBox signUpPane = new VBox(10);
        signUpPane.setPadding(new Insets(20));

        Label lblUsername = new Label("Username:");
        TextField txtUsername = new TextField();

        Label lblPassword = new Label("Password:");
        PasswordField txtPassword = new PasswordField();

        Label lblConfirmPassword = new Label("Confirm Password:");
        PasswordField txtConfirmPassword = new PasswordField();

        Hyperlink hyperlinkSignUp = new Hyperlink("Create Account");

        hyperlinkSignUp.setOnAction(e -> {
            String username = txtUsername.getText();
            String password = txtPassword.getText();
            String confirmPassword = txtConfirmPassword.getText();

            if (username.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
                showAlert("Error", "All fields are required.");
            } else if (!password.equals(confirmPassword)) {
                showAlert("Error", "Passwords do not match.");
            } else if (com.example.msuai.DatabaseHelper.createUser(username, password)) {
                showAlert("Success", "Account created successfully. Please sign in.");
                com.example.msuai.LoginPage loginPage = new com.example.msuai.LoginPage(stage);
                stage.setScene(new Scene(loginPage.getLoginPane(), 400, 300));
            } else {
                showAlert("Error", "Username is already taken.");
            }
        });

        signUpPane.getChildren().addAll(lblUsername, txtUsername, lblPassword, txtPassword, lblConfirmPassword, txtConfirmPassword, hyperlinkSignUp);
        return signUpPane;
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
