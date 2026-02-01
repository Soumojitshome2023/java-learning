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

        // ===================== char to int =====================
        char ch = 'A';
        int asciiValue = ch;

        System.out.println("\nchar to int (ASCII value):");
        System.out.println(asciiValue);

        // ===================== int to char =====================
        int ascii = 66;
        char character = (char) ascii;

        System.out.println("\nint to char:");
        System.out.println(character);
    }
}
