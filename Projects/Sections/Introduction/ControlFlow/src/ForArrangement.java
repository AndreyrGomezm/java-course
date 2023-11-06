import javax.swing.*;

public class ForArrangement {
    public static void main(String[] args) {

        // Declarar un arreglo de nombres.
        String[] names = {"Andrey", "Pepe", "Maria", "Paco", "Lalo", "Bea", "Pato", "Pepa"};

        // Obtener la cantidad de elementos en el arreglo.
        int count = names.length;

        // Iterar a través de los nombres en el arreglo.
        for (int i = 0; i < count; i++) {
            // Comprobar si el nombre actual contiene "ANDREY" o "pepa" (insensible a
            // mayúsculas y minúsculas).
            if (names[i].toLowerCase().contains("ANDREY".toLowerCase())
                    || names[i].toLowerCase().contains("pepa".toLowerCase())) {
                continue; // Saltar a la siguiente iteración si se cumple la condición.
            }
            // Imprimir el índice y el nombre que no cumple la condición.
            System.out.println(i + ".- " + names[i]);
        }

        // Solicitar al usuario que ingrese un nombre para buscar.
        String seek = JOptionPane.showInputDialog("Enter a name, for main \"Pepe\" or \"Maria\": ");
        System.out.println("seek = " + seek);

        boolean found = false;

        // Iterar a través de los nombres en el arreglo para buscar el nombre ingresado
        // por el usuario.
        for (int i = 0; i < count; i++) {
            // Comprobar si el nombre actual es igual al nombre buscado (insensible a
            // mayúsculas y minúsculas).
            if (names[i].equalsIgnoreCase(seek)) {
                found = true;
                break; // Salir del bucle si se encuentra el nombre buscado.
            }
            // Imprimir los nombres en el arreglo mientras se busca.
            System.out.println("names = " + names[i]);
        }

        // Mostrar un mensaje según si se encontró o no el nombre.
        if (found) {
            JOptionPane.showMessageDialog(null, seek + " was found!");
        } else {
            JOptionPane.showMessageDialog(null, seek + " does not exist in the system");
        }
    }
}
