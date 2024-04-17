package com.npclibrary.models;

import com.npclibrary.models.characters.Character;
import com.npclibrary.models.locations.Location;

import java.util.List;

public class Group extends StoryObjects {
    private List<Character> characters;
    private List<Location> locations;

    Group() {
    }

    public List<Character> getCharacters() {
        return characters;
    }

    public List<Location> getLocations() {
        return locations;
    }
}
