package ui;

import model.Calculator;
import model.exceptions.*;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        String numerator = JOptionPane.showInputDialog("Enter a double numerator:");
        String divider = JOptionPane.showInputDialog("Enter a double divider:");

        try {
            double division2 = cal.divide(numerator, divider);
            System.out.println("division2 = " + division2);
        } catch (FormatNumberException e){
            System.err.println("An exception was detected: enter a valid number: " + e.getMessage());
            e.printStackTrace(System.out);
        }catch (DivisionByZeroException ae) {
            System.err.println("We catch the exception at runtime: " + ae.getMessage());
            main(args);
        } finally {
            System.out.println("It is optional, but it is always executed with or without exception!");
        }
        System.out.println("We continue with our application flow");
    }
}
