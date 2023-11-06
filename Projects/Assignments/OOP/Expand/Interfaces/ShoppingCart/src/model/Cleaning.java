package model;

public class Cleaning extends Product {

    private String components;
    private double liters;

    public Cleaning(String components, double liters, String name, double price) {
        super(name, price);
        this.components = components;
        this.liters = liters;
    }

    public String getComponents() {
        return components;
    }

    public double getLiters() {
        return liters;
    }
}
