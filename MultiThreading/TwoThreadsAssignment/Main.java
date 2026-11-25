package MultiThreading.TwoThreadsAssignment;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        // Create Thread 1: Print 1 to 5
        NumberThread thread1 = new NumberThread("Thread-1", 1, 5);

        // Create Thread 2: Print 6 to 10
        NumberThread thread2 = new NumberThread("Thread-2", 6, 10);

        // Start both threads
        thread1.start();
        thread2.start();

        // Wait for both threads to complete
        thread1.join();
        thread2.join();

        System.out.println("Both threads completed!");
    }
}
