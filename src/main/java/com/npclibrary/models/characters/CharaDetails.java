package com.npclibrary.models.characters;

import com.npclibrary.models.locations.Location;
import com.npclibrary.models.Field;

import java.util.ArrayList;
import java.util.List;

public class CharaDetails {
    private Character character;
    private Location currentLocation;
   // current location as opposed to the main location they're associated with
    private String tagline;
    // a character's tagline is meant to be a title or one line description
    private String gender;
    private String age;
    private String appearance;
    private String bio;

    private List<Field> extrafields = new ArrayList<Field>();

    CharaDetails() {
    }

    public Character getCharacter() {
        return character;
    }

    public Location getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAppearance() {
        return appearance;
    }

    public void setAppearance(String appearance) {
        this.appearance = appearance;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public List<Field> getExtrafields() {
        return extrafields;
    }
    public void setExtrafields(List<Field> extrafields) {
        this.extrafields = extrafields;
    }
    public boolean addNewField(Field newField) {
        if (extrafields.contains(newField)) {
            return false;
        }
        extrafields.add(newField);
        return true;
    }

    public void removeFieldByIndex(int index) {
        extrafields.remove(index);
    }

    public void removeField(Field fieldToRemove) {
        extrafields.remove(fieldToRemove);
    }
}
