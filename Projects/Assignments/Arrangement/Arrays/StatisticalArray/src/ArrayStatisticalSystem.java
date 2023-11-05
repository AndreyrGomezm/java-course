import java.util.Scanner;

public class ArrayStatisticalSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positiveSum, positiveCount, negativeSum, negativeCount, zeroCount, i, array[];

        array = new int[7];
        positiveSum = 0;
        positiveCount = 0;
        negativeSum = 0;
        negativeCount = 0;
        zeroCount = 0;

        for (i = 0; i < 7; i++) {
            System.out.println("Enter a number: ");
            array[i] = scanner.nextInt();
        }
        scanner.close();

        for (i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                zeroCount++;
            } else {
                if (array[i] > 0) {
                    positiveSum = positiveSum + array[i];
                    positiveCount++;
                } else {
                    negativeSum = negativeSum + array[i];
                    negativeCount++;
                }
            }
        }

        if (positiveCount == 0) {
            System.out.println("Unable to calculate the average of positive numbers");
        } else {
            System.out.println("The average of positive numbers: " + (float) positiveSum / positiveCount);
        }

        if (negativeCount == 0) {
            System.out.println("Unable to calculate the average of negative numbers");
        } else {
            System.out.println("The average of negative numbers: " + (float) negativeSum / negativeCount);
        }

        System.out.println("The count of zeros is: " + zeroCount);
    }
}
