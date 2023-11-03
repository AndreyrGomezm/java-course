import java.util.Scanner;

public class MovePosition3 {
    public static void main(String[] args) {

        int[] a = new int[7]; // Declaración de un arreglo de enteros 'a' con 7 elementos
        int num, position; // Variables para almacenar el nuevo número y la posición de inserción
        Scanner s = new Scanner(System.in); // Creación de un objeto Scanner para la entrada de usuario

        // Lee 6 números ingresados por el usuario y los almacena en el arreglo 'a'
        // (dejando un espacio vacío)
        for (int i = 0; i < a.length - 1; i++) {
            System.out.print("Enter a num: ");
            a[i] = s.nextInt();
        }
        System.out.println();

        System.out.println("Enter a num: "); // Muestra un mensaje para que el usuario ingrese el nuevo número
        num = s.nextInt(); // Lee el nuevo número ingresado por el usuario
        s.close(); // Cierra el objeto Scanner para liberar recursos

        position = 0;

        // Encuentra la posición de inserción adecuada para el nuevo número en el
        // arreglo ordenado
        while (position < 6 && num > a[position]) {
            position++;
        }

        // Mueve los elementos del arreglo hacia la derecha desde 'position' hasta el
        // final
        for (int i = a.length - 2; i >= position; i--) {
            a[i + 1] = a[i];
        }
        a[position] = num; // Coloca el nuevo número en la posición especificada

        System.out.println("Resulting arrangement:"); // Muestra un mensaje indicando que se mostrará el arreglo
                                                      // resultante
        for (int i = 0; i < a.length; i++) {
            System.out.println(i + " => " + a[i]); // Imprime cada elemento del arreglo 'a' con su posición
        }
    }
}
