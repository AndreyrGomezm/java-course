package co.agomez.app;

import co.agomez.app.client.*;

public class Main {
    public static void main(String[] args) {
        IProduct[] products = new Product[6];
        products[0] = new IPhone(299000, "Apple", "3G", "Black");
        products[1] = new IPhone(399000, "Apple", "4G", "White");
        products[2] = new LCDTV(340000, "Sony", 40);
        products[3] = new Book(18000, "Eric Gamma", "Reusable OOP Elements", "Some...");
        products[4] = new Book(14000, "Martin Fowler", "UML Drop by Drop", "Some...");
        products[5] = new Comic(5000, "Pepo", "Condorito", "Some...", "Condorito");

        for (IProduct product : products) {
            System.out.print("Type: " + product.getClass().getName());
            System.out.print(" - ");
            System.out.print("Price: " + product.getPrice());
            System.out.print(" - ");
            System.out.print("Final Price: " + product.getSellingPrice());
            // For Electronics ============
            if (product instanceof IElectronic) {
                System.out.print(" - ");
                System.out.print("Manufacturer: " + ((IElectronic) product).getManufacturer());
                // For iPhones ============
                if (product instanceof IPhone) {
                    System.out.print(" - ");
                    System.out.print("Model: " + ((IPhone) product).getModel());
                    System.out.print(" - ");
                    System.out.print("Color: " + ((IPhone) product).getColor());
                }
                // For LCD TVs ============
                if (product instanceof LCDTV) {
                    System.out.print(" - ");
                    System.out.print("Inches: " + ((LCDTV) product).getInches());
                }
            }
            // For Books ============
            if (product instanceof IBook) {
                System.out.print(" - ");
                System.out.print("Title: " + ((IBook) product).getTitle());
                System.out.print(" - ");
                System.out.print("Author: " + ((IBook) product).getAuthor());
                // For Comics ============
                if (product instanceof Comic) {
                    System.out.print(" - ");
                    System.out.print("Character: " + ((Comic) product).getCharacter());
                }
            }
            System.out.println();
        }
    }
}
