package MultiThreading.JoinAssignment;

public class TaskThread extends Thread {

    private String taskName;

    public TaskThread(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {

        System.out.println(taskName + " started");

        try {
            // Simulate some work
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(taskName + " was interrupted");
            Thread.currentThread().interrupt();
            return;
        }

        System.out.println(taskName + " completed");
    }
}
