package MultiThreading.TwoThreadsAssignment;


public class NumberThread extends Thread {

    private int start;
    private int end;

    public NumberThread(String threadName, int start, int end) {

        super(threadName);

        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {

        for (int i = start; i <= end; i++) {

            System.out.println(
                Thread.currentThread().getName() + " : " + i
            );
        }
    }
}
