import java.util.Scanner;

public class HistogramPrintingProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[12];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number from 1 to 6: ");
            array[i] = scanner.nextInt();
        }
        scanner.close();

        String[] histogramArray = new String[6];

        for (int i = 0; i < histogramArray.length; i++) {
            int currentNumber = i + 1;
            String histogram = currentNumber + ": ";
            for (int j = 0; j < array.length; j++) {
                if (currentNumber == array[j]) {
                    histogram += "*";
                }
            }
            histogramArray[i] = histogram;
        }

        for (int i = 0; i < histogramArray.length; i++) {
            System.out.println(histogramArray[i]);
        }
    }
}
