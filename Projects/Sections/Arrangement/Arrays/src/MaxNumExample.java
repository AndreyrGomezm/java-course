import java.util.Scanner;

public class MaxNumExample {
    public static void main(String[] args) {

        int[] a = new int[5]; // Declaración de un arreglo de enteros 'a' con 5 elementos
        Scanner s = new Scanner(System.in); // Creación de un objeto Scanner para la entrada de usuario

        System.out.println("Enter 5 integers"); // Muestra un mensaje para que el usuario ingrese 5 enteros
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt(); // Lee y almacena los enteros ingresados por el usuario en el arreglo 'a'
        }
        s.close(); // Cierra el objeto Scanner para liberar recursos

        int max = 0; // Inicializa una variable 'max' para almacenar el índice del número máximo en
                     // el arreglo

        // Itera a través del arreglo 'a' para encontrar el número máximo
        for (int i = 1; i < a.length; i++) {
            max = (a[max] > a[i]) ? max : i; // Compara el número en 'max' con el número en la posición 'i' y actualiza
                                             // 'max' si es necesario
        }

        // Imprime el número máximo encontrado en el arreglo 'a'
        System.out.println("max = " + a[max]);
    }
}
