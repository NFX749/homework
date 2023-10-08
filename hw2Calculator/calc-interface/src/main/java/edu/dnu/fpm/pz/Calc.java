package edu.dnu.fpm.pz;

/**
 * This is the Calc interface.
 */
public interface Calc {

    /**
     * Adds two numbers.
     *
     * @param firstParam The first number.
     * @param secondParam The second number.
     * @return The result of addition.
     */
    double addition(double firstParam, double secondParam);

    /**
     * Subtracts two numbers.
     *
     * @param firstParam The first number.
     * @param secondParam The second number.
     * @return The result of subtraction.
     */
    double subtraction(double firstParam, double secondParam);

    /**
     * Multiplies two numbers.
     *
     * @param firstParam The first number.
     * @param secondParam The second number.
     * @return The result of multiplication.
     */
    double multiplication(double firstParam, double secondParam);

    /**
     * Divides two numbers.
     *
     * @param firstParam The dividend.
     * @param secondParam The divisor (must not be zero).
     * @return The result of division.
     */
    double division(double firstParam, double secondParam);
}
