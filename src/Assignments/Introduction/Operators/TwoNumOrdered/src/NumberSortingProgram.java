import java.util.Scanner;

public class NumberSortingProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number 1.");
        int num1 = scanner.nextInt();

        System.out.println("Enter number 2");
        int num2 = scanner.nextInt();
        scanner.close();

        String result = (num1 > num2) ? num1 + " and " + num2 : num2 + " and " + num1;
        System.out.println("The order is " + result);
    }
}