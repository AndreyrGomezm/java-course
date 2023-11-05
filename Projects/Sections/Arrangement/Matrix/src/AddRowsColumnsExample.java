public class AddRowsColumnsExample {
        public static void main(String[] args) {
                int sumRow, sumColumn;
                int[][] a = {
                                { 1, 2, 3 },
                                { 4, 5, 6 },
                                { 7, 8, 9 }
                };

                // Iterar sobre las filas de la matriz 'a'
                for (int i = 0; i < a.length; i++) {
                        sumColumn = 0;
                        sumRow = 0;

                        // Iterar sobre los elementos de la fila actual
                        for (int j = 0; j < a[i].length; j++) {
                                sumRow += a[i][j]; // Sumar elementos de la fila
                                sumColumn += a[j][i]; // Sumar elementos de la columna
                        }

                        // Imprimir la suma de la fila y la columna actual
                        System.out.println("Total fila " + i + " : " + sumRow);
                        System.out.println("Total columna " + i + " : " + sumColumn);
                }
        }
}
