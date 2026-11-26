package ExceptionHandling.ChainedExceptionAssignment;


public class ArithmeticService {

    public void divideNumbers(int a, int b) throws CustomException {

        try {
            int result = a / b;

            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {

            System.out.println("ArithmeticException caught!");

            throw new CustomException(
                "Custom Exception: Unable to perform division!",
                e
            );
        }
    }
}