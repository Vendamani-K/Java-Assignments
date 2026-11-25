package MultiThreading.MethodAccessAssignment;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        // Create one shared counter object
        AccessCounter counter = new AccessCounter();

        // Number of threads
        int numberOfThreads = 5;

        // Each thread calls the method 1000 times
        int iterations = 1000;

        WorkerThread[] threads = new WorkerThread[numberOfThreads];

        // Create and start all threads
        for (int i = 0; i < numberOfThreads; i++) {

            threads[i] = new WorkerThread(counter, iterations);

            threads[i].start();
        }

        // Wait for all threads to finish
        for (int i = 0; i < numberOfThreads; i++) {

            threads[i].join();
        }

        // Display final count
        System.out.println("Total method accesses: " + counter.getCount());

        System.out.println("Expected count: " +
                (numberOfThreads * iterations));
    }
}
