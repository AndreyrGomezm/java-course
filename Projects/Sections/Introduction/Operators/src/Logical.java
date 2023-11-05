public class Logical {
    public static void main(String[] args) {

        int i = 3;
        byte j = 3;
        float k = 127e-7f;
        double l = 2.1413e3;
        boolean m = false;

        // Uso del operador lógico AND (&&) para combinar múltiples condiciones.
        // b1 será verdadero (true) si todas las condiciones son verdaderas.
        boolean b1 = i == j && k < l && m == false;
        System.out.println("b1 = " + b1); // Imprimir el resultado de la combinación.

        // Uso del operador lógico OR (||) para combinar múltiples condiciones.
        // b2 será verdadero (true) si al menos una de las condiciones es verdadera.
        boolean b2 = i == j || k < l;
        System.out.println("b2 = " + b2); // Imprimir el resultado de la combinación.

        // Uso de paréntesis para agrupar condiciones y controlar la lógica de
        // evaluación.
        // b3 será verdadero (true) si la primera condición es verdadera o si ambas
        // condiciones dentro de los paréntesis son verdaderas.
        boolean b3 = i == j && (k > l || m == true);
        System.out.println("b3 = " + b3); // Imprimir el resultado de la combinación.

        // Uso de paréntesis para cambiar la prioridad de evaluación.
        // b4 será verdadero (true) si la primera condición dentro de los paréntesis es
        // verdadera y m es verdadero.
        boolean b4 = (i == j || k < l) && m == true;
        System.out.println("b4 = " + b4); // Imprimir el resultado de la combinación.

        // Ejemplo de evaluación de expresiones lógicas.
        boolean b5 = (true || true) && false; // false
        System.out.println("b5 = " + b5);

        boolean b6 = true || false && false || false; // true
        System.out.println("b6 = " + b6);

        boolean b7 = ((true || false) && false) || false; // true
        System.out.println("b7 = " + b7);
    }
}
