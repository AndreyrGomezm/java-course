package co.agomez.model.app.domain;

public class Dairy extends Product {

    private int quantity;
    private int proteins;

    public Dairy(int quantity, int proteins, String name, double price) {
        super(name, price);
        this.quantity = quantity;
        this.proteins = proteins;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getProteins() {
        return proteins;
    }
}
