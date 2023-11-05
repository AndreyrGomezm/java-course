package co.agomez.app.ui;

import co.agomez.app.model.*;

import static co.agomez.app.model.Gender.*;
import static co.agomez.app.model.IPrintable.*;

public class Main {
    public static void main(String[] args) {
        Curriculum cv = new Curriculum(new Person("John", "Doe"),
                "Systems Engineer", "Labor summary...");
        cv.addExperience("Java")
                .addExperience("Oracle DBA")
                .addExperience("Spring Framework")
                .addExperience("Fullstack developer")
                .addExperience("Angular");

        Book book = new Book(new Person("Erich", "Gamma"),
                "Design patterns: Elem. Reusable OOP", PROGRAMMING);
        book.addPage(new Page("Singleton Pattern"))
                .addPage(new Page("Observer Pattern"))
                .addPage(new Page("Factory Pattern"))
                .addPage(new Page("Composite"))
                .addPage(new Page("Facade"));

        Report report = new Report(new Person("Martin", "Fowler"),
                new Person("James", "Gosling"), "Study on microservices");

        print(cv);
        print(report);
        print(book);

        print(new IPrintable() {
            @Override
            public String print() {
                return "Hi, how are you, printing a generic object from an anonymous class!";
            }
        });

        System.out.println(DEFAULT_TEXT);
    }
}