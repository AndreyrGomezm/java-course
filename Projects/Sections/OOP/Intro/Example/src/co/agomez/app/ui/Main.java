package co.agomez.app.ui;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.setRut("5555-5");
        customer.setName("Andrey");

        Scanner s = new Scanner(System.in);
        System.out.print("Enter invoice description: ");
        Invoice invoice = new Invoice(s.nextLine(), customer);

        Product product;

        System.out.println();

        for (int i = 0; i < 5; i++) {
            product = new Product();
            System.out.print("Enter product n° " + product.getId() + ": ");
            product.setName(s.nextLine());

            System.out.print("Enter the price: ");
            product.setPrice(s.nextDouble());

            System.out.print("Enter the amount: ");
            invoice.addInvoiceItem(new InvoiceItem(s.nextInt(), product));

            System.out.println();
            s.nextLine();
        }
        s.close();
        System.out.println(invoice);
    }
}
