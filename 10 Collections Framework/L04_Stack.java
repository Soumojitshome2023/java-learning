// File Name: L04_Stack.java
// Topic: Stack in Java

import java.util.Stack;

public class L04_Stack {

    // ===================== MAIN METHOD =====================
    public static void main(String[] args) {

        // ===================== STACK USING JAVA COLLECTION =====================
        // Stack follows LIFO (Last In First Out)
        Stack<Integer> stack = new Stack<>();

        // -------- PUSH --------
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack after push: " + stack);

        // -------- PEEK --------
        System.out.println("Top element (peek): " + stack.peek());

        // -------- POP --------
        int popped = stack.pop();
        System.out.println("Popped element: " + popped);
        System.out.println("Stack after pop: " + stack);

        // -------- IS EMPTY --------
        System.out.println("Is stack empty? " + stack.isEmpty());

        // ===================== STACK FROM SCRATCH =====================
        System.out.println("\n--- Stack Implementation from Scratch ---");

        MyStack myStack = new MyStack();

        myStack.push(5);
        myStack.push(15);
        myStack.push(25);

        myStack.print();

        System.out.println("Peek: " + myStack.peek());
        System.out.println("Pop: " + myStack.pop());

        myStack.print();
    }
}

/*
===================== STACK OPERATIONS =====================
push  -> add element
pop   -> remove top element
peek  -> see top element
isEmpty -> check empty
============================================================
 */
// ===================== STACK IMPLEMENTATION FROM SCRATCH =====================
class MyStack {

    // ===================== NODE =====================
    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top; // top of stack

    // ===================== PUSH =====================
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    // ===================== POP =====================
    public int pop() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        }

        int val = top.data;
        top = top.next;
        return val;
    }

    // ===================== PEEK =====================
    public int peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }

    // ===================== IS EMPTY =====================
    public boolean isEmpty() {
        return top == null;
    }

    // ===================== PRINT STACK =====================
    public void print() {
        Node temp = top;
        System.out.print("Stack (top to bottom): ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
