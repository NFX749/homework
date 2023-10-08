package edu.dnu.fpm.pz;

/**
 * This is an implementation of the Calc interface.
 */
public class CalculatorImpl implements Calculator {

    /**
     * Performs addition of two numbers.
     *
     * @param firstParam The first number.
     * @param secondParam The second number.
     * @return The result of the addition.
     */
    public double addition(double firstParam, double secondParam ) {
        return firstParam + secondParam;
    }

    /**
     * Performs subtraction of two numbers.
     *
     * @param firstParam The first number.
     * @param secondParam  The second number.
     * @return The result of the subtraction.
     */
    public double subtraction(double firstParam, double secondParam ) {
        return firstParam - secondParam;
    }

    /**
     * Performs multiplication of two numbers.
     *
     * @param firstParam The first number.
     * @param secondParam  The second number.
     * @return The result of the multiplication.
     */
    public double multiplication(double firstParam, double secondParam ) {
        return firstParam * secondParam;
    }

    /**
     * Performs division of two numbers.
     *
     * @param firstParam The dividend.
     * @param secondParam  The divisor.
     * @return The result of the division, or 0 if division by zero occurs.
     */
    public double division(double firstParam, double secondParam ) {
        double result = 0;

        try {
            result = firstParam / secondParam;
        } catch (ArithmeticException e) {
            System.out.println("An error occurred during division: " + e.getMessage());
        }

        return result;
    }
}

