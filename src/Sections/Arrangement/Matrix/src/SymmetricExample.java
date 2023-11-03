public class SymmetricExample {
    public static void main(String[] args) {
        // Inicializa una variable booleana para determinar si la matriz es simétrica
        boolean symmetrical = true;

        // Define una matriz bidimensional
        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 2, 1, 0, 5 },
                { 3, 0, 1, 6 },
                { 4, 5, 6, 7 }
        };

        // Utiliza etiqueta 'goOut' para salir de los bucles anidados si se encuentra
        // una diferencia
        goOut: for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                // Compara los elementos en posiciones simétricas de la matriz
                if (matrix[i][j] != matrix[j][i]) {
                    // Si encuentra una diferencia, marca la matriz como no simétrica y sale de los
                    // bucles
                    symmetrical = false;
                    break goOut;
                }
            }
        }

        // Verifica si la matriz es simétrica y muestra el resultado
        if (symmetrical) {
            System.out.println("Matrix is symmetric");
        } else {
            System.out.println("Matrix is not symmetric");
        }
    }
}
