public class CombinedExamples {

    public static void main(String[] args) {

        int[] a, b, c; // Declaración de tres arreglos de enteros: 'a', 'b' y 'c'
        a = new int[12]; // Inicialización de 'a' con 12 elementos
        b = new int[12]; // Inicialización de 'b' con 12 elementos
        c = new int[24]; // Inicialización de 'c' con 24 elementos para almacenar la combinación

        // Llena el arreglo 'a' con valores del 1 al 12
        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
        }

        // Llena el arreglo 'b' con valores del 5 al 60 (múltiplos de 5)
        for (int i = 0; i < b.length; i++) {
            b[i] = (i + 1) * 5;
        }

        int aux = 0; // Variable auxiliar para rastrear la posición en el arreglo 'c'

        // Combina elementos de 'a' y 'b' en 'c' en grupos de 3
        for (int i = 0; i < b.length; i += 3) {
            for (int j = 0; j < 3; j++) {
                c[aux++] = a[i + j]; // Agrega 3 elementos de 'a' en 'c'
            }
            for (int j = 0; j < 3; j++) {
                c[aux++] = b[i + j]; // Agrega 3 elementos de 'b' en 'c'
            }
        }

        // Imprime los elementos del arreglo 'c'
        for (int i = 0; i < c.length; i++) {
            System.out.println(i + ": " + c[i]);
        }
    }
}
