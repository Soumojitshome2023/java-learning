// File Name: L04_Loops.java
// Topic: Loops in Java (for, while, do-while)

import java.util.Scanner; // Import Scanner for input

public class L04_Loops {

    // Main method: program starts here
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // ===================== FOR LOOP =====================
        // Used when number of iterations is known
        System.out.print("Enter a number for FOR loop: ");
        int n = sc.nextInt();

        System.out.println("For Loop Output:");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // ===================== WHILE LOOP =====================
        // Used when condition is checked before execution
        System.out.print("\nEnter a number for WHILE loop: ");
        int m = sc.nextInt();

        System.out.println("While Loop Output:");
        int i = 1;
        while (i <= m) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        // ===================== DO-WHILE LOOP =====================
        // Executes at least once, condition checked after execution
        System.out.print("\nEnter a number for DO-WHILE loop: ");
        int k = sc.nextInt();

        System.out.println("Do-While Loop Output:");
        int j = 1;
        do {
            System.out.print(j + " ");
            j++;
        } while (j <= k);

        // Close Scanner
        sc.close();
    }
}
