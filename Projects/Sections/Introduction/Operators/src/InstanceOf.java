public class InstanceOf {
    public static void main(String[] args) {

        // Definir una cadena de texto.
        String text = "Creating an object of class String ... how about it!";

        // Definir un número entero.
        Integer num = 7;

        // Verificar si 'text' es una instancia de la clase String.
        Boolean b1 = text instanceof String;
        System.out.println("text is of type String = " + b1);

        // Verificar si 'text' es una instancia de la clase Object (superclase de
        // String).
        b1 = text instanceof Object;
        System.out.println("text is of type Object = " + b1);

        // Verificar si 'num' es una instancia de la clase Integer.
        b1 = num instanceof Integer;
        System.out.println("num is of type Integer = " + b1);

        // Verificar si 'num' es una instancia de la clase Number (superclase de
        // Integer).
        b1 = num instanceof Number;
        System.out.println("num is of type Number = " + b1);

        // Verificar si 'num' es una instancia de la clase Object (superclase de
        // Number).
        b1 = num instanceof Object;
        System.out.println("num is of type Object = " + b1);

        // Definir un número decimal (punto flotante).
        Double decimal = 45.54;

        // Verificar si 'decimal' es una instancia de la clase Number.
        b1 = decimal instanceof Number;
        System.out.println("decimal is of type Number = " + b1);

        // Verificar si 'b1' es una instancia de la clase Boolean.
        b1 = b1 instanceof Boolean;
        System.out.println("b1 is of type Boolean = " + b1);
    }
}
