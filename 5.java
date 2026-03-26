// Program Name: ArrayCreationAndAccess
// Description: Create an array and print elements using for loop

import java.util.Scanner;

public class ArrayCreationAndAccess {
    public static void main(String[] args) {

        // Declare variables
        int size;
        Scanner scanner = new Scanner(System.in);

        // Get array size from user
        System.out.print("Enter array size: ");
        size = scanner.nextInt();

        // Validate input
        if (size <= 0) {
            System.err.println("Invalid array size!");
            System.exit(0);
        }

        // Create array
        int[] numbers = new int[size];

        // Input array elements
        for (int index = 0; index < numbers.length; index++) {
            System.out.print("Enter element " + index + ": ");
            numbers[index] = scanner.nextInt();
        }

        // Access and print elements
        System.out.println("Array Elements:");
        for (int index = 0; index < numbers.length; index++) {
            System.out.println(numbers[index]);
        }

        scanner.close();
    }
}