public class SearchExample {
    public static void main(String[] args) {

        // Declaración e inicialización de una matriz bidimensional
        int[][] integerArray = {{35, 90, 3, 1978},
                {15, 202, 10, 5},
                {677, 127, 32767, 1999}
        };

        // Elemento a buscar en la matriz
        int searchItem = 156;

        // Variable para indicar si se encontró el elemento
        boolean found = false;

        // Variables para guardar las coordenadas del elemento si se encuentra
        int i;
        int j = 0;

        // Etiqueta 'search' para romper dos bucles anidados
        search:
        for (i = 0; i < integerArray.length; i++) {
            for (j = 0; j < integerArray[i].length; j++) {
                // Comprueba si el elemento actual es igual al elemento de búsqueda
                if (integerArray[i][j] == searchItem) {
                    found = true;
                    // Rompe ambos bucles utilizando la etiqueta 'search'
                    break search;
                }
            }
        }

        // Verifica si se encontró el elemento y muestra la información correspondiente
        if (found) {
            System.out.println("Found " + searchItem + " in coordinates " + i + "," + j);
        } else {
            System.out.println(searchItem + " not found in array");
        }
    }
}
