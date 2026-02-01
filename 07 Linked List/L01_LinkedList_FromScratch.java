// File Name: L01_LinkedList_FromScratch.java
// Topic: Singly Linked List Implementation from Scratch

public class L01_LinkedList_FromScratch {

    // ===================== NODE CLASS =====================
    // Each node contains data and reference to next node
    static class Node {

        int data;
        Node next;

        // Constructor
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // ===================== LINKED LIST CLASS =====================
    static class LinkedList {

        Node head;   // first node
        Node tail;   // last node
        int size;    // number of nodes

        // ===================== ADD AT FIRST =====================
        public void addFirst(int data) {
            Node newNode = new Node(data);
            size++;

            if (head == null) {
                head = tail = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }

        // ===================== ADD AT LAST =====================
        public void addLast(int data) {
            Node newNode = new Node(data);
            size++;

            if (head == null) {
                head = tail = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;
        }

        // ===================== ADD AT GIVEN INDEX =====================
        public void addAtIndex(int idx, int data) {

            if (idx == 0) {
                addFirst(data);
                return;
            }

            Node newNode = new Node(data);
            size++;

            Node temp = head;
            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;
            }

            newNode.next = temp.next;
            temp.next = newNode;
        }

        // ===================== REMOVE FIRST =====================
        public int removeFirst() {

            if (size == 0) {
                System.out.println("List is empty");
                return -1;
            }

            int val = head.data;
            head = head.next;
            size--;

            if (size == 0) {
                tail = null;
            }

            return val;
        }

        // ===================== REMOVE LAST =====================
        public int removeLast() {

            if (size == 0) {
                System.out.println("List is empty");
                return -1;
            }

            if (size == 1) {
                int val = head.data;
                head = tail = null;
                size = 0;
                return val;
            }

            Node prev = head;
            for (int i = 0; i < size - 2; i++) {
                prev = prev.next;
            }

            int val = tail.data;
            prev.next = null;
            tail = prev;
            size--;

            return val;
        }

        // ===================== SEARCH =====================
        public int search(int key) {

            Node temp = head;
            int idx = 0;

            while (temp != null) {
                if (temp.data == key) {
                    return idx;
                }
                temp = temp.next;
                idx++;
            }

            return -1; // not found
        }

        // ===================== PRINT LINKED LIST =====================
        public void print() {

            Node temp = head;

            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }

            System.out.println("null");
        }

        // ===================== SIZE =====================
        public int size() {
            return size;
        }

        // ===================== REVERSE LINKED LIST =====================
        // Reverses the linked list iteratively
        public void reverse() {

            Node prev = null;
            Node curr = head;
            Node next;

            // Tail will become head after reverse
            tail = head;

            while (curr != null) {
                next = curr.next;   // store next node
                curr.next = prev;   // reverse link
                prev = curr;        // move prev forward
                curr = next;        // move curr forward
            }

            head = prev; // update head
        }

        // ===================== REVERSE LINKED LIST (RECURSION) =====================
        public void reverseRecursion() {
            head = reverseHelper(head);
        }

        // Helper function
        private Node reverseHelper(Node curr) {

            // Base case: empty list or last node
            if (curr == null || curr.next == null) {
                tail = curr; // last node becomes new tail
                return curr;
            }

            // Reverse the rest of the list
            Node newHead = reverseHelper(curr.next);

            // Fix the current node
            curr.next.next = curr;
            curr.next = null;

            return newHead;
        }

    }

    // ===================== MAIN METHOD =====================
    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        ll.addFirst(10);
        ll.addFirst(20);
        ll.addLast(30);
        ll.addLast(40);

        ll.print();   // 20 -> 10 -> 30 -> 40 -> null

        ll.addAtIndex(2, 25);
        ll.print();   // 20 -> 10 -> 25 -> 30 -> 40 -> null

        ll.removeFirst();
        ll.print();

        ll.removeLast();
        ll.print();

        System.out.println("Index of 25: " + ll.search(25));
        System.out.println("Size: " + ll.size());

        ll.reverse();
        ll.print();

        ll.reverseRecursion();
        ll.print();

    }
}
