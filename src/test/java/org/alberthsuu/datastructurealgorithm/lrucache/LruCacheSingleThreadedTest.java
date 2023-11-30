package org.alberthsuu.datastructurealgorithm.lrucache;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LruCacheSingleThreadedTest {

    @Test
    void lruCacheWorksFirstTestCase() {
        int result;
        LruCacheSingleThreaded lruCache = new LruCacheSingleThreaded(2);

        lruCache.put(1, 1); // cache is {1=1}
        lruCache.put(2, 2); // cache is {1=1, 2=2}
        result = lruCache.get(1);    // return 1
        assertEquals(result, 1);

        lruCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
        result = lruCache.get(2);    // returns -1 (not found)
        assertEquals(result, -1);

        lruCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
        result = lruCache.get(1);    // return -1 (not found)
        assertEquals(result, -1);

        result = lruCache.get(3);    // return 3
        assertEquals(result, 3);

        result = lruCache.get(4);    // return 4
        assertEquals(result, 4);
    }
}