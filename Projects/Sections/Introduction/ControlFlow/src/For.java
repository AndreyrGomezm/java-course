public class For {
    public static void main(String[] args) {

        // Bucle for que cuenta del 0 al 10.
        for (int i = 0; i <= 10; i++) {
            System.out.println("i = " + i);
        }

        // Bucle for que cuenta del 10 al 0 en orden descendente.
        for (int i = 10; i >= 0; i--) {
            System.out.println("i = " + i);
        }

        // Bucle for que utiliza dos variables (i y j) para contar en direcciones
        // opuestas.
        for (int i = 1, j = 10; i < j; i++, j--) {
            System.out.println(i + " - " + j);
        }

        // Bucle for que cuenta del 0 al 10, pero utiliza la declaración 'continue' para
        // omitir números impares.
        for (int i = 0; i <= 10; i++) {
            if (!(i % 2 == 0)) {
                continue; // Salta a la siguiente iteración si i es impar.
            }
            System.out.println("i = " + i);
        }
    }
}
