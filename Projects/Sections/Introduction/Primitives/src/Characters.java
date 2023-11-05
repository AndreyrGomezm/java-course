public class Characters {
    public static void main(String[] args) {
        // Declaración de una variable 'character' con un valor Unicode ('\u0040'
        // representa '@')
        var character = '\u0040';

        // Declaración de una variable 'decimal' con un valor numérico (64)
        var decimal = 64;

        // Imprime el valor de 'character' en la consola
        System.out.println("character = " + character);

        // Imprime el valor de 'decimal' en la consola
        System.out.println("decimal = " + decimal);

        // Compara si 'character' y 'decimal' son iguales e imprime el resultado
        System.out.println("decimal = character: " + (decimal == character));

        // Declaración de una variable 'symbol' con el carácter '@'
        char symbol = '@';

        // Imprime el valor de 'symbol' en la consola
        System.out.println("symbol = " + symbol);

        // Compara si 'symbol' y 'character' son iguales e imprime el resultado
        System.out.println("decimal = character: " + (symbol == character));

        // Declaración de variables para representar caracteres especiales
        char space = '\u0020'; // Espacio en blanco
        char recoil = '\b'; // Retroceso (backspace)
        char tabulator = '\t'; // Tabulador (tab)
        char newLine = '\n'; // Nueva línea
        char carriageReturn = '\r'; // Retorno de carro (carriage return)

        // Imprime las variables que representan caracteres especiales
        System.out.println("space = " + space);
        System.out.println("recoil = " + recoil);
        System.out.println("tabulator = " + tabulator);
        System.out.println("newLine = " + newLine);
        System.out.println("carriageReturn = " + carriageReturn);

        // Imprime información sobre el tipo char
        System.out.println("Char type corresponds in byte: " + Character.BYTES); // Tamaño en bytes
        System.out.println("Char type corresponds in bits: " + Character.SIZE); // Tamaño en bits
        System.out.println("Maximum value of a char: " + Character.MAX_VALUE); // Valor máximo
        System.out.println("Minimum value of a char: " + Character.MIN_VALUE); // Valor mínimo
    }
}
