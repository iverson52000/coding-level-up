package org.alberthsuu.datastructurealgorithm.lrucache;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Your LruCache object will be instantiated and called as such:
 * LruCache obj = new LruCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
public class LruCacheSingleThreaded {
    private final LinkedHashMap<Integer, Integer> linkedMap;

    public LruCacheSingleThreaded(int capacity) {
        linkedMap = new LinkedHashMap<>(capacity, 0.75f, true) {
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return size() > capacity;
            }
        };
    }

    public int get(int key) {
        return linkedMap.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        linkedMap.put(key, value);
    }
}




