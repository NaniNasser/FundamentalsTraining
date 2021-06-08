package Entities.plant_entities;

public class Plant {
    private String name;
    private double height;

    public  Plant(String name) {

    }

    public Plant(String name, double height) {
        this.name = name;
        this.height = height;
    }

   

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}


