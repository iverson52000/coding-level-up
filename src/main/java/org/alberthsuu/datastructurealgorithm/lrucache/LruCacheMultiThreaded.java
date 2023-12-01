package org.alberthsuu.datastructurealgorithm.lrucache;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.Optional;

/**
 * Reference:
 * <a href="https://www.baeldung.com/java-lru-cache">...</a>
 * <a href="https://github.com/eugenp/tutorials/tree/master/data-structures/src/main/java/com/baeldung/lrucache">...</a>
 */
public class LruCacheMultiThreaded<K, V> implements Cache<K, V> {
    private final int size;
    private final Map<K, LinkedListNode<CacheElement<K, V>>> linkedListNodeMap;
    private final DoublyLinkedList<CacheElement<K, V>> doublyLinkedList;
    private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public LruCacheMultiThreaded(int size) {
        this.size = size;
        this.linkedListNodeMap = new ConcurrentHashMap<>(size);
        this.doublyLinkedList = new DoublyLinkedList<>();
    }

    @Override
    public void put(K key, V value) {
        this.lock.writeLock().lock();
        try {
            CacheElement<K, V> item = new CacheElement<>(key, value);
            LinkedListNode<CacheElement<K, V>> newNode;
            if (this.linkedListNodeMap.containsKey(key)) {
                LinkedListNode<CacheElement<K, V>> node = this.linkedListNodeMap.get(key);
                newNode = doublyLinkedList.updateAndMoveToFront(node, item);
            } else {
                if (this.size() >= this.size) {
                    this.evictElement();
                }
                newNode = this.doublyLinkedList.add(item);
            }
            if (newNode.isEmpty()) {
                return;
            }
            this.linkedListNodeMap.put(key, newNode);

        } finally {
            this.lock.writeLock().unlock();
        }
    }

    @Override
    public Optional<V> get(K key) {
        this.lock.readLock().lock();
        try {
            LinkedListNode<CacheElement<K, V>> linkedListNode = this.linkedListNodeMap.get(key);
            if (linkedListNode != null && !linkedListNode.isEmpty()) {
                linkedListNodeMap.put(key, this.doublyLinkedList.moveToFront(linkedListNode));
                return Optional.of(linkedListNode.getElement().getValue());
            }
            return Optional.empty();
        } finally {
            this.lock.readLock().unlock();
        }
    }

    @Override
    public int size() {
        this.lock.readLock().lock();
        try {
            return doublyLinkedList.size();
        } finally {
            this.lock.readLock().unlock();
        }
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public void clear() {
        this.lock.writeLock().lock();
        try {
            linkedListNodeMap.clear();
            doublyLinkedList.clear();
        } finally {
            this.lock.writeLock().unlock();
        }
    }

    private void evictElement() {
        this.lock.writeLock().lock();
        try {
            LinkedListNode<CacheElement<K, V>> linkedListNode = doublyLinkedList.removeTail();
            if (linkedListNode.isEmpty()) {
                return;
            }
            linkedListNodeMap.remove(linkedListNode.getElement().getKey());
        } finally {
            this.lock.writeLock().unlock();
        }
    }
}
