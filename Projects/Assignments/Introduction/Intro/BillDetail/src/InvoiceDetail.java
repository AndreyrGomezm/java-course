import java.util.Scanner;

public class InvoiceDetail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an invoice name:");
        String name = scanner.nextLine();

        System.out.println("Enter a product price:");
        double price1 = scanner.nextDouble();

        System.out.println("Enter a second product price:");
        double price2 = scanner.nextDouble();
        scanner.close();

        double grossTotal = price1 + price2;
        double tax = grossTotal * 0.19;
        double netTotal = grossTotal + tax;

        String detail = "The invoice " + name + " has a gross total of " + grossTotal + ", with a tax of " + tax
                + " and the amount after tax is " + netTotal;

        System.out.println(detail);
    }
}