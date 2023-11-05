public class MathExample {
    public static void main(String[] args) {

        // Calcula el valor absoluto de un número
        int absolute = Math.abs(-3);
        System.out.println("absolute = " + absolute);

        // Calcula el valor absoluto de otro número
        absolute = Math.abs(3);
        System.out.println("absolute = " + absolute);

        // Encuentra el valor máximo entre dos números
        double max = Math.max(3.5, 1.2);
        System.out.println("max = " + max);

        // Encuentra el valor mínimo entre dos números
        double min = Math.min(3.5, 1.2);
        System.out.println("min = " + min);

        // Redondea hacia arriba un número decimal
        double roof = Math.ceil(3.5);
        System.out.println("roof = " + roof);

        // Redondea hacia abajo un número decimal
        double floor = Math.floor(3.5);
        System.out.println("floor = " + floor);

        // Redondea un número decimal al entero más cercano
        long integer = Math.round(Math.PI);
        System.out.println("integer = " + integer);

        // Calcula el valor de e elevado a la potencia de 1 (e^1)
        double exp = Math.exp(1);
        System.out.println("exp = " + exp);

        // Calcula el logaritmo natural de 10
        double log = Math.log(10);
        System.out.println("log = " + log);

        // Calcula 10 elevado a la potencia de 3 (10^3)
        double power = Math.pow(10, 3);
        System.out.println("power = " + power);

        // Calcula la raíz cuadrada de 5
        double root = Math.sqrt(5);
        System.out.println("root = " + root);

        // Convierte 1.57 radianes a grados y redondea
        double degrees = Math.toDegrees(1.57);
        degrees = Math.round(degrees);
        System.out.println("Convert radians to degrees = " + degrees);

        // Convierte 90.00 grados a radianes
        double radians = Math.toRadians(90.00);
        System.out.println("Convert degrees to radians = " + radians);

        // Calcula el seno de 90 grados (en radianes)
        System.out.println("sin(90): " + Math.sin(radians));

        // Calcula el coseno de 90 grados (en radianes)
        System.out.println("cos(90): " + Math.cos(radians));

        // Calcula el coseno de 180 grados (en radianes)
        radians = Math.toRadians(180);
        System.out.println("cos(180): " + Math.cos(radians));

        // Calcula el coseno de 0 grados (en radianes)
        radians = Math.toRadians(0.00);
        System.out.println("cos(0): " + Math.cos(radians));
    }
}
