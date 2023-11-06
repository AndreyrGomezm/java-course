package model;

public abstract class Product implements IProduct {
    private final int price;

    public Product(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
