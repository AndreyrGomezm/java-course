package model;

import model.exceptions.*;

public class Calculator {
    public double divide(double numerator, double divider) throws DivisionByZeroException {
        if (divider == 0) {
            throw new DivisionByZeroException("cannot be divided by zero!");
        }
        return numerator / divider;
    }

    public double divide(String numerator, String divider)
            throws DivisionByZeroException, FormatNumberException {
        try {
            double num = Double.parseDouble(numerator);
            double div = Double.parseDouble(divider);
            return divide(num, div);
        } catch (NumberFormatException e){
            throw new FormatNumberException("You must enter a number in the numerator and divisor");
        }
    }
}
