public class Floats {
    public static void main(String[] args) {
        // Declaración de una variable 'realFloat' de tipo float con un valor
        // extremadamente grande
        float realFloat = 3.4028235E38F;

        // Imprime el valor de 'realFloat' en la consola
        System.out.println("realFloat = " + realFloat);

        // Imprime información sobre el tipo float, como el tamaño en bytes y bits,
        // valor máximo y mínimo
        System.out.println("Float type corresponds in byte: " + Float.BYTES); // Tamaño en bytes
        System.out.println("Float type corresponds in bits: " + Float.SIZE); // Tamaño en bits
        System.out.println("Maximum value of a float: " + Float.MAX_VALUE); // Valor máximo
        System.out.println("Minimum value of a float: " + Float.MIN_VALUE); // Valor mínimo

        // Declaración de una variable 'realDouble' de tipo double con un valor
        // extremadamente grande
        double realDouble = 1.7976931348623157E308;

        // Imprime el valor de 'realDouble' en la consola
        System.out.println("realDouble = " + realDouble);

        // Imprime información sobre el tipo double, como el tamaño en bytes y bits,
        // valor máximo y mínimo
        System.out.println("Double type corresponds in byte: " + Double.BYTES); // Tamaño en bytes
        System.out.println("Double type corresponds in bits: " + Double.SIZE); // Tamaño en bits
        System.out.println("Maximum value of a double: " + Double.MAX_VALUE); // Valor máximo
        System.out.println("Minimum value of a double: " + Double.MIN_VALUE); // Valor mínimo

        // Declaración de una variable 'varFloat' de tipo float con un valor decimal
        float varFloat = 3.1416f;

        // Imprime el valor de 'varFloat' en la consola
        System.out.println("varFloat = " + varFloat);
    }
}
