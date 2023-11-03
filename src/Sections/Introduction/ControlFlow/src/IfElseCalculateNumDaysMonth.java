import java.util.Scanner;

public class IfElseCalculateNumDaysMonth {
    public static void main(String[] args) {

        // Crear un objeto Scanner para leer la entrada del usuario.
        Scanner s = new Scanner(System.in);

        // Solicitar al usuario que ingrese el número de mes (1 - 12).
        System.out.println("Enter the month number from 1 - 12");
        int month = s.nextInt();

        // Solicitar al usuario que ingrese el año (YYYY).
        System.out.println("Enter the year (YYYY)");
        int year = s.nextInt();

        // Cerrar el objeto Scanner para liberar recursos.
        s.close();

        // Inicializar la variable "numDays" que almacenará el número de días en el mes.
        int numDays = 0;

        // Utilizar una estructura "if-else" para determinar el número de días en el
        // mes.
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            numDays = 31; // Si el mes es uno de los meses con 31 días, asignar 31 días a "numDays".
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            numDays = 30; // Si el mes es uno de los meses con 30 días, asignar 30 días a "numDays".
        } else if (month == 2) {
            // Si el mes es febrero, verificar si es un año bisiesto o no.
            if (year % 400 == 0 || ((year % 4 == 0) && !(year % 100 == 0))) {
                numDays = 29; // Si es bisiesto, asignar 29 días a "numDays".
            } else {
                numDays = 28; // Si no es bisiesto, asignar 28 días a "numDays".
            }
        }

        // Imprimir el número de días en el mes.
        System.out.println("numDays " + numDays);
    }
}
