package ui;

import model.Calculator;

public class Main {
    public static void main(String[] args) {

        System.out.println("Add int: " + Calculator.add(10, 5));
        System.out.println("Add float: " + Calculator.add(10f, 5f));
        System.out.println("Add float-int: " + Calculator.add(10f, 5));
        System.out.println("Add int-float: " + Calculator.add(10, 5f));
        System.out.println("Add double: " + Calculator.add(10.0, 5.0));
        System.out.println("Add String: " + Calculator.add("10", "5"));
        System.out.println("Add three int: " + Calculator.add(10, 5, 3));
        System.out.println("Add four int: " + Calculator.add(10, 5, 3, 4));
        System.out.println("Add six int: " + Calculator.add(10, 5, 3, 4, 6, 7));
        System.out.println("Add float + n int: " + Calculator.add(10.5f, 5, 9, 15));
        System.out.println("Add four double: " + Calculator.add(10., 5.0, 3.5, 4.5));

        System.out.println("Add long: " + Calculator.add(10L, 5L));
        System.out.println("Add int: " + Calculator.add(10, '@'));
        System.out.println("Add float-int: " + Calculator.add(10f, '@'));
    }
}
