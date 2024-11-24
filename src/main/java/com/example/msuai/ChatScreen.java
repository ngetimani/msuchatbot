package com.example.msuai;

import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class ChatScreen {
    private Stage stage;

    public ChatScreen(Stage stage) {
        this.stage = stage;
    }

    public Pane getChatPane() {
        BorderPane chatPane = new BorderPane();
        chatPane.setPadding(new Insets(10));

        ListView<String> chatList = new ListView<>();
        TextField messageInput = new TextField();
        Button sendButton = new Button("Send");

        HBox inputPane = new HBox(5, messageInput, sendButton);
        inputPane.setPadding(new Insets(10));

        sendButton.setOnAction(e -> {
            String message = messageInput.getText();
            if (!message.isEmpty()) {
                chatList.getItems().add("You: " + message);
                messageInput.clear();
            }
        });

        chatPane.setCenter(chatList);
        chatPane.setBottom(inputPane);
        return chatPane;
    }
}
