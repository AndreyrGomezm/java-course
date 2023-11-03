public class FrameworkExample {
    public static void main(String[] args) {

        int[][] matrix = new int[5][5];

        // Llena la matriz con 1 en los bordes y la diagonal principal, y 0 en otros
        // lugares
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j || i == 0 || i == matrix.length - 1 || j == 0 || j == matrix[i].length - 1) {
                    matrix[i][j] = 1; // Establece 1 en los bordes y la diagonal principal
                }
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
