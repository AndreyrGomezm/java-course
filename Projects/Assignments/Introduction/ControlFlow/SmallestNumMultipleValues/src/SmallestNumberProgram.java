import java.util.Scanner;

public class SmallestNumberProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of integers to compare: ");
        int quantity = scanner.nextInt();

        if (quantity < 10) {
            System.out.println("Error: You must compare at least 10 integers!");
        } else {
            int smallest = Integer.MAX_VALUE;
            int num;

            for (int i = 0; i < quantity; i++) {
                System.out.println("Enter number " + (i + 1) + ": ");
                num = scanner.nextInt();
                smallest = (num < smallest) ? num : smallest;
            }
            scanner.close();
            System.out.println("The smallest number is: " + smallest);

            if (smallest < 10) {
                System.out.println("The number " + smallest + " is less than 10!");
            } else {
                System.out.println("The number " + smallest + " is equal to or greater than 10!");
            }
        }
    }
}
