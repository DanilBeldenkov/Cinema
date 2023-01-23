package com.example.cinema;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.*;


public class Result {

    public static void main(String[] args) {
        try{
            String url = "jdbc:mysql://localhost/cinema?serverTimezone=Europe/Moscow&useSSL=false";
            String username = "root";
            String password = "1379248650";
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();

            try (Connection conn = DriverManager.getConnection(url, username, password)){

                Statement statement = conn.createStatement();

                ResultSet resultSet = statement.executeQuery("SELECT * FROM users");
                while(resultSet.next()){

                    int id = resultSet.getInt(1);
                    String name = resultSet.getString(2);
                    String login = resultSet.getString(3);
                    String pass = resultSet.getString(4);
                    String country = resultSet.getString(5);
                    String city = resultSet.getString(6);
                    System.out.printf("%d. %s: %s; %s (%s, %s)\n", id, name, login, pass, country, city);

                }
            }
        }
        catch(Exception ex){
            System.out.println("Connection failed...");

            System.out.println(ex);
        }
    }
}