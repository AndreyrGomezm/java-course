import java.util.Scanner;

public class LogicalLogin {
    public static void main(String[] args) {

        // Declaración y asignación de arreglos para almacenar nombres de usuario y
        // contraseñas válidos.
        String[] usernames = { "andrey", "admin", "pepe" };
        String[] passwords = { "123", "1234", "12345" };

        /*
         * Otra forma de declarar y asignar valores
         * String[] usernames = new String[3];
         * String[] passwords = new String[3];
         * usernames[0] = "andrey";
         * passwords[0] = "12345";
         * 
         * usernames[1] = "admin";
         * passwords[1] = "12345";
         * 
         * usernames[2] = "pepe";
         * passwords[2] = "12345";
         */

        // Crear un objeto Scanner para recibir entrada del usuario.
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese su nombre de usuario.
        System.out.println("Enter the username");
        String u = scanner.next();

        // Solicitar al usuario que ingrese su contraseña.
        System.out.println("Enter the password");
        String p = scanner.next();

        // Cerrar el objeto Scanner para liberar recursos.
        scanner.close();

        // Inicializar una variable para rastrear si la autenticación fue exitosa.
        boolean isAuthenticator = false;

        // Iterar a través de los arreglos de nombres de usuario y contraseñas.
        for (int i = 0; i < usernames.length; i++) {
            // Verificar si el nombre de usuario y la contraseña coinciden con alguna
            // entrada válida.
            // Usando el operador ternario para asignar 'true' si coincide, manteniendo
            // 'true' si ya es 'true',
            // o 'false' si no coincide.
            isAuthenticator = (usernames[i].equals(u) && passwords[i].equals(p)) ? true : isAuthenticator;

            /*
             * La versión comentada a continuación representa la misma lógica utilizando una
             * estructura if.
             * if (usernames[i].equals(u) && passwords[i].equals(p)) {
             * isAuthenticator = true;
             * }
             */
        }

        // Crear un mensaje en función de si la autenticación fue exitosa o no
        // utilizando el operador ternario.
        String message = isAuthenticator ? "Welcome user ".concat(u).concat("!")
                : "Incorrect username or password! \n Sorry, requires authentication";
        System.out.println("mensaje = " + message);

        /*
         * La versión comentada a continuación representa la misma lógica utilizando una
         * estructura if-else.
         * if (isAuthenticator) {
         * System.out.println("Welcome user ".concat(u).concat("!"));
         * } else {
         * System.out.println("Incorrect username or password!");
         * System.out.println("Sorry, requires authentication");
         * }
         */
    }
}
