package com.example.kruger.petagram.pojo;

/**
 * Created by Kruger on 27/12/2017.
 */

public class Pet {
    private int image;
    private String name;
    private int rating;

    public Pet(int image, String name, int rating) {
        this.image = image;
        this.name = name;
        this.rating = rating;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
