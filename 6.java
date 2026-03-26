// Program Name: ModifyArray
// Description: Modify a specific index in an array

import java.util.Scanner;

public class ModifyArray {
    public static void main(String[] args) {

        int size, position, newValue;
        Scanner scanner = new Scanner(System.in);

        // Input size
        System.out.print("Enter array size: ");
        size = scanner.nextInt();

        if (size <= 0) {
            System.err.println("Invalid size!");
            System.exit(0);
        }

        int[] array = new int[size];

        // Input elements
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter value: ");
            array[i] = scanner.nextInt();
        }

        // Input position to modify
        System.out.print("Enter index to modify: ");
        position = scanner.nextInt();

        if (position < 0 || position >= array.length) {
            System.err.println("Invalid index!");
            System.exit(0);
        }

        // Input new value
        System.out.print("Enter new value: ");
        newValue = scanner.nextInt();

        // Modify array
        array[position] = newValue;

        // Print updated array
        System.out.println("Updated Array:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        scanner.close();
    }
}