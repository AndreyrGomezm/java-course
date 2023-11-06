public class LoopTags {
    public static void main(String[] args) {

        // Etiqueta de bucle "loop1"
        loop1:
        for (int i = 1; i < 7; i++) {
            int j = 1;
            while (j <= 8) {
                if (i == 6 || i == 7) {
                    System.out.println("Day " + i + ": weekend break!");
                    continue loop1; // Continúa el bucle etiquetado "loop1"
                }
                System.out.println("Day " + i + ", working at " + j + "hrs.");
                j++;
            }
        }
        System.out.println("\n======================================================================");

        // Etiqueta de bucle "loop2"
        loop2:
        for (int i = 0; i < 5; i++) {

            System.out.println();
            int j = 0;
            while (j < 5) {
                if (i == 2) {
                    continue loop2; // Continúa el bucle etiquetado "loop2"
                }
                System.out.print("[i = " + i + ", j = " + j + "]");
                j++;
            }
        }
        System.out.println("\n======================================================================");

        // Etiqueta de bucle "loop3"
        loop3:
        for (int i = 0; i < 5; i++) {

            System.out.println();
            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    break loop3; // Sale del bucle etiquetado "loop3"
                }
                System.out.print("[i = " + i + ", j = " + j + "]");
            }
        }
    }
}
