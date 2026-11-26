package ExceptionHandling.NestedTryCatchAssignment;

//package ExceptionHandling.NestedTryCatchAssignment;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Enter first number: ");
            String input1 = scanner.nextLine();

            System.out.print("Enter second number: ");
            String input2 = scanner.nextLine();

            // Inner try-catch block
            try {

                int num1 = Integer.parseInt(input1);
                int num2 = Integer.parseInt(input2);

                int result = num1 / num2;

                System.out.println("Division result: " + result);

            } catch (ArithmeticException e) {

                System.out.println("Error: Cannot divide by zero!");

            } catch (NumberFormatException e) {

                System.out.println("Error: Please enter numeric values only!");

            }

        } catch (Exception e) {

            System.out.println("An unexpected error occurred: "
                    + e.getMessage());

        }

        System.out.println("Program completed!");

        scanner.close();
    }
}