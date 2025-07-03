package ARRAY.EXAMPLES;

import java.util.ArrayList;
import java.util.HashMap;

public class TWOsum {

    public int[] twoSum(int[] nums, int target) {
    // Convert nums to ArrayList
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < nums.length; i++) {
        list.add(nums[i]);
    }

    // HashMap to store number and its index
    HashMap<Integer, Integer> map = new HashMap<>();

    // Iterate through ArrayList
    for (int i = 0; i < list.size(); i++) {
        int num = list.get(i);
        int complement = target - num;

        // Check if complement exists in map
        if (map.containsKey(complement)) {
            return new int[] {map.get(complement), i};
        }

        // Add current number and index to map
        map.put(num, i);
    }

    // No solution (though problem guarantees one)
    return new int[] {};
}

    public static void main(String[] args) {
        TWOsum solution = new TWOsum();

        // Test case 1: nums = [2,7,11,15], target = 9
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = solution.twoSum(nums1, target1);
        System.out.println("Test case 1: [" + result1[0] + ", " + result1[1] + "]"); // Expected: [0, 1]

        // Test case 2: nums = [3,2,4], target = 6
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = solution.twoSum(nums2, target2);
        System.out.println("Test case 2: [" + result2[0] + ", " + result2[1] + "]"); // Expected: [1, 2]

        // Test case 3: nums = [3,3], target = 6
        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = solution.twoSum(nums3, target3);
        System.out.println("Test case 3: [" + result3[0] + ", " + result3[1] + "]"); // Expected: [0, 1]
    }
}