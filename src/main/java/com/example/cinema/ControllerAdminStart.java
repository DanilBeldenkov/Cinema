package com.example.cinema;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerAdminStart {

    @FXML
    private Button B1;

    @FXML
    private Button B2;

    @FXML
    void initialize(){

        B1.setOnAction(e -> {

            WindowFilms windowFilms = new WindowFilms();
            try {
                windowFilms.start(new Stage());
                B1.getScene().getWindow().hide();
                System.out.println("Список фильмов");
            }
            catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        B2.setOnAction(event -> {

            WindowAdminRefactor windowAdminRefactor = new WindowAdminRefactor();
            try {
                windowAdminRefactor.start(new Stage());
                B2.getScene().getWindow().hide();
                System.out.println("Admin");
            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }

}
