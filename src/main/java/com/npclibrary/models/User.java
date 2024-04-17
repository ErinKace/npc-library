package com.npclibrary.models;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return id == user.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
