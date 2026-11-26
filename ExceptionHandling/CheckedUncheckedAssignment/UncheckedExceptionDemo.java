package ExceptionHandling.CheckedUncheckedAssignment;

public class UncheckedExceptionDemo {

    public void divideNumbers() {

        try {

            int number1 = 10;
            int number2 = 0;

            int result = number1 / number2;

            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {

            System.out.println(
                "Unchecked Exception: Cannot divide by zero!"
            );
        }
    }
}
