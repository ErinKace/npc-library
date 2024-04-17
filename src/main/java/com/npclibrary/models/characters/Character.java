package com.npclibrary.models.characters;

import com.npclibrary.models.StoryObjects;
import com.npclibrary.models.locations.Location;
import com.npclibrary.models.Group;

import java.util.List;

public class Character extends StoryObjects {
    private Group group;
     private Location mainLocation;
     private List<Location> relatedLocations;
    // private CharaDetails charaDetails;
    // private StatBlock statBlock;

    Character() {
        super();
    }


}
