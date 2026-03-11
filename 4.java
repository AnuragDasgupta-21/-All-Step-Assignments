// Program Name: SimpleCalculator
// This program performs basic arithmetic operations using switch statement.

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);

        // Variable declarations
        double number1;
        double number2;
        char operator;
        double result;

        // User input
        System.out.print("Enter first number: ");
        number1 = input.nextDouble();

        System.out.print("Enter second number: ");
        number2 = input.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        operator = input.next().charAt(0);

        // Switch statement
        switch (operator) {

            case '+':
                result = number1 + number2;
                System.out.println("Result = " + result);
                break;

            case '-':
                result = number1 - number2;
                System.out.println("Result = " + result);
                break;

            case '*':
                result = number1 * number2;
                System.out.println("Result = " + result);
                break;

            case '/':
                result = number1 / number2;
                System.out.println("Result = " + result);
                break;

            default:
                System.out.println("Invalid operator");
        }

        input.close();
    }
}