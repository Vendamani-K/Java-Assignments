package Lambda.FlattenListAssignment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        // Step 1: Create a list of lists
        List<List<Integer>> numbers = Arrays.asList(
            Arrays.asList(1, 2, 3),
            Arrays.asList(3, 4, 5),
            Arrays.asList(5, 6, 7)
        );

        // Step 2: Flatten the list and remove duplicates
        List<Integer> result = numbers.stream()
                .flatMap(List::stream)
                .distinct()
                .collect(Collectors.toList());

        // Step 3: Print the result
        System.out.println("Original nested list: " + numbers);

        System.out.println("Distinct numbers: " + result);
    }
}