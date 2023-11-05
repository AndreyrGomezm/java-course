import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {

        // Uso del operador ternario para asignar un valor a la variable 'var' según una
        // condición.
        String var = 7 == 7 ? "if it is true" : "if it is false";
        System.out.println("var = " + var);

        // Declaración de variables para almacenar calificaciones y promedio.
        String state = "";
        double average = 0.0;

        double math = 0.0;
        double sciences = 0.0;
        double history = 0.0;

        // Crear un objeto Scanner para recibir entrada del usuario.
        Scanner s = new Scanner(System.in);

        // Solicitar al usuario que ingrese calificaciones para matemáticas, ciencias e
        // historia.
        System.out.println("Enter math grade between 2.0 - 7.0");
        math = s.nextDouble();

        System.out.println("Enter sciences grade between 2.0 - 7.0");
        sciences = s.nextDouble();

        System.out.println("Enter history grade between 2.0 - 7.0");
        history = s.nextDouble();
        s.close();

        // Calcular el promedio de las calificaciones.
        average = (math + sciences + history) / 3;

        // Uso del operador ternario para determinar si el estudiante está aprobado o
        // reprobado.
        state = average >= 5.49 ? "approved" : "declined";
        System.out.println("state = " + state);

        /*
         * La versión comentada a continuación representa la misma lógica utilizando
         * una estructura if-else en lugar del operador ternario.
         */
        /*
         * if (average >= 5.49) {
         * state = "approved";
         * } else {
         * state = "declined";
         * }
         */
    }
}
