package ExceptionHandling.CustomExceptionAssignment;

import java.util.Scanner;

public class Main {

    // Method to validate the number
    public static void checkNumber(int number)
            throws InvalidInputException {

        if (number <= 0) {

            throw new InvalidInputException(
                "Invalid input! Number must be positive."
            );
        }

        System.out.println("Valid input: " + number);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Enter a positive integer: ");

            int number = scanner.nextInt();

            checkNumber(number);

        } catch (InvalidInputException e) {

            System.out.println("Error: " + e.getMessage());

        } catch (java.util.InputMismatchException e) {

            System.out.println("Error: Please enter a valid integer.");

        } finally {

            scanner.close();
        }
    }
}
