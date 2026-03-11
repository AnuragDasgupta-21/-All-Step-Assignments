// Program Name: MultiplicationTable
// This program prints multiplication table of a given number.

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Variable declaration
        int number;

        // User input
        System.out.print("Enter a number: ");
        number = input.nextInt();

        // Loop to generate table
        for (int i = 1; i <= 10; i++) {

            int result = number * i;

            System.out.println(number + " x " + i + " = " + result);
        }

        input.close();
    }
}