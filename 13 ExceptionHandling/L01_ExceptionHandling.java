// File: L01_ExceptionHandling.java
// This program demonstrates basic exception handling in Java
// It covers: try, catch, finally, and multiple catch blocks

class L01_ExceptionHandling {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        try {
            // Code that may cause an exception
            System.out.println("Trying to divide numbers...");
            int result = a / b;   // ArithmeticException
            System.out.println("Result: " + result);
        } // Handles divide by zero error
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Error: Cannot divide by zero");
        } // Handles any other unexpected exception
        catch (Exception e) {
            System.out.println("Some other error occurred");
        } // finally block always executes
        finally {
            System.out.println("Finally block executed");
        }

        // Program continues normally
        System.out.println("Program continues normally");
    }
}
