// File Name: L01_Stack_Manual.java
// Topic: Stack Implementation from Scratch (Manual)

public class L01_Stack_Manual {

    // ===================== NODE CLASS =====================
    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // ===================== STACK CLASS =====================
    static class Stack {

        private Node top; // top of stack

        // ===================== PUSH =====================
        // Insert element at top
        public void push(int data) {
            Node newNode = new Node(data);
            newNode.next = top;
            top = newNode;
        }

        // ===================== POP =====================
        // Remove top element
        public int pop() {
            if (top == null) {
                System.out.println("Stack Underflow");
                return -1;
            }

            int val = top.data;
            top = top.next;
            return val;
        }

        // ===================== PEEK =====================
        // Return top element
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

    // ===================== MAIN METHOD =====================
    public static void main(String[] args) {

        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.print(); // 30 20 10

        System.out.println("Peek: " + stack.peek());

        System.out.println("Pop: " + stack.pop());
        stack.print();

        System.out.println("Is empty? " + stack.isEmpty());
    }
}
