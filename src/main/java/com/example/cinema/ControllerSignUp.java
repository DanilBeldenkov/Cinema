package com.example.cinema;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerSignUp {

    @FXML
    private Button B1;

    @FXML
    private Button BExit;

    @FXML
    private TextField TF1;

    @FXML
    private TextField TF2;

    @FXML
    private PasswordField PF3;

    @FXML
    private TextField TF4;

    @FXML
    private TextField TF5;

    @FXML
    void initialize(){

        B1.setOnAction(e -> {

            signUpNewUser();

            WindowStart windowStart = new WindowStart();
            try {
                windowStart.start(new Stage());
                B1.getScene().getWindow().hide();
                System.out.println("Авторизация");
            }
            catch (IOException ex) {
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

    private void signUpNewUser() {
        DateBase dbBase = new DateBase();

        String FirstName = TF1.getText();
        String Login = TF2.getText();
        String Password = PF3.getText();
        String Country = TF4.getText();
        String City = TF5.getText();

        Password = MD5.hashingPassword(Password);

        User user = new User(FirstName, Login, Password, Country, City);

        dbBase.signUpUser(user);
    }
}
