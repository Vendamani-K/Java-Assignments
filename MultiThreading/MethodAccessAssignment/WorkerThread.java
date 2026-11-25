package MultiThreading.MethodAccessAssignment;


public class WorkerThread extends Thread {

    private AccessCounter counter;
    private int iterations;

    public WorkerThread(AccessCounter counter, int iterations) {

        this.counter = counter;
        this.iterations = iterations;
    }

    @Override
    public void run() {

        for (int i = 0; i < iterations; i++) {

            counter.accessMethod();
        }
    }
}
