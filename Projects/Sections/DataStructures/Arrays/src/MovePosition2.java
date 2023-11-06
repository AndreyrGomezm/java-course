import java.util.Scanner;

public class MovePosition2 {
    public static void main(String[] args) {

        int[] a = new int[10]; // Declaración de un arreglo de enteros 'a' con 10 elementos
        int item, position; // Variables para almacenar el nuevo elemento y la posición en la que se
        // agregará
        Scanner s = new Scanner(System.in); // Creación de un objeto Scanner para la entrada de usuario

        // Lee 9 números ingresados por el usuario y los almacena en el arreglo 'a'
        // (dejando un espacio vacío)
        for (int i = 0; i < a.length - 1; i++) {
            System.out.print("Enter the num:");
            a[i] = s.nextInt();
        }
        System.out.println();

        System.out.println("New item"); // Muestra un mensaje para que el usuario ingrese el nuevo elemento
        item = s.nextInt(); // Lee el nuevo elemento ingresado por el usuario

        System.out.println("Position to add item (0-9)"); // Muestra un mensaje para que el usuario ingrese la posición
        // de inserción
        position = s.nextInt(); // Lee la posición de inserción ingresada por el usuario
        s.close(); // Cierra el objeto Scanner para liberar recursos

        // Mueve los elementos del arreglo hacia la derecha desde 'position' hasta el
        // final
        for (int i = a.length - 2; i >= position; i--) {
            a[i + 1] = a[i];
        }
        a[position] = item; // Agrega el nuevo elemento en la posición especificada

        System.out.println("The arrangement:"); // Muestra un mensaje indicando que se mostrará el arreglo resultante
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]); // Imprime cada elemento del arreglo 'a'
        }
    }
}
