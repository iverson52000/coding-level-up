package org.alberthsuu.datastructurealgorithm.twosum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumTest {
    @Test
    void twoSumWorks() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expectedResult = {0, 1};

        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSum(nums, target);

        assertArrayEquals(result, expectedResult);
    }
}