package edu.dnu.fpm.pz;

/**
 * This is an implementation of the Calc interface.
 */
public class CalcImpl implements Calc {

    public double addition(double a, double b) {
        return a + b;
    }

    public double subtraction(double a, double b) {
        return a - b;
    }

    public double multiplication(double a, double b) {
        return a * b;
    }

    public double division(double a, double b) {
        double result = 0;

        try {
            if (b != 0) {
                result = a / b;
            } else {
                System.out.println("Division by zero");
            }
        } catch (ArithmeticException e) {
            System.out.println("An error occurred during division: " + e.getMessage());
        }

        return result;
    }
}
