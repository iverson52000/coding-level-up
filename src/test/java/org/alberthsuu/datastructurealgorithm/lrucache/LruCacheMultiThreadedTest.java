package org.alberthsuu.datastructurealgorithm.lrucache;

import org.junit.jupiter.api.Test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class LruCacheMultiThreadedTest {
    @Test
    public void addDataToCacheWhenGetDataThenIsEqualWithCacheElement() {
        LruCacheMultiThreaded<String, String> lruCache = new LruCacheMultiThreaded<>(3);
        lruCache.put("1", "test1");
        lruCache.put("2", "test2");
        lruCache.put("3", "test3");

        assertEquals("test1", lruCache.get("1").orElse(null));
        assertEquals("test2", lruCache.get("2").orElse(null));
        assertEquals("test3", lruCache.get("3").orElse(null));
    }

    @Test
    public void addDataToCacheToTheNumberOfSizeWhenAddOneMoreDataThenLeastRecentlyDataWillEvict() {
        LruCacheMultiThreaded<String, String> lruCache = new LruCacheMultiThreaded<>(3);
        lruCache.put("1", "test1");
        lruCache.put("2", "test2");
        lruCache.put("3", "test3");
        lruCache.put("4", "test4");

        assertFalse(lruCache.get("1").isPresent());
    }

    @Test
    public void runMultiThreadTaskWhenPutDataInConcurrentToCacheThenNoDataLost() throws Exception {
        final int size = 50;
        final ExecutorService executorService = Executors.newFixedThreadPool(5);
        LruCacheMultiThreaded<Integer, String> lruCache = new LruCacheMultiThreaded<>(size);
        CountDownLatch countDownLatch = new CountDownLatch(size);

        try {
            IntStream.range(0, size).<Runnable>mapToObj(key -> () -> {
                lruCache.put(key, "value" + key);
                countDownLatch.countDown();
            }).forEach(executorService::submit);
            countDownLatch.await();
        } finally {
            executorService.shutdown();
        }

        assertEquals(lruCache.size(), size);
        IntStream.range(0, size).forEach(i -> assertEquals("value" + i, lruCache.get(i).orElse(null)));
    }
}