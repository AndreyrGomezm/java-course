import java.util.Scanner;

public class StringSearchExample {
    public static void main(String[] args) {

        String[] a = new String[4]; // Declaración de un arreglo de cadenas 'a' con 4 elementos

        Scanner s = new Scanner(System.in); // Creación de un objeto Scanner para la entrada de usuario

        // Lee 4 cadenas ingresadas por el usuario y las almacena en el arreglo 'a'
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter a string: ");
            a[i] = s.next();
        }
        System.out.println("\r\nEnter a string to search:"); // Muestra un mensaje para que el usuario ingrese la cadena
                                                             // a buscar
        String name = s.next(); // Lee la cadena a buscar ingresada por el usuario
        s.close(); // Cierra el objeto Scanner para liberar recursos

        int i = 0;

        // Busca la cadena en el arreglo 'a' comparando cada elemento con 'name'
        // (ignorando mayúsculas/minúsculas)
        for (; i < a.length && !a[i].equalsIgnoreCase(name); i++) {
        }

        // Comprueba si la cadena se encontró o no en el arreglo y muestra un mensaje
        // correspondiente
        if (i == a.length) {
            System.out.println("String not found"); // La cadena no se encontró en el arreglo
        } else if (a[i].toLowerCase().compareTo(name.toLowerCase()) == 0) {
            System.out.println("Found in position: " + i); // La cadena se encontró en la posición 'i' del arreglo
        }
    }
}
