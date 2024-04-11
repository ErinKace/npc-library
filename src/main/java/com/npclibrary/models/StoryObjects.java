package com.npclibrary.models;

import java.util.List;

public abstract class StoryObjects {
    private long id;
    private static long nextId =1;
    private String name;

     private User userCreated;
     private List<User> sharedWithUsers;

     private String notes;

//     private List<Tag>

     public StoryObjects() {
         this.id = nextId;
         nextId++;
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

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
