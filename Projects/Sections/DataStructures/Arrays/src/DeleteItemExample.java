import java.util.Scanner;

public class DeleteItemExample {
    public static void main(String[] args) {

        int[] a = new int[10]; // Declaración de un arreglo de enteros 'a' con 10 elementos

        Scanner s = new Scanner(System.in); // Creación de un objeto Scanner para la entrada de usuario

        // Lee 10 números ingresados por el usuario y los almacena en el arreglo 'a'
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter a num: ");
            a[i] = s.nextInt();
        }
        System.out.println();

        System.out.println("Enter a position to delete between 0 - 9:"); // Muestra un mensaje para que el usuario
        // ingrese la posición a eliminar
        int position = s.nextInt(); // Lee la posición a eliminar ingresada por el usuario
        s.close(); // Cierra el objeto Scanner para liberar recursos

        // Desplaza los elementos del arreglo hacia la izquierda desde 'position' hasta
        // el final
        for (int i = position; i < a.length - 1; i++) {
            a[i] = a[i + 1];
        }

        int[] b = new int[a.length - 1]; // Crea un nuevo arreglo 'b' con un elemento menos
        System.arraycopy(a, 0, b, 0, b.length); // Copia los elementos del arreglo 'a' al arreglo 'b'
        a = b; // Asigna el arreglo 'b' a 'a', reduciendo así el tamaño del arreglo

        System.out.println("Resulting arrangement:"); // Muestra un mensaje indicando que se mostrará el arreglo
        // resultante
        for (int i = 0; i < a.length; i++) {
            System.out.println(i + " => " + a[i]); // Imprime cada elemento del arreglo 'a'
        }
    }
}
