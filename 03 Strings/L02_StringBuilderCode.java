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
    }
}
