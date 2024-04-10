package com.npclibrary.models;

public abstract class StoryObjects {
    private int id;
    private int nextId;
    private String name;

    // private User userCreated
    // private List<User> sharedWithUsers;

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
