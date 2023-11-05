public class ArrayMethods {
    public static void main(String[] args) {
        // Declaración de una cadena 'tongueTwister' y muestra su longitud
        String tongueTwister = "tongue twister";
        System.out.println("tongueTwister = " + tongueTwister.length());

        // Convierte la cadena 'tongueTwister' en un arreglo de caracteres
        char[] arrangement = tongueTwister.toCharArray();

        // Obtiene la longitud del arreglo 'arrangement'
        int l0ng = arrangement.length;
        System.out.println("long = " + l0ng);

        // Imprime cada carácter del arreglo en una línea
        for (int i = 0; i < l0ng; i++) {
            System.out.print(arrangement[i]);
        }
        System.out.println();

        // Divide la cadena 'tongueTwister' en subcadenas utilizando 't' como
        // delimitador
        System.out.println("\ntongueTwister = " + tongueTwister.split("t"));

        // Almacena las subcadenas resultantes en un arreglo 'arrangement2'
        String[] arrangement2 = tongueTwister.split("t");

        // Obtiene la longitud del arreglo 'arrangement2'
        int l = arrangement2.length;

        // Imprime cada subcadena en una línea
        for (int j = 0; j < l; j++) {
            System.out.println(arrangement2[j]);
        }

        // Divide la cadena 'file' en subcadenas utilizando el punto (.) como
        // delimitador
        String file = "some.image.pdf";
        String[] fileArr = file.split("\\."); // El punto debe escaparse con doble barra invertida [.]
        l = fileArr.length;

        // Imprime cada subcadena en una línea
        for (int j = 0; j < l; j++) {
            System.out.println(fileArr[j]);
        }

        // Muestra la extensión del archivo, que es la última subcadena en 'fileArr'
        System.out.println("extension = " + fileArr[l - 1]);
    }
}
