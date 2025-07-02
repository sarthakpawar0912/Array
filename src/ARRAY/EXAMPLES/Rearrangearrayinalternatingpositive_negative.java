package ARRAY.EXAMPLES;
import java.util.ArrayList;

public class Rearrangearrayinalternatingpositive_negative {

    public void rearrange(int[] nums) {

        // Create ArrayLists for positive and negative numbers
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();

        // Separate positive and negative numbers
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                positive.add(nums[i]);
            } else {
                negative.add(nums[i]);
            }
        }

        // Merge alternately into nums
        int posIndex = 0; // Index for positive list
        int negIndex = 0; // Index for negative list
        int i = 0; // Index for nums

        // Alternate positive and negative while both are available
        while (posIndex < positive.size() && negIndex < negative.size()) {
            nums[i++] = positive.get(posIndex++); // Add positive
            if (i < nums.length) {
                nums[i++] = negative.get(negIndex++); // Add negative
            }
        }

        // Append remaining positive numbers, if any
        while (posIndex < positive.size()) {
            nums[i++] = positive.get(posIndex++);
        }

        // Append remaining negative numbers, if any
        while (negIndex < negative.size()) {
            nums[i++] = negative.get(negIndex++);
        }
    }

    public static void main(String[] args) {
        Rearrangearrayinalternatingpositive_negative solution = new Rearrangearrayinalternatingpositive_negative();

        // Test case 1: nums = [3,1,-2,-5,2,-4]
        int[] nums1 = {3, 1, -2, -5, 2, -4};
        solution.rearrange(nums1);
        System.out.print("Test case 1: ");
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.println(); // Expected: 3 -2 1 -5 2 -4

        // Test case 2: nums = [1,2,-3,-4,-5]
        int[] nums2 = {1, 2, -3, -4, -5};
        solution.rearrange(nums2);
        System.out.print("Test case 2: ");
        for (int i = 0; i < nums2.length; i++) {
            System.out.print(nums2[i] + " ");
        }
        System.out.println(); // Expected: 1 -3 2 -4 -5

        // Test case 3: nums = [-1,1]
        int[] nums3 = {-1, 1};
        solution.rearrange(nums3);
        System.out.print("Test case 3: ");
        for (int i = 0; i < nums3.length; i++) {
            System.out.print(nums3[i] + " ");
        }
        System.out.println(); // Expected: 1 -1
    }
}
