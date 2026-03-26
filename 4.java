// Program Name: LargestElement
// Description: Find largest number in array

import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {

        int size;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size: ");
        size = scanner.nextInt();

        if (size <= 0) {
            System.err.println("Invalid size!");
            System.exit(0);
        }

        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter value: ");
            array[i] = scanner.nextInt();
        }

        int largest = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }

        System.out.println("Largest element: " + largest);

        scanner.close();
    }
}