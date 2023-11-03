import java.util.Scanner;

public class NumSearchExample {
    public static void main(String[] args) {

        int[] a = new int[10]; // Declaración de un arreglo de enteros 'a' con 10 elementos

        Scanner s = new Scanner(System.in); // Creación de un objeto Scanner para la entrada de usuario

        // Lee 10 números ingresados por el usuario y los almacena en el arreglo 'a'
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter a number: ");
            a[i] = s.nextInt();
        }
        System.out.println("\r\nEnter a number to search:"); // Muestra un mensaje para que el usuario ingrese el número
                                                             // a buscar
        int num = s.nextInt(); // Lee el número a buscar ingresado por el usuario
        s.close(); // Cierra el objeto Scanner para liberar recursos

        int i = 0;

        // Busca el número en el arreglo 'a' comparando cada elemento con 'num'
        for (; i < a.length && a[i] != num; i++) {
        }

        // Comprueba si el número se encontró o no en el arreglo y muestra un mensaje
        // correspondiente
        if (i == a.length) {
            System.out.println("Number not found"); // El número no se encontró en el arreglo
        } else if (a[i] == num) {
            System.out.println("Found in position: " + i); // El número se encontró en la posición 'i' del arreglo
        }
    }
}
