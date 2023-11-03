public class Incremental {
    public static void main(String[] args) {
        // Pre-increment: Incrementa 'i' antes de asignar su valor a 'j'.
        int i = 1;
        int j = ++i; // i = i + 1

        System.out.println("i = " + i); // Imprimir el nuevo valor de 'i'.
        System.out.println("j = " + j); // Imprimir el valor de 'j'.

        // Post-increment: Asigna el valor actual de 'i' a 'j' y luego incrementa 'i'.
        i = 2;
        System.out.println("initial of i = " + i);
        j = i++; // j = i, i = i + 1
        System.out.println("i = " + i); // Imprimir el nuevo valor de 'i'.
        System.out.println("j = " + j); // Imprimir el valor anterior de 'i' (antes del incremento).

        // Pre-decrement: Decrementa 'i' antes de asignar su valor a 'j'.
        i = 3;
        j = --i; // i = i - 1
        System.out.println("i = " + i); // Imprimir el nuevo valor de 'i'.
        System.out.println("j = " + j); // Imprimir el valor de 'j'.

        // Post-decrement: Asigna el valor actual de 'i' a 'j' y luego decrementa 'i'.
        i = 4;
        System.out.println("initial of i = " + i);
        j = i--; // j = i, i = i - 1
        System.out.println("i = " + i); // Imprimir el nuevo valor de 'i'.
        System.out.println("j = " + j); // Imprimir el valor anterior de 'i' (antes del decremento).

        // Ejemplos adicionales de pre-increment, post-increment y post-increment con
        // impresión inmediata.
        System.out.println("j = " + (++j)); // Pre-increment y luego imprimir 'j'.
        System.out.println("j = " + (j++)); // Imprimir 'j' y luego post-increment.
        System.out.println("j = " + j); // Imprimir el nuevo valor de 'j'.
    }
}
