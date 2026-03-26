// Program Name: MatrixDisplay
// Description: Input and display a 2D matrix

import java.util.Scanner;

public class MatrixDisplay {
    public static void main(String[] args) {

        int rows, cols;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter rows: ");
        rows = scanner.nextInt();

        System.out.print("Enter columns: ");
        cols = scanner.nextInt();

        if (rows <= 0 || cols <= 0) {
            System.err.println("Invalid matrix size!");
            System.exit(0);
        }

        int[][] matrix = new int[rows][cols];

        // Input matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Enter element: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Display matrix
        System.out.println("Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}