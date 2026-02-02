// File Name: L11_Math.java
// Topic: Math class in Java

public class L11_Math {

    // Main method: program execution starts here
    public static void main(String[] args) {

        // ===================== BASIC Math METHODS =====================
        int a = 10;
        int b = 3;

        // Absolute value
        System.out.println("Absolute value of -10: " + Math.abs(-10));

        // Maximum and Minimum
        System.out.println("Maximum of a and b: " + Math.max(a, b));
        System.out.println("Minimum of a and b: " + Math.min(a, b));

        // Power (a raised to b)
        System.out.println("a power b: " + Math.pow(a, b));

        // Square root
        System.out.println("Square root of 25: " + Math.sqrt(25));

        // ===================== ROUNDING METHODS =====================
        double num = 4.6;

        // Round to nearest integer
        System.out.println("Round: " + Math.round(num));

        // Round down
        System.out.println("Floor: " + Math.floor(num));

        // Round up
        System.out.println("Ceil: " + Math.ceil(num));

        // ===================== RANDOM NUMBER =====================
        // Generates a random number between 0.0 and 1.0
        System.out.println("Random number: " + Math.random());
    }
}
