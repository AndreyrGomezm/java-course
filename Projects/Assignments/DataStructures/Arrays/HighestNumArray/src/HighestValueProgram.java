import java.util.Scanner;

public class HighestValueProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];

        for (int i = 0; i < 7; i++) {
            System.out.println("Enter a number between 11 and 99: ");
            array[i] = scanner.nextInt();
        }
        scanner.close();
        int max = 0;

        for (int i = 0; i < 7; i++) {
            max = (max > array[i]) ? max : array[i];
        }
        System.out.println("The highest value is: " + max);
    }
}
