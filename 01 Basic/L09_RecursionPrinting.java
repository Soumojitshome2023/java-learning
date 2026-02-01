// File: L09_RecursionPrinting.java
// This program demonstrates recursion using simple printing

class L09_RecursionPrinting {

    // Recursive function to print numbers from n to 1
    static void printNumbers(int n) {

        // Base condition: stop when n becomes 0
        if (n == 0) {
            return;
        }

        // Print the current number
        System.out.println(n);

        // Recursive call with smaller value
        printNumbers(n - 1);
    }

    public static void main(String[] args) {

        int number = 5;

        // Calling the recursive function
        printNumbers(number);
    }
}
