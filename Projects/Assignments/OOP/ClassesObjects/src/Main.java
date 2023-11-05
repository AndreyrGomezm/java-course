import java.util.Date;

public class Main {
    public static void main(String[] args) {

        PurchaseOrder order1 = new PurchaseOrder("Computer Components Purchase");
        order1.setCustomer(new Customer("Andres", "Guzman"));
        order1.setDate(new Date());

        order1.addProduct(new Product("Western Digital", "480GB SSD Drive", 54890));
        order1.addProduct(new Product("MSI", "Optix G271 Monitor", 363940));
        order1.addProduct(new Product("AMD", "AMD Ryzen 9 5900X Processor", 599990));
        order1.addProduct(new Product("EVGA", "EVGA RTX 3080Ti Graphics Card", 1849990));

        PurchaseOrder order2 = new PurchaseOrder("Appliances Purchase");
        order2.setCustomer(new Customer("John", "Doe"));
        order2.setDate(new Date());
        order2.addProduct(new Product("Fensa", "Stove", 239990));
        order2.addProduct(new Product("Samsung", "Refrigerator", 429990));
        order2.addProduct(new Product("Midea", "Washing Machine", 149990));
        order2.addProduct(new Product("IRobot", "Vacuum Cleaner", 199990));

        PurchaseOrder order3 = new PurchaseOrder("Construction Materials Purchase");
        order3.setCustomer(new Customer("Pepa", "Roe"));
        order3.setDate(new Date());
        order3.addProduct(new Product("Melon", "25kg Cement Bag", 4870));
        order3.addProduct(new Product("Grau", "Concrete", 6040));
        order3.addProduct(new Product("Ceramicas Santiago", "Brick", 790));
        order3.addProduct(new Product("Redline", "Aluminum Articulated Ladder", 48990));

        PurchaseOrder[] orders = { order1, order2, order3 };

        for (PurchaseOrder order : orders) {
            System.out.println("Order Number: " + order.getIdentifier());
            System.out.println("Customer: " + order.getCustomer());
            System.out.println("Description: " + order.getDescription());
            System.out.println("Date: " + order.getDate());
            System.out.println("Total: $" + order.getTotalPrice());

            int i = 1;
            for (Product p : order.getProducts()) {
                System.out.println("Product " + i + ": " + p.getName() + " by " + p.getManufacturer() + " Price: $"
                        + p.getPrice());
                i++;
            }
            System.out.println("---------------------------------- Next --------------------------------------");
        }
    }
}
