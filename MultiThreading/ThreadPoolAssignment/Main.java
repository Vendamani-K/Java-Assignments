package MultiThreading.ThreadPoolAssignment;


public class Main {

    public static void main(String[] args) {

        // Create a thread pool with 3 worker threads
        MyThreadPool pool = new MyThreadPool(3);

        // Submit 5 tasks
        for (int i = 1; i <= 5; i++) {

            final int taskNumber = i;

            pool.submit(() -> {

                System.out.println(
                    "Task " + taskNumber +
                    " started by " +
                    Thread.currentThread().getName()
                );

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }

                System.out.println(
                    "Task " + taskNumber + " completed"
                );
            });
        }

        // Stop accepting new tasks
        pool.shutdown();

        // Wait for all tasks to finish
        pool.awaitTermination();

        System.out.println("All tasks completed!");
    }
}
