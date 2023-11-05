import java.io.FileInputStream;
import java.util.Properties;

public class AssignPropertiesExample {
    public static void main(String[] args) {

        try {
            // Intenta cargar un archivo de propiedades llamado "config.properties"
            FileInputStream file = new FileInputStream("IdeaProjects/Sections/introduction/system/config.properties");

            // Crea un objeto Properties basado en las propiedades actuales del sistema
            Properties p = new Properties(System.getProperties());

            // Carga las propiedades desde el archivo en el objeto 'p'
            p.load(file);

            // Agrega una propiedad personalizada al objeto 'p'
            p.setProperty("my.custom.property", "my value saved in properties object");

            // Establece las propiedades modificadas en el sistema
            System.setProperties(p);

            // Muestra el valor de "my.custom.property"
            System.out.println("ps.getProperty(...) = " + System.getProperty("my.custom.property"));

            // Muestra el valor de otras propiedades
            System.out.println(System.getProperty("config.server.port"));
            System.out.println(System.getProperty("config.author.name"));
            System.out.println(System.getProperty("config.author.email"));

            // Obtiene y lista todas las propiedades del sistema
            Properties ps = System.getProperties();
            ps.list(System.out);
        } catch (Exception e) {
            // Si el archivo no existe, muestra un mensaje de error y sale con código de
            // error (1)
            System.err.println("El archivo no existe: " + e);
            System.exit(1);
        }
    }
}
