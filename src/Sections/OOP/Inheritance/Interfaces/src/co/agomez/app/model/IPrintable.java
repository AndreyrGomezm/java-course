package co.agomez.app.model;

public interface IPrintable {
    String DEFAULT_TEXT = "Printing a default value";

    default String print() {
        return DEFAULT_TEXT;
    };

    static void print(IPrintable printable) {
        System.out.println(printable.print());
    }
}