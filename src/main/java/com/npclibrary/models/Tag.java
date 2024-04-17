package com.npclibrary.models;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tag tag)) return false;
        return id == tag.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
