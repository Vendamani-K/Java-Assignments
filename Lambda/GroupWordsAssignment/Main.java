package Lambda.GroupWordsAssignment;


import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        try {

            // Step 1: Read words from the file
            List<String> words = Files.readAllLines(
                Path.of("Lambda/GroupWordsAssignment/words.txt")
            );

            // Step 2: Group words by their first letter and count them
            Map<String, Long> result = words.stream()
                    .map(String::trim)
                    .filter(word -> !word.isEmpty())
                    .collect(Collectors.groupingBy(
                        word -> word.substring(0, 1).toUpperCase(),
                        TreeMap::new,
                        Collectors.counting()
                    ));

            // Step 3: Print the result
            System.out.println("Word count grouped by first letter:");

            result.forEach((letter, count) ->
                System.out.println(letter + " = " + count)
            );

        } catch (IOException e) {

            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}