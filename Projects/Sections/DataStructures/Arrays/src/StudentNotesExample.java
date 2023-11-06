import java.util.Scanner;

public class StudentNotesExample {
    public static void main(String[] args) {

        double[] mathClass, historyClass, languageClass; // Declaración de tres arreglos de tipo double para las
        // calificaciones de matemáticas, historia y lenguaje
        double sumNotesMath = 0, sumNotesHistory = 0, sumNotesLanguage = 0; // Variables para sumar las calificaciones
        // de cada clase
        mathClass = new double[7]; // Inicialización de un arreglo de double para las calificaciones de matemáticas
        // con 7 elementos
        historyClass = new double[7]; // Inicialización de un arreglo de double para las calificaciones de historia
        // con 7 elementos
        languageClass = new double[7]; // Inicialización de un arreglo de double para las calificaciones de lenguaje
        // con 7 elementos

        Scanner s = new Scanner(System.in); // Creación de un objeto Scanner para la entrada de usuario
        System.out.println("Enter 7 student grades for math:"); // Muestra un mensaje para que el usuario ingrese las
        // calificaciones de matemáticas

        // Lee y almacena las calificaciones de matemáticas ingresadas por el usuario en
        // el arreglo 'mathClass'
        for (int i = 0; i < mathClass.length; i++) {
            mathClass[i] = s.nextDouble();
        }

        System.out.println("Enter 7 student grades for history:"); // Muestra un mensaje para que el usuario ingrese las
        // calificaciones de historia

        // Lee y almacena las calificaciones de historia ingresadas por el usuario en el
        // arreglo 'historyClass'
        for (int i = 0; i < historyClass.length; i++) {
            historyClass[i] = s.nextDouble();
        }

        System.out.println("Enter 7 student grades for language:"); // Muestra un mensaje para que el usuario ingrese
        // las calificaciones de lenguaje

        // Lee y almacena las calificaciones de lenguaje ingresadas por el usuario en el
        // arreglo 'languageClass'
        for (int i = 0; i < languageClass.length; i++) {
            languageClass[i] = s.nextDouble();
        }

        // Calcula la suma de las calificaciones de cada clase
        for (int i = 0; i < 7; i++) {
            sumNotesMath += mathClass[i];
            sumNotesHistory += historyClass[i];
            sumNotesLanguage += languageClass[i];
        }

        // Calcula el promedio de calificaciones para cada clase
        double averageMath = sumNotesMath / mathClass.length;
        double averageHistory = sumNotesHistory / historyClass.length;
        double averageLanguage = sumNotesLanguage / languageClass.length;

        // Imprime los promedios de calificaciones para cada clase y el promedio total
        // del curso
        System.out.println("Math class average: " + averageMath);
        System.out.println("History class average: " + averageHistory);
        System.out.println("Language class average: " + averageLanguage);
        System.out.println("Total course average: " + (averageMath + averageHistory + averageLanguage) / 3);

        System.out.println("Enter the student ID (0 - 6): "); // Muestra un mensaje para que el usuario ingrese el ID
        // del estudiante
        int id = s.nextInt(); // Lee el ID del estudiante ingresado por el usuario
        s.close(); // Cierra el objeto Scanner para liberar recursos

        // Calcula el promedio de calificaciones para el estudiante específico y lo
        // imprime
        double studentAverage = (historyClass[id] + languageClass[id] + mathClass[id]) / 3;
        System.out.println("Average student num " + id + " : " + studentAverage);
    }
}
