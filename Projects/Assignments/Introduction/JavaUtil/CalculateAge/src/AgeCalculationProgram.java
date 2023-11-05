import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AgeCalculationProgram {

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a birthdate in the format yyyy-MM-dd:");
        String dateStr = scanner.next();
        scanner.close();

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date birthDate = df.parse(dateStr);
        Date currentDate = new Date();

        df = new SimpleDateFormat("yyyyMMdd");

        int from = Integer.parseInt(df.format(birthDate));
        int to = Integer.parseInt(df.format(currentDate));

        int age = (to - from) / 10000;
        System.out.println("The age is: " + age);
    }
}
