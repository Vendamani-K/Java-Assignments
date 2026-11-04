package Collections.CustomCacheAssignment;


public class Main {

    public static void main(String[] args) {

        // Create custom cache
        CustomCache cache = new CustomCache();

        // Add 2000 values
        for (int i = 1; i <= 2000; i++) {

            cache.put(i, "Value-" + i);
        }

        // Print total cache size
        System.out.println("Total values: " + cache.size());

        // Read some values
        System.out.println("Value at key 1: " + cache.get(1));
        System.out.println("Value at key 500: " + cache.get(500));
        System.out.println("Value at key 1000: " + cache.get(1000));
        System.out.println("Value at key 2000: " + cache.get(2000));
    }
}