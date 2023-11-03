public class FileExtension {
    public static void main(String[] args) {
        // Declaración de una cadena 'file' que representa un nombre de archivo
        String file = "some.image.jpeg";

        // Encuentra la última posición del carácter '.' en la cadena 'file'
        int i = file.lastIndexOf(".");

        // Imprime la longitud de la cadena 'file'
        System.out.println("file.length() = " + file.length());

        // Utiliza 'i' (la posición del último '.') para obtener la extensión del
        // archivo
        // utilizando el método 'substring()' para obtener la parte de la cadena después
        // del punto
        System.out.println("file.substring(i+1) = " + file.substring(i + 1));
    }
}
