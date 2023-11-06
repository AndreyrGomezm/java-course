import javax.swing.*;

public class Systems {
    public static void main(String[] args) {

        // Solicitar al usuario que ingrese un número entero
        String strNumber = JOptionPane.showInputDialog(null, "Please enter an integer");

        int decimalNumber = 0;
        try {
            // Intentar convertir la entrada de usuario en un número entero
            decimalNumber = Integer.parseInt(strNumber);
        } catch (NumberFormatException e) {
            // Si ocurre una excepción, mostrar un mensaje de error y salir del programa
            JOptionPane.showMessageDialog(null, "Error: You must enter an integer");
            main(args); // Llamar recursivamente al método main para volver a solicitar la entrada
            System.exit(0); // Salir del programa
        }

        // Mostrar el número entero ingresado por el usuario
        System.out.println("decimalNumber = " + decimalNumber);

        // Calcular y mostrar la representación binaria del número
        String binaryResult = "binary number of " + decimalNumber + " = " + Integer.toBinaryString(decimalNumber);
        System.out.println(binaryResult);

        // Ejemplo de número binario directo (0b indica que es un número binario)
        int binaryNumber = 0b111110100;
        System.out.println("binaryNumber = " + binaryNumber);

        // Calcular y mostrar la representación octal del número
        String octalResult = "octal number of " + decimalNumber + " = " + Integer.toOctalString(decimalNumber);
        System.out.println(octalResult);

        // Ejemplo de número octal directo (0 indica que es un número octal)
        int octalNumber = 0764;
        System.out.println("octalNumber = " + octalNumber);

        // Calcular y mostrar la representación hexadecimal del número
        String hexResult = "hexadecimal number of " + decimalNumber + " = " + Integer.toHexString(decimalNumber);
        System.out.println(hexResult);

        // Ejemplo de número hexadecimal directo (0x indica que es un número
        // hexadecimal)
        int hexNumber = 0x1f4;
        System.out.println("hexNumber = " + hexNumber);

        // Combinar todos los resultados en un mensaje
        String message = binaryResult;
        message += "\n" + octalResult;
        message += "\n" + hexResult;

        // Mostrar el mensaje en una ventana de diálogo
        JOptionPane.showMessageDialog(null, message);
    }
}
