package com.npclibrary.models;

public class User {
    private long id;
    private static long nextId = 1;

    private String email;
    private String username;
    private String pwHash;

    User() {
        this.id = nextId;
        nextId++;
    }

    public long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
