package ExceptionHandling.ExceptionPropagationAssignment;


public class ExceptionService {

    // Method A calls Method B and catches the exception
    public void methodA() {

        System.out.println("Method A started");

        try {

            methodB();

        } catch (InvalidOperationException e) {

            System.out.println(
                "Exception caught in Method A: " + e.getMessage()
            );
        }

        System.out.println("Method A completed");
    }

    // Method B calls Method C
    public void methodB() throws InvalidOperationException {

        System.out.println("Method B started");

        methodC();

        System.out.println("Method B completed");
    }

    // Method C throws the custom exception
    public void methodC() throws InvalidOperationException {

        System.out.println("Method C started");

        throw new InvalidOperationException(
            "Something went wrong in Method C!"
        );
    }
}
