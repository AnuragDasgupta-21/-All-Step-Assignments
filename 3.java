// Program Name: PrintNumbers
// This program prints numbers from 1 to N using a for loop.

import java.util.Scanner;

public class PrintNumbers {

    public static void main(String[] args) {

        // Scanner for user input
        Scanner input = new Scanner(System.in);

        // Variable declaration
        int limit;

        // Ask user for number
        System.out.print("Enter the limit: ");
        limit = input.nextInt();

        // Loop from 1 to limit
        for (int i = 1; i <= limit; i++) {
            System.out.println(i);
        }

        input.close();
    }
}