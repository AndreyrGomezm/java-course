public class Immutable {
    public static void main(String[] args) {
        // Declaración de dos cadenas: 'course' y 'teacher'
        String course = "Java Programming";
        String teacher = "Andres Guzman";

        // Concatenación de las cadenas 'course' y 'teacher' y asignación a 'result'
        String result = course.concat(teacher);

        // Imprime 'course', que sigue siendo inmutable
        System.out.println("course = " + course);

        // Imprime 'result', que es la concatenación de 'course' y 'teacher'
        System.out.println("result = " + result);

        // Compara si 'course' y 'result' tienen la misma referencia (devolverá 'false')
        System.out.println(course == result);

        // Utiliza el método 'transform()' para crear 'result2' concatenando 'teacher' a
        // 'course'
        String result2 = course.transform(c -> {
            return c + " with " + teacher;
        });

        // Imprime 'course', que sigue siendo inmutable
        System.out.println("course = " + course);

        // Imprime 'result2', que es la concatenación de 'course' y 'teacher' utilizando
        // 'transform()'
        System.out.println("result2 = " + result2);

        // Reemplaza todas las ocurrencias de 'a' con 'A' en 'result' y asigna el
        // resultado a 'result3'
        String result3 = result.replace("a", "A");

        // Imprime 'result', que sigue siendo inmutable
        System.out.println("result = " + result);

        // Imprime 'result3', que es el resultado de reemplazar 'a' con 'A' en 'result'
        System.out.println("result3 = " + result3);
    }
}
