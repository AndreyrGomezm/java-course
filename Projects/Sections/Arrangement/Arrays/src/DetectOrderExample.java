import java.util.Scanner;

public class DetectOrderExample {
    public static void main(String[] args) {

        int[] a = new int[7]; // Declaración de un arreglo de enteros 'a' con 7 elementos

        Scanner s = new Scanner(System.in); // Creación de un objeto Scanner para la entrada de usuario
        System.out.println("Enter 7 num:"); // Muestra un mensaje para que el usuario ingrese 7 números

        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt(); // Lee y almacena los números ingresados por el usuario en el arreglo 'a'
        }
        s.close(); // Cierra el objeto Scanner para liberar recursos

        boolean upward = false; // Variable booleana que indica si la secuencia es ascendente
        boolean falling = false; // Variable booleana que indica si la secuencia es descendente

        // Itera a través del arreglo 'a' para detectar el tipo de orden
        for (int i = 0; i < a.length - 1; i++) {

            if (a[i] > a[i + 1]) {
                falling = true; // La secuencia es descendente si encuentra un número mayor que el siguiente
            }
            if (a[i] < a[i + 1]) {
                upward = true; // La secuencia es ascendente si encuentra un número menor que el siguiente
            }
        }

        // Determina el tipo de orden y muestra un mensaje correspondiente
        if (upward && falling) {
            System.out.println("Arrangement = Messy"); // La secuencia es desordenada
        } else if (!upward && !falling) {
            System.out.println("Arrangement = Everyone is equal"); // Todos los números son iguales
        } else if (upward && !falling) {
            System.out.println("Arrangement = Sorted ascending"); // La secuencia es ascendente
        } else if (!upward && falling) {
            System.out.println("Arrangement = Sorted descending"); // La secuencia es descendente
        }
    }
}
