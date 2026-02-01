// File Name: L01_Arrays.java
// Topic: Arrays in Java (1D Array)

import java.util.Scanner; // Import Scanner for input

public class L01_Arrays {

    // Main method: program starts here
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ===================== ARRAY DECLARATION =====================
        // Ask user for array size
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();

        // Declare array of size n
        int[] arr = new int[n];

        // ===================== ARRAY INPUT =====================
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // store value at index i
        }

        // ===================== ARRAY OUTPUT =====================
        System.out.println("\nArray elements are:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // ===================== SUM OF ARRAY ELEMENTS =====================
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of array elements: " + sum);

        // ===================== FIND MAX ELEMENT =====================
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum element: " + max);

        // ===================== FIND MIN ELEMENT =====================
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum element: " + min);

        // ===================== HARDCODED ARRAY =====================
        // Array with predefined values
        int[] hardcodedArr = {10, 20, 30, 40, 50};

        System.out.println("\nHardcoded array elements:");
        for (int i = 0; i < hardcodedArr.length; i++) {
            System.out.print(hardcodedArr[i] + " ");
        }
        System.out.println();

        // Close Scanner
        sc.close();
    }
}
