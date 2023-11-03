package co.agomez.inheritance.app.domain;

public class CleaningProduct extends Product {

    private String components;
    private double liters;

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
