// File Name: L05_QueueUsingCollection.java
// Topic: Queue in Java (Collection)

// import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class L05_QueueUsingCollection {

    // ===================== MAIN METHOD =====================
    public static void main(String[] args) {

        // ===================== QUEUE USING JAVA COLLECTION =====================
        // Queue follows FIFO (First In First Out)
        // Queue<Integer> q = new ArrayDeque<>();
        Queue<Integer> q = new LinkedList<>();

        // -------- ENQUEUE (add) --------
        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println("Queue (Collection): " + q);

        // -------- PEEK --------
        System.out.println("Front element (peek): " + q.peek());

        // -------- DEQUEUE (remove) --------
        System.out.println("Removed element: " + q.remove());
        System.out.println("Queue after remove: " + q);

        // -------- IS EMPTY --------
        System.out.println("Is queue empty? " + q.isEmpty());
    }
}
