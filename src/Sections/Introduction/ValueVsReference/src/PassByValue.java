public class PassByValue {
    public static void main(String[] args) {

        // Crear una variable int 'i' y asignarle el valor 10
        int i = 10;

        // Imprimir el valor inicial de 'i' en el método 'main'
        System.out.println("We start main method with i = " + i);

        // Llamar al método 'test' y pasar la variable 'i' como argumento
        test(i);

        // Imprimir el valor de 'i' después de llamar al método 'test' (sigue siendo 10)
        System.out.println("End main method with value of i (remains the same) = " + i);
    }

    // Definir un método 'test' que toma un parámetro 'i' de tipo int
    public static void test(int i) {
        // Imprimir el valor de 'i' en el método 'test' (es 10, el mismo valor que en
        // 'main')
        System.out.println("We start test method with i = " + i);

        // Asignar un nuevo valor (35) a 'i' en el método 'test'
        i = 35;

        // Imprimir el valor de 'i' después de asignarle 35 (en 'test')
        System.out.println("We end test method with i = " + i);
    }
}
