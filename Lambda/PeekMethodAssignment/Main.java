package Lambda.PeekMethodAssignment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        // Step 1: Create a list of strings
        List<String> words = Arrays.asList(
            "java",
            "spring",
            "docker",
            "python",
            "microservices"
        );

        System.out.println("Original strings: " + words);

        // Step 2: Process strings using Streams
        List<String> result = words.stream()

                // Print the length of each string
                .peek(word ->
                    System.out.println(
                        word + " length: " + word.length()
                    )
                )

                // Convert each string to uppercase
                .map(String::toUpperCase)

                // Use peek for debugging
                .peek(word ->
                    System.out.println("After uppercase: " + word)
                )

                // Collect the modified strings
                .collect(Collectors.toList());

        // Step 3: Print final result
        System.out.println("\nModified strings: " + result);
    }
}