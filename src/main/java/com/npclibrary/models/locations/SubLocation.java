package com.npclibrary.models.locations;

import java.util.List;

public class SubLocation extends Location {
    private Location parentLocation;

    SubLocation() {
        super();
    }

    public Location getParentLocation() {
        return parentLocation;
    }

    public void setParentLocation(Location parentLocation) {
        this.parentLocation = parentLocation;
    }
    public int calculateLevel() {
        int Lvl = 0;
        // need to go up as many levels as possible and add to the count each time.
        //could we do this with recursion?
        // possibly check if the Location is a SubLocation?
        return Lvl;
    }
}
