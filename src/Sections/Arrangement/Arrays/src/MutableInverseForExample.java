import java.util.Arrays;

public class MutableInverseForExample {

    // Método para invertir el orden de los elementos en un arreglo
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

    public static void main(String[] args) {

        // Declaración e inicialización de un arreglo de Strings llamado 'products' con
        // valores iniciales
        String[] products = { "Kingston Pendrive 64GB", "Samsung Galaxy", "Samsung External SSD Hard Drive",
                "Asus Notebook", "Macbook Air", "Chromecast 4th generation", "Bicycle Oxford" };
        int count = products.length; // Almacena la longitud del arreglo 'products'

        Arrays.sort(products); // Ordena el arreglo 'products' alfabéticamente

        // Llamada al método para invertir el orden del arreglo 'products'
        inverseArraignment(products);

        // Utiliza el método 'Collections.reverse' para invertir el orden del arreglo
        // 'products'
        // Collections.reverse(Arrays.asList(products));

        System.out.println("=== Using for ===");

        // Uso de un bucle 'for' estándar para imprimir los elementos del arreglo
        // 'products'
        for (int i = 0; i < count; i++) {
            System.out.println("For index " + i + " : " + products[i]);
        }
    }
}
