import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
    public static void main(String[] args) {

        // Crear una instancia de la clase 'Date' que representa la fecha y hora actual
        Date date = new Date();

        // Imprimir la fecha y hora actual en su formato predeterminado
        System.out.println("date = " + date);

        // Crear un objeto 'SimpleDateFormat' para formatear la fecha
        SimpleDateFormat df = new SimpleDateFormat("EEEE dd 'of' MMMM, yyyy");

        // Formatear la fecha en un formato personalizado y almacenarla en una cadena
        String dateStr = df.format(date);

        // Inicializar una variable 'j' a cero
        long j = 0;

        // Ejecutar un bucle 'for' que realiza cálculos y suma los valores a 'j'
        for (int i = 0; i < 10000000; i++) {
            j += i;
        }

        // Imprimir el valor de 'j' después del bucle
        System.out.println("j = " + j);

        // Crear una segunda instancia de 'Date' para medir el tiempo después del bucle
        Date date2 = new Date();

        // Calcular el tiempo transcurrido en milisegundos desde 'date' hasta 'date2'
        long finalTime = date2.getTime() - date.getTime();

        // Imprimir el tiempo transcurrido en el bucle
        System.out.println("Time spent in the for = " + finalTime);

        // Imprimir la fecha formateada
        System.out.println("dateStr = " + dateStr);
    }
}
