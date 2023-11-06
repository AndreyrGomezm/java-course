public class Example {
    public static void main(String[] args) {

        // Declaración e inicialización de una matriz bidimensional 'num' de tamaño 2x4
        int[][] num = new int[2][4];

        // Inicialización de los elementos de la matriz 'num'
        num[0][0] = 1;
        num[0][1] = 2;
        num[0][2] = 3;
        num[0][3] = 4;

        num[1][0] = 11;
        num[1][1] = 12;
        num[1][2] = 13;
        num[1][3] = 14;

        // Imprime el número de filas y columnas de la matriz
        System.out.println("Number of rows: " + num.length); // Debe imprimir "Number of rows: 2"
        System.out.println("Number of columns: " + num[0].length); // Debe imprimir "Number of columns: 4"

        // Imprime el primer elemento de la matriz y el último elemento
        System.out.println("First item of array: " + num[0][0]); // Debe imprimir "First item of array: 1"
        System.out.println("Last item: " + num[num.length - 1][num[1].length - 1]); // Debe imprimir "Last item: 14"

        // Almacena los elementos individuales de la matriz en variables separadas
        int num1 = num[0][0];
        int num2 = num[0][1];
        int num3 = num[0][2];
        int num4 = num[0][3];
        int num5 = num[1][0];
        int num6 = num[1][1];
        int num7 = num[1][2];
        int num8 = num[1][3];

        // Imprime los valores almacenados en las variables
        System.out.println("num1 = " + num1); // Debe imprimir "num1 = 1"
        System.out.println("num2 = " + num2); // Debe imprimir "num2 = 2"
        System.out.println("num3 = " + num3); // Debe imprimir "num3 = 3"
        System.out.println("num4 = " + num4); // Debe imprimir "num4 = 4"
        System.out.println("num5 = " + num5); // Debe imprimir "num5 = 11"
        System.out.println("num6 = " + num6); // Debe imprimir "num6 = 12"
        System.out.println("num7 = " + num7); // Debe imprimir "num7 = 13"
        System.out.println("num8 = " + num8); // Debe imprimir "num8 = 14"
    }
}
