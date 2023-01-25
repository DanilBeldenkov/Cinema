package com.example.cinema;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Controller1 {

    @FXML
    private Button B1;

    @FXML
    private Button B2;

    @FXML
    private PasswordField PF1;

    @FXML
    private TextField TF1;

    @FXML
    void initialize() {

        B1.setOnAction(event -> {
            String login = TF1.getText().trim();
            String pass = PF1.getText().trim();


            if(!login.equals("") && !pass.equals("") | login.equals("admin"))
                loginUsers(login, pass);

            else {
                try {
                    WindowError1 windowError1 = new WindowError1();
                    try {
                        windowError1.start(new Stage());
                        B1.getScene().getWindow();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    System.out.println("Error");
                } catch (RuntimeException e) {
                    throw new RuntimeException(e);
                }
            }

        });

        B2.setOnAction(e -> {

            System.out.println("Регистрация");

            Window2 window2 = new Window2();
            try {
                window2.start(new Stage());
                B2.getScene().getWindow().hide();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

    }

    private void loginUsers(String login, String pass) {
        DateBase dbBase = new DateBase();
        User user  =new User();
        user.setLogin(login);
        user.setPassword(MD5.hashingPassword(pass));
        ResultSet result = dbBase.getUser(user);

        int counter = 0;

        try {
            while(result.next()) {
                counter++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if (counter >= 1 && login.equals("admin") && TF1 !=null && PF1 !=null){
            try {
                WindowAdmin0 windowAdmin0 = new WindowAdmin0();
                try {
                    windowAdmin0.start(new Stage());
                    B1.getScene().getWindow().hide();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (counter >= 1 && TF1 != null && PF1 != null) {
            try {
                Window3 window3 = new Window3();
                try {
                    window3.start(new Stage());
                    B1.getScene().getWindow().hide();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("Авторизация правильная");
        } else {
            WindowError1 windowError1 = new WindowError1();
            try {
                windowError1.start(new Stage());
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            System.out.println("Авторизация неправильная");

        }
    }
}
