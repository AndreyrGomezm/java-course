public class ForEach {
    public static void main(String[] args) {

        // Ejemplo de bucle "for-each" para recorrer una matriz de números.
        int[] numbers = { 1, 3, 5, 7, 9, 11, 13, 15 };
        for (int num : numbers) {
            System.out.println("num = " + num);
        }

        // Ejemplo de bucle "for-each" para recorrer una matriz de nombres.
        String[] names = { "Andrey", "Pepe", "Maria", "Paco", "Lalo", "Bea", "Pato", "Pepa" };
        for (String name : names) {
            System.out.println("name = " + name);
        }
    }
}
