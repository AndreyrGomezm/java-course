public class While {
    public static void main(String[] args) {

        // Ejemplo de un bucle while simple.
        int i = 0;
        while (i < 5) {
            System.out.println("i = " + i);
            i++;
        }

        // Ejemplo de un bucle while con una condición más compleja y una variable de
        // control.
        i = 0;
        boolean test = true;
        while (test) {
            if (i == 7) {
                test = false;
            }
            System.out.println("i = " + i);
            i++;
        }

        // Ejemplo de un bucle do-while que se ejecuta al menos una vez.
        test = false;
        do {
            System.out.println("runs at least once");
        } while (test);

        // Ejemplo de un bucle do-while con una condición más compleja y una variable de
        // control.
        test = true;
        i = 0;
        do {
            if (i == 10) {
                test = false;
            }
            System.out.println("i = " + i);
            i++;
        } while (test);
    }
}
