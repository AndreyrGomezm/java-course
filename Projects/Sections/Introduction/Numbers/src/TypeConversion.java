public class TypeConversion {
    public static void main(String[] args) {

        // Convertir una cadena a un entero
        String strNumber = "50";
        int intNumber = Integer.parseInt(strNumber);
        System.out.println("intNumber " + intNumber);

        // Convertir una cadena a un número decimal (double)
        String strReal = "98765.43e-3";
        double doubleReal = Double.parseDouble(strReal);
        System.out.println("doubleReal " + doubleReal);

        // Convertir una cadena a un valor booleano
        String logicalStr = "true";
        boolean logicalBoolean = Boolean.parseBoolean(logicalStr);
        System.out.println("logicalBoolean " + logicalBoolean);

        // Convertir un entero a una cadena
        int anotherIntNumber = 100;
        System.out.println("anotherIntNumber = " + anotherIntNumber);
        String anotherStrNumber = Integer.toString(anotherIntNumber);
        System.out.println("anotherStrNumber = " + anotherStrNumber);

        // Convertir una expresión a una cadena
        anotherStrNumber = String.valueOf(anotherIntNumber + 10);
        System.out.println("anotherStrNumber = " + anotherStrNumber);

        // Convertir un número decimal a una cadena
        double anotherDoubleReal = 1.23456e2;
        String anotherStrReal = Double.toString(anotherDoubleReal);
        System.out.println("anotherStrReal = " + anotherStrReal);

        // Convertir un número decimal (float) a una cadena
        anotherStrReal = String.valueOf(1.23456e2f);
        System.out.println("anotherStrReal = " + anotherStrReal);

        // Conversión de tipos numéricos
        int i = 22768;
        short s = (short) i; // Conversión explícita a short
        System.out.println("s = " + s);
        long l = i; // Conversión implícita a long
        System.out.println("l = " + l);
        System.out.println(Short.MAX_VALUE);
        char c = (char) i; // Conversión explícita a char
        System.out.println("c = " + c);
        float f = (float) i; // Conversión explícita a float
        System.out.println("f = " + f);
    }
}
