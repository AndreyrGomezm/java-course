import javax.swing.*;

public class Arithmetic {
    public static void main(String[] args) {

        // Declaración de variables y cálculo de la suma de i y j.
        int i = 5, j = 4, sum = i + j;

        // Imprimir la suma en la consola.
        System.out.println("sum = " + sum);

        // Imprimir la suma de i y j directamente sin utilizar una variable intermedia.
        System.out.println("i + j = " + (i + j));

        // Cálculo de la resta de i y j.
        int res = i - j;

        // Imprimir la resta en la consola.
        System.out.println("res = " + res);

        // Imprimir la resta de i y j directamente sin utilizar una variable intermedia.
        System.out.println("i - j =" + (i - j));

        // Cálculo de la multiplicación de i y j.
        int multi = i * j;

        // Imprimir el resultado de la multiplicación en la consola.
        System.out.println("multiplication = " + multi);

        // Cálculo de la división de i entre j (en dos formas, int y float).
        int div = i / j;
        float div2 = (float) i / j;

        // Imprimir los resultados de ambas divisiones en la consola.
        System.out.println("division = " + div);
        System.out.println("division2 = " + div2);

        // Cálculo del resto de la división de i entre j.
        int rest = i % j;

        // Imprimir el resultado del resto en la consola.
        System.out.println("rest = " + rest);

        // Ejemplo adicional de cálculo del resto (8 % 5) e impresión en la consola.
        rest = 8 % 5;
        System.out.println("rest = " + rest);

        // Solicitar al usuario que ingrese un número.
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));

        // Verificar si el número ingresado por el usuario es par o impar y mostrarlo en
        // la consola.
        if (num % 2 == 0) {
            System.out.println("Número par = " + num);
        } else {
            System.out.println("Número impar = " + num);
        }
    }
}
