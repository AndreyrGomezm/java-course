public class Unary {
    public static void main(String[] args) {
        // Declaración e inicialización de la variable 'i' con un valor negativo.
        int i = -5;

        // Uso del operador de signo positivo ('+') para 'j'. j = (+1) * i => -5
        int j = +i;
        System.out.println("j = " + j); // Imprimir el valor de 'j'.

        // Uso del operador de negación ('-') para 'k'. k = (-1) * i => 5
        int k = -i;
        System.out.println("k = " + k); // Imprimir el valor de 'k'.

        // Asignar un nuevo valor positivo a 'i'.
        i = 6;

        // Volver a usar el operador de signo positivo ('+') para 'j'. j = (+1) * i => 6
        j = +i;
        System.out.println("j = " + j); // Imprimir el nuevo valor de 'j'.

        // Volver a usar el operador de negación ('-') para 'k'. k = (-1) * i => -6
        k = -i;
        System.out.println("k = " + k); // Imprimir el nuevo valor de 'k'.
    }
}
