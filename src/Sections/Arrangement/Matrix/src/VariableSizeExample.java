public class VariableSizeExample {
    public static void main(String[] args) {

        // Declaración de una matriz bidimensional con 3 filas de longitud variable
        int[][] matrix = new int[3][];

        // Inicialización de cada fila con una longitud diferente
        matrix[0] = new int[2]; // Fila 0 tiene 2 elementos
        matrix[1] = new int[3]; // Fila 1 tiene 3 elementos
        matrix[2] = new int[4]; // Fila 2 tiene 4 elementos

        // Imprime la longitud de cada fila de la matriz
        System.out.println("matrix length: " + matrix.length);
        System.out.println("row 0 length: " + matrix[0].length);
        System.out.println("row 1 length: " + matrix[1].length);
        System.out.println("row 2 length: " + matrix[2].length);

        // Llena la matriz con valores calculados (en este caso, i * j)
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = i * j;
            }
        }

        // Imprime la matriz
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
