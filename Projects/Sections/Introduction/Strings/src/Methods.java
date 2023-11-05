public class Methods {
    public static void main(String[] args) {
        // Declaración de una cadena 'name'
        String name = "Andrey";

        // Imprime la longitud de la cadena 'name'
        System.out.println("name.length() = " + name.length());

        // Convierte la cadena 'name' a mayúsculas y la imprime
        System.out.println("name.toUpperCase() = " + name.toUpperCase());

        // Convierte la cadena 'name' a minúsculas y la imprime
        System.out.println("name.toLowerCase() = " + name.toLowerCase());

        // Compara si 'name' es igual a "Andrey" (considera mayúsculas y minúsculas)
        System.out.println("name.equals(\"Andrey\") = " + name.equals("Andrey"));

        // Compara si 'name' es igual a "andrey" (distingue mayúsculas y minúsculas)
        System.out.println("name.equals(\"andrey\") = " + name.equals("andrey"));

        // Compara si 'name' es igual a "andrey" (ignora mayúsculas y minúsculas)
        System.out.println("name.equalsIgnoreCase(\"andrey\") = " + name.equalsIgnoreCase("andrey"));

        // Compara 'name' con "Andrey" lexicográficamente (comparación de cadenas)
        System.out.println("name.compareTo(\"Andrey\") = " + name.compareTo("Andrey"));

        // Compara 'name' con "Aaron" lexicográficamente (comparación de cadenas)
        System.out.println("name.compareTo(\"Aaron\") = " + name.compareTo("Aaron"));

        // Obtiene el carácter en la posición 0 de 'name'
        System.out.println("name.charAt(0) = " + name.charAt(0));

        // Obtiene el carácter en la posición 1 de 'name'
        System.out.println("name.charAt(1) = " + name.charAt(1));

        // Obtiene el último carácter de 'name' usando 'name.length() - 1' como índice
        System.out.println("name.charAt(name.length()-1) = " + name.charAt(name.length() - 1));

        // Obtiene una subcadena de 'name' a partir de la posición 1 hasta el final
        System.out.println("name.substring(1) = " + name.substring(1));

        // Obtiene una subcadena de 'name' desde la posición 1 hasta la posición 4 (no
        // inclusiva)
        System.out.println("name.substring(1, 4) = " + name.substring(1, 4));

        // Obtiene el último carácter de 'name' usando 'name.length() - 1' como índice
        // en 'substring()'
        System.out.println("name.substring(name.length()-1) = " + name.substring(name.length() - 1));

        // Declaración de una cadena 'tongueTwister'
        String tongueTwister = "tongue twister";

        // Reemplaza todas las ocurrencias de 't' por '.' en 'tongueTwister'
        System.out.println("tongueTwister = " + tongueTwister.replace("t", "."));

        // Imprime 'tongueTwister' original (no se modifica por el reemplazo)
        System.out.println("tongueTwister = " + tongueTwister);

        // Encuentra la primera posición de 't' en 'tongueTwister'
        System.out.println("tongueTwister.indexOf('t') = " + tongueTwister.indexOf('t'));

        // Encuentra la última posición de 't' en 'tongueTwister'
        System.out.println("tongueTwister.lastIndexOf('t') = " + tongueTwister.lastIndexOf('t'));

        // Encuentra la posición de la subcadena "twister" en 'tongueTwister'
        System.out.println("tongueTwister.indexOf(\"twister\") = " + tongueTwister.indexOf("twister"));

        // Comprueba si 'tongueTwister' contiene la subcadena "twister"
        System.out.println("tongueTwister.contains(\"twister\") = " + tongueTwister.contains("twister"));

        // Comprueba si 'tongueTwister' comienza con "to"
        System.out.println("tongueTwister.startsWith(\"to\") = " + tongueTwister.startsWith("to"));

        // Comprueba si 'tongueTwister' termina con "r"
        System.out.println("tongueTwister.endsWith(\"r\") = " + tongueTwister.endsWith("r"));

        // Imprime una cadena con espacios antes y después
        System.out.println("  tongue twister ");

        // Utiliza 'trim()' para eliminar los espacios en blanco al principio y al final
        // de la cadena
        System.out.println("  tongue twister ".trim());
    }
}
