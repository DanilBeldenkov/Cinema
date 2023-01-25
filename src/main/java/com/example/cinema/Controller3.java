package com.example.cinema;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Controller3 {

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
    void initialize() {
        B1.setOnAction(e -> {
            Window4 window4 = new Window4();
            try {
                window4.start(new Stage());
                B1.getScene().getWindow().hide();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        B2.setOnAction(e -> {
            Window4 window4 = new Window4();
            try {
                window4.start(new Stage());
                B2.getScene().getWindow().hide();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        B3.setOnAction(e -> {
            Window4 window4 = new Window4();
            try {
                window4.start(new Stage());
                B3.getScene().getWindow().hide();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        B4.setOnAction(e -> {
            Window4 window4 = new Window4();
            try {
                window4.start(new Stage());
                B4.getScene().getWindow().hide();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        B5.setOnAction(e -> {
            Window4 window4 = new Window4();
            try {
                window4.start(new Stage());
                B5.getScene().getWindow().hide();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        B6.setOnAction(e -> {
            Window4 window4 = new Window4();
            try {
                window4.start(new Stage());
                B6.getScene().getWindow().hide();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        B7.setOnAction(e -> {
            Window4 window4 = new Window4();
            try {
                window4.start(new Stage());
                B7.getScene().getWindow().hide();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        B8.setOnAction(e -> {
            Window4 window4 = new Window4();
            try {
                window4.start(new Stage());
                B8.getScene().getWindow().hide();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        B9.setOnAction(e -> {
            Window4 window4 = new Window4();
            try {
                window4.start(new Stage());
                B9.getScene().getWindow().hide();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
    }
}
