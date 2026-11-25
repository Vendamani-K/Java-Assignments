package MultiThreading.EvenOddSumAssignment;



public class OddThread extends Thread {

    @Override
    public void run() {

        System.out.println("Odd Numbers:");

        for (int i = 1; i <= 10; i++) {

            if (i % 2 != 0) {

                System.out.print(i + " ");

                NumberData.oddSum += i;
            }
        }

        System.out.println();
        System.out.println("Odd Sum: " + NumberData.oddSum);
    }
}
