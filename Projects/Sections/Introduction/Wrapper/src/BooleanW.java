public class BooleanW {
    public static void main(String[] args) {

        // Declaración e inicialización de dos objetos Integer
        Integer num1, num2;
        num1 = 1;
        num2 = 2;

        // Comparación de valores primitivos y asignación del resultado a primBoolean
        boolean primBoolean = num1 > num2; // false

        // Creación de objetos Boolean a partir de valores primitivos y literales
        Boolean objBoolean = Boolean.valueOf(primBoolean);
        Boolean objBoolean2 = Boolean.valueOf("false"); // false
        Boolean objBoolean3 = true; // true (autoboxing)

        // Imprimir los valores de los objetos Boolean
        System.out.println("primBoolean = " + primBoolean);
        System.out.println("objBoolean = " + objBoolean);
        System.out.println("objBoolean2 = " + objBoolean2);

        // Comparación de objetos Boolean (referencia)
        System.out.println("Comparando dos objetos booleanos: " + (objBoolean == objBoolean2)); // true
        System.out.println("Comparando dos objetos booleanos: " + (objBoolean.equals(objBoolean2))); // true
        System.out.println("Comparando dos objetos booleanos: " + (objBoolean2 == objBoolean3)); // true
        System.out.println("Comparando dos objetos booleanos: " + (objBoolean == objBoolean2)); // true

        // Conversión de un objeto Boolean a valor primitivo
        boolean primBoolean2 = objBoolean2.booleanValue();
        System.out.println("primBoolean2 = " + primBoolean2);
    }
}
