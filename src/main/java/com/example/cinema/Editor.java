package com.example.cinema;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.*;
import java.nio.file.*;
import java.io.*;
import java.util.*;

public class Editor {

    public static void main(String[] args) {

        //java -classpath C:\Editor Files (x86)\MySQL\Connector J 8.0\mysql-connector-j-8.0.31.jar;D:\Projects\IntelliJIDEAProjects\Cinema\Cinema\src\main\java\com\example\cinema\Editor.java
        try{
            String url = "jdbc:mysql://localhost/cinema?serverTimezone=Europe/Moscow&useSSL=false";
            String username = "root";
            String password = "1379248650";

            // работа с базой данных
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            System.out.println("Connection succesfull!");

            // команда создания таблицы
             String sqlCommand = "CREATE TABLE films (Id INT PRIMARY KEY AUTO_INCREMENT)";


            try(Connection conn = DriverManager.getConnection(url, username, password)) {

                // создание таблицы
                 Statement statement = conn.createStatement();

                   statement.executeUpdate(sqlCommand);


                /* Statement statement = conn.createStatement();
                *
                //Добавление в таблицу
                * int rows = statement.executeUpdate("INSERT users(FirstName, Login, Password, Country, City) VALUES ('Админ', 'admin', 1111, 'Россия', 'Пенза')," +
                *        "('Денис', 'Denis', 1379, 'Россия', 'Пенза'), ('Данил', 'Danil', 1234, 'Россия', 'Пенза')");
                * System.out.printf("Added %d rows", rows);
                */

                //Редактирование таблицы
                /* Statement statement = conn.createStatement();
                *
                * int rows = statement.executeUpdate("UPDATE Products SET Price = Price - 5000");
                * System.out.printf("Updated %d rows", rows);
                */

                //Удаление
                /*Statement statement = conn.createStatement();
                *
                *int rows = statement.executeUpdate("DELETE FROM Products WHERE Id = 3");
                *System.out.printf("%d row(s) deleted", rows);
                *
                *System.out.println("Database has been created!");
                */


            }

        }
        catch(Exception ex){
            System.out.println("Connection failed...");

            System.out.println(ex);
        }
    }

    public static Connection getConnection() throws SQLException, IOException{

        Properties props = new Properties();
        try(InputStream in = Files.newInputStream(Paths.get("database.properties"))){
            props.load(in);
        }
        String url = props.getProperty("url");
        String username = props.getProperty("username");
        String password = props.getProperty("1379248650");

        return DriverManager.getConnection(url, username, password);
    }
}