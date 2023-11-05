public class RelationalOperators {
    public static void main(String[] args) {

        // Creación de dos objetos Integer y asignación de num1 a num2
        Integer num1 = Integer.valueOf(1000);
        Integer num2 = num1;

        // Imprimir los valores de num1 y num2
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // Comprobar si num1 y num2 son la misma instancia (referencia)
        System.out.println("¿Son el mismo número? " + (num1 == num2));

        // Asignar un nuevo valor a num2 (creando un nuevo objeto Integer)
        num2 = 1000;

        // Imprimir los valores actualizados de num1 y num2
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // Comprobar si num1 y num2 son la misma instancia (referencia) después de la
        // asignación
        System.out.println("¿Son el mismo número? " + (num1 == num2));

        // Comprobar si num1 y num2 tienen el mismo valor (contenido)
        System.out.println("¿Tienen el mismo valor? " + (num1.equals(num2)));

        // Comprobar si num1 es mayor que num2 (comparación de valores primitivos)
        System.out.println("¿num1 es mayor que num2? " + (num1.intValue() > num2.intValue()));

        // Cambiar el valor de num2
        num2 = 500;

        // Realizar una comparación usando operadores relacionales
        boolean condition = num1 > num2;
        System.out.println("condición = " + condition);

        // Realizar una comparación de valores primitivos
        boolean condition2 = num1.intValue() < num2.intValue();
        System.out.println("condición2 = " + condition2);
    }
}
