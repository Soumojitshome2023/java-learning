// File Name: L02_AccessModifiers.java
// Topic: Access Modifiers in Java

public class L02_AccessModifiers {

    // Main method: program starts here
    public static void main(String[] args) {

        AccessDemo obj = new AccessDemo();

        // Public → accessible everywhere
        System.out.println("Public value: " + obj.publicVar);

        // Protected → accessible within same package
        System.out.println("Protected value: " + obj.protectedVar);

        // Default → accessible within same package
        System.out.println("Default value: " + obj.defaultVar);

        // Private → NOT accessible outside the class
        // System.out.println(obj.privateVar); // Compile-time error
        // Access private variable using public method
        obj.showPrivate();
    }
}

// ===================== ACCESS DEMO CLASS =====================
class AccessDemo {

    // ===================== ACCESS MODIFIERS =====================
    public int publicVar = 10;       // Accessible everywhere
    protected int protectedVar = 20; // Same package / subclass
    int defaultVar = 30;             // Same package only
    private int privateVar = 40;     // Same class only

    // Public method to access private variable
    public void showPrivate() {
        System.out.println("Private value (via method): " + privateVar);
    }
}
