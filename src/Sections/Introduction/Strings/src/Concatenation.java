public class Concatenation {
    public static void main(String[] args) {
        // Declaración de dos cadenas: 'course' y 'teacher'
        String course = "Java Programming";
        String teacher = "Andres Guzman";

        // Concatenación de las cadenas 'course' y 'teacher' junto con una frase y
        // asignación a 'detail'
        java.lang.String detail = course + " with the instructor " + teacher;

        // Imprime la variable 'detail' que contiene la concatenación
        System.out.println(detail);

        // Declaración de dos números enteros: 'numberA' y 'numberB'
        int numberA = 10;
        int numberB = 5;

        // Concatenación de 'detail' con la suma de 'numberA' y 'numberB'
        System.out.println(detail + (numberA + numberB));

        // Realiza la suma de 'numberA' y 'numberB' y luego concatena el resultado con
        // 'detail'
        System.out.println(numberA + numberB + detail);

        // Concatenación de 'course' y 'teacher' utilizando el método 'concat' y
        // asignación a 'detail2'
        String detail2 = course.concat(" with ").concat(teacher);

        // Imprime la variable 'detail2' que contiene la concatenación
        System.out.println("detail2: " + detail2);
    }
}
