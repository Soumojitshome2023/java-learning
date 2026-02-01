// File Name: L03_LinkedList.java
// Topic: LinkedList in Java

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class L03_LinkedList {

    // Main method: program starts here
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ===================== CREATE LINKEDLIST =====================
        // LinkedList implements List interface
        LinkedList<Integer> list = new LinkedList<>();

        // ===================== ADD ELEMENTS =====================
        System.out.print("Enter number of elements to add: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt()); // add at end
        }

        // ===================== PRINT LINKEDLIST =====================
        System.out.println("\nLinkedList elements: " + list);

        // ===================== ADD AT FIRST =====================
        list.addFirst(100);
        System.out.println("After addFirst(100): " + list);

        // ===================== ADD AT LAST =====================
        list.addLast(200);
        System.out.println("After addLast(200): " + list);

        // ===================== ADD AT GIVEN INDEX =====================
        System.out.print("\nEnter index to add element: ");
        int index = sc.nextInt();

        System.out.print("Enter element to add at index " + index + ": ");
        int element = sc.nextInt();

        list.add(index, element);
        System.out.println("After adding at index " + index + ": " + list);

        // ===================== GET ELEMENT =====================
        System.out.println("\nFirst element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());
        System.out.println("Element at index 2: " + list.get(2));

        // ===================== REMOVE ELEMENTS =====================
        list.removeFirst();
        System.out.println("\nAfter removeFirst(): " + list);

        list.removeLast();
        System.out.println("After removeLast(): " + list);

        list.remove(1); // remove by index
        System.out.println("After remove index 1: " + list);

        // ===================== SIZE =====================
        System.out.println("\nSize of LinkedList: " + list.size());

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

        // ===================== BUILT-IN REVERSE =====================
        System.out.println("Before reverse: " + list);
        Collections.reverse(list);
        System.out.println("After reverse: " + list);

        sc.close();
    }
}
