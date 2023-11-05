import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateParseExample {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // Crear un formato para analizar fechas en el formato "yyyy-MM-dd"
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("Enter a date in 'yyyy-MM-dd' format");

        try {
            // Leer la fecha ingresada por el usuario como una cadena
            String userInput = s.next();

            // Intentar analizar la cadena en un objeto 'Date' usando el formato
            Date date = format.parse(userInput);

            // Cerrar el objeto Scanner
            s.close();

            // Imprimir la fecha analizada
            System.out.println("date = " + date);

            // Obtener la fecha y hora actual
            Date date2 = new Date();
            System.out.println("date2 = " + date2);

            // Comparar las dos fechas utilizando los métodos 'after', 'before' y 'equals'
            if (date.after(date2)) {
                System.out.println("date (user's) is after date2 (current)");
            } else if (date.before(date2)) {
                System.out.println("date is before date2");
            } else if (date.equals(date2)) {
                System.out.println("date equals date2");
            }

            // Comparar las dos fechas utilizando el método 'compareTo'
            if (date.compareTo(date2) > 0) {
                System.out.println("date (user's) is after date2 (current)");
            } else if (date.compareTo(date2) < 0) {
                System.out.println("date is before date2");
            } else if (date.compareTo(date2) == 0) {
                System.out.println("date equals date2");
            }

        } catch (ParseException e) {
            // Si ocurre un error al analizar la fecha, muestra un mensaje de error
            System.err.println("Date is in incorrect format: " + e.getMessage());
            System.err.println("The format must be 'yyyy-MM-dd'");
            // Reinicia la ejecución principal para solicitar nuevamente la entrada del
            // usuario
            main(args);
        }
    }
}
