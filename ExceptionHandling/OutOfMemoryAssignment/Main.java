package ExceptionHandling.OutOfMemoryAssignment;


public class Main {

    public static void main(String[] args) {

        OutOfMemoryDemo demo = new OutOfMemoryDemo();

        try {

            demo.generateOutOfMemory();

        } catch (OutOfMemoryError e) {

            System.out.println("OutOfMemoryError occurred!");
            System.out.println(e.getMessage());

        }

    }
}
