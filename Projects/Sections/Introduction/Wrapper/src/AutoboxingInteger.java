public class AutoboxingInteger {
    public static void main(String[] args) {

        // Creación de un arreglo de objetos Integer utilizando diferentes formas
        // de autoboxing
        Integer[] integers = { Integer.valueOf(1), 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };

        // Inicialización de la suma
        int sum = 0;

        // Iteración a través del arreglo de objetos Integer
        for (Integer i : integers) {
            // Obtener el valor primitivo int de Integer usando intValue()
            int valorPrimitivo = i.intValue();

            // Comprobar si el valor primitivo es par
            if (valorPrimitivo % 2 == 0) {
                // Sumar el valor par a la suma total
                sum += valorPrimitivo;
            }
        }

        // Imprimir la suma de los números pares
        System.out.println("sum = " + sum);

        // Reinicializar la suma
        sum = 0;

        // Iterar nuevamente a través del arreglo de objetos Integer
        for (Integer i : integers) {
            // Como el autoboxing y unboxing son manejados automáticamente por Java,
            // no es necesario usar intValue() para obtener el valor primitivo.
            // Java automáticamente realiza la conversión de Integer a int cuando es
            // necesario.
            if (i % 2 == 0) {
                // Sumar el valor par a la suma total
                sum += i;
            }
        }

        // Imprimir la suma de los números pares usando autoboxing
        System.out.println("sum = " + sum);
    }
}
