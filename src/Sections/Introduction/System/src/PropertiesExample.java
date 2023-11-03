import java.util.Properties;

public class PropertiesExample {
    public static void main(String[] args) {

        // Obtener el nombre de usuario del sistema
        String username = System.getProperty("user.name");
        System.out.println("username = " + username);

        // Obtener el directorio principal del usuario
        String home = System.getProperty("user.home");
        System.out.println("home = " + home);

        // Obtener el directorio de trabajo actual
        String workspace = System.getProperty("user.dir");
        System.out.println("workspace = " + workspace);

        // Obtener la versión de Java
        String java = System.getProperty("java.version");
        System.out.println("java = " + java);

        // Obtener el separador de líneas del sistema y usarlo para imprimir una nueva
        // línea
        String lineSeparator = System.getProperty("line.separator");
        System.out.println("lineSeparator: " + lineSeparator + "A new line ... ");

        // Otra forma de obtener el separador de líneas y usarlo para imprimir una nueva
        // línea
        String lineSeparator2 = System.lineSeparator();
        System.out.println("lineSeparator: " + lineSeparator2 + "A new line ... ");

        // Obtener todas las propiedades del sistema y listarlas en la salida estándar
        Properties p = System.getProperties();
        p.list(System.out);
    }
}
