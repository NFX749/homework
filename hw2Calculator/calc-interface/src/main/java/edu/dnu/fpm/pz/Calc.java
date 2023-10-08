package edu.dnu.fpm.pz;

/**
 * This is the Calc interface.
 */
public interface Calc {

    /**
     * Adds two numbers.
     *
     * @param a The first number.
     * @param b The second number.
     * @return The result of addition.
     */
    double addition(double a, double b);

    /**
     * Subtracts two numbers.
     *
     * @param a The first number.
     * @param b The second number.
     * @return The result of subtraction.
     */
    double subtraction(double a, double b);

    /**
     * Multiplies two numbers.
     *
     * @param a The first number.
     * @param b The second number.
     * @return The result of multiplication.
     */
    double multiplication(double a, double b);

    /**
     * Divides two numbers.
     *
     * @param a The dividend.
     * @param b The divisor (must not be zero).
     * @return The result of division.
     */
    double division(double a, double b);
}
