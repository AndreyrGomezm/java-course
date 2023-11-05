import java.util.Scanner;

public class NameManagementProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a family member or friend's name:");
        String nameA = scanner.nextLine();
        String nameA2 = nameA.toUpperCase().charAt(1) + "." + nameA.substring(nameA.length() - 2);

        System.out.println("Enter another family member or friend's name:");
        String nameB = scanner.nextLine();
        String nameB2 = nameB.toUpperCase().charAt(1) + "." + nameB.substring(nameB.length() - 2);

        System.out.println("Enter another family member or friend's name:");
        String nameC = scanner.nextLine();
        String nameC2 = nameC.toUpperCase().charAt(1) + "." + nameC.substring(nameC.length() - 2);
        scanner.close();

        String result = nameA2 + "_" + nameB2 + "_" + nameC2;

        System.out.println(result);
    }
}
