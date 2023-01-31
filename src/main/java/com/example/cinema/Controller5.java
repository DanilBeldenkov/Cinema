package com.example.cinema;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller5 {

    @FXML
    private Button B1;

    @FXML
    private Button B1_1;

    @FXML
    private Button B1_10;

    @FXML
    private Button B1_2;

    @FXML
    private Button B1_3;

    @FXML
    private Button B1_4;

    @FXML
    private Button B1_5;

    @FXML
    private Button B1_6;

    @FXML
    private Button B1_7;

    @FXML
    private Button B1_8;

    @FXML
    private Button B1_9;

    @FXML
    private Button B2_1;

    @FXML
    private Button B2_10;

    @FXML
    private Button B2_2;

    @FXML
    private Button B2_3;

    @FXML
    private Button B2_4;

    @FXML
    private Button B2_5;

    @FXML
    private Button B2_6;

    @FXML
    private Button B2_7;

    @FXML
    private Button B2_8;

    @FXML
    private Button B2_9;

    @FXML
    private Button B3_1;

    @FXML
    private Button B3_10;

    @FXML
    private Button B3_2;

    @FXML
    private Button B3_3;

    @FXML
    private Button B3_4;

    @FXML
    private Button B3_5;

    @FXML
    private Button B3_6;

    @FXML
    private Button B3_7;

    @FXML
    private Button B3_8;

    @FXML
    private Button B3_9;

    @FXML
    private Button BExit;

    @FXML
    void initialize(){
        B1.setOnAction(event -> {
            Window6 window6 = new Window6();
            try {
                window6.start(new Stage());
                B1.getScene().getWindow().hide();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        BExit.setOnAction(event -> {
            System.out.println("Выход из приложения");

            WindowExit windowExit = new WindowExit();
            try {
                windowExit.start(new Stage());
                BExit.getScene().getWindow().hide();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
    }

}
