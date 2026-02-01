// File Name: L01_ArrayList.java
// Topic: ArrayList in Java

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class L01_ArrayList {

    // Main method: program starts here
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ===================== CREATE ARRAYLIST =====================
        // ArrayList is a dynamic array (size can grow/shrink)
        ArrayList<Integer> list = new ArrayList<>();

        // ===================== ADD ELEMENTS =====================
        System.out.print("Enter number of elements to add: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt()); // add element
        }

        // ===================== PRINT ARRAYLIST =====================
        System.out.println("\nArrayList elements: " + list);

        // ===================== ADD AT GIVEN INDEX =====================
        // Syntax: add(index, element)
        System.out.print("\nEnter index to add element: ");
        int index = sc.nextInt();

        System.out.print("Enter element to add at index " + index + ": ");
        int element = sc.nextInt();

        list.add(index, element); // insert element at given index

        System.out.println("After adding at index " + index + ": " + list);

        // ===================== COLLECTIONS SORT =====================
        // Sorts the ArrayList in ascending order
        Collections.sort(list);
        System.out.println("\nAfter sorting (Collections.sort): " + list);

        // ===================== GET ELEMENT =====================
        System.out.println("Element at index 0: " + list.get(0));

        // ===================== SET / UPDATE ELEMENT =====================
        list.set(0, 100); // update value at index 0
        System.out.println("After updating index 0: " + list);

        // ===================== REMOVE ELEMENT =====================
        list.remove(1); // removes element at index 1
        System.out.println("After removing index 1: " + list);

        // ===================== SIZE =====================
        System.out.println("Size of ArrayList: " + list.size());

        // ===================== CONTAINS =====================
        System.out.print("Enter element to check: ");
        int key = sc.nextInt();

        if (list.contains(key)) {
            System.out.println(key + " is present in the list");
        } else {
            System.out.println(key + " is NOT present in the list");
        }

        // ===================== ITERATION =====================
        System.out.println("\nIterating using for-each loop:");
        for (int val : list) {
            System.out.print(val + " ");
        }
        System.out.println();

        sc.close();
    }
}
