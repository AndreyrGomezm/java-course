public class PerformanceTestConcat {
    public static void main(String[] args) {

        // Definir tres cadenas
        String a = "a";
        String b = "b";
        String c = "a";

        // Usar un StringBuilder para concatenar cadenas eficientemente
        StringBuilder sb = new StringBuilder(a);

        // Tomar el tiempo de inicio
        long start = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            // Alternativamente, puedes usar una de estas dos formas de concatenar cadenas.
            // La primera forma utiliza el método concat() y la segunda utiliza el operador
            // de concatenación '+='.

            // Forma 1: c = c.concat(a).concat(b).concat("\n");
            // Forma 2: c += a + b + "\n";

            // Usar un StringBuilder es generalmente más eficiente para la concatenación en
            // bucles.
            sb.append(a).append(b).append("\n");
        }

        // Forzar la ejecución del recolector de basura
        System.gc();

        // Tomar el tiempo de finalización
        long end = System.currentTimeMillis();

        // Imprimir el tiempo transcurrido en milisegundos
        System.out.println(end - start);

        // Imprimir las cadenas resultantes (c y sb)
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());

        // Salir del programa
        System.exit(0);
    }
}
