// Program Name: CheckNumberType
// This program checks whether a number is positive, negative, or zero.

import java.util.Scanner;

public class CheckNumberType {

    public static void main(String[] args) {

        // Create scanner object for user input
        Scanner input = new Scanner(System.in);

        // Declare variable for number
        int number;

        // Ask user for input
        System.out.print("Enter a number: ");
        number = input.nextInt();

        // Conditional statements to check number type
        if (number > 0) {
            System.out.println("The number is Positive");
        } 
        else if (number < 0) {
            System.out.println("The number is Negative");
        } 
        else {
            System.out.println("The number is Zero");
        }

        input.close();
    }
}