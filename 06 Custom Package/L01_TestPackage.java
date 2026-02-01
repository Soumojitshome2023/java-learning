// File Name: L01_TestPackage.java
// Topic: Using (Testing) Custom Package in Java

import mypackage.L01_MyPackageClass; // importing custom package class

public class L01_TestPackage {

    public static void main(String[] args) {

        // Create object of class from custom package
        L01_MyPackageClass obj = new L01_MyPackageClass();

        // Call methods
        obj.greet();
        System.out.println("Sum = " + obj.add(5, 7));
    }
}
