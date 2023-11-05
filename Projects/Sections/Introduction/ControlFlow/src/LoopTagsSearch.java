public class LoopTagsSearch {
    public static void main(String[] args) {

        // Definir la frase y la palabra a buscar
        String phrase = "can you can a can as a canner can can a can?";
        String word = "can";

        // Obtener la longitud de la palabra
        int maxWord = word.length();

        // Calcular la longitud máxima de búsqueda en la frase
        int maxPhrase = phrase.length() - maxWord;

        // Inicializar la variable para contar la cantidad de ocurrencias
        int quantity = 0;

        // Etiqueta 'search' para el bucle exterior
        search: for (int i = 0; i <= maxPhrase;) {

            // Inicializar la variable 'k' para rastrear la posición en la frase
            int k = i;

            // Bucle anidado para comparar caracteres de la palabra con la frase
            for (int j = 0; j < maxWord; j++) {
                if (phrase.charAt(k++) != word.charAt(j)) {
                    // Si los caracteres no coinciden, incrementar 'i' y continuar buscando
                    i++;
                    continue search;
                }
            }

            // Si se encuentra una coincidencia completa de la palabra, incrementar el
            // contador
            quantity++;

            // Mover 'i' más allá de la palabra encontrada para continuar la búsqueda
            i = i + maxWord;
        }

        // Mostrar la cantidad de ocurrencias encontradas
        System.out.println("quantity = " + quantity + " found word '" + word + "' in phrase");
    }
}
