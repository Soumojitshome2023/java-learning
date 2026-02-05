// File Name: L01_HelloWorld.java
// Topic: Hello World in Java

public class L01_HelloWorld {

    // Main method: entry point of Java program
    public static void main(String[] args) {

        // println: prints text and moves to a new line
        System.out.println("Hello, World!");

        // print: prints text without moving to a new line
        System.out.print("Hello");
        System.out.print(" Java");

        // Move to next line manually
        System.out.println();

        // printf: formatted output
        String language = "Java";
        int year = 2026;

        System.out.printf("I am learning %s in %d.%n", language, year);
        System.out.format("I am learning %s in %d.%n", language, year);
    }
}
