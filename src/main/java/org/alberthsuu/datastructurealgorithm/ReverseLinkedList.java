package org.alberthsuu.datastructurealgorithm;

import org.alberthsuu.datastructurealgorithm.common.ListNode;

/**
 * 206. Reverse Linked List
 */
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;

        ListNode pre = null;

        while (head != null) {
            ListNode nxt = head.next;
            head.next = pre;
            pre = head;
            head = nxt;
        }

        return pre;
    }
}
