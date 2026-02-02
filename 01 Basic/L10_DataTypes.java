// L10_DataTypes.java
// This program demonstrates basic data types in Java

public class L10_DataTypes {

    public static void main(String[] args) {

        // ===================== Primitive Data Types =====================
        // Integer types
        byte smallNumber = 10;        // 1 byte
        short shortNumber = 200;      // 2 bytes
        int normalNumber = 1000;      // 4 bytes (most commonly used)
        long bigNumber = 100000L;     // 8 bytes (L suffix is required)

        // Decimal (floating-point) types
        float price = 99.99f;         // 4 bytes (f suffix is required)
        double pi = 3.14159;          // 8 bytes (default for decimals)

        // Character type
        char grade = 'A';             // Stores a single character

        // Boolean type
        boolean isJavaFun = true;     // Stores true or false

        // ===================== Printing Values =====================
        System.out.println("Byte value: " + smallNumber);
        System.out.println("Short value: " + shortNumber);
        System.out.println("Int value: " + normalNumber);
        System.out.println("Long value: " + bigNumber);

        System.out.println("Float value: " + price);
        System.out.println("Double value: " + pi);

        System.out.println("Char value: " + grade);
        System.out.println("Boolean value: " + isJavaFun);
    }
}
