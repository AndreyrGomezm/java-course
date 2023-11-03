import java.util.Scanner;

public class AverageStudentGrades {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grade;
        int countGrades1 = 0;
        int countGradesAbove5 = 0;
        int countGradesBelow4 = 0;
        double sumGradesAbove5 = 0;
        double sumGradesBelow4 = 0;
        double totalSum = 0;

        double averageGradesAbove5, averageGradesBelow4;

        boolean error = false;

        for (int i = 0; i < 20; i++) {
            System.out.println("Enter a grade (between 1 and 7) for student " + (i + 1) + ": ");
            grade = scanner.nextDouble();

            if (grade == 0) {
                error = true;
                break;
            }

            if (grade == 1) {
                countGrades1++;
            } else {
                if (grade > 5) {
                    countGradesAbove5++;
                    sumGradesAbove5 += grade;
                } else if (grade < 4) {
                    countGradesBelow4++;
                    sumGradesBelow4 += grade;
                }
            }
            totalSum += grade;
        }
        scanner.close();

        if (error) {
            System.err.println("Error: Grades cannot be 0. Program execution has terminated.");
            System.exit(1);
        }

        System.out.println("The number of grade 1s is: " + countGrades1);

        if (countGradesAbove5 == 0) {
            System.out.println("Cannot calculate the average of grades above 5.");
        } else {
            averageGradesAbove5 = sumGradesAbove5 / countGradesAbove5;
            System.out.println("Average of grades above 5: " + averageGradesAbove5);
        }

        if (countGradesBelow4 == 0) {
            System.out.println("Cannot calculate the average of grades below 4.");
        } else {
            averageGradesBelow4 = sumGradesBelow4 / countGradesBelow4;
            System.out.println("Average of grades below 4: " + averageGradesBelow4);
        }

        double totalAverageGrades = totalSum / 20;
        System.out.println("Total average of all grades: " + totalAverageGrades);
    }
}
