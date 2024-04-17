package com.npclibrary.models.locations;

import com.npclibrary.models.StoryObjects;

import java.util.List;

public class Location extends StoryObjects {
    private int level;
    private List<Location> containsLocations;

    // private LocationDetails locationDetails;

    Location() {
        super();
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public List<Location> getContainsLocations() {
        return containsLocations;
    }

    public void setContainsLocations(List<Location> containsLocations) {
        this.containsLocations = containsLocations;
    }

    public void addNewContainedLocation(Location newLocation) {
        this.containsLocations.add(newLocation);
    }

    public void removeLocation(Location locationToRemove) {
        this.containsLocations.remove(locationToRemove);
    }
}
