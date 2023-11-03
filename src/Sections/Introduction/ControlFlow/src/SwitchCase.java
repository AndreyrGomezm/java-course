import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        // Crear un objeto Scanner para leer la entrada del usuario.
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the month num between 1 - 12");
        int month = s.nextInt();
        s.close();

        String monthName = null; // Declarar una variable para almacenar el nombre del mes.

        // Utilizar la estructura de control switch para determinar el nombre del mes
        // basado en el número ingresado.
        switch (month) {
            case 1 -> monthName = "January";

            default ->
                monthName = "Undefined"; // Si el número no corresponde a ningún mes, se establece como "Indefinido".
        }

        // Imprimir el nombre del mes.
        System.out.println("monthName: " + monthName);

        char num = 'z';

        // Utilizar switch para determinar un mensaje basado en el carácter ingresado.
        switch (num) {
            case '0':
                System.out.println("The num is zero");
                break;
            case '1':
                System.out.println("The num is one");
                break;
            case '2':
                System.out.println("The num is two");
                break;
            case '3':
                System.out.println("The num is three");
                break;
            case 'a':
                System.out.println("The character is a");
                break;
            default:
                System.out.println("Unknown number or character");
        }

        String name = "juan";

        // Utilizar switch para saludar a un usuario basado en su nombre.
        switch (name) {
            case "admin":
                System.out.println("Hello admin, welcome!");
                break;
            case "andrey":
                System.out.println("Hi andrey!");
                break;
            default:
                System.out.println("Unknown user");
                break;
        }
    }
}
