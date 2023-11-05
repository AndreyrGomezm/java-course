import java.util.Scanner;

public class MovePosition2b {
    public static void main(String[] args) {

        int[] a = new int[10]; // Declaración de un arreglo de enteros 'a' con 10 elementos
        int item, position, last; // Variables para almacenar el nuevo elemento, la posición de inserción y el
                                  // último elemento
        Scanner s = new Scanner(System.in); // Creación de un objeto Scanner para la entrada de usuario

        // Lee 10 números ingresados por el usuario y los almacena en el arreglo 'a'
        for (int i = 0; i < a.length; i++) {
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

        last = a[a.length - 1]; // Almacena el último elemento del arreglo en la variable 'last'

        // Mueve los elementos del arreglo hacia la derecha desde 'position' hasta el
        // final
        for (int i = a.length - 2; i >= position; i--) {
            a[i + 1] = a[i];
        }

        int[] b = new int[a.length + 1]; // Crea un nuevo arreglo 'b' con un elemento adicional
        System.arraycopy(a, 0, b, 0, a.length); // Copia los elementos del arreglo 'a' al arreglo 'b'
        a = b; // Asigna el arreglo 'b' a 'a', ampliando así el arreglo

        a[position] = item; // Coloca el nuevo elemento en la posición especificada
        a[a.length - 1] = last; // Coloca el último elemento en la última posición del arreglo

        System.out.println("The arrangement:"); // Muestra un mensaje indicando que se mostrará el arreglo resultante
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]); // Imprime cada elemento del arreglo 'a'
        }
    }
}
