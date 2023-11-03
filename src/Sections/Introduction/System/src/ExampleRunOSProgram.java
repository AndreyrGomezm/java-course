import java.io.IOException;

public class ExampleRunOSProgram {
    public static void main(String[] args) {

        // Obtener el nombre del sistema operativo actual
        String osName = System.getProperty("os.name").toLowerCase();

        // Crear un objeto ProcessBuilder para ejecutar programas
        ProcessBuilder processBuilder = new ProcessBuilder();

        try {
            // Configurar el comando a ejecutar según el sistema operativo
            if (osName.startsWith("windows")) {
                processBuilder.command("notepad");
            } else if (osName.startsWith("mac")) {
                processBuilder.command("textedit");
            } else if (osName.startsWith("nux") || osName.startsWith("nix")) {
                processBuilder.command("gedit");
            } else {

                // Si no se reconoce el sistema operativo, se intenta abrir "gedit" (en sistemas
                // basados en Unix)
                processBuilder.command("gedit");
            }

            // Iniciar el proceso para ejecutar el programa
            Process process = processBuilder.start();

            // Esperar a que el proceso termine
            int exitCode = process.waitFor();

            // Verificar el código de salida del proceso
            if (exitCode == 0) {
                System.out.println("The editor has closed.");
                System.exit(0);
            } else {
                System.err.println("Error executing the command.");
                System.exit(1);
            }
        } catch (IOException | InterruptedException e) {
            // Manejar posibles errores durante la ejecución del proceso
            System.err.println("Error executing the command: " + e.getMessage());
            e.printStackTrace();
            System.exit(1);
        }
    }
}
