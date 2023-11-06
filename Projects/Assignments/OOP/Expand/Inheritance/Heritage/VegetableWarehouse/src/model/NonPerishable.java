package model;

public class NonPerishable extends Product {

    private final int content;
    private final int calories;

    public NonPerishable(int content, int calories, String name, double price) {
        super(name, price);
        this.content = content;
        this.calories = calories;
    }

    public int getContent() {
        return content;
    }

    public int getCalories() {
        return calories;
    }
}
