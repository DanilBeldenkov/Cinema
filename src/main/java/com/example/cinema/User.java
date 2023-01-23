package com.example.cinema;

public class User {
    private String FirstName;
    private String Login;
    private String Password;
    private String Country;
    private String City;

    public User(String firstName, String login, String password, String country, String city) {
        FirstName = firstName;
        Login = login;
        Password = password;
        Country = country;
        City = city;
    }

    public User() {

    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String login) {
        Login = login;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }
}
