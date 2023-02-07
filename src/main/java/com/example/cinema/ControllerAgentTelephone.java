package com.example.cinema;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerAgentTelephone {

    @FXML
    private Button BExit;
    @FXML
    private Button B1;

    @FXML
    void initialize() {
        B1.setOnAction(event -> {
            WindowFilms windowFilms = new WindowFilms();
            try {
                windowFilms.start(new Stage());
                B1.getScene().getWindow().hide();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        BExit.setOnAction(e -> {
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