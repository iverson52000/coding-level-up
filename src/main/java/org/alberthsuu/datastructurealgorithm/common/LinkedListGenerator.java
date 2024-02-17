package org.alberthsuu.datastructurealgorithm.common;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class LinkedListGenerator {
    @org.jetbrains.annotations.NotNull
    public static ListNode fromArray(Integer @NotNull [] listArray) {
        if (listArray.length == 0) return new ListNode();

        ListNode head = new ListNode(listArray[0]);
        ListNode node = head;

        for (int i = 0; i < listArray.length - 1; i++) {
            node.next = new ListNode(listArray[i + 1]);
            node = node.next;
        }

        return head;
    }

    public static Integer[] toArray(ListNode head) {
        ArrayList<Integer> result = new ArrayList<>();

        while (head != null) {
            result.add(head.val);
            head = head.next;
        }

        return result.toArray(Integer[]::new);
    }

}
