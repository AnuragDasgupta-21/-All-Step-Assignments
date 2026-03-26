// Program Name: SumAndAverage
// Description: Find sum and average of array elements

import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {

        int size;
        double sum = 0, average;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        size = scanner.nextInt();

        if (size <= 0) {
            System.err.println("Invalid size!");
            System.exit(0);
        }

        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number: ");
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        average = sum / numbers.length;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);

        scanner.close();
    }
}