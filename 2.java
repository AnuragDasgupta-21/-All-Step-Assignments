// Program Name: SumOfNumbers
// This program calculates sum from 1 to N.

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Variables
        int limit;
        int counter = 1;
        int sum = 0;

        // User input
        System.out.print("Enter a number: ");
        limit = input.nextInt();

        // While loop
        while (counter <= limit) {

            sum = sum + counter;
            counter++;

        }

        System.out.println("Total Sum = " + sum);

        input.close();
    }
}