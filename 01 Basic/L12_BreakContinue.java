// File Name: L12_BreakContinue.java
// Topic: break and continue in Java

public class L12_BreakContinue {

    // Main method: program execution starts here
    public static void main(String[] args) {

        // ===================== break statement =====================
        // break is used to exit the loop immediately
        System.out.println("Using break:");
        for (int i = 1; i <= 10; i++) {

            if (i == 5) {
                break; // loop stops when i becomes 5
            }

            System.out.println(i);
        }

        // ===================== continue statement =====================
        // continue skips the current iteration and moves to the next one
        System.out.println("\nUsing continue:");
        for (int i = 1; i <= 10; i++) {

            if (i == 5) {
                continue; // skips printing 5
            }

            System.out.println(i);
        }
    }
}
