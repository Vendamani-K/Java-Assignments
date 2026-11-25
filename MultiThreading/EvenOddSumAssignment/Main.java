package MultiThreading.EvenOddSumAssignment;


public class Main {

    public static void main(String[] args) throws InterruptedException {

        // Create three threads
        EvenThread evenThread = new EvenThread();
        OddThread oddThread = new OddThread();
        SumThread sumThread = new SumThread();

        // First thread: Print even numbers
        evenThread.start();
        evenThread.join();

        // Second thread: Print odd numbers
        oddThread.start();
        oddThread.join();

        // Third thread: Calculate total sum
        sumThread.start();
        sumThread.join();

        System.out.println("All threads completed!");
    }
}
