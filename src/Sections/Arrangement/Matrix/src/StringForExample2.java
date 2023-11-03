public class StringForExample2 {
    public static void main(String[] args) {

        // Declaración e inicialización de una matriz de cadenas de 3 filas y 2 columnas
        String[][] names = { { "pepe", "pepa" }, { "Josefa", "Paco" }, { "Lucas", "Pancha" } };

        // Iteración a través de la matriz utilizando un bucle "foreach"
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
