import java.util.Scanner;

public class ArraySortingProgram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int i;
        int[] array;
        array = new int[10];
        for (i = 0; i < 10; i++) {
            System.out.println("Enter a number: ");
            array[i] = scanner.nextInt();
        }
        scanner.close();

        System.out.println("The result is:");
        for (i = 0; i <= 4; i++) {
            System.out.println(array[9 - i]);
            System.out.println(array[i]);
        }
    }
}
