package MultiThreading.EvenOddSumAssignment;

public class EvenThread extends Thread {

    @Override
    public void run() {

        System.out.println("Even Numbers:");

        for (int i = 1; i <= 10; i++) {

            if (i % 2 == 0) {

                System.out.print(i + " ");

                NumberData.evenSum += i;
            }
        }

        System.out.println();
        System.out.println("Even Sum: " + NumberData.evenSum);
    }
}
