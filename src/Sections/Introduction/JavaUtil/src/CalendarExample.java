import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarExample {
    public static void main(String[] args) {

        // Obtener una instancia de la clase 'Calendar' que representa la fecha y hora
        // actual
        Calendar calendar = Calendar.getInstance();

        // Establecer valores específicos de año, mes y día en el calendario
        calendar.set(Calendar.YEAR, 2020);
        calendar.set(Calendar.MONTH, Calendar.MARCH);
        calendar.set(Calendar.DAY_OF_MONTH, 25);

        // Establecer valores específicos de hora, minutos, segundos y milisegundos en
        // el calendario
        calendar.set(Calendar.HOUR, 7);
        calendar.set(Calendar.AM_PM, Calendar.PM); // Establecer PM (por la tarde)
        calendar.set(Calendar.MINUTE, 20);
        calendar.set(Calendar.SECOND, 10);
        calendar.set(Calendar.MILLISECOND, 125);

        // Obtener un objeto 'Date' a partir del calendario configurado
        Date date = calendar.getTime();
        System.out.println("Date without format = " + date);

        // Crear un objeto 'SimpleDateFormat' para formatear la fecha y hora
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS a");
        String formattedDate = format.format(date);
        System.out.println("Formatted date = " + formattedDate);

        // Obtener la fecha y hora actual
        Calendar currentCal = Calendar.getInstance();
        Date date2 = currentCal.getTime();

        // Comparar las dos fechas utilizando los métodos 'after', 'before' y 'equals'
        if (date.after(date2)) {
            System.out.println("date1 (from the user) is after date2 (current)");
        } else if (date.before(date2)) {
            System.out.println("date is before date2");
        } else if (date.equals(date2)) {
            System.out.println("date is equal to date2");
        }

        // Comparar las dos fechas utilizando el método 'compareTo'
        if (date.compareTo(date2) > 0) {
            System.out.println("date1 (from the user) is after date2 (current)");
        } else if (date.compareTo(date2) < 0) {
            System.out.println("date is before date2");
        } else if (date.compareTo(date2) == 0) {
            System.out.println("date is equal to date2");
        }
    }
}
