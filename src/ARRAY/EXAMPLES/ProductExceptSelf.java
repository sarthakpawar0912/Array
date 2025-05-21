package ARRAY.EXAMPLES;

import java.util.ArrayList;

public class ProductExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        // Convert nums to ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }

        int n = list.size();
        int[] answer = new int[n];

        // First pass: Compute left products
        answer[0] = 1; // No elements to the left of index 0
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] * list.get(i - 1);
        }

        // Second pass: Multiply by right products
        int rightProduct = 1; // Product of elements to the right
        for (int i = n - 1; i >= 0; i--) {
            answer[i] = answer[i] * rightProduct;
            rightProduct *= list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        ProductExceptSelf solution = new ProductExceptSelf();

        // Test case 1: nums = [1,2,3,4]
        int[] nums1 = {1, 2, 3, 4};
        int[] result1 = solution.productExceptSelf(nums1);
        System.out.print("Test case 1: [");
        for (int i = 0; i < result1.length; i++) {
            System.out.print(result1[i]);
            if (i < result1.length - 1) System.out.print(", ");
        }
        System.out.println("]"); // Expected: [24, 12, 8, 6]

        // Test case 2: nums = [2,3,4,5]
        int[] nums2 = {2, 3, 4, 5};
        int[] result2 = solution.productExceptSelf(nums2);
        System.out.print("Test case 2: [");
        for (int i = 0; i < result2.length; i++) {
            System.out.print(result2[i]);
            if (i < result2.length - 1) System.out.print(", ");
        }
        System.out.println("]"); // Expected: [60, 40, 30, 24]

        // Test case 3: nums = [-1,1]
        int[] nums3 = {-1, 1};
        int[] result3 = solution.productExceptSelf(nums3);
        System.out.print("Test case 3: [");
        for (int i = 0; i < result3.length; i++) {
            System.out.print(result3[i]);
            if (i < result3.length - 1) System.out.print(", ");
        }
        System.out.println("]"); // Expected: [1, -1]
    }
}
