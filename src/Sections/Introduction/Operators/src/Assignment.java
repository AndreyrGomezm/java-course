public class Assignment {
    public static void main(String[] args) {
        // Declaración e inicialización de la variable 'i'.
        int i = 5;
        // Declaración y asignación de 'j' como la suma de 'i' y 4.
        int j = i + 4;
        System.out.println("i = " + i); // Imprimir el valor de 'i'.
        System.out.println("j = " + j); // Imprimir el valor de 'j'.

        // Uso del operador de asignación compuesta '+=' para incrementar 'i' en 2.
        i += 2; // i = i + 2
        System.out.println("i = " + i); // Imprimir el nuevo valor de 'i'.

        // Uso del operador de asignación compuesta '+=' para incrementar 'i' en 5.
        i += 5; // i = i + 5
        System.out.println("i = " + i); // Imprimir el nuevo valor de 'i'.

        // Uso del operador de asignación compuesta '-=' para decrementar 'j' en 4.
        j -= 4; // j = j - 4
        System.out.println("j = " + j); // Imprimir el nuevo valor de 'j'.

        // Uso del operador de asignación compuesta '*=' para multiplicar 'j' por 3.
        j *= 3; // j = j * 3
        System.out.println("j = " + j); // Imprimir el nuevo valor de 'j'.

        // Concatenación de cadenas de texto utilizando el operador de asignación
        // compuesta '+='.
        String sqlString = "select * from client as c";
        sqlString += " where c.name = 'Andrey "; // Agregar una parte de la consulta SQL.
        sqlString += "and c.active = 1"; // Agregar otra parte de la consulta SQL.
        System.out.println("sqlString = " + sqlString); // Imprimir la consulta SQL resultante.
    }
}
