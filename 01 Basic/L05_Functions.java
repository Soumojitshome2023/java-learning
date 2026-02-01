// File Name: L05_Functions.java
// Topic: Functions (Methods) in Java

import java.util.Scanner; // Import Scanner for input

public class L05_Functions {

    // ===================== MAIN METHOD =====================
    // Program execution starts here
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input for addition
        System.out.print("Enter two numbers for addition: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Calling add function
        int sum = add(a, b);
        System.out.println("Sum = " + sum);

        // Calling function with no parameters
        greet();

        // Calling function with return type
        int squareResult = square(a);
        System.out.println("Square of " + a + " = " + squareResult);

        // Calling function with boolean return type
        System.out.println("Is " + a + " even? " + isEven(a));

        sc.close();
    }

    // ===================== FUNCTION WITH PARAMETERS & RETURN =====================
    // This function takes two integers and returns their sum
    static int add(int x, int y) {
        return x + y;
    }

    // ===================== FUNCTION WITH NO PARAMETERS =====================
    // This function does not take input and does not return anything
    static void greet() {
        System.out.println("Hello! Welcome to Java Functions.");
    }

    // ===================== FUNCTION WITH SINGLE PARAMETER =====================
    // Returns square of a number
    static int square(int n) {
        return n * n;
    }

    // ===================== FUNCTION RETURNING BOOLEAN =====================
    // Checks whether a number is even or not
    static boolean isEven(int n) {
        return n % 2 == 0;
    }
}
