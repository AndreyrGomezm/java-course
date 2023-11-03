public class arguments {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Must enter parameters or arguments!");
            System.exit(-1);
        }
        for (int i = 0; i < args.length; i++) {
            System.out.println("arguments n° " + i + ": " + args[i]);
        }
    }
}
