// File Name: L03_ConditionalStatements.java
// Topic: Conditional Statements in Java (if, if-else, else-if, switch)

import java.util.Scanner; // Import Scanner for input

public class L03_ConditionalStatements {

    // Main method: program execution starts here
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // ===================== IF STATEMENT =====================
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // if condition checks true or false
        if (num > 0) {
            System.out.println("The number is positive");
        }

        // ===================== IF-ELSE STATEMENT =====================
        System.out.print("\nEnter your age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }

        // ===================== ELSE-IF LADDER =====================
        System.out.print("\nEnter your marks: ");
        int marks = sc.nextInt();

        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 75) {
            System.out.println("Grade: B");
        } else if (marks >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }

        // ===================== SWITCH STATEMENT =====================
        System.out.print("\nEnter day number (1-7): ");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number");
        }

        // Close Scanner
        sc.close();
    }
}
