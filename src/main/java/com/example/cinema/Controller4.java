package com.example.cinema;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller4 {

    @FXML
    private Button B1;

    @FXML
    private Button BBack;

    @FXML
    private Button BExit;

    @FXML
    private ImageView I1;

    @FXML
    private Label L1;

    @FXML
    private Label L2;

    @FXML
    private Label L3;

    @FXML
    void initialize() {
        B1.setOnAction(event -> {
            Window5 window5 = new Window5();
            try {
                window5.start(new Stage());
                B1.getScene().getWindow().hide();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
    }

}
