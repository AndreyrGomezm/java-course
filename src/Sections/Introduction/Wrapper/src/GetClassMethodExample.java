import java.lang.reflect.Method;

public class GetClassMethodExample {
    public static void main(String[] args) {

        // Crear una cadena de texto
        String text = "Hi how are you!";

        // Obtener la clase del objeto 'text'
        Class strClass = text.getClass();

        // Imprimir el nombre completo de la clase
        System.out.println("strClass = " + strClass.getName());

        // Imprimir el nombre simple de la clase
        System.out.println("strClass = " + strClass.getSimpleName());

        // Imprimir el nombre del paquete de la clase
        System.out.println("strClass = " + strClass.getPackageName());

        // Imprimir la representación de cadena de la clase
        System.out.println("strClass = " + strClass);

        // Iterar a través de los métodos públicos de la clase 'String'
        for (Method method : strClass.getMethods()) {
            System.out.println("method.getName() = " + method.getName());
        }

        // Crear un objeto Integer
        Integer num = 34;

        // Obtener la clase del objeto 'num'
        Class intClass = num.getClass();

        // Obtener la clase base de la clase Integer
        Class objClass = intClass.getSuperclass().getSuperclass();

        // Imprimir la clase base de la clase Integer
        System.out.println("intClass.getSuperclass().getSuperclass() = " + intClass.getSuperclass());

        // Imprimir la clase base de la clase base de Integer
        System.out.println("objClass = " + objClass);

        // Iterar a través de los métodos públicos de la clase base de Integer
        for (Method method : objClass.getMethods()) {
            System.out.println("method.getName() = " + method.getName());
        }
    }
}
