public class ForBubbleSortExample {

    // Método para invertir el orden de los elementos en un arreglo de Strings
    public static void inverseArraignment(String[] arraignment) {
        int count = arraignment.length;
        int count2 = arraignment.length;
        for (int i = 0; i < count2; i++) {
            String actual = arraignment[i];
            String inverse = arraignment[count - 1 - i];
            arraignment[i] = inverse;
            arraignment[count - 1 - i] = actual;
            count2--;
        }
    }

    // Método para ordenar un arreglo de objetos utilizando el algoritmo de
    // ordenación burbuja
    public static void sortBubble(Object[] arraignment) {
        int total = arraignment.length;

        for (int i = 0; i < total - 1; i++) {
            for (int j = 0; j < total - 1 - i; j++) {
                if (((Comparable) arraignment[j + 1]).compareTo(arraignment[j]) > 0) {
                    Object auxiliary = arraignment[j];
                    arraignment[j] = arraignment[j + 1];
                    arraignment[j + 1] = auxiliary;
                }
            }
        }
    }

    public static void main(String[] args) {

        // Declaración e inicialización de un arreglo de Strings llamado 'products' con
        // valores iniciales
        String[] products = {"Kingston Pendrive 64GB", "Samsung Galaxy", "Samsung External SSD Hard Drive",
                "Asus Notebook", "Macbook Air", "Chromecast 4th generation", "Bicycle Oxford"};

        int total = products.length;

        // Llama al método 'sortBubble' para ordenar el arreglo 'products' utilizando el
        // algoritmo de ordenación burbuja
        sortBubble(products);

        System.out.println("=== Using for ===");

        // Uso de un bucle 'for' estándar para imprimir los elementos del arreglo
        // 'products' ordenados
        for (int i = 0; i < total; i++) {
            System.out.println("For index " + i + " : " + products[i]);
        }

        // Declaración e inicialización de un arreglo de Integers llamado 'num' con
        // valores iniciales
        Integer[] num = new Integer[4];

        num[0] = 10;
        num[1] = Integer.valueOf("7");
        num[2] = 35;
        num[3] = -1;

        // Llama al método 'sortBubble' para ordenar el arreglo 'num' utilizando el
        // algoritmo de ordenación burbuja
        sortBubble(num);

        for (int i = 0; i < num.length; i++) {
            System.out.println("i = " + i + " : " + num[i]);
        }
    }
}
