public class StringForExample {
    public static void main(String[] args) {

        // Declaración e inicialización de una matriz de cadenas de 3 filas y 2 columnas
        String[][] names = new String[3][2];

        // Asignación de valores a la matriz
        names[0][0] = "pepe";
        names[0][1] = "pepa";
        names[1][0] = "Josefa";
        names[1][1] = "Paco";
        names[2][0] = "Lucas";
        names[2][1] = "Pancha";

        // Iteración a través de la matriz utilizando un bucle "for"
        System.out.println("Iterating with for:");
        for (int i = 0; i < names.length; i++) {

            for (int j = 0; j < names[i].length; j++) {
                // Imprime cada elemento de la matriz seguido de una tabulación
                System.out.print(names[i][j] + "\t");
            }
            // Salta a una nueva línea después de imprimir una fila completa
            System.out.println();
        }

        // Iteración a través de la matriz utilizando un bucle "foreach"
        System.out.println("Iterating with foreach:");
        for (String[] row : names) {
            for (String name : row) {
                // Imprime cada elemento de la matriz seguido de una tabulación
                System.out.print(name + "\t");
            }
            // Salta a una nueva línea después de imprimir una fila completa
            System.out.println();
        }
    }
}
