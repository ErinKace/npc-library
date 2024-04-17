package com.npclibrary.models.characters;

import com.npclibrary.models.StoryObjects;
import com.npclibrary.models.locations.Location;
import com.npclibrary.models.Group;

import java.util.List;

public class Character extends StoryObjects {
    private Group group;
     private Location mainLocation;
     private List<Location> relatedLocations;
     private CharaDetails charaDetails;
    // private StatBlock statBlock;

    Character() {
        super();
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Location getMainLocation() {
        return mainLocation;
    }

    public void setMainLocation(Location mainLocation) {
        this.mainLocation = mainLocation;
    }

    public List<Location> getRelatedLocations() {
        return relatedLocations;
    }

    public void setRelatedLocations(List<Location> relatedLocations) {
        this.relatedLocations = relatedLocations;
    }

    public CharaDetails getCharaDetails() {
        return charaDetails;
    }

    public void setCharaDetails(CharaDetails charaDetails) {
        this.charaDetails = charaDetails;
    }


}
