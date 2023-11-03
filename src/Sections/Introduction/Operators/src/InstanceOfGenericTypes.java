public class InstanceOfGenericTypes {
    public static void main(String[] args) {

        // Definir un objeto 'text' de tipo Object que contiene una cadena de texto.
        Object text = "Creating an object of class String ... how about it!";

        // Definir un objeto 'num' de tipo Number que se inicializa con un valor entero.
        Number num = Integer.valueOf(7); // 7;

        // Verificar si 'text' es una instancia de la clase String.
        Boolean b1 = text instanceof String;
        System.out.println("text is of type String = " + b1);

        // Verificar si 'text' es una instancia de la clase Object.
        b1 = text instanceof Object;
        System.out.println("text is of type Object = " + b1);

        // Verificar si 'text' es una instancia de la clase Integer (lo cual es falso).
        b1 = text instanceof Integer;
        System.out.println("text is of type Integer = " + b1);

        // Verificar si 'num' es una instancia de la clase Integer (lo cual es
        // verdadero).
        b1 = num instanceof Integer;
        System.out.println("num is of type Integer = " + b1);

        // Verificar si 'num' es una instancia de la clase Number.
        b1 = num instanceof Number;
        System.out.println("num is of type Number = " + b1);

        // Verificar si 'num' es una instancia de la clase Object.
        b1 = num instanceof Object;
        System.out.println("num is of type Object = " + b1);

        // Verificar si 'num' es una instancia de la clase Long (lo cual es falso).
        b1 = num instanceof Long;
        System.out.println("num is of type Long = " + b1);

        // Verificar si 'num' es una instancia de la clase Double (lo cual es falso).
        b1 = num instanceof Double;
        System.out.println("num is of type Double = " + b1);

        // Definir un objeto 'decimal' de tipo Number que se inicializa con un valor
        // decimal.
        Number decimal = Float.valueOf(45.54f);

        // Verificar si 'decimal' es una instancia de la clase Double (lo cual es
        // falso).
        b1 = decimal instanceof Double;
        System.out.println("decimal is of type Double = " + b1);

        // Verificar si 'decimal' es una instancia de la clase Float (lo cual es
        // verdadero).
        b1 = decimal instanceof Float;
        System.out.println("decimal is of type Float = " + b1);

        // Verificar si 'decimal' es una instancia de la clase Integer (lo cual es
        // falso).
        b1 = decimal instanceof Integer;
        System.out.println("decimal is of type Integer = " + b1);

        // Verificar si 'decimal' es una instancia de la clase Number.
        b1 = decimal instanceof Number;
        System.out.println("decimal is of type Number = " + b1);

        // Verificar si 'b1' es una instancia de la clase Boolean.
        b1 = b1 instanceof Boolean;
        System.out.println("b1 is of type Boolean = " + b1);
    }
}
