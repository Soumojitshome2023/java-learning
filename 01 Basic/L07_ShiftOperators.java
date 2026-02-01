// File Name: L07_ShiftOperators.java
// Topic: Left Shift (<<) and Right Shift (>>) Operators in Java

import java.util.Scanner; // Import Scanner for input

public class L07_ShiftOperators {

    // Main method: program execution starts here
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ===================== INPUT =====================
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.print("Enter shift value: ");
        int shift = sc.nextInt();

        // ===================== LEFT SHIFT =====================
        // Left shift moves bits to the LEFT
        // Formula: num << k = num * (2^k)
        int leftShift = num << shift;

        System.out.println("\n--- Left Shift (<<) ---");
        System.out.println(num + " << " + shift + " = " + leftShift);

        // ===================== RIGHT SHIFT =====================
        // Right shift moves bits to the RIGHT
        // Formula: num >> k = num / (2^k)
        int rightShift = num >> shift;

        System.out.println("\n--- Right Shift (>>) ---");
        System.out.println(num + " >> " + shift + " = " + rightShift);

        sc.close();
    }
}
