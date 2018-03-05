package com.example.eslam.tourguideapp;

/**
 * Created by Eslam on 3/3/2018.
 */

public class Place {
    private static int NO_IMAGE_PROVIDED = -1;
    private String Name, Description;
    private int ImageID = NO_IMAGE_PROVIDED;

    public Place(String name, String description) {
        Name = name;
        Description = description;
    }

    public Place(String name, String description, int imageID) {
        Name = name;
        Description = description;
        ImageID = imageID;
    }

    public String getName() {
        return Name;
    }

    public String getDescription() {
        return Description;
    }

    public int getImageID() {
        return ImageID;
    }

    public boolean HasImage() {
        return ImageID != NO_IMAGE_PROVIDED;
    }
}