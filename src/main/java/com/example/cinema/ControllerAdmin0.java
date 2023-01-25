package com.example.cinema;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerAdmin0 {

    @FXML
    private Button B1;

    @FXML
    private Button B2;

    @FXML
    void initialize(){

        B1.setOnAction(e -> {

            Window3 window3 = new Window3();
            try {
                window3.start(new Stage());
                B1.getScene().getWindow().hide();
                System.out.println("Список фильмов");
            }
            catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        B2.setOnAction(event -> {

            WindowAdmin1 windowAdmin1 = new WindowAdmin1();
            try {
                windowAdmin1.start(new Stage());
                B2.getScene().getWindow().hide();
                System.out.println("Admin");
            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }

}
