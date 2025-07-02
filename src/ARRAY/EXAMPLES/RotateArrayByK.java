package ARRAY.EXAMPLES;

public class RotateArrayByK {

    public void rotate(int[] nums, int k) {

        // Handle edge cases: null, empty, or single-element array
        if (nums == null || nums.length <= 1) {
            return;
        }

        // Normalize k to handle k > nums.length
        k = k % nums.length;

        // If k == 0 after normalization, no rotation needed
        if (k == 0) {

            return;

        }

        // Step 1: Reverse the entire array
        reverse(nums, 0, nums.length - 1);

        // Step 2: Reverse the first k elements
        reverse(nums, 0, k - 1);

        // Step 3: Reverse the remaining n - k elements
        reverse(nums, k, nums.length - 1);
    }

    // Helper method to reverse elements in the array from start to end
    private void reverse(int[] nums, int start, int end) {
        // Swap elements from start and end until pointers meet
        while (start < end) {
            // Swap nums[start] and nums[end]
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            // Move pointers inward
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        // Create an instance of RotateArrayByK
        RotateArrayByK rotator = new RotateArrayByK();
        // Example array and rotation value
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        // Call the rotate method to perform cyclic rotation by k
        rotator.rotate(nums, k);
        // Print the rotated array
        System.out.print("Array after cyclic rotation by " + k + ": ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}