import java.util.Scanner;

public class SystemsScanner {
    public static void main(String[] args) {

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer");

        int decimalNumber = 0;
        try {
            // Intentar leer un número entero desde la entrada del usuario
            decimalNumber = scanner.nextInt();
            scanner.close(); // Cerrar el Scanner después de usarlo
        } catch (Exception e) {
            // Si ocurre una excepción, mostrar un mensaje de error y reiniciar el programa
            System.out.println("Error: You must enter an integer");
            main(args); // Llamar recursivamente al método main para volver a solicitar la entrada
            System.exit(0); // Salir del programa
        }

        // Mostrar el número entero ingresado por el usuario
        System.out.println("decimalNumber = " + decimalNumber);

        // Calcular y mostrar la representación binaria del número
        String binaryResult = "binary number of " + decimalNumber + " = " + Integer.toBinaryString(decimalNumber);

        // Calcular y mostrar la representación octal del número
        String octalResult = "octal number of " + decimalNumber + " = " + Integer.toOctalString(decimalNumber);

        // Calcular y mostrar la representación hexadecimal del número
        String hexResult = "hexadecimal number of " + decimalNumber + " = " + Integer.toHexString(decimalNumber);

        // Combinar todos los resultados en un mensaje
        String message = binaryResult;
        message += "\n" + octalResult;
        message += "\n" + hexResult;

        // Mostrar el mensaje en la consola
        System.out.println(message);
    }
}
