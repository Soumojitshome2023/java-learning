// File: L08_TypeCasting.java
// This program demonstrates different type casting and type conversion examples in Java

class L08_TypeCasting {

    public static void main(String[] args) {

        // ===================== int to double =====================
        int a = 25;
        double b = a; // implicit casting

        System.out.println("int to double:");
        System.out.println(b);

        // ===================== double to int =====================
        double x = 45.78;
        int y = (int) x; // explicit casting

        System.out.println("\ndouble to int:");
        System.out.println(y);

        // ===================== int to String =====================
        int num = 100;
        String strNum = Integer.toString(num);

        System.out.println("\nint to String:");
        System.out.println(strNum);

        // ===================== double to String =====================
        double price = 99.99;
        String strPrice = Double.toString(price);

        System.out.println("\ndouble to String:");
        System.out.println(strPrice);

        // ===================== long to String =====================
        long bigNum = 123456789L;
        String strLong = Long.toString(bigNum);

        System.out.println("\nlong to String:");
        System.out.println(strLong);

        // ===================== String to int =====================
        String str1 = "123";
        int n1 = Integer.parseInt(str1);

        System.out.println("\nString to int:");
        System.out.println(n1);

        // ===================== String to double =====================
        String str2 = "56.78";
        double n2 = Double.parseDouble(str2);

        System.out.println("\nString to double:");
        System.out.println(n2);

        // ===================== String to long =====================
        String str3 = "987654321";
        long n3 = Long.parseLong(str3);

        System.out.println("\nString to long:");
        System.out.println(n3);

        // ===================== char to int (ASCII value) =====================
        char ch = 'A';
        int asciiValue = ch;

        System.out.println("\nchar to int (ASCII value):");
        System.out.println(asciiValue);

        // ===================== char digit to int (numeric value) =====================
        char digit = '7';
        int digitValue = digit - '0';

        System.out.println("\nchar digit to int:");
        System.out.println(digitValue);

        // ===================== char to long =====================
        char ch2 = 'B';
        long longValue = ch2;

        System.out.println("\nchar to long:");
        System.out.println(longValue);

        // ===================== int to char (ASCII value) =====================
        int ascii = 65;
        char ch1 = (char) ascii;   // explicit casting using ASCII value

        System.out.println("\nint to char (ASCII value):");
        System.out.println(ch1);  // Output: A

        // ===================== int to char (digit to character) =====================
        int digit2 = 7;
        char ch3 = (char) (digit2 + '0');  // converting numeric digit to character

        System.out.println("\nint to char (digit character):");
        System.out.println(ch3);  // Output: 7

        // ===================== long to char =====================
        long asciiLong = 67;
        char character2 = (char) asciiLong;

        System.out.println("\nlong to char:");
        System.out.println(character2);

        // ===================== char to String =====================
        char ch4 = 'Z';
        String strChar = Character.toString(ch4);
        // OR: String strChar = String.valueOf(ch4);

        System.out.println("\nchar to String:");
        System.out.println(strChar);

    }
}
