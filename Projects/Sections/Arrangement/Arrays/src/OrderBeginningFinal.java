public class OrderBeginningFinal {
    public static void main(String[] args) {

        int[] num = new int[10]; // Declaración e inicialización de un arreglo de enteros 'num' con 10 elementos
        int[] a = new int[10]; // Declaración e inicialización de un nuevo arreglo de enteros 'a' con 10
                               // elementos

        // Llena el arreglo 'num' con valores del 1 al 10
        for (int i = 0; i < num.length; i++) {
            num[i] = i + 1;
        }

        int aux = 0;

        // Combina elementos desde el principio y el final del arreglo 'num' y los
        // almacena en el arreglo 'a'
        for (int i = 0; i < num.length - i; i++) {
            a[aux++] = num[i]; // Agrega el elemento desde el principio
            a[aux++] = num[num.length - 1 - i]; // Agrega el elemento desde el final
        }

        // Imprime los elementos del arreglo 'a'
        for (int i = 0; i < a.length; i++) {
            System.out.println("i = " + i + " value " + a[i]);
        }
    }
}
