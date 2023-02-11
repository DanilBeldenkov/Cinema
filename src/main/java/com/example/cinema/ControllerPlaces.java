package com.example.cinema;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerPlaces {

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
            WindowAgentTelephone windowAgentTelephone = new WindowAgentTelephone();
            try {
                windowAgentTelephone.start(new Stage());
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

        B1_1.setOnMousePressed(mouseEvent -> {
            B1_1.setStyle("-fx-background-color: green");
        });
        B1_1.setOnAction(actionEvent -> {
            B1_1.setOnMousePressed(event -> {
                B1_1.setStyle("-fx-background-color: red");
            });
        });

        B1_2.setOnMousePressed(mouseEvent -> {
            B1_2.setStyle("-fx-background-color: green");
        });
        B1_2.setOnAction(actionEvent -> {
            B1_2.setOnMousePressed(event -> {
                B1_2.setStyle("-fx-background-color: red");
            });
        });

        B1_3.setOnMousePressed(mouseEvent -> {
            B1_3.setStyle("-fx-background-color: green");
        });
        B1_3.setOnAction(actionEvent -> {
            B1_3.setOnMousePressed(event -> {
                B1_3.setStyle("-fx-background-color: red");
            });
        });

        B1_4.setOnMousePressed(mouseEvent -> {
            B1_4.setStyle("-fx-background-color: green");
        });
        B1_4.setOnAction(actionEvent -> {
            B1_4.setOnMousePressed(event -> {
                B1_4.setStyle("-fx-background-color: red");
            });
        });

        B1_5.setOnMousePressed(mouseEvent -> {
            B1_5.setStyle("-fx-background-color: green");
        });
        B1_5.setOnAction(actionEvent -> {
            B1_5.setOnMousePressed(event -> {
                B1_5.setStyle("-fx-background-color: red");
            });
        });

        B1_6.setOnMousePressed(mouseEvent -> {
            B1_6.setStyle("-fx-background-color: green");
        });
        B1_6.setOnAction(actionEvent -> {
            B1_6.setOnMousePressed(event -> {
                B1_6.setStyle("-fx-background-color: red");
            });
        });

        B1_7.setOnMousePressed(mouseEvent -> {
            B1_7.setStyle("-fx-background-color: green");
        });
        B1_7.setOnAction(actionEvent -> {
            B1_7.setOnMousePressed(event -> {
                B1_7.setStyle("-fx-background-color: red");
            });
        });

        B1_8.setOnMousePressed(mouseEvent -> {
            B1_8.setStyle("-fx-background-color: green");
        });
        B1_8.setOnAction(actionEvent -> {
            B1_8.setOnMousePressed(event -> {
                B1_8.setStyle("-fx-background-color: red");
            });
        });

        B1_9.setOnMousePressed(mouseEvent -> {
            B1_9.setStyle("-fx-background-color: green");
        });
        B1_9.setOnAction(actionEvent -> {
            B1_9.setOnMousePressed(event -> {
                B1_9.setStyle("-fx-background-color: red");
            });
        });

        B1_10.setOnMousePressed(mouseEvent -> {
            B1_10.setStyle("-fx-background-color: green");
        });
        B1_10.setOnAction(actionEvent -> {
            B1_10.setOnMousePressed(event -> {
                B1_10.setStyle("-fx-background-color: red");
            });
        });

        B2_1.setOnMousePressed(mouseEvent -> {
            B2_1.setStyle("-fx-background-color: green");
        });
        B2_1.setOnAction(actionEvent -> {
            B2_1.setOnMousePressed(event -> {
                B2_1.setStyle("-fx-background-color: red");
            });
        });

        B2_2.setOnMousePressed(mouseEvent -> {
            B2_2.setStyle("-fx-background-color: green");
        });
        B2_2.setOnAction(actionEvent -> {
            B2_2.setOnMousePressed(event -> {
                B2_2.setStyle("-fx-background-color: red");
            });
        });

        B2_3.setOnMousePressed(mouseEvent -> {
            B2_3.setStyle("-fx-background-color: green");
        });
        B2_3.setOnAction(actionEvent -> {
            B2_3.setOnMousePressed(event -> {
                B2_3.setStyle("-fx-background-color: red");
            });
        });

        B2_4.setOnMousePressed(mouseEvent -> {
            B2_4.setStyle("-fx-background-color: green");
        });
        B2_4.setOnAction(actionEvent -> {
            B2_4.setOnMousePressed(event -> {
                B2_4.setStyle("-fx-background-color: red");
            });
        });

        B2_5.setOnMousePressed(mouseEvent -> {
            B2_5.setStyle("-fx-background-color: green");
        });
        B2_5.setOnAction(actionEvent -> {
            B2_5.setOnMousePressed(event -> {
                B2_5.setStyle("-fx-background-color: red");
            });
        });

        B2_6.setOnMousePressed(mouseEvent -> {
            B2_6.setStyle("-fx-background-color: green");
        });
        B2_6.setOnAction(actionEvent -> {
            B2_6.setOnMousePressed(event -> {
                B2_6.setStyle("-fx-background-color: red");
            });
        });

        B2_7.setOnMousePressed(mouseEvent -> {
            B2_7.setStyle("-fx-background-color: green");
        });
        B2_7.setOnAction(actionEvent -> {
            B2_7.setOnMousePressed(event -> {
                B2_7.setStyle("-fx-background-color: red");
            });
        });

        B2_8.setOnMousePressed(mouseEvent -> {
            B2_8.setStyle("-fx-background-color: green");
        });
        B2_8.setOnAction(actionEvent -> {
            B2_8.setOnMousePressed(event -> {
                B2_8.setStyle("-fx-background-color: red");
            });
        });

        B2_9.setOnMousePressed(mouseEvent -> {
            B2_9.setStyle("-fx-background-color: green");
        });
        B2_9.setOnAction(actionEvent -> {
            B2_9.setOnMousePressed(event -> {
                B2_9.setStyle("-fx-background-color: red");
            });
        });

        B2_10.setOnMousePressed(mouseEvent -> {
            B2_10.setStyle("-fx-background-color: green");
        });
        B2_10.setOnAction(actionEvent -> {
            B2_10.setOnMousePressed(event -> {
                B2_10.setStyle("-fx-background-color: red");
            });
        });

        B3_1.setOnMousePressed(mouseEvent -> {
            B3_1.setStyle("-fx-background-color: green");
        });
        B3_1.setOnAction(actionEvent -> {
            B3_1.setOnMousePressed(event ->{
                B3_1.setStyle("-fx-background-color: red");
            });
        });

        B3_2.setOnMousePressed(mouseEvent -> {
            B3_2.setStyle("-fx-background-color: green");
        });
        B3_2.setOnAction(actionEvent -> {
            B3_2.setOnMousePressed(event ->{
                B3_2.setStyle("-fx-background-color: red");
            });
        });

        B3_3.setOnMousePressed(mouseEvent -> {
            B3_3.setStyle("-fx-background-color: green");
        });
        B3_3.setOnAction(actionEvent -> {
            B3_3.setOnMousePressed(event ->{
                B3_3.setStyle("-fx-background-color: red");
            });
        });

        B3_4.setOnMousePressed(mouseEvent -> {
            B3_4.setStyle("-fx-background-color: green");
        });
        B3_4.setOnAction(actionEvent -> {
            B3_4.setOnMousePressed(event ->{
                B3_4.setStyle("-fx-background-color: red");
            });
        });

        B3_5.setOnMousePressed(mouseEvent -> {
            B3_5.setStyle("-fx-background-color: green");
        });
        B3_5.setOnAction(actionEvent -> {
            B3_5.setOnMousePressed(event ->{
                B3_5.setStyle("-fx-background-color: red");
            });
        });

        B3_6.setOnMousePressed(mouseEvent -> {
            B3_6.setStyle("-fx-background-color: green");
        });
        B3_6.setOnAction(actionEvent -> {
            B3_6.setOnMousePressed(event ->{
                B3_6.setStyle("-fx-background-color: red");
            });
        });

        B3_7.setOnMousePressed(mouseEvent -> {
            B3_7.setStyle("-fx-background-color: green");
        });
        B3_7.setOnAction(actionEvent -> {
            B3_7.setOnMousePressed(event ->{
                B3_7.setStyle("-fx-background-color: red");
            });
        });

        B3_8.setOnMousePressed(mouseEvent -> {
            B3_8.setStyle("-fx-background-color: green");
        });
        B3_8.setOnAction(actionEvent -> {
            B3_8.setOnMousePressed(event ->{
                B3_8.setStyle("-fx-background-color: red");
            });
        });

        B3_9.setOnMousePressed(mouseEvent -> {
            B3_9.setStyle("-fx-background-color: green");
        });
        B3_9.setOnAction(actionEvent -> {
            B3_9.setOnMousePressed(event ->{
                B3_9.setStyle("-fx-background-color: red");
            });
        });

        B3_10.setOnMousePressed(mouseEvent -> {
            B3_10.setStyle("-fx-background-color: green");
        });
        B3_10.setOnAction(actionEvent -> {
            B3_10.setOnMousePressed(event ->{
                B3_10.setStyle("-fx-background-color: red");
            });
        });
    }
}
