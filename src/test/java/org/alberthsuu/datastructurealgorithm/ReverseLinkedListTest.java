package org.alberthsuu.datastructurealgorithm;

import org.alberthsuu.datastructurealgorithm.common.LinkedListGenerator;
import org.alberthsuu.datastructurealgorithm.common.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ReverseLinkedListTest {
    private ReverseLinkedList reverseLinkedList;

    @BeforeEach
    void setUp() {
        reverseLinkedList = new ReverseLinkedList();
    }

    @Test
    void reverseLinkedListFirstTestCase() {
        Integer[] listArray = {1, 2, 3, 4, 5};
        ListNode head = LinkedListGenerator.fromArray(listArray);
        ListNode res = reverseLinkedList.reverseList(head);

        Integer[] resArray = LinkedListGenerator.fromNode(res);
        Integer[] expectedResult = {5, 4, 3, 2, 1};

        assertArrayEquals(resArray, expectedResult);
    }

}