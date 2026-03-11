// Program Name: LargestNumber
// This program finds the largest of three numbers.

import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Variable declarations
        int number1;
        int number2;
        int number3;
        int largestNumber;

        // User input
        System.out.print("Enter first number: ");
        number1 = input.nextInt();

        System.out.print("Enter second number: ");
        number2 = input.nextInt();

        System.out.print("Enter third number: ");
        number3 = input.nextInt();

        // Conditional logic
        if (number1 >= number2 && number1 >= number3) {
            largestNumber = number1;
        } 
        else if (number2 >= number1 && number2 >= number3) {
            largestNumber = number2;
        } 
        else {
            largestNumber = number3;
        }

        System.out.println("Largest Number = " + largestNumber);

        input.close();
    }
}