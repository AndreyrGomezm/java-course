package model;

public class Comic extends Book {

    private final String character;

    public Comic(int price, String author, String title, String publisher, String character) {
        super(price, author, title, publisher);
        this.character = character;
    }

    public String getCharacter() {
        return character;
    }

    @Override
    public double getSellingPrice() {
        return this.getPrice() * 0.85;
    }
}