public class Example {
    public static void main(String[] args) {
        // Declaración de dos cadenas 'course' y 'course2' de la misma forma
        String course = "Java Programming";
        String course2 = new String("Java Programming");

        // Comparación de las referencias de 'course' y 'course2' utilizando el operador
        // '=='
        boolean isEqual = course == course2;
        System.out.println("course == course2: " + isEqual);

        // Comparación de los contenidos de 'course' y 'course2' utilizando el método
        // 'equals()'
        isEqual = course.equals(course2);
        System.out.println("course.equals(course2): " + isEqual);

        // Declaración de una nueva cadena 'course3' que es igual a 'course'
        String course3 = "Java Programming";

        // Comparación de las referencias de 'course' y 'course3' utilizando el operador
        // '=='
        isEqual = course == course3;
        System.out.println("course == course3: " + isEqual);
    }
}
