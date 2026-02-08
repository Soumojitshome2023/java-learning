// File Name: L02_StringBuilderCode.java
// Topic: StringBuilder in Java

public class L02_StringBuilderCode {

    // Main method: program execution starts here
    public static void main(String[] args) {

        // ===================== STRING vs STRINGBUILDER =====================
        // String is immutable (cannot be changed)
        // StringBuilder is mutable (can be changed)
        // ===================== CREATING STRINGBUILDER =====================
        StringBuilder sb = new StringBuilder("Hello");

        System.out.println("Initial StringBuilder: " + sb);

        // ===================== APPEND =====================
        // Adds text at the end
        sb.append(" World");
        System.out.println("After append: " + sb);

        // ===================== INSERT =====================
        // Inserts text at given index
        sb.insert(5, ",");
        System.out.println("After insert: " + sb);

        // ===================== DELETE =====================
        // Deletes characters from start index to end index (end not included)
        sb.delete(5, 6);
        System.out.println("After delete: " + sb);

        // ===================== Remove first character =====================
        sb.deleteCharAt(0);
        System.out.println("After removing first character: " + sb);

        // ===================== charAt() =====================
        // Returns character at a given index
        char ch = sb.charAt(1);
        System.out.println("Character at index 1: " + ch);

        // ===================== SET CHARACTER =====================
        // Changes character at a specific index
        sb.setCharAt(0, 'h');
        System.out.println("After setCharAt: " + sb);

        // ===================== REVERSE =====================
        // Reverses the string
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // ===================== LENGTH =====================
        // Returns length of StringBuilder
        System.out.println("Length: " + sb.length());

        // ===================== CONVERT TO STRING =====================
        // Convert StringBuilder to String
        String finalString = sb.toString();
        System.out.println("Converted to String: " + finalString);

        // ===================== FIND INDEX OF A CHARACTER =====================
        // Find index of a character
        int index1 = sb.indexOf("o");
        System.out.println("Index of 'o': " + index1);

        // Find index of a character after a specific index
        int index2 = sb.indexOf("o", 5);
        System.out.println("Index of 'o' after index 5: " + index2);

        // ===================== CLEAR STRINGBUILDER =====================
        // Removes all characters from StringBuilder
        StringBuilder sb4 = new StringBuilder("Hello World");

        System.out.println("\nBefore clear: " + sb4);

        // Method 1: delete all characters
        sb4.delete(0, sb4.length());
        System.out.println("After clear (delete): " + sb4);

        // Method 2: set length to 0
        sb4.setLength(0);
        System.out.println("After clear (setLength): " + sb4);

    }
}
