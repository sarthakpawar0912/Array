package ARRAY.EXAMPLES;
import java.util.ArrayList;
import java.util.HashSet;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {

        // Convert nums to ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            list.add(nums[i]);

        }

        // HashSet to track seen numbers
        HashSet<Integer> set = new HashSet<>();

        // Check for duplicates
        for (int i = 0; i < list.size(); i++) {

            int num = list.get(i);
            if (set.contains(num)) {
                return true; // Duplicate found
            }
            set.add(num);
        }

        return false; // No duplicates
    }

    public static void main(String[] args) {
        ContainsDuplicate solution = new ContainsDuplicate();

        // Test case 1: nums = [1,2,3,1]
        int[] nums1 = {1, 2, 3, 1};
        System.out.println("Test case 1: Contains duplicate = " + solution.containsDuplicate(nums1)); // Expected: true

        // Test case 2: nums = [1,2,3,4]
        int[] nums2 = {1, 2, 3, 4};
        System.out.println("Test case 2: Contains duplicate = " + solution.containsDuplicate(nums2)); // Expected: false

        // Test case 3: nums = [1,1,1,3,3,4,3,2,4,2]
        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println("Test case 3: Contains duplicate = " + solution.containsDuplicate(nums3)); // Expected: true
    }
}
