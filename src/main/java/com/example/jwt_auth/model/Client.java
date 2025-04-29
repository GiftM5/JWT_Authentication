package com.example.jwt_auth.model;

//The Client class stores and manages the username and password of a user in the system

public class Client {
    private String username;
    private String password;


    public Client(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
