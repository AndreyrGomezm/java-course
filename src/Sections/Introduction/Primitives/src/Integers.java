public class Integers {
    public static void main(String[] args) {
        // Declaración de una variable 'numberByte' de tipo byte con el valor máximo
        byte numberByte = 127;

        // Imprime el valor de 'numberByte' en la consola
        System.out.println("numberByte" + numberByte);

        // Imprime información sobre el tipo byte, como el tamaño en bytes y bits, valor
        // máximo y mínimo
        System.out.println("Byte type corresponds in byte: " + Byte.BYTES); // Tamaño en bytes
        System.out.println("Byte type corresponds in bits: " + Byte.SIZE); // Tamaño en bits
        System.out.println("Maximum value of a byte: " + Byte.MAX_VALUE); // Valor máximo
        System.out.println("Minimum value of a byte: " + Byte.MIN_VALUE); // Valor mínimo

        // Declaración de una variable 'numberShort' de tipo short con el valor máximo
        short numberShort = 32767;

        // Imprime el valor de 'numberShort' en la consola
        System.out.println("numberShort " + numberShort);

        // Imprime información sobre el tipo short, como el tamaño en bytes y bits,
        // valor máximo y mínimo
        System.out.println("Short type corresponds in byte: " + Short.BYTES); // Tamaño en bytes
        System.out.println("Short type corresponds in bits: " + Short.SIZE); // Tamaño en bits
        System.out.println("Maximum value of a short: " + Short.MAX_VALUE); // Valor máximo
        System.out.println("Minimum value of a short: " + Short.MIN_VALUE); // Valor mínimo

        // Declaración de una variable 'numberInt' de tipo int con el valor máximo
        int numberInt = 2147483647;

        // Imprime el valor de 'numberInt' en la consola
        System.out.println("numberInt " + numberInt);

        // Imprime información sobre el tipo int, como el tamaño en bytes y bits, valor
        // máximo y mínimo
        System.out.println("Int type corresponds in byte: " + Integer.BYTES); // Tamaño en bytes
        System.out.println("Int type corresponds in bits: " + Integer.SIZE); // Tamaño en bits
        System.out.println("Maximum value of a int: " + Integer.MAX_VALUE); // Valor máximo
        System.out.println("Minimum value of a int: " + Integer.MIN_VALUE); // Valor mínimo

        // Declaración de una variable 'numberLong' de tipo long con el valor máximo
        long numberLong = 9223372036854775807L;

        // Imprime el valor de 'numberLong' en la consola
        System.out.println("numberLong " + numberLong);

        // Imprime información sobre el tipo long, como el tamaño en bytes y bits, valor
        // máximo y mínimo
        System.out.println("Long type corresponds in byte: " + Long.BYTES); // Tamaño en bytes
        System.out.println("Long type corresponds in bits: " + Long.SIZE); // Tamaño en bits
        System.out.println("Maximum value of a long: " + Long.MAX_VALUE); // Valor máximo
        System.out.println("Minimum value of a long: " + Long.MIN_VALUE); // Valor mínimo

        // Declaración de una variable 'numberVar' de tipo float con un valor
        // extremadamente grande
        var numberVar = 9223372036854775808F;

        // Imprime el valor de 'numberVar' en la consola
        System.out.println("numberVar " + numberVar);
    }
}
