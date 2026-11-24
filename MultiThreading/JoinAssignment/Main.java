package MultiThreading.JoinAssignment;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        // Create three threads
        TaskThread thread1 = new TaskThread("Downloading file");
        TaskThread thread2 = new TaskThread("Processing file");
        TaskThread thread3 = new TaskThread("Displaying result");

        // Execute Thread 1
        thread1.start();
        thread1.join();

        // Execute Thread 2 after Thread 1 finishes
        thread2.start();
        thread2.join();

        // Execute Thread 3 after Thread 2 finishes
        thread3.start();
        thread3.join();

        System.out.println("All tasks completed successfully!");
    }
}
