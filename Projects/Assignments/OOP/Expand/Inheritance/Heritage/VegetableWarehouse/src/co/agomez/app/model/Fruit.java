package co.agomez.model.app.domain;

public class Fruit extends Product {

    private double weight;
    private String color;

    public Fruit(double weight, String color, String name, double price) {
        super(name, price);
        this.weight = weight;
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }
}
