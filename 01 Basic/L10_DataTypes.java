// L10_DataTypes.java
// This program demonstrates basic data types in Java

public class L10_DataTypes {

    public static void main(String[] args) {

        // ===================== Primitive Data Types =====================
        // ===================== Integer Data Types =====================
        byte byteValue = 10;
        // Size: 1 byte (8 bits)
        // Range: -128 to 127

        short shortValue = 200;
        // Size: 2 bytes (16 bits)
        // Range: -32,768 to 32,767

        int intValue = 1000;
        // Size: 4 bytes (32 bits)
        // Range: -2^31 to (2^31 - 1)

        long longValue = 100000L;
        // Size: 8 bytes (64 bits)
        // Range: -2^63 to (2^63 - 1)

        // ===================== Decimal (Floating-Point) Data Types =====================
        float floatValue = 99.99f;
        // Size: 4 bytes (32 bits)
        // Range: ~1.4E-45 to ~3.4E38

        double doubleValue = 3.14159;
        // Size: 8 bytes (64 bits)
        // Range: ~4.9E-324 to ~1.7E308

        // ===================== Character Data Type =====================
        char charValue = 'A';
        // Size: 2 bytes
        // Range: 0 to 65,535 (Unicode characters)

        // ===================== Boolean Data Type =====================
        boolean isJavaFun = true;
        // Size: JVM dependent (generally 1 bit)
        // Range: true or false

        // ===================== Printing Values =====================
        System.out.println("Byte value: " + byteValue);
        System.out.println("Short value: " + shortValue);
        System.out.println("Int value: " + intValue);
        System.out.println("Long value: " + longValue);

        System.out.println("Float value: " + floatValue);
        System.out.println("Double value: " + doubleValue);

        System.out.println("Char value: " + charValue);
        System.out.println("Boolean value: " + isJavaFun);
    }
}
