package com.example.eslam.tourguideapp;

/**
 * Created by Eslam on 3/3/2018.
 */

public class Details {
    private static int NO_IMAGE_PROVIDED = -1;
    String Name, Description;
    int ImageID = NO_IMAGE_PROVIDED;

    public Details(String name, String description) {
        Name = name;
        Description = description;
    }

    public Details(String name, String description, int imageID) {
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