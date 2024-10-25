package org.example;

public class Plane {
    private String id;
    private String model;
    private int yearOfIntroduction;

    public Plane() {
        this.id = "";
        this.model = "";
        this.yearOfIntroduction = 0;
    }

    public Plane(String id, String model, int yearOfIntroduction) {
        this.id = id;
        this.model = model;
        this.yearOfIntroduction = yearOfIntroduction;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfIntroduction() {
        return yearOfIntroduction;
    }

    public void setYearOfIntroduction(int yearOfIntroduction) {
        this.yearOfIntroduction = yearOfIntroduction;
    }

    public void displayPlaneInfo() {
        System.out.println("Plane ID: " + id);
        System.out.println("Model: " + model);
        System.out.println("Year of Introduction: " + yearOfIntroduction);
    }
}
