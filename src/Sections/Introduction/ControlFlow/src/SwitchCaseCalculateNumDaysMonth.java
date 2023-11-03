import java.util.Scanner;

public class SwitchCaseCalculateNumDaysMonth {
    public static void main(String[] args) {

        // Crear un objeto Scanner para leer la entrada del usuario.
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the month number from 1 - 12");
        int month = s.nextInt();

        int numDays = 0; // Declarar una variable para almacenar el número de días en el mes.
        System.out.println("Enter the year (YYYY)");
        int year = s.nextInt();
        s.close(); // Cerrar el objeto Scanner para liberar recursos.

        // Utilizar la estructura de control switch con múltiples casos para determinar
        // el número de días en el mes.
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                numDays = 31; // Meses con 31 días.
                break;
            case 4, 6, 9, 11:
                numDays = 30; // Meses con 30 días.
                break;
            case 2:
                if (year % 400 == 0 || ((year % 4 == 0) && !(year % 100 == 0))) {
                    numDays = 29; // Febrero en un año bisiesto.
                } else {
                    numDays = 28; // Febrero en un año no bisiesto.
                }
                break;
            default:
                numDays = 0; // Valor predeterminado si se ingresa un número de mes no válido.
        }

        // Imprimir el número de días en el mes.
        System.out.println("numDays " + numDays);
    }
}
