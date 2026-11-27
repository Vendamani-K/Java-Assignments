package Lambda.SortStringsAssignment;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        // Step 1: Create a list of strings
        List<String> words = Arrays.asList(
            "Apple",
            "Banana",
            "Cat",
            "Watermelon",
            "Dog",
            "Pineapple"
        );

        // Step 2: Sort strings by length in descending order
        List<String> result = words.stream()
                .sorted(Comparator.comparingInt(String::length).reversed())
                .limit(3)
                .collect(Collectors.toList());

        // Step 3: Print the result
        System.out.println("Original list: " + words);

        System.out.println("Top 3 longest strings: " + result);
    }
}