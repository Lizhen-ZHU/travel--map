package com.example.andriod.googlemap;

public class MovieInfo {
    private String name;
    private String location;
    private int photoID;
    private String introduction;

    public MovieInfo(String name, String location, int photoID, String introduction){
        this.introduction = introduction;
        this.location = location;
        this.photoID = photoID;
        this.name = name;
    }

    public MovieInfo(String name, String location, int photoID){
        this.location = location;
        this.photoID = photoID;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setPhotoID(int photoID) {
        this.photoID = photoID;
    }

    public String getName() {
        return name;
    }

    public int getPhotoID() {
        return photoID;
    }

    public String getIntroduction() {
        return introduction;
    }

    public String getLocation() {
        return location;
    }
}
