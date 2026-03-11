// Program Name: EvenOddChecker
// This program checks whether a number is even or odd.

import java.util.Scanner;

public class EvenOddChecker {

    public static void main(String[] args) {

        // Scanner object for input
        Scanner input = new Scanner(System.in);

        // Variable declaration
        int number;

        // User input
        System.out.print("Enter a number: ");
        number = input.nextInt();

        // Boolean expression to check even or odd
        boolean isEven = (number % 2 == 0);

        // Conditional statement
        if (isEven) {
            System.out.println("The number is Even");
        } else {
            System.out.println("The number is Odd");
        }

        input.close();
    }
}