package Collections.LRUCacheAssignment;

import java.util.LinkedHashMap;
import java.util.LinkedList;

public class LRUCache {

    // Stores key-value pairs
    private LinkedHashMap<Integer, String> cache;

    // Maintains the usage order of keys
    private LinkedList<Integer> usageOrder;

    // Maximum capacity of cache
    private int capacity;

    // Constructor
    public LRUCache(int capacity) {

        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be greater than zero");
        }

        this.capacity = capacity;

        cache = new LinkedHashMap<>();

        usageOrder = new LinkedList<>();
    }

    // Add a value to cache
    public void put(int key, String value) {

        // If key already exists, remove its old position
        if (cache.containsKey(key)) {
            usageOrder.remove(Integer.valueOf(key));
        }

        // If cache is full, remove least recently used item
        else if (cache.size() >= capacity) {

            int oldKey = usageOrder.removeLast();

            cache.remove(oldKey);

            System.out.println("Evicted key: " + oldKey);
        }

        // Add new value
        cache.put(key, value);

        // Mark this key as most recently used
        usageOrder.addFirst(key);
    }

    // Read a value from cache
    public String get(int key) {

        if (!cache.containsKey(key)) {
            return null;
        }

        // Move accessed key to the front
        usageOrder.remove(Integer.valueOf(key));

        usageOrder.addFirst(key);

        return cache.get(key);
    }

    // Display cache contents
    public void display() {

        System.out.println("Cache contents: " + cache);
        System.out.println("Usage order: " + usageOrder);
    }

    // Get cache size
    public int size() {
        return cache.size();
    }
}
