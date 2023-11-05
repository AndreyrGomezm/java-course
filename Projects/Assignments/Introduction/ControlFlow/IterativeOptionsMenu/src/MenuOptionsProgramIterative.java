import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class MenuOptionsProgramIterative {

    public static void main(String[] args) {
        int optionIndex = 0;
        do {
            Map<String, Integer> options = new HashMap<>();
            options.put("Update", 1);
            options.put("Delete", 2);
            options.put("Add", 3);
            options.put("List", 4);
            options.put("Exit", 5);

            Object[] optionArray = options.keySet().toArray();

            Object selectedOption = JOptionPane.showInputDialog(null,
                    "Select an Operation", "User Maintainer", JOptionPane.INFORMATION_MESSAGE, null,
                    optionArray, optionArray[0]);

            if (selectedOption == null) {
                JOptionPane.showMessageDialog(null, "You must select an operation.");
            } else {
                optionIndex = options.get(selectedOption.toString());

                String message = null;

                switch (optionIndex) {
                    case 1 -> {
                        message = "User updated successfully.";
                        JOptionPane.showMessageDialog(null, message);
                        System.out.println(message);
                    }
                    case 2 -> {
                        message = "User deleted successfully.";
                        JOptionPane.showMessageDialog(null, message);
                        System.out.println(message);
                    }
                    case 3 -> {
                        message = "User added successfully.";
                        JOptionPane.showMessageDialog(null, message);
                        System.out.println(message);
                    }
                    case 4 -> {
                        message = "Listing users.";
                        JOptionPane.showMessageDialog(null, message);
                        System.out.println(message);
                    }
                }
            }

        } while (optionIndex != 5);

        JOptionPane.showMessageDialog(null, "You have exited successfully!");
    }
}
