package org.alberthsuu.datastructurealgorithm.lrucache;

public class DummyNode<T> implements LinkedListNode<T> {
    private final DoublyLinkedList<T> list;

    public DummyNode(DoublyLinkedList<T> list) {
        this.list = list;
    }

    @Override
    public boolean hasElement() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public T getElement() throws NullPointerException {
        throw new NullPointerException();
    }

    @Override
    public void detach() {
    }

    @Override
    public DoublyLinkedList<T> getListReference() {
        return list;
    }

    @Override
    public void setPrev(LinkedListNode<T> next) {
    }

    @Override
    public void setNext(LinkedListNode<T> prev) {
    }

    @Override
    public LinkedListNode<T> getPrev() {
        return this;
    }

    @Override
    public LinkedListNode<T> getNext() {
        return this;
    }

    @Override
    public LinkedListNode<T> search(T value) {
        return this;
    }
}
