public class PassByReference {
    public static void main(String[] args) {

        // Crear un arreglo 'age' de enteros y asignarle valores iniciales
        int[] age = { 10, 11, 12 };

        // Imprimir un mensaje para indicar el inicio del método 'main'
        System.out.println("We start main method");

        // Imprimir los valores del arreglo 'age' antes de llamar al método 'test'
        for (int i = 0; i < age.length; i++) {
            System.out.println("age[i]" + age[i]);
        }

        // Imprimir un mensaje antes de llamar al método 'test'
        System.out.println("Before calling the method test");

        // Llamar al método 'test' y pasar el arreglo 'age' como argumento
        test(age);

        // Imprimir un mensaje después de llamar al método 'test'

        System.out.println("After calling the method test");

        // Imprimir los valores del arreglo 'age' después de llamar al método 'test'
        for (int i = 0; i < age.length; i++) {
            System.out.println("age[i]" + age[i]);
        }

        // Imprimir un mensaje para indicar que se ha terminado el método 'main'
        System.out.println("Finish the main method with the modified array data!");
    }

    // Definir un método 'test' que toma un arreglo de enteros 'age' como parámetro
    public static void test(int[] age) {
        // Imprimir un mensaje para indicar el inicio del método 'test'
        System.out.println("We start test method");

        // Modificar los valores del arreglo 'age' agregándoles 20 a cada elemento
        for (int i = 0; i < age.length; i++) {
            age[i] = age[i] + 20;
        }

        // Imprimir un mensaje para indicar el final del método 'test'
        System.out.println("We end test method");
    }
}
