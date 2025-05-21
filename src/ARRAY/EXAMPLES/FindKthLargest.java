package ARRAY.EXAMPLES;

import java.util.ArrayList;
import java.util.Collections;

public class FindKthLargest {

    public int findKthLargest(int[] nums, int k) {
    // Convert nums to ArrayList
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < nums.length; i++) {
        list.add(nums[i]);
    }

    // Sort in ascending order
    Collections.sort(list);

    // Return kth largest (at index size - k)
    return list.get(list.size() - k);
}

    public static void main(String[] args) {
        FindKthLargest solution = new FindKthLargest();

        // Test case 1: nums = [3,2,1,5,6,4], k = 2
        int[] nums1 = {3, 2, 1, 5, 6, 4};
        int k1 = 2;
        System.out.println("Test case 1: " + k1 + "th largest = " + solution.findKthLargest(nums1, k1)); // Expected: 5

        // Test case 2: nums = [3,2,3,1,2,4,5,5,6], k = 4
        int[] nums2 = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        int k2 = 4;
        System.out.println("Test case 2: " + k2 + "th largest = " + solution.findKthLargest(nums2, k2)); // Expected: 4

        // Test case 3: nums = [1], k = 1
        int[] nums3 = {1};
        int k3 = 1;
        System.out.println("Test case 3: " + k3 + "th largest = " + solution.findKthLargest(nums3, k3)); // Expected: 1
    }
}