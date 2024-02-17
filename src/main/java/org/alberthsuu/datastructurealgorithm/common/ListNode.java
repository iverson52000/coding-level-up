package org.alberthsuu.datastructurealgorithm.common;

public class ListNode {
    public Integer val;
    public ListNode next;

    ListNode() {
    }

    ListNode(Integer val) {
        this.val = val;
    }

    ListNode(Integer val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
