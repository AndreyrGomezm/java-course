public class Provenance {
    public static void main(String[] args) {

        int i = 14;
        int j = 8;
        int k = 20;

        // Calcular el promedio de i, j y k y asignarlo a la variable 'average'.
        double average = (i + j + k) / 3d;
        System.out.println("average = " + average);

        // Multiplicar el promedio por 10 y actualizar la variable 'average'.
        average = (i + j + k) / 3d * 10;
        System.out.println("average = " + average);

        // Realizar una serie de operaciones con i, j y k, teniendo en cuenta la
        // precedencia de operadores.
        average = --i + j++ + k / 3d * 10;

        /*
         * El orden de las operaciones en la línea anterior es el siguiente:
         * 1. Decrementar 'i' en 1 (pre-decremento): i pasa de 13 a 12.
         * 2. Sumar 'j' al resultado (post-incremento): j pasa de 8 a 9, y se suma a 12.
         * 3. Calcular 'k / 3d * 10': k/3d da como resultado 20.0, que se multiplica por
         * 10, resultando en 200.0.
         * 4. Sumar 200.0 al resultado anterior: 12 + 9 + 200.0 = 221.0
         * El resultado final se almacena en 'average'.
         */

        System.out.println("average = " + average); // Imprimir el valor de 'average'.
        System.out.println("i = " + i); // Imprimir el valor actualizado de 'i'.
        System.out.println("j = " + j); // Imprimir el valor actualizado de 'j'.
    }
}
