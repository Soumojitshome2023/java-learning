// File Name: L01_QueueUsingArray.java
// Topic: Queue Implementation using Array (Manual)

public class L01_QueueUsingArray {

    static class Queue {

        int[] arr;
        int front = 0;
        int rear = -1;
        int size;

        // Constructor
        Queue(int n) {
            arr = new int[n];
            size = n;
        }

        // ===================== ENQUEUE =====================
        public void enqueue(int data) {
            if (rear == size - 1) {
                System.out.println("Queue Overflow");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        // ===================== DEQUEUE =====================
        public int dequeue() {
            if (front > rear) {
                System.out.println("Queue Underflow");
                return -1;
            }
            return arr[front++];
        }

        // ===================== PEEK =====================
        public int peek() {
            if (front > rear) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }

        // ===================== PRINT =====================
        public void print() {
            System.out.print("Queue: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.print();
        System.out.println("Removed: " + q.dequeue());
        q.print();
    }
}
