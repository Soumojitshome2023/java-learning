// File Name: L01_Strings.java
// Topic: Strings in Java

import java.util.Scanner; // Import Scanner for input

public class L01_Strings {

    // Main method: program execution starts here
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ===================== STRING INPUT USING nextLine() =====================
        // Reads full line including spaces
        System.out.print("Enter a string (nextLine): ");
        String str = sc.nextLine();

        // ===================== STRING OUTPUT =====================
        System.out.println("\nYou entered: " + str);

        // ===================== STRING LENGTH =====================
        System.out.println("Length of string: " + str.length());

        // ===================== CHARACTER AT INDEX =====================
        System.out.println("Character at index 0: " + str.charAt(0));

        // ===================== STRING CONCATENATION =====================
        System.out.print("\nEnter another string: ");
        String str2 = sc.nextLine();

        String result = str.concat(" ").concat(str2);
        System.out.println("After concatenation: " + result);

        // ===================== STRING INPUT USING next() =====================
        // Reads only ONE word (stops at space)
        System.out.print("\nEnter a single word (next): ");
        String singleWord = sc.next();   // <-- use of next()

        System.out.println("Word entered using next(): " + singleWord);

        // ===================== next() vs nextLine() =====================
        System.out.print("\nEnter a single word (next): ");
        String word = sc.next(); // reads only one word
        System.out.println("Word entered using next(): " + word);

        sc.nextLine(); // consume leftover newline

        // ===================== STRING COMPARISON =====================
        System.out.print("\nEnter a string to compare: ");
        String str3 = sc.nextLine();

        if (str.equals(str3)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are NOT equal");
        }

        // ===================== STRING COMPARISON using compareTo() =====================
        // compareTo() compares strings lexicographically
        System.out.print("\nEnter a string to compare using compareTo(): ");
        String str4 = sc.nextLine();

        int cmp = str.compareTo(str4);

        if (cmp == 0) {
            System.out.println("Strings are equal (compareTo = 0)");
        } else if (cmp > 0) {
            System.out.println("First string is greater than second (compareTo > 0)");
        } else {
            System.out.println("First string is smaller than second (compareTo < 0)");
        }

        // ===================== SUBSTRING =====================
        System.out.println("\nSubstring (0 to 4): " + str.substring(0, 4));

        // ===================== CASE CONVERSION =====================
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());

        // ===================== STRING SPLIT =====================
        // split() breaks string into parts based on delimiter
        System.out.println("\n--- Using split() ---");

        // Splitting sentence by space
        String[] words = str.split(" ");

        System.out.println("Words in the sentence:");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }

        // Example: split using comma
        String data = "Java,Python,C++,JavaScript";
        String[] languages = data.split(",");

        System.out.println("\nLanguages list:");
        for (String lang : languages) {
            System.out.println(lang);
        }

        // Close Scanner
        sc.close();
    }
}
