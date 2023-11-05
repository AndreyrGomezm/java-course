package co.agomez.app;

public class Calculator {
    private Calculator() {
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int... varargs) {
        int total = 0;
        for (int i : varargs) {
            total += i;
        }
        return total;
    }

    public static float add(float a, int... varargs) {
        float total = a;
        for (int i : varargs) {
            total += i;
        }
        return total;
    }

    public static double add(double... varargs) {
        double total = 0;
        for (double d : varargs) {
            total += d;
        }
        return total;
    }

    public static float add(float x, float y) {
        return x + y;
    }

    public static float add(int i, float j) {
        return i + j;
    }

    public static float add(float i, int j) {
        return i + j;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static int add(String a, String b) {
        int result;
        try {
            return Integer.parseInt(a) + Integer.parseInt(b);
        } catch (NumberFormatException e) {
            result = 0;
        }
        return result;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }
}
