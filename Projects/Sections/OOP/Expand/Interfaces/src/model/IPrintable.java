package model;

public interface IPrintable {
    String DEFAULT_TEXT = "Printing a default value";

    static void print(IPrintable printable) {
        System.out.println(printable.print());
    }

    default String print() {
        return DEFAULT_TEXT;
    }
}