package com.npclibrary.models;

public class Tag {
    private long id;
    private static long nextid = 1;
    private String name;

    Tag() {
        this.id = this.nextid;
        this.nextid++;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
