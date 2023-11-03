import java.util.Arrays;

public class Example {
    public static void main(String[] args) {

        // Creación de un arreglo de Strings llamado 'products' con 7 elementos
        String[] products = new String[7];

        // Asignación de valores a los elementos del arreglo 'products'
        products[0] = "Kingston Pendrive 64GB";
        products[1] = "Samsung Galaxy";
        products[2] = "Samsung External SSD Hard Drive";
        products[3] = "Asus Notebook";
        products[4] = "Macbook Air";
        products[5] = "Chromecast 4th generation";
        products[6] = "Bicycle Oxford";

        // Ordena el arreglo 'products' alfabéticamente
        Arrays.sort(products);

        // Asigna los elementos ordenados a variables individuales
        String product1 = products[0];
        String product2 = products[1];
        String product3 = products[2];
        String product4 = products[3];
        String product5 = products[4];
        String product6 = products[5];
        String product7 = products[6];

        // Imprime los elementos ordenados
        System.out.println("products[0] = " + product1);
        System.out.println("products[1] = " + product2);
        System.out.println("products[2] = " + product3);
        System.out.println("products[3] = " + product4);
        System.out.println("products[4] = " + product5);
        System.out.println("products[5] = " + product6);
        System.out.println("products[6] = " + product7);

        // Creación de un arreglo de enteros llamado 'num' con 4 elementos
        int[] num = new int[4];

        // Asignación de valores a los elementos del arreglo 'num'
        num[0] = 10;
        num[1] = Integer.valueOf("7");
        num[2] = 35;
        num[3] = -1;
        // num[4] = 5; // Esta línea está comentada porque el arreglo 'num' tiene solo 4
        // elementos.

        // Asigna los valores del arreglo 'num' a variables individuales
        int i = num[0];
        int j = num[1];
        int k = num[2];
        int l = num[num.length - 1]; // Obtén el último elemento del arreglo

        // Ordena el arreglo 'num'
        Arrays.sort(num);

        // Imprime los valores de las variables
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l); // Imprime el valor del último elemento del arreglo 'num'
    }
}
