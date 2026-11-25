package MultiThreading.EvenOddSumAssignment;


public class SumThread extends Thread {

    @Override
    public void run() {

        int totalSum = NumberData.evenSum + NumberData.oddSum;

        System.out.println("Sum of Even and Odd Numbers: " + totalSum);
    }
}
