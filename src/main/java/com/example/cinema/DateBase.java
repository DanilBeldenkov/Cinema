package com.example.cinema;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.*;
import java.util.Properties;

public class DateBase extends Configs {
    Connection dbConnection;

    public Connection getDbConnection()
            throws ClassNotFoundException, SQLException {
        String connectionString = "jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName + "?serverTimezone=Europe/Moscow&useSSL=false";
        Class.forName("com.mysql.jdbc.Driver");

        dbConnection = DriverManager.getConnection(connectionString, dbUser,dbPass);
        return dbConnection;
    }
    public void signUpUser(User user) {
        String insert = "INSERT INTO " + Const.USER_TABLE + "(" + Const.USERS_FIRSTNAME + "," + Const.USERS_LOGIN + "," + Const.USERS_PASSWOD + "," + Const.USERS_COUNTRY + "," + Const.USERS_CITY +")" + "VALUES(?,?,?,?,?)";
        try {
            PreparedStatement prST = getDbConnection().prepareStatement(insert);
            prST.setString(1, user.getFirstName());
            prST.setString(2, user.getLogin());
            prST.setString(3, user.getPassword());
            prST.setString(4, user.getCountry());
            prST.setString(5, user.getCity());

            prST.executeUpdate();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        catch (ClassCastException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public ResultSet getUser(User user) {
        ResultSet resSet = null;

        String select = "SELECT * FROM " + Const.USER_TABLE + " WHERE " + Const.USERS_LOGIN + "=? AND " + Const.USERS_PASSWOD + "=?";
        try {
            PreparedStatement prST = getDbConnection().prepareStatement(select);
            prST.setString(1, user.getLogin());
            prST.setString(2, user.getPassword());

            resSet = prST.executeQuery();
        }
        catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassCastException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return resSet;
    }
    /*
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

                //Добавление в таблицу
                int rows = statement.executeUpdate("INSERT users(FirstName, Login, Password, Country, City) VALUES ('Админ', 'admin', 1111, 'Россия', 'Пенза')," +
                "('Денис', 'Denis', 1379, 'Россия', 'Пенза'), ('Данил', 'Danil', 1234, 'Россия', 'Пенза')");
                System.out.printf("Added %d rows", rows);


                //Редактирование таблицы

                 int red = statement.executeUpdate("UPDATE Products SET Price = Price - 5000");
                 System.out.printf("Updated %d rows", red);


                //Удаление
                 int del = statement.executeUpdate("DELETE FROM Products WHERE Id = 3");
                 System.out.printf("%d row(s) deleted", del);

                 System.out.println("Database has been created!");
            }

        }
        catch(Exception ex){
            System.out.println("Connection failed...");

            System.out.println(ex);
        }
    }
    public static Connection getConnection() throws SQLException, IOException {

        Properties props = new Properties();
        try(InputStream in = Files.newInputStream(Paths.get("database.properties"))){
            props.load(in);
        }
        String url = props.getProperty("url");
        String username = props.getProperty("username");
        String password = props.getProperty("1379248650");

        return DriverManager.getConnection(url, username, password);
    }

     */
}


