package co.agomez.app.model;

public class Product {
    private int id;
    private String name;
    private double price;
    private static int lastId;

    public Product() {
        id = ++lastId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return id + "\t" + name + "\t" + price;
    }
}
