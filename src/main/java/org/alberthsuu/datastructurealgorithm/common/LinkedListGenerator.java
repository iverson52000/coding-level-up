package org.alberthsuu.datastructurealgorithm.common;

import java.util.ArrayList;

public class LinkedListGenerator {
    public static ListNode fromArray(Integer[] listArray) {
        if (listArray.length == 0) return new ListNode();

        ListNode head = new ListNode(listArray[0]);
        ListNode currentNode = head;

        for (int i = 0; i < listArray.length - 1; i++) {
            currentNode.next = new ListNode(listArray[i + 1]);
            currentNode = currentNode.next;
        }

        return head;
    }

    public static Integer[] fromNode(ListNode head) {
        ArrayList<Integer> res = new ArrayList<>();

        while (head != null) {
            res.add(head.val);
            head = head.next;
        }

        return res.toArray(Integer[]::new);
    }

}
