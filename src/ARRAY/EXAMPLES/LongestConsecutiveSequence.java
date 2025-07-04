package ARRAY.EXAMPLES;
import java.util.ArrayList;
import java.util.Collections;

public class LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {

        // Create ArrayList and add numbers
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            list.add(nums[i]);

        }

        // If empty, return 0
        if (list.size() == 0) {

            return 0;

        }

        // Sort the ArrayList
        Collections.sort(list);

        // Count consecutive sequences
        int maxLength = 1; // Longest sequence length

        int currentLength = 1; // Current sequence length

        for (int i = 1; i < list.size(); i++) {

            // Skip duplicates
            if (list.get(i).equals(list.get(i - 1))) {

                continue;

            }
            // Check if consecutive (current = previous + 1)
            if (list.get(i) == list.get(i - 1) + 1) {
                currentLength++;
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                }
            } else {
                // Reset sequence if not consecutive
                currentLength = 1;
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        LongestConsecutiveSequence solution = new LongestConsecutiveSequence();

        // Test case 1: nums = [100,4,200,1,3,2]
        int[] nums1 = {100, 4, 200, 1, 3, 2};
        System.out.println("Test case 1: Longest sequence length = " + solution.longestConsecutive(nums1)); // Expected: 4

        // Test case 2: nums = [0,3,7,2,5,8,4,6,0,1]
        int[] nums2 = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        System.out.println("Test case 2: Longest sequence length = " + solution.longestConsecutive(nums2)); // Expected: 9

        // Test case 3: nums = []
        int[] nums3 = {};
        System.out.println("Test case 3: Longest sequence length = " + solution.longestConsecutive(nums3)); // Expected: 0
    }
}
