package com.example.cinema;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerFilms {

    @FXML
    private Button B1;

    @FXML
    private Button B2;

    @FXML
    private Button B3;

    @FXML
    private Button B4;

    @FXML
    private Button B5;

    @FXML
    private Button B6;

    @FXML
    private Button B7;

    @FXML
    private Button B8;

    @FXML
    private Button B9;

    @FXML
    private Button BExit;

    @FXML
    private Button BGo;

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
        BExit.setOnAction(e -> {
            System.out.println("Выход из приложения");
                BExit.getScene().getWindow().hide();
        });

        BGo.setOnAction(event -> {
            WindowPlaces windowPlaces = new WindowPlaces();
            try {
                windowPlaces.start(new Stage());
                BGo.getScene().getWindow().hide();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
    }
}
