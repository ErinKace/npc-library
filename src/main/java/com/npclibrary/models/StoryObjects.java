package com.npclibrary.models;

import java.util.List;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StoryObjects that)) return false;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
