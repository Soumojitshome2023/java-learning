// File: L01_Multithreading.java
// This program demonstrates basic multithreading in Java
// Using Thread class

class L01_Multithreading extends Thread {

    // Code that runs when the thread starts
    public void run() {

        // Printing task for the thread
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }

    public static void main(String[] args) {

        // Creating two threads
        L01_Multithreading t1 = new L01_Multithreading();
        L01_Multithreading t2 = new L01_Multithreading();

        // Starting threads
        t1.start();
        t2.start();
    }
}
