package ARRAY.EXAMPLES;

import java.util.ArrayList;
import java.util.HashMap;

public class Findsubarraywithgivensum {
    public int subarraySum(int[] nums, int k) {
        // HashMap to store (cumulative sum -> count of occurrences)
        HashMap<Integer, Integer> sumCountMap = new HashMap<>();
        sumCountMap.put(0, 1); // Base case: sum 0 occurs once

        int sum = 0;
        int count = 0;

        for (int num : nums) {
            sum += num;

            // If (sum - k) exists in map, then a subarray with sum=k ends here
            if (sumCountMap.containsKey(sum - k)) {
                count += sumCountMap.get(sum - k);
            }

            // Update the map with the current sum
            sumCountMap.put(sum, sumCountMap.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        Findsubarraywithgivensum solution = new Findsubarraywithgivensum();

        // Test case 1: nums = [1,1,1], k = 2
        int[] nums1 = {1, 1, 1};
        int k1 = 2;
        System.out.println("Test case 1: Number of subarrays = " + solution.subarraySum(nums1, k1)); // Expected: 2

        // Test case 2: nums = [1,2,3], k = 3
        int[] nums2 = {1, 2, 3};
        int k2 = 3;
        System.out.println("Test case 2: Number of subarrays = " + solution.subarraySum(nums2, k2)); // Expected: 2

        // Test case 3: nums = [1], k = 0
        int[] nums3 = {1};
        int k3 = 0;
        System.out.println("Test case 3: Number of subarrays = " + solution.subarraySum(nums3, k3)); // Expected: 0
    }
}
