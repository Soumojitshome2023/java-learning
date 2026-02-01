// File Name: L02_QueueUsingLinkedList.java
// Topic: Queue Implementation using Linked List (Manual)

public class L02_QueueUsingLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        Node front, rear;

        // ===================== ENQUEUE =====================
        public void enqueue(int data) {
            Node newNode = new Node(data);

            if (rear == null) {
                front = rear = newNode;
                return;
            }

            rear.next = newNode;
            rear = newNode;
        }

        // ===================== DEQUEUE =====================
        public int dequeue() {
            if (front == null) {
                System.out.println("Queue Underflow");
                return -1;
            }

            int val = front.data;
            front = front.next;

            if (front == null) {
                rear = null;
            }

            return val;
        }

        // ===================== PEEK =====================
        public int peek() {
            if (front == null) {
                System.out.println("Queue is empty");
                return -1;
            }
            return front.data;
        }

        // ===================== PRINT =====================
        public void print() {
            Node temp = front;
            System.out.print("Queue: ");
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.print();
        System.out.println("Removed: " + q.dequeue());
        q.print();
    }
}
