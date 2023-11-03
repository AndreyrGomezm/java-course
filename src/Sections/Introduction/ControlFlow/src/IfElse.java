public class IfElse {
    public static void main(String[] args) {

        // Definir la variable "average" para almacenar un promedio (puede ser una
        // calificación).
        float average = 5.8f;

        // Evaluar el promedio usando una serie de declaraciones "if-else if-else".
        if (average >= 6.5) {
            System.out.println("Congratulations, excellent average!"); // Imprimir un mensaje si el promedio es mayor o
                                                                       // igual a 6.5.
        } else if (average >= 6.0) {
            System.out.println("Very good average!"); // Imprimir un mensaje si el promedio está entre 6.0 y 6.49.
        } else if (average >= 5.5) {
            System.out.println("Good average!"); // Imprimir un mensaje si el promedio está entre 5.5 y 5.99.
        } else if (average >= 5.0) {
            System.out.println("Regular, you need a little more effort!"); // Imprimir un mensaje si el promedio está
                                                                           // entre 5.0 y 5.49.
        } else if (average >= 4.0) {
            System.out.println("Insufficient, you need to study more!"); // Imprimir un mensaje si el promedio está
                                                                         // entre 4.0 y 4.99.
        } else {
            System.out.println("Flunked out"); // Imprimir un mensaje si el promedio es menor que 4.0.
        }

        // Imprimir el promedio, independientemente de la evaluación anterior.
        System.out.println("Your average is " + average);
    }
}
