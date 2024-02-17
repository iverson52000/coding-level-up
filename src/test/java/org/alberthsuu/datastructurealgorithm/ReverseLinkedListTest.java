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
        ListNode result = reverseLinkedList.reverseList(head);

        Integer[] resultArray = LinkedListGenerator.toArray(result);
        Integer[] expectedResult = {5, 4, 3, 2, 1};

        assertArrayEquals(resultArray, expectedResult);
    }

    @Test
    void reverseLinkedListEmptyInput() {
        Integer[] listArray = {};
        ListNode head = LinkedListGenerator.fromArray(listArray);
        ListNode result = reverseLinkedList.reverseList(head);

        Integer[] resultArray = LinkedListGenerator.toArray(result);
        Integer[] expectedResult = {null};

        assertArrayEquals(resultArray, expectedResult);
    }

}