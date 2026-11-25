package MultiThreading.MethodAccessAssignment;


public class AccessCounter {

    private int count = 0;

    // Count how many times this method is accessed
    public synchronized void accessMethod() {

        count++;
    }

    // Return the final count
    public synchronized int getCount() {

        return count;
    }
}
