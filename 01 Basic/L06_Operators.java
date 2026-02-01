// File Name: L06_Operators.java
// Topic: Operators in Java

import java.util.Scanner; // Import Scanner for input

public class L06_Operators {

    // Main method: program execution starts here
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ===================== ARITHMETIC OPERATORS =====================
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("\n--- Arithmetic Operators ---");
        System.out.println("Addition (+): " + (a + b));
        System.out.println("Subtraction (-): " + (a - b));
        System.out.println("Multiplication (*): " + (a * b));
        System.out.println("Division (/): " + (a / b));
        System.out.println("Modulus (%): " + (a % b));

        // ===================== RELATIONAL OPERATORS =====================
        System.out.println("\n--- Relational Operators ---");
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));

        // ===================== LOGICAL OPERATORS =====================
        System.out.println("\n--- Logical Operators ---");
        boolean x = true;
        boolean y = false;

        System.out.println("x && y : " + (x && y)); // AND
        System.out.println("x || y : " + (x || y)); // OR
        System.out.println("!x     : " + (!x));     // NOT

        // ===================== ASSIGNMENT OPERATORS =====================
        System.out.println("\n--- Assignment Operators ---");
        int c = 10;
        System.out.println("Initial c = " + c);

        c += 5;  // c = c + 5
        System.out.println("c += 5  -> " + c);

        c -= 3;  // c = c - 3
        System.out.println("c -= 3  -> " + c);

        c *= 2;  // c = c * 2
        System.out.println("c *= 2  -> " + c);

        // ===================== UNARY OPERATORS =====================
        System.out.println("\n--- Unary Operators ---");
        int d = 5;

        System.out.println("d = " + d);
        System.out.println("++d (pre-increment): " + (++d));
        System.out.println("d++ (post-increment): " + (d++));
        System.out.println("After d++ : " + d);

        System.out.println("--d (pre-decrement): " + (--d));
        System.out.println("d-- (post-decrement): " + (d--));
        System.out.println("After d-- : " + d);

        // ===================== BITWISE OPERATORS =====================
        System.out.println("\n--- Bitwise Operators ---");
        int p = 5;  // 0101
        int q = 3;  // 0011

        System.out.println("p & q : " + (p & q)); // AND
        System.out.println("p | q : " + (p | q)); // OR
        System.out.println("p ^ q : " + (p ^ q)); // XOR
        System.out.println("~p    : " + (~p));    // NOT

        // Close Scanner
        sc.close();
    }
}
