package com.npclibrary.models.characters;

import com.npclibrary.models.locations.Location;

public class CharaDetails {
    private Character character;
    private Location currentLocation;
   // current location as opposed to the main location they're associated with
    private String tagline;
    // a character's tagline is meant to be a title or one line description
    private String gender;
    private String age;
    private String appearance;
    private String voice;
    // this is helpful if you like to roleplay as a dm with lots of silly voices
    private String wants;
    private String fears;
    private String bio;

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

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public String getWants() {
        return wants;
    }

    public void setWants(String wants) {
        this.wants = wants;
    }

    public String getFears() {
        return fears;
    }

    public void setFears(String fears) {
        this.fears = fears;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
