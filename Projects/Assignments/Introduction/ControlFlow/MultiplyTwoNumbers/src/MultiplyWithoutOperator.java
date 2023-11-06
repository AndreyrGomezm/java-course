import java.util.Scanner;

public class MultiplyWithoutOperator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number a: ");
        int a = scanner.nextInt();

        System.out.println("Enter the number b: ");
        int b = scanner.nextInt();
        scanner.close();
        int result = 0;

        boolean positiveB = b > -1;
        boolean positiveA = a > -1;

        int absoluteA = positiveA ? a : -a;

        for (int i = 0; i < absoluteA; i++) {
            result = result + b;
        }

        if (!positiveA) {
            result = -result;
        }

        System.out.println("The result is " + result);
    }
}
