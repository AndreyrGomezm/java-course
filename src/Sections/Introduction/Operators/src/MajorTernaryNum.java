import java.util.Scanner;

public class MajorTernaryNum {
    public static void main(String[] args) {

        int max; // Variable para almacenar el número más grande.

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1 = s.nextInt();

        System.out.println("Enter a second number");
        int num2 = s.nextInt();

        System.out.println("Enter a third number");
        int num3 = s.nextInt();

        System.out.println("Enter a fourth number");
        int num4 = s.nextInt();
        s.close(); // Cerrar el objeto Scanner para liberar recursos.

        // Utilizar el operador ternario para encontrar el número más grande.
        max = (num1 > num2) ? num1 : num2; // Compara num1 y num2, asigna el mayor a 'max'.
        max = (max > num3) ? max : num3; // Compara 'max' y num3, asigna el mayor a 'max'.
        max = (max > num4) ? max : num4; // Compara 'max' y num4, asigna el mayor a 'max'.

        // Mostrar los números ingresados y el número más grande.
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("The largest number is = " + max);
    }
}
