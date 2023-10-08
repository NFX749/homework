package pz.fpm.dnu.edu;

/**
 * This is an implementation of the Calc interface.
 */
public class CalculatorImpl implements Calculator {

    /**
     * Performs addition of two numbers.
     *
     * @param a The first number.
     * @param b The second number.
     * @return The result of the addition.
     */
    public double addition(double a, double b) {
        return a + b;
    }

    /**
     * Performs subtraction of two numbers.
     *
     * @param a The first number.
     * @param b The second number.
     * @return The result of the subtraction.
     */
    public double subtraction(double a, double b) {
        return a - b;
    }

    /**
     * Performs multiplication of two numbers.
     *
     * @param a The first number.
     * @param b The second number.
     * @return The result of the multiplication.
     */
    public double multiplication(double a, double b) {
        return a * b;
    }

    /**
     * Performs division of two numbers.
     *
     * @param a The dividend.
     * @param b The divisor.
     * @return The result of the division, or 0 if division by zero occurs.
     */
    public double division(double a, double b) {
        double result = 0;

        try {
            result = a / b;
        } catch (ArithmeticException e) {
            System.out.println("An error occurred during division: " + e.getMessage());
        }

        return result;
    }
}

