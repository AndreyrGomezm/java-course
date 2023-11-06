import java.util.Arrays;

public class ForExample {
    public static void main(String[] args) {

        // Creación de un arreglo de Strings llamado 'products' con 7 elementos
        String[] products = new String[7];
        int count = products.length; // Almacena la longitud del arreglo 'products'

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
        System.out.println("=== Using for ===");

        // Uso de un bucle 'for' para iterar a través de los elementos del arreglo
        // 'products'
        for (int i = 0; i < count; i++) {
            System.out.println("For index " + i + " : " + products[i]);
        }
        System.out.println("=== Using foreach ===");

        // Uso de un bucle 'foreach' para iterar a través de los elementos del arreglo
        // 'products'
        for (String prod : products) {
            System.out.println("prod = " + prod);
        }
        System.out.println("=== Using while ===");

        // Uso de un bucle 'while' para iterar a través de los elementos del arreglo
        // 'products'
        int i = 0;
        while (i < count) {
            System.out.println("For index " + i + " : " + products[i]);
            i++;
        }
        System.out.println("=== Using do while ===");

        // Uso de un bucle 'do-while' para iterar a través de los elementos del arreglo
        // 'products'
        int j = 0;
        do {
            System.out.println("For index " + j + " : " + products[j]);
            j++;
        } while (j < count);

        // Creación de un arreglo de enteros llamado 'num' con 10 elementos
        int[] num = new int[10];

        int countNum = num.length; // Almacena la longitud del arreglo 'num'

        // Uso de un bucle 'for' para asignar valores al arreglo 'num'
        for (int k = 0; k < countNum; k++) {
            num[k] = k * 3;
        }

        // Uso de un bucle 'for' para imprimir los valores del arreglo 'num'
        for (int k = 0; k < countNum; k++) {
            System.out.println("num = " + num[k]);
        }
    }
}
