public class AddExample {
        public static void main(String[] args) {
                // Declarar y definir las matrices a y b
                int[][] a = {
                                { 1, 2, 3 },
                                { 4, 5, 6 },
                                { 7, 8, 9 }
                };
                int[][] b = {
                                { 10, 20, 30 },
                                { 40, 50, 60 },
                                { 70, 80, 90 }
                };

                // Crear una matriz para almacenar la suma, con la misma dimensión que a y b
                int[][] sum = new int[3][3];

                // Sumar las matrices a y b elemento por elemento
                for (int i = 0; i < a.length; i++) {
                        for (int j = 0; j < a[i].length; j++) {
                                sum[i][j] = a[i][j] + b[i][j];
                        }
                }

                // Imprimir la matriz resultante
                System.out.println("Resultado de la suma:");

                // Iterar sobre la matriz resultante y mostrar los valores
                for (int i = 0; i < sum.length; i++) {
                        for (int j = 0; j < sum[i].length; j++) {
                                System.out.print(sum[i][j] + "\t");
                        }
                        System.out.println(); // Nueva línea después de cada fila
                }
        }
}
