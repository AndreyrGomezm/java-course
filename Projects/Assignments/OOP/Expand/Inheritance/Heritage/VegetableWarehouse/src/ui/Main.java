package ui;

import model.*;

public class Main {

    public static void main(String[] args) {

        Product[] products = new Product[8];
        products[0] = new Fruit(1200.00, "red", "Fuji apple", 2500d);
        products[1] = new Fruit(1000.00, "green", "grapes", 3500d);
        products[2] = new CleaningProduct("dish soap", 1.2, "Quix", 2290);
        products[3] = new CleaningProduct("Lavender Disinfectant", 0.9, "Lysol", 1330);
        products[4] = new Dairy(1000, 32, "Semi-Skimmed Chocolate Milk", 1150);
        products[5] = new Dairy(1000, 37, "Strawberry Flavored Yogurt Pouch", 1190);
        products[6] = new NonPerishable(170, 95, "Angelmo Tuna Fillets in Water", 960);
        products[7] = new NonPerishable(1000, 3536, "Hallado Beans Bag", 1990);

        for (Product prod : products) {
            System.out.println("-------------------------------- " + prod.getClass().getSimpleName()
                    + "---------------------------------");
            System.out.println("Name: " + prod.getName());
            System.out.println("Price: " + prod.getPrice());

            if (prod instanceof Fruit) {
                System.out.println("Weight (g): " + ((Fruit) prod).getWeight());
                System.out.println("Color: " + ((Fruit) prod).getColor());
            } else if (prod instanceof CleaningProduct) {
                System.out.println("Components: " + ((CleaningProduct) prod).getComponents());
                System.out.println("Liters: " + ((CleaningProduct) prod).getLiters());
            } else if (prod instanceof Dairy) {
                System.out.println("Quantity (g/cc): " + ((Dairy) prod).getQuantity());
                System.out.println("Proteins (g): " + ((Dairy) prod).getProteins());
            } else if (prod instanceof NonPerishable) {
                System.out.println("Calories (kCal): " + ((NonPerishable) prod).getCalories());
                System.out.println("Net Content (g): " + ((NonPerishable) prod).getContent());
            }
        }
    }
}
