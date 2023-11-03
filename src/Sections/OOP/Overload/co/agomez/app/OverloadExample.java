package co.agomez.app;

import static co.agomez.app.Calculator.*;

public class OverloadExample {
    public static void main(String[] args) {

        System.out.println("Add int: " + add(10, 5));
        System.out.println("Add float: " + add(10f, 5f));
        System.out.println("Add float-int: " + add(10f, 5));
        System.out.println("Add int-float: " + add(10, 5f));
        System.out.println("Add double: " + add(10.0, 5.0));
        System.out.println("Add String: " + add("10", "5"));
        System.out.println("Add three int: " + add(10, 5, 3));
        System.out.println("Add four int: " + add(10, 5, 3, 4));
        System.out.println("Add six int: " + add(10, 5, 3, 4, 6, 7));
        System.out.println("Add float + n int: " + add(10.5f, 5, 9, 15));
        System.out.println("Add four double: " + add(10., 5.0, 3.5, 4.5));

        System.out.println("Add long: " + add(10l, 5l));
        System.out.println("Add int: " + add(10, '@'));
        System.out.println("Add float-int: " + add(10f, '@'));
    }
}
