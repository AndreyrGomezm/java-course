public class Validate {
    public static void main(String[] args) {
        // Declaración de una cadena 'course' que es nula (null)
        String course = null;

        // Comprueba si 'course' es nula
        boolean isNull = course == null;

        // Imprime el resultado de la comprobación
        System.out.println("isNull = " + isNull);

        // Si 'course' es nula, asigna un valor a la cadena
        if (isNull) {
            course = "Java Programming";
        }

        // Comprueba si 'course' está vacía verificando su longitud
        boolean isEmpty = course.length() == 0;

        // Imprime el resultado de la comprobación de si está vacía
        System.out.println("isEmpty = " + isEmpty);

        // Comprueba si 'course' está vacía utilizando el método 'isEmpty()'
        boolean isEmpty2 = course.isEmpty();

        // Imprime el resultado de la comprobación de si está vacía
        System.out.println("isEmpty2 = " + isEmpty2);

        // Comprueba si 'course' está en blanco (solo espacios en blanco) utilizando
        // 'isBlank()'
        boolean isBlank = course.isBlank();

        // Imprime el resultado de la comprobación de si está en blanco
        System.out.println("isBlank = " + isBlank);

        // Si 'course' no está en blanco, realiza algunas operaciones
        if (!isBlank) {
            // Convierte 'course' a mayúsculas y la imprime
            System.out.println(course.toUpperCase());

            // Imprime un mensaje de bienvenida concatenando 'course'
            System.out.println("Welcome to the course " + course);
        }
    }
}
