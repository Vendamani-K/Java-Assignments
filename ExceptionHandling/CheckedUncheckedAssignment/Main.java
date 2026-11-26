package ExceptionHandling.CheckedUncheckedAssignment;


public class Main {

    public static void main(String[] args) {
        

        // Demonstrate checked exception
        System.out.println("=== Checked Exception ===");

        CheckedExceptionDemo checked = new CheckedExceptionDemo();

        checked.readFile();

        // Demonstrate unchecked exception
        System.out.println("\n=== Unchecked Exception ===");

        UncheckedExceptionDemo unchecked = new UncheckedExceptionDemo();

        unchecked.divideNumbers();

        System.out.println("\nProgram completed!");
    }
}
