package org.alberthsuu.datastructurealgorithm.twosum;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            if (map.containsKey(num)) {
                return new int[]{map.get(num), i};
            } else {
                map.put(target - num, i);
            }
        }

        return new int[2];
    }
}
