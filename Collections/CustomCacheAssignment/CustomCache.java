package Collections.CustomCacheAssignment;

import java.util.HashMap;

public class CustomCache {

    private HashMap<Integer, String> cache = new HashMap<>();

    public void put(Integer key, String value) {
        cache.put(key, value);
    }

    public String get(Integer key) {
        return cache.get(key);
    }

    public int size() {
        return cache.size();
    }
}