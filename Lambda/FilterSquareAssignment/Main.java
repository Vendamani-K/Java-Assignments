package Lambda.FilterSquareAssignment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        // Step 1: Create a list of integers
        List<Integer> numbers = Arrays.asList(
            1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        );

        // Step 2: Use Stream to filter and square numbers
        List<Integer> squaredNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .collect(Collectors.toList());

        // Step 3: Print the squared numbers
        System.out.println("Original numbers: " + numbers);

        System.out.println("Squared even numbers: " + squaredNumbers);
    }
}