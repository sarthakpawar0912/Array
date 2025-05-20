package ARRAY.EXAMPLES;
class Solution {
    public int findDuplicate(int[] nums) {
        // Initialize slow and fast pointers at nums[0]
        int slow = nums[0];
        int fast = nums[0];

        // Phase 1: Find the intersection point of slow and fast pointers
        // Move slow one step and fast two steps until they meet
        do {
            slow = nums[slow];          // Slow moves one step
            fast = nums[nums[fast]];    // Fast moves two steps
        } while (slow != fast);

        // Phase 2: Find the entrance to the cycle (duplicate number)
        // Reset slow to nums[0] and move both pointers one step at a time
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];          // Slow moves one step
            fast = nums[fast];          // Fast moves one step
        }

        // The meeting point is the duplicate number
        return slow;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1: nums = [1,3,4,2,2]
        int[] nums1 = {1, 3, 4, 2, 2};
        System.out.println("Test case 1: Duplicate number = " + solution.findDuplicate(nums1)); // Expected: 2

        // Test case 2: nums = [3,1,3,4,2]
        int[] nums2 = {3, 1, 3, 4, 2};
        System.out.println("Test case 2: Duplicate number = " + solution.findDuplicate(nums2)); // Expected: 3

        // Test case 3: nums = [1,1]
        int[] nums3 = {1, 1};
        System.out.println("Test case 3: Duplicate number = " + solution.findDuplicate(nums3)); // Expected: 1
    }
}