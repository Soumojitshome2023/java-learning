// File Name: L02_InputInJava.java
// Topic: Input in Java using Scanner

import java.util.Scanner; // Import Scanner class for input

public class L02_InputInJava {

    // Main method: program starts here
    public static void main(String[] args) {

        // Create Scanner object to take input from keyboard
        Scanner sc = new Scanner(System.in);

        // Taking String input
        System.out.print("Enter your name: ");
        String name = sc.nextLine(); // Reads full line

        // Taking integer input
        System.out.print("Enter your age: ");
        int age = sc.nextInt(); // Reads integer

        // Taking double input
        System.out.print("Enter your percentage: ");
        double percentage = sc.nextDouble(); // Reads decimal value

        // Output the input values
        System.out.println("\n--- User Details ---");
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Percentage : " + percentage);

        // Close the Scanner (good practice)
        sc.close();
    }
}
