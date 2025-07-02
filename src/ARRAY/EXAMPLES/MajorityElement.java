package ARRAY.EXAMPLES;
import java.util.ArrayList;
import java.util.Collections;

public class MajorityElement {

    public int majorityElement(int[] nums) {

        // Create an ArrayList to store elements
        ArrayList<Integer> list = new ArrayList<>();

        // Copy nums to ArrayList
        for (int i = 0; i < nums.length; i++) {

            list.add(nums[i]);

        }

        // Sort the ArrayList
        Collections.sort(list);

        // Return the middle element (index n/2)
        return list.get(list.size() / 2);

    }

    public static void main(String[] args) {

        MajorityElement solution = new MajorityElement();

        // Test case 1: nums = [3,2,3]
        int[] nums1 = {3, 2, 3};
        System.out.println("Test case 1: Majority element = " + solution.majorityElement(nums1)); // Expected: 3


        // Test case 2: nums = [2,2,1,1,1,2,2]
        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("Test case 2: Majority element = " + solution.majorityElement(nums2)); // Expected: 2

        // Test case 3: nums = [1]
        int[] nums3 = {1};
        System.out.println("Test case 3: Majority element = " + solution.majorityElement(nums3)); // Expected: 1
    }
}
