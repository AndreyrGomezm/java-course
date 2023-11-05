public class Relational {
    public static void main(String[] args) {

        // Declaración e inicialización de varias variables de diferentes tipos.
        int i = 3;
        byte j = 7;
        float k = 127e-7F;
        double l = 2.1413e3;
        boolean m = false;

        // Uso del operador de igualdad (==) para comparar 'i' y 'j'.
        boolean b1 = i == j;
        System.out.println("b1 = " + b1); // Imprimir el resultado de la comparación.

        // Uso del operador de negación (!) para negar el valor de 'b1'.
        boolean b2 = !b1;
        System.out.println("b2 = " + b2); // Imprimir el resultado de la negación.

        // Uso del operador de desigualdad (!=) para comparar 'i' y 'j'.
        boolean b3 = i != j;
        System.out.println("b3 = " + b3); // Imprimir el resultado de la comparación.

        // Uso del operador de igualdad (==) para comparar 'm' y 'true'.
        boolean b4 = m == true;
        System.out.println("b4 = " + b4); // Imprimir el resultado de la comparación.

        // Uso del operador de desigualdad (!=) para comparar 'm' y 'true'.
        boolean b5 = m != true;
        System.out.println("b5 = " + b5); // Imprimir el resultado de la comparación.

        // Uso del operador de mayor que (>) para comparar 'i' y 'j'.
        boolean b6 = i > j;
        System.out.println("b6 = " + b6); // Imprimir el resultado de la comparación.

        // Uso del operador de menor que (<) para comparar 'i' y 'j'.
        boolean b7 = i < j;
        System.out.println("b7 = " + b7); // Imprimir el resultado de la comparación.

        // Uso del operador de mayor o igual que (>=) para comparar 'l' y 'k'.
        boolean b8 = (l >= k);
        System.out.println("b8 = " + b8); // Imprimir el resultado de la comparación.

        // Uso del operador de menor o igual que (<=) para comparar 'l' y 'k'.
        boolean b9 = l <= k;
        System.out.println("b9 = " + b9); // Imprimir el resultado de la comparación.
    }
}
