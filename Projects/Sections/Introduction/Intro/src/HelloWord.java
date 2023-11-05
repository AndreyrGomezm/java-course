public class HelloWord {
    public static void main(String[] args) {
        // Declaración y asignación de una cadena 'greet'
        String greet = "Hello World from Java";

        // Imprime el valor de la cadena 'greet'
        System.out.println(greet);

        // Convierte la cadena 'greet' a mayúsculas y la imprime
        System.out.println("greet.toUpperCase() = " + greet.toUpperCase());

        // Declaración y asignación de una variable 'number'
        int number = 11;

        // Declaración de una variable 'value' y asignación de 'true'
        boolean value = true;

        // Declaración y asignación de una variable 'number2' con valor 5
        int number2 = 5;

        // Verifica si 'value' es verdadero
        if (value) {
            // Si es verdadero, imprime el valor de 'number' y cambia 'number2' a 15
            System.out.println("number = " + number);
            number2 = 15;
        }

        // Imprime el valor de 'number2' (puede ser 5 o 15, dependiendo de 'value')
        System.out.println("number2 = " + number2);

        // Declaración de una variable 'number3' con asignación automática de tipo (var)
        var number3 = 15;

        // Declaración de una cadena 'name' sin asignación inicial
        String name;

        // Asignación de un valor a 'name'
        name = "Andrey";

        // Verifica si 'number3' es mayor que 10 y, si es así, cambia 'name' a "Rolando"
        if (number3 > 10) {
            name = "Rolando";
        }

        // Imprime el valor final de 'name' ("Andrey" o "Rolando")
        System.out.println("name = " + name);

        // Declaración y asignación de una variable 'agePeople' con valor 5
        int agePeople = 5;

        // Imprime el valor de 'agePeople'
        System.out.println("agePeople = " + agePeople);
    }
}
