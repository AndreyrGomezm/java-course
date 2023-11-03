import java.util.Scanner;

public class MovePosition3b {
    public static void main(String[] args) {

        int[] a = new int[7]; // Declaración de un arreglo de enteros 'a' con 7 elementos
        int number, position, last; // Variables para almacenar el número a insertar, la posición de inserción y el
                                    // último elemento

        Scanner s = new Scanner(System.in); // Creación de un objeto Scanner para la entrada de usuario

        // Lee 7 números ingresados por el usuario y los almacena en el arreglo 'a'
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter a number: ");
            a[i] = s.nextInt();
        }
        System.out.println();

        System.out.println("Enter a number to insert:"); // Muestra un mensaje para que el usuario ingrese el número a
                                                         // insertar
        number = s.nextInt(); // Lee el número a insertar ingresado por el usuario
        s.close(); // Cierra el objeto Scanner para liberar recursos

        last = a[a.length - 1]; // Almacena el último elemento del arreglo en la variable 'last'
        position = 0;

        // Encuentra la posición de inserción en la que el número es menor o igual al
        // elemento del arreglo
        while (position < 6 && number > a[position]) {
            position++;
        }

        // Desplaza los elementos del arreglo hacia la derecha desde 'position' hasta el
        // final
        for (int i = a.length - 2; i >= position; i--) {
            a[i + 1] = a[i];
        }

        int[] b = new int[a.length + 1]; // Crea un nuevo arreglo 'b' con un elemento adicional
        System.arraycopy(a, 0, b, 0, a.length); // Copia los elementos del arreglo 'a' al arreglo 'b'

        if (number > last) {
            b[b.length - 1] = number; // Si el número a insertar es mayor que el último elemento, se coloca al final
                                      // del arreglo 'b'
        } else {
            b[b.length - 1] = last; // Si no, se coloca el último elemento al final del arreglo 'b'
            b[position] = number; // Luego, se coloca el número en la posición de inserción
        }

        System.out.println("The new sorted array:"); // Muestra un mensaje indicando que se mostrará el arreglo
                                                     // resultante
        for (int i = 0; i < b.length; i++) {
            System.out.println(i + " => " + b[i]); // Imprime cada elemento del arreglo 'b'
        }
    }
}
