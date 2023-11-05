import java.util.Scanner;

public class FuelTank {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double currentCapacity;

        System.out.println("Enter the current fuel tank capacity (max 70 liters): ");
        currentCapacity = scanner.nextDouble();
        scanner.close();

        if (currentCapacity >= 0 && currentCapacity < 20) {
            System.out.println("Insufficient");
        } else if (currentCapacity >= 20 && currentCapacity < 35) {
            System.out.println("Sufficient");
        } else if (currentCapacity >= 35 && currentCapacity < 40) {
            System.out.println("Half Tank");
        } else if (currentCapacity >= 40 && currentCapacity < 60) {
            System.out.println("3/4 Full Tank");
        } else if (currentCapacity >= 60 && currentCapacity < 70) {
            System.out.println("Almost Full Tank");
        } else if (currentCapacity == 70) {
            System.out.println("Full Tank");
        }
    }
}
