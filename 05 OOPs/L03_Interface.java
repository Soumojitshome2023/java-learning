// File Name: L03_Interface.java
// Topic: Interface in Java

public class L03_Interface {

    // Main method: program starts here
    public static void main(String[] args) {

        // Creating object of class that implements interface
        Calculator calc = new SimpleCalculator();

        // Calling interface methods
        System.out.println("Addition: " + calc.add(10, 5));
        System.out.println("Subtraction: " + calc.subtract(10, 5));
    }
}

// ===================== INTERFACE =====================
// Interface is a blueprint of a class
// It contains abstract methods by default
interface Calculator {

    // Methods are public and abstract by default
    int add(int a, int b);

    int subtract(int a, int b);
}

// ===================== IMPLEMENTING INTERFACE =====================
class SimpleCalculator implements Calculator {

    // Must implement ALL methods of interface
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }
}
