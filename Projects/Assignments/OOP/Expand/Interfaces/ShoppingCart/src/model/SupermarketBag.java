package model;

import java.util.*;

public class SupermarketBag<T> {

    private List<T> products;
    private int productIndex;
    private int max = 5;

    public SupermarketBag() {
        this.products = new ArrayList();
    }

    public List<T> getProducts() {
        return products;
    }

    public SupermarketBag addProduct(T p) {
        if (this.products.size() <= max) {
            this.products.add(p);
        } else {
            throw new RuntimeException("No more space available.");
        }
        return this;
    }
}
