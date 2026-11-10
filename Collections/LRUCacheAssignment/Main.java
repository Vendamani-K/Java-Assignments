package Collections.LRUCacheAssignment;


public class Main {

    public static void main(String[] args) {

        // Create cache with capacity 3
        LRUCache cache = new LRUCache(3);

        // Add three values
        cache.put(1, "Apple");
        cache.put(2, "Banana");
        cache.put(3, "Orange");

        System.out.println("After adding 3 values:");
        cache.display();

        // Access key 1
        System.out.println("\nReading key 1:");
        System.out.println("Value: " + cache.get(1));

        cache.display();

        // Add another value
        System.out.println("\nAdding key 4:");
        cache.put(4, "Mango");

        cache.display();

        // Read key 2
        System.out.println("\nReading key 2:");
        System.out.println("Value: " + cache.get(2));

        cache.display();

        // Check cache size
        System.out.println("\nCache size: " + cache.size());
    }
}
