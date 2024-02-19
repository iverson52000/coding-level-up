package org.alberthsuu.datastructurealgorithm;

import java.util.PriorityQueue;

/**
 * 215. Kth Largest Element in an Array
 */
public class KthLargestElementInAnArray {

    /**
     * Time complexity: O(nlogk). Each of the n elements is processed once. However, heap operations take O(logk) time,
     * leading to an overall complexity of O(nlogk).
     * Space complexity: O(k).
     */
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            minHeap.offer(nums[i]);
        }

        for (int i = k; i < nums.length; i++) {
            if (nums[i] > minHeap.peek()) {
                minHeap.poll();
                minHeap.offer(nums[i]);
            }
        }

        return minHeap.peek();
    }
}
