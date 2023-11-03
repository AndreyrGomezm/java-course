import javax.swing.JOptionPane;

public class LongestNameProgram {
    public static void main(String[] args) {
        String person1 = JOptionPane.showInputDialog("Enter the name and surname of a family member or friend:");
        String person2 = JOptionPane.showInputDialog("Enter the name and surname of a family member or friend:");
        String person3 = JOptionPane.showInputDialog("Enter the name and surname of a family member or friend:");

        String longestName = (person1.split(" ")[0].length() < person2.split(" ")[0].length()) ? person2 : person1;
        longestName = (person3.split(" ")[0].length() < longestName.split(" ")[0].length()) ? longestName : person3;

        System.out.println("The person with the longest first name is " + longestName);
    }
}
