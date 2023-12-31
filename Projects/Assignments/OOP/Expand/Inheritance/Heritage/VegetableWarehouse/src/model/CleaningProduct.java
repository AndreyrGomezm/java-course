package model;

public class CleaningProduct extends Product {

    private final String components;
    private final double liters;

    public CleaningProduct(String components, double liters, String name, double price) {
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
