import java.util.Arrays;

public class InverseForExample {
    public static void main(String[] args) {

        // Declaración e inicialización de un arreglo de Strings llamado 'products' con
        // valores iniciales
        String[] products = { "Kingston Pendrive 64GB", "Samsung Galaxy", "Samsung External SSD Hard Drive",
                "Asus Notebook", "Macbook Air", "Chromecast 4th generation", "Bicycle Oxford" };

        int count = products.length; // Almacena la longitud del arreglo 'products'

        Arrays.sort(products); // Ordena el arreglo 'products' alfabéticamente
        System.out.println("=== Using for ===");

        // Uso de un bucle 'for' estándar para iterar a través de los elementos del
        // arreglo 'products'
        for (int i = 0; i < count; i++) {
            System.out.println("For index " + i + " : " + products[i]);
        }
        System.out.println("=== Using inverse for ===");

        // Uso de un bucle 'for' inverso para imprimir los elementos en orden inverso
        for (int i = 0; i < count; i++) {
            System.out.println("For i = " + (count - 1 - i) + " value: " + products[count - 1 - i]);
        }
        System.out.println("=== Using inverse for 2 ===");

        // Uso de otro bucle 'for' inverso, pero con una estructura diferente, para
        // imprimir los elementos en orden inverso
        for (int i = count - 1; i >= 0; i--) {
            System.out.println("for i = " + i + " value " + products[i]);
        }
    }
}
