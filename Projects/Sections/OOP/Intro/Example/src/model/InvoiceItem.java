package model;

public class InvoiceItem {
    private int amount;
    private Product product;
    public InvoiceItem(int amount, Product product) {
        this.amount = amount;
        this.product = product;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double calculateAmount() {
        return amount * product.getPrice();
    }

    @Override
    public String toString() {
        return product + "\t" + amount + "\t" + calculateAmount();
    }
}
