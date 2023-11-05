public class Calculator {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.err.println("Please enter an operation (add, subtract, div, or multiply) and two integers");
            System.exit(-1);
        }

        String operation = args[0];
        int a = 0;
        int b = 0;
        double result = 0.00;

        try {
            a = Integer.parseInt(args[1]);
            b = Integer.parseInt(args[2]);
        } catch (NumberFormatException e) {
            System.err.println("Warning: 'a' and 'b' should be integers, please try again!");
            System.exit(-1);
        }
        switch (operation) {
            case "add":
                result = a + b;
                break;
            case "subtract":
                result = a - b;
                break;
            case "multiply":
                result = a * b;
                break;
            case "div":
                if (b == 0) {
                    System.err.println("You cannot divide by zero!");
                    System.exit(-1);
                }
                result = (double) a / b;
                break;
            default:
                result = a + b;
        }

        System.out.println("Result of the operation '" + operation + "' is: " + result);
    }
}
