package com.npclibrary.models;

public class Field {
    private long id;
    private static long nextId = 1;
    private String name;
    private String description;
    private String value;
    private User createdBy;
    private boolean isPublic = false;

    Field() {
        this.id = nextId;
        this.nextId++;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public boolean isPublic() {
        return isPublic;
    }

    public void setPublic(boolean aPublic) {
        isPublic = aPublic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Field that)) return false;
        return id == that.id && name.equals(that.name);
    }
}
