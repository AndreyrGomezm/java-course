package co.agomez.app.client;

public abstract class Product implements IProduct {
    private int price;

    public Product(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
