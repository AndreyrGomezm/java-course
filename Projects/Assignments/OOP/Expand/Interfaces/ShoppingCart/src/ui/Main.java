package ui;

import model.SupermarketBag;
import model.*;

public class Main {

    public static void main(String[] args) {

        SupermarketBag<Fruit> fruitBag = new SupermarketBag<>();
        SupermarketBag<Cleaning> cleaningBag = new SupermarketBag<>();
        SupermarketBag<Dairy> dairyBag = new SupermarketBag<>();
        SupermarketBag<NonPerishable> nonPerishableBag = new SupermarketBag<>();

        fruitBag.addProduct(new Fruit(1200.00, "red", "Fuji apple", 2500d))
                .addProduct(new Fruit(800.00, "red", "peaches", 1800d))
                .addProduct(new Fruit(1000.00, "green", "grapes", 3500d))
                .addProduct(new Fruit(1200.00, "yellow", "lemons", 1500d))
                .addProduct(new Fruit(1200.00, "watermelon", "watermelon", 4000d));

        cleaningBag.addProduct(new Cleaning("antibacterial", 0.75, "Cif", 1690))
                .addProduct(new Cleaning("dishwashing", 1.2, "Quix", 2290))
                .addProduct(new Cleaning("bleach", 0.95, "Cream Cleaner", 1390))
                .addProduct(new Cleaning("Lavender Gel", 0.45, "Lysoform", 1380))
                .addProduct(new Cleaning("Lavender Disinfectant", 0.9, "Lysol", 1330));

        dairyBag.addProduct(new Dairy(1000, 32, "Semi-Skimmed Chocolate Milk", 1150))
                .addProduct(new Dairy(200, 4, "Cream Milk box", 800))
                .addProduct(new Dairy(1000, 31, "Boxed Low-Fat Milk", 720))
                .addProduct(new Dairy(1000, 37, "Strawberry Flavored Yoghurt Pouch", 1190))
                .addProduct(new Dairy(250, 2, "Butter With Salt Soprole", 1750));

        nonPerishableBag.addProduct(new NonPerishable(170, 95, "Angelmo Tuna Loin in Water", 960))
                .addProduct(new NonPerishable(425, 560, "Natural Jurel Can", 1120))
                .addProduct(new NonPerishable(380, 234, "Ready-to-Serve Black Beans Box", 1030))
                .addProduct(new NonPerishable(1000, 3340, "Grade 1 Long Grain Wide Rice", 1320))
                .addProduct(new NonPerishable(1000, 3536, "Bean Hallado Bag", 1990));

        System.out.println("-------------------------------- Fruits ---------------------------------");
        for (Fruit fruit : fruitBag.getProducts()) {
            System.out.println("-------------------------------- " +  fruit.getName());
            System.out.println("Price: " + fruit.getPrice());
            System.out.println("Weight (g): " + fruit.getWeight());
            System.out.println("Color: " + fruit.getColor());
        }

        System.out.println("-------------------------------- Cleaning ---------------------------------");
        for (Cleaning product : cleaningBag.getProducts()) {
            System.out.println("-------------------------------- " +  product.getName());
            System.out.println("Price: " + product.getPrice());
            System.out.println("Components: " + product.getComponents());
            System.out.println("Liters: " + product.getLiters());
        }

        System.out.println("-------------------------------- Dairy ---------------------------------");
        for (Dairy product : dairyBag.getProducts()) {
            System.out.println("-------------------------------- " +  product.getName());
            System.out.println("Price: " + product.getPrice());
            System.out.println("Quantity (g/cc): " + product.getQuantity());
            System.out.println("Proteins (g): " + product.getProteins());
        }

        System.out.println("-------------------------------- Non-Perishable ---------------------------------");
        for (NonPerishable product : nonPerishableBag.getProducts()) {
            System.out.println("-------------------------------- " +  product.getName());
            System.out.println("Price: " + product.getPrice());
            System.out.println("Calories (kCal): " + product.getCalories());
            System.out.println("Net Content (g): " + product.getContent());
        }
    }
}
