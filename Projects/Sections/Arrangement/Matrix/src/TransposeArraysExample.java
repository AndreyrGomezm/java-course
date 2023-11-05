public class TransposeArraysExample {
    public static void main(String[] args) {
        int[][] a, b;
        a = new int[8][4]; // Matriz original de 8 filas y 4 columnas
        b = new int[4][8]; // Matriz transpuesta tendrá 4 filas y 8 columnas

        // Inicializa y muestra la matriz original 'a'
        System.out.println("Matrix 'a':");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = i + j * 3;
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

        // Realiza la transposición de la matriz 'a' y almacena el resultado en 'b'
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                b[j][i] = a[i][j]; // Intercambia filas por columnas
            }
        }

        // Muestra la matriz transpuesta 'b'
        System.out.println("The transpose matrix 'b':");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
