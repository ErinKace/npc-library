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
}
