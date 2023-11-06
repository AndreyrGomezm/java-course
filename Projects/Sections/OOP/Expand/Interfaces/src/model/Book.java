package model;

import java.util.ArrayList;
import java.util.List;

public class Book implements IPrintable {
    private final List<IPrintable> pages;
    private final Person author;
    private final String title;
    private final Gender gender;

    public Book(Person author, String title, Gender gender) {
        this.author = author;
        this.title = title;
        this.gender = gender;
        pages = new ArrayList<>();
    }

    public Book addPage(IPrintable page) {
        pages.add(page);
        return this;
    }

    @Override
    public String print() {
        StringBuilder sb = new StringBuilder("Title: ");
        sb.append(title).append("\n")
                .append("Author: ").append(author).append("\n")
                .append("Gender: ").append(gender).append("\n");
        for (IPrintable pag : pages) {
            sb.append(pag.print()).append("\n");
        }
        return sb.toString();
    }
}
