import java.util.Map;

public class EnvironmentVariablesExample {
    public static void main(String[] args) {

        // Obtener un mapa de las variables de entorno del sistema
        Map<String, String> varEnv = System.getenv();

        // Imprimir todo el mapa de variables de entorno
        System.out.println("System environment variable = " + varEnv);

        // Listar todas las variables de entorno del sistema
        System.out.println("----- listing system environment variables -----");
        for (String key : varEnv.keySet()) {
            System.out.println(key + " => " + varEnv.get(key));
        }

        // Obtener y mostrar valores específicos de variables de entorno
        String username = System.getenv("USERNAME");
        System.out.println("username = " + username);

        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);

        String tempDir = System.getenv("TEMP");
        System.out.println("tempDir = " + tempDir);

        String path = System.getenv("PATH");
        System.out.println("path = " + path);

        // También puedes obtener valores de variables de entorno en mayúsculas o
        // minúsculas
        String path2 = varEnv.get("Path");
        System.out.println("path2 = " + path2);

        // Acceder a una variable de entorno personalizada
        String appEnv = System.getenv("APPLICATION_ENV");
        System.out.println("appEnv = " + appEnv);

        // Acceder a otra variable de entorno personalizada
        String hello = System.getenv("GREETING_HELLO");
        System.out.println("hello = " + hello);
    }
}
