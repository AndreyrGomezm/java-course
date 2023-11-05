class People {
    private String name;

    // Método para modificar el nombre de una persona
    public void modifyName(String newName) {
        this.name = newName;
    }

    // Método para obtener el nombre de una persona
    public String readName() {
        return this.name;
    }
}

public class PassByReference2 {
    public static void main(String[] ags) {

        // Crear una instancia de la clase People y asignarle el nombre "Andrey"
        People people = new People();
        people.modifyName("Andrey");

        // Imprimir un mensaje para indicar el inicio del método 'main'
        System.out.println("We start main method");

        // Imprimir el nombre de la persona (debería ser "Andrey")
        System.out.println("people.modifyName = " + people.readName());

        // Imprimir un mensaje antes de llamar al método 'test'
        System.out.println("Before calling the method test");

        // Llamar al método 'test' y pasar la instancia 'people' como argumento
        test(people);

        // Imprimir un mensaje después de llamar al método 'test'

        System.out.println("After calling the method test");

        // Imprimir el nombre de la persona nuevamente (debería ser "Pepe" debido a la
        // modificación en 'test')
        System.out.println("people.modifyName = " + people.readName());

        // Imprimir un mensaje para indicar el final del método 'main'
        System.out.println("Ends the main method with the modified person's data");
    }

    // Definir un método 'test' que toma una instancia de 'People' como parámetro
    public static void test(People people) {
        // Imprimir un mensaje para indicar el inicio del método 'test'
        System.out.println("We start test method");

        // Modificar el nombre de la persona a "Pepe" dentro del método 'test'
        people.modifyName("Pepe");

        // Imprimir un mensaje para indicar el final del método 'test'
        System.out.println("We end test method");
    }
}
