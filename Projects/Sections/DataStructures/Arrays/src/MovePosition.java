import java.util.Scanner;

public class MovePosition {
    public static void main(String[] args) {

        int[] a = new int[10]; // Declaración de un arreglo de enteros 'a' con 10 elementos
        int last; // Variable para almacenar el último elemento del arreglo
        Scanner s = new Scanner(System.in); // Creación de un objeto Scanner para la entrada de usuario

        // Lee 10 números ingresados por el usuario y los almacena en el arreglo 'a'
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter the num:");
            a[i] = s.nextInt();
        }
        s.close(); // Cierra el objeto Scanner para liberar recursos

        System.out.println();
        last = a[a.length - 1]; // Almacena el último elemento del arreglo en la variable 'last'

        // Mueve los elementos del arreglo hacia la derecha de manera circular
        for (int i = a.length - 2; i >= 0; i--) {
            a[i + 1] = a[i];
        }
        a[0] = last; // Coloca el elemento almacenado en 'last' en la primera posición del arreglo

        System.out.println("The arrangement:"); // Muestra un mensaje indicando que se mostrará el arreglo resultante
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]); // Imprime cada elemento del arreglo 'a'
        }
    }
}
