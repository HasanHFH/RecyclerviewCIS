package com.example.unrwa.recyclerviewcis;

public class ModelFood {

    private int image;
    private String name,place,pric;

    public ModelFood(int image, String name, String place, String pric) {
        this.image = image;
        this.name = name;
        this.place = place;
        this.pric = pric;
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

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getPric() {
        return pric;
    }

    public void setPric(String pric) {
        this.pric = pric;
    }
}
