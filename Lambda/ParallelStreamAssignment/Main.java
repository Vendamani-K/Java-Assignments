package Lambda.ParallelStreamAssignment;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        // Step 1: Generate 5 million random integers
        int size = 5_000_000;

        Random random = new Random();

        List<Integer> numbers = random.ints(size, 1, 101)
                .boxed()
                .collect(Collectors.toList());

        System.out.println("Generated " + numbers.size()
                + " random numbers.");

        // Step 2: Calculate sum using Sequential Stream
        long startSequential = System.nanoTime();

        long sequentialSum = numbers.stream()
                .mapToLong(Integer::longValue)
                .sum();

        long endSequential = System.nanoTime();

        long sequentialTime = endSequential - startSequential;

        // Step 3: Calculate sum using Parallel Stream
        long startParallel = System.nanoTime();

        long parallelSum = numbers.parallelStream()
                .mapToLong(Integer::longValue)
                .sum();

        long endParallel = System.nanoTime();

        long parallelTime = endParallel - startParallel;

        // Step 4: Print results
        System.out.println("\nSequential Stream:");
        System.out.println("Sum: " + sequentialSum);
        System.out.println("Time: " + sequentialTime / 1_000_000
                + " milliseconds");

        System.out.println("\nParallel Stream:");
        System.out.println("Sum: " + parallelSum);
        System.out.println("Time: " + parallelTime / 1_000_000
                + " milliseconds");

        // Step 5: Compare execution time
        System.out.println("\nPerformance Comparison:");

        if (parallelTime < sequentialTime) {
            System.out.println("Parallel Stream is faster.");
        } else if (sequentialTime < parallelTime) {
            System.out.println("Sequential Stream is faster.");
        } else {
            System.out.println("Both took approximately the same time.");
        }

        // Verify both sums are equal
        System.out.println("Both sums are equal: "
                + (sequentialSum == parallelSum));
    }
}
