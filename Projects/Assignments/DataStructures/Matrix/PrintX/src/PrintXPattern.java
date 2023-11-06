import java.util.Scanner;

public class PrintXPattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the matrix (n x n): ");
        int n = scanner.nextInt();
        scanner.close();
        if (n == 0) {
            System.out.println("ERROR");
            System.exit(1);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i == j || (j == n - i - 1)) {
                    System.out.print("X");
                } else {
                    System.out.print("_");
                }
            }
            System.out.println();
        }
    }
}
