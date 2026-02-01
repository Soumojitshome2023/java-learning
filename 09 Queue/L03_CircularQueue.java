// File Name: L03_CircularQueue.java
// Topic: Circular Queue Implementation using Array

public class L03_CircularQueue {

    static class Queue {
        int[] arr;
        int front = -1;
        int rear = -1;
        int size;

        Queue(int n) {
            arr = new int[n];
            size = n;
        }

        // ===================== IS EMPTY =====================
        public boolean isEmpty() {
            return front == -1;
        }

        // ===================== IS FULL =====================
        public boolean isFull() {
            return (rear + 1) % size == front;
        }

        // ===================== ENQUEUE =====================
        public void enqueue(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }

            if (front == -1) {
                front = 0;
            }

            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // ===================== DEQUEUE =====================
        public int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            int val = arr[front];

            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % size;
            }

            return val;
        }

        // ===================== PRINT =====================
        public void print() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }

            System.out.print("Queue: ");
            int i = front;
            while (true) {
                System.out.print(arr[i] + " ");
                if (i == rear) break;
                i = (i + 1) % size;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

        q.print();
        q.dequeue();
        q.enqueue(50);
        q.print();
    }
}
