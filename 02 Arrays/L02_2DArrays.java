// File Name: L02_2DArrays.java
// Topic: 2D Arrays in Java

import java.util.Scanner; // Import Scanner for input

public class L02_2DArrays {

    // Main method: program execution starts here
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ===================== ROWS & COLUMNS =====================
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        // ===================== 2D ARRAY DECLARATION =====================
        int[][] matrix = new int[rows][cols];

        // ===================== 2D ARRAY INPUT =====================
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // ===================== 2D ARRAY OUTPUT =====================
        System.out.println("\nMatrix is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // new line after each row
        }

        // ===================== SUM OF ALL ELEMENTS =====================
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println("\nSum of all elements: " + sum);

        // ===================== SEARCH AN ELEMENT =====================
        System.out.print("\nEnter element to search: ");
        int key = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Element found at position (" + i + ", " + j + ")");
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }

        // Close Scanner
        sc.close();
    }
}
