package MultiThreading.ThreadPoolAssignment;


import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class MyThreadPool {

    private BlockingQueue<Runnable> taskQueue;
    private Thread[] workers;
    private boolean isShutdown = false;

    // Special task used to stop worker threads
    private final Runnable STOP = () -> {};

    public MyThreadPool(int numberOfThreads) {

        taskQueue = new LinkedBlockingQueue<>();
        workers = new Thread[numberOfThreads];

        // Create and start worker threads
        for (int i = 0; i < numberOfThreads; i++) {

            workers[i] = new Thread(() -> {

                while (true) {
                    try {
                        Runnable task = taskQueue.take();

                        // Stop worker if STOP task is received
                        if (task == STOP) {
                            break;
                        }

                        task.run();

                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        break;

                    } catch (RuntimeException e) {
                        System.out.println("Task failed: " + e.getMessage());
                    }
                }
            });

            workers[i].start();
        }
    }

    // Submit a task to the thread pool
    public synchronized void submit(Runnable task) {

        if (isShutdown) {
            throw new IllegalStateException(
                "Thread pool is already shut down"
            );
        }

        taskQueue.add(task);
    }

    // Stop the thread pool after completing submitted tasks
    public synchronized void shutdown() {

        if (isShutdown) {
            return;
        }

        isShutdown = true;

        // Add one STOP task for every worker
        for (int i = 0; i < workers.length; i++) {
            taskQueue.add(STOP);
        }
    }

    // Wait until all worker threads finish
    public void awaitTermination() {

        for (Thread worker : workers) {
            try {
                worker.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}
