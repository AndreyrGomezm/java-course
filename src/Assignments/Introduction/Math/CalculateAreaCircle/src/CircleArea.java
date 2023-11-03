import java.util.Scanner;

public class CircleArea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double area;

        double radius;
        System.out.println("Enter the radius of a circle: ");
        radius = scanner.nextDouble();
        area = Math.PI * Math.pow(radius, 2);
        scanner.close();

        System.out.println("The area of a circle with a radius of " + radius + " is: " + area);
    }
}
