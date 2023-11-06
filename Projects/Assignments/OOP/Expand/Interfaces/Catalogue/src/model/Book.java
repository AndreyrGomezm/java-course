package model;

import java.util.Date;

public class Book extends Product implements IBook {
    private final Date publicationDate = new Date();
    private final String author;
    private final String title;
    private final String publisher;

    public Book(int price, String author, String title, String publisher) {
        super(price);
        this.author = author;
        this.title = title;
        this.publisher = publisher;
    }

    @Override
    public Date getPublicationDate() {
        return publicationDate;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getPublisher() {
        return publisher;
    }

    @Override
    public double getSellingPrice() {
        return getPrice() * 0.95;
    }
}