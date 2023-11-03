public class Boolean {
    public static void main(String[] args) {

        // Declarar y asignar un valor booleano
        boolean logicalData = true;

        // Imprimir el valor de la variable booleana
        System.out.println("logicalData = " + logicalData);

        // Declarar y asignar valores decimales (double y float)
        double d = 98765.43e-3; // 98.76543

        // Imprimir el valor de 'd'
        System.out.println("d = " + d);

        float f = 1.2345e2f; // 123.45

        // Imprimir el valor de 'f'
        System.out.println("f = " + f);

        // Realizar una operación lógica (comparación) y almacenar el resultado en una
        // variable booleana
        logicalData = d < f;

        int a = 3;
        int b = 2;
        int c = 1;

        // Realizar una comparación y almacenar el resultado en una variable booleana
        boolean isEqual = (a - b == c);

        // Imprimir el valor de 'isEqual' (dependiendo de los valores de 'a', 'b', y
        // 'c')
        System.out.println("isEqual = " + isEqual);
    }
}
