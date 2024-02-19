package org.alberthsuu.datastructurealgorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KthLargestElementInAnArrayTest {
    private KthLargestElementInAnArray kthLargestElementInAnArray;

    @BeforeEach
    void setUp() {
        kthLargestElementInAnArray = new KthLargestElementInAnArray();
    }


    @Test
    void KthLargestElementInAnArrayFirstTestCase() {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;

        int result = kthLargestElementInAnArray.findKthLargest(nums, k);
        int expectedResult = 5;

        assertEquals(result, expectedResult);
    }

    @Test
    void KthLargestElementInAnArraySecondTestCase() {
        int[] nums = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        int k = 4;

        int result = kthLargestElementInAnArray.findKthLargest(nums, k);
        int expectedResult = 4;

        assertEquals(result, expectedResult);
    }
}