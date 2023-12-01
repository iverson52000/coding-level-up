package org.alberthsuu.datastructurealgorithm.lrucache;

public interface LinkedListNode<V> {
    boolean hasElement();

    boolean isEmpty();

    V getElement() throws NullPointerException;

    void detach();

    DoublyLinkedList<V> getListReference();

    void setPrev(LinkedListNode<V> prev);

    void setNext(LinkedListNode<V> next);

    LinkedListNode<V> getPrev();

    LinkedListNode<V> getNext();

    LinkedListNode<V> search(V value);

}
