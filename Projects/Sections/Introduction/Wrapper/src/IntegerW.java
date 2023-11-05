public class IntegerW {
    public static void main(String[] args) {

        // Creando un primitivo int e inicializándolo con el valor 32768
        int intPrimitivo = 32768;

        // Envoltura del primitivo int en un objeto Integer
        Integer intObjeto = Integer.valueOf(intPrimitivo);

        // Creando otro objeto Integer directamente con el valor 32768
        Integer intObjeto2 = 32768;

        // Imprimiendo el valor de intObjeto
        System.out.println("intObjeto = " + intObjeto);

        // Unboxing: Asignando el objeto Integer a un primitivo int (auto-unboxing)
        int num = intObjeto;

        // Imprimiendo el valor de num
        System.out.println("num = " + num);

        // Extrayendo el valor int del objeto Integer explícitamente
        int num2 = intObjeto.intValue();

        // Imprimiendo el valor de num2
        System.out.println("num2 = " + num2);

        // Parseando una cadena para crear un objeto Integer
        String valorTvLcd = "67000";
        Integer valor = Integer.valueOf(valorTvLcd);

        // Imprimiendo el valor de valor
        System.out.println("valor = " + valor);

        // Convirtiendo el objeto Integer en un objeto Short
        Short shortObjeto = intObjeto2.shortValue();

        // Imprimiendo el valor de shortObjeto
        System.out.println("shortObjeto = " + shortObjeto);

        // Convirtiendo el objeto Integer en un objeto Byte
        Byte byteObjeto = intObjeto2.byteValue();

        // Imprimiendo el valor de byteObjeto
        System.out.println("byteObjeto = " + byteObjeto);

        // Convirtiendo el objeto Integer en un objeto Long
        Long longObjeto = intObjeto2.longValue();

        // Imprimiendo el valor de longObjeto
        System.out.println("longObjeto = " + longObjeto);
    }
}
