public class TransposedExample {
    public static void main(String[] args) {
        // Define una matriz bidimensional
        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        System.out.println("Original matrix");
        // Muestra la matriz original
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        // Realiza la transposición de la matriz
        int aux;
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                // Intercambia elementos en posiciones (i, j) y (j, i)
                aux = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = aux;
            }
        }

        System.out.println("Transposed matrix");
        // Muestra la matriz transpuesta
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
