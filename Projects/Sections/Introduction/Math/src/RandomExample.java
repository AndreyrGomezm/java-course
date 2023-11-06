import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {

        // Definir un arreglo de colores
        String[] colors = {"blue", "yellow", "red", "green", "white", "black"};

        // Generar un número decimal aleatorio entre 0 (inclusive) y 1 (exclusivo)
        // usando Math.random()
        double random = Math.random();
        System.out.println("random = " + random);

        // Escalar el número aleatorio para que esté dentro del rango de índices del
        // arreglo
        random *= colors.length;
        System.out.println("random = " + random);

        // Redondear hacia abajo el número aleatorio para obtener un índice válido
        random = Math.floor(random);
        System.out.println("random = " + random);

        // Seleccionar un color aleatorio del arreglo utilizando el índice generado
        System.out.println("colores = " + colors[(int) random]);

        // Crear un objeto Random para generar números enteros aleatorios
        Random randomObj = new Random();

        // Generar un número entero aleatorio entre 15 y 25 (ambos inclusive)
        int randomInt = 15 + randomObj.nextInt(25 - 15 + 1);
        System.out.println("randomInt = " + randomInt);

        // Generar un índice aleatorio para seleccionar un color del arreglo
        randomInt = randomObj.nextInt(colors.length);
        System.out.println("randomInt = " + randomInt);
        System.out.println("colors = " + colors[randomInt]);
    }
}
