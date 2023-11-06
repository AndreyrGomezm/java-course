import java.util.Scanner;

public class OddEvenExample {

    public static void main(String[] args) {

        int[] a, even, odd; // Declaración de tres arreglos de enteros: 'a', 'even' (pares) y 'odd'
        // (impares)
        int totalEven = 0, totalOdd = 0; // Variables para contar el número de pares e impares
        a = new int[10]; // Declaración e inicialización de un arreglo de enteros 'a' con 10 elementos
        Scanner s = new Scanner(System.in); // Creación de un objeto Scanner para la entrada de usuario

        System.out.println("Enter 10 num:"); // Muestra un mensaje para que el usuario ingrese 10 números
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt(); // Lee y almacena los números ingresados por el usuario en el arreglo 'a'
        }
        s.close(); // Cierra el objeto Scanner para liberar recursos

        // Itera a través del arreglo 'a' para contar el número de pares e impares
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                totalEven++; // Incrementa el contador de pares
            } else {
                totalOdd++; // Incrementa el contador de impares
            }
        }

        even = new int[totalEven]; // Crea un arreglo 'even' para almacenar los números pares
        odd = new int[totalOdd]; // Crea un arreglo 'odd' para almacenar los números impares

        int j = 0;
        int k = 0;

        // Itera a través del arreglo 'a' para separar los números pares e impares en
        // arreglos diferentes
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                even[j++] = a[i]; // Almacena el número par en 'even' y aumenta el índice de 'even'
            } else {
                odd[k++] = a[i]; // Almacena el número impar en 'odd' y aumenta el índice de 'odd'
            }
        }

        // Imprime los números pares e impares
        System.out.println("Evens");
        for (int i = 0; i < even.length; i++) {
            System.out.print(even[i] + " ");
        }
        System.out.println("\r\nOdds");
        for (int i = 0; i < odd.length; i++) {
            System.out.print(odd[i] + " ");
        }
        System.out.println();
    }
}
