package model;

import java.util.Date;

public class PurchaseOrder {

    private static int lastId;
    private final int identifier;
    private final String description;
    private Date date;
    private Customer customer;
    private final Product[] products;
    private int productIndex;

    public PurchaseOrder(String description) {
        this.description = description;
        this.identifier = ++lastId;
        this.products = new Product[4];
    }

    public int getIdentifier() {
        return identifier;
    }

    public String getDescription() {
        return description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product[] getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        if (productIndex < this.products.length) {
            this.products[productIndex++] = product;
        }
    }

    public int getTotalPrice() {
        int total = 0;
        for (Product p : products) {
            if (p != null) {
                total += p.getPrice();
            }
        }
        return total;
    }
}
