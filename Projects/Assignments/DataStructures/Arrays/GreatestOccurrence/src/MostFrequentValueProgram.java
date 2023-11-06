import java.util.Scanner;

public class MostFrequentValueProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter a number from 1 to 9: ");
            array[i] = scanner.nextInt();
        }
        scanner.close();

        int[] valueCountArray = new int[10];

        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            valueCountArray[i] = count;
        }

        int index = 0;
        int maxCount = 0;
        for (int i = 0; i < 10; i++) {
            if (maxCount < valueCountArray[i]) {
                maxCount = valueCountArray[i];
                index = i;
            }
        }
        System.out.println("The highest occurrence is: " + maxCount);
        System.out.println("The element that occurs most frequently is: " + array[index]);
        System.out.println("Element " + array[index] + " occurs " + maxCount + " times!");
    }
}
