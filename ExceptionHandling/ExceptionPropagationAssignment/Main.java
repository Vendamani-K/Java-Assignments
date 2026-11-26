package ExceptionHandling.ExceptionPropagationAssignment;


public class Main {

    public static void main(String[] args) {

        ExceptionService service = new ExceptionService();

        service.methodA();

        System.out.println("Program completed successfully!");
    }
}

