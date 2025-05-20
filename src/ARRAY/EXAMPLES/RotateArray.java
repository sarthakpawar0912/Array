package ARRAY.EXAMPLES;

class RotateArray {
    public void rotate(int[] nums, int k) {
        // Handle edge cases: null, length <= 1, or k = 0
        if (nums == null || nums.length <= 1 || k == 0) {
            return;
        }

        // Normalize k to avoid redundant rotations
        k = k % nums.length;

        // Create temporary array to store rotated elements
        int[] temp = new int[nums.length];

        // Place each element in its new position
        for (int i = 0; i < nums.length; i++) {
            temp[(i + k) % nums.length] = nums[i];
        }

        // Copy temp back to nums
        for (int i = 0; i < nums.length; i++) {
            nums[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        RotateArray solution = new RotateArray();

        // Test case 1: nums = [1,2,3,4,5], k = 2
        int[] nums1 = {1, 2, 3, 4, 5};
        int k1 = 2;
        solution.rotate(nums1, k1);
        System.out.print("Test case 1: ");
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.println(); // Expected: 4 5 1 2 3

        // Test case 2: nums = [1,2], k = 3
        int[] nums2 = {1, 2};
        int k2 = 3;
        solution.rotate(nums2, k2);
        System.out.print("Test case 2: ");
        for (int i = 0; i < nums2.length; i++) {
            System.out.print(nums2[i] + " ");
        }
        System.out.println(); // Expected: 2 1

        // Test case 3: nums = [1], k = 1
        int[] nums3 = {1};
        int k3 = 1;
        solution.rotate(nums3, k3);
        System.out.print("Test case 3: ");
        for (int i = 0; i < nums3.length; i++) {
            System.out.print(nums3[i] + " ");
        }
        System.out.println(); // Expected: 1
    }
}