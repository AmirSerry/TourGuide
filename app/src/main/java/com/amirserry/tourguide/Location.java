package com.amirserry.tourguide;

public class Location {

    private int locationName;

    private int locationDesc;

    private int imageResourceId;

    public Location(int locationName, int locationDesc, int imageResourceId) {
        this.locationName = locationName;
        this.locationDesc = locationDesc;
        this.imageResourceId = imageResourceId;
    }

    public int getLocationName() {
        return locationName;
    }

    public void setLocationName(int locationName) {
        this.locationName = locationName;
    }

    public int getLocationDesc() {
        return locationDesc;
    }

    public void setLocationDesc(int locationDesc) {
        this.locationDesc = locationDesc;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }
}
