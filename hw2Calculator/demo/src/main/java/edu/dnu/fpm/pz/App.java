package edu.dnu.fpm.pz;

public class CalculatorApp {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.err.println("Not enough parameters!");
            return;
        }

        Calc calc = new CalcImpl();
        double firstNumber;
        double secondNumber;
        try {
            firstNumber = Double.parseDouble(args[0]);
            secondNumber = Double.parseDouble(args[1]);
        } catch (NumberFormatException e) {
            System.err.println("Invalid number format!");
            return;
        }

        double result;
        switch (args[2]) {
            case "+":
                result = calc.addition(firstNumber, secondNumber);
                break;
            case "-":
                result = calc.subtraction(firstNumber, secondNumber);
                break;
            case "*":
                result = calc.multiplication(firstNumber, secondNumber);
                break;
            case "/":
                if (secondNumber == 0) {
                    System.err.println("Division by zero!");
                    return;
                }
                result = calc.division(firstNumber, secondNumber);
                break;
            default:
                System.err.println("Invalid operator!");
                return;
        }

        System.out.println("Number1 = " + firstNumber + " Number2 = " + secondNumber +
                " Operator = " + args[2] + " Result = " + result);
    }
}
