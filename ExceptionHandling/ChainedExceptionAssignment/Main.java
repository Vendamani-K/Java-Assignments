package ExceptionHandling.ChainedExceptionAssignment;


public class Main {

    public static void main(String[] args) {

        ArithmeticService service = new ArithmeticService();

        try {
            service.divideNumbers(10, 0);

        } catch (CustomException e) {

            System.out.println(e.getMessage());

            System.out.println("Original cause: "
                    + e.getCause());
        }

        System.out.println("Program completed!");
    }
}