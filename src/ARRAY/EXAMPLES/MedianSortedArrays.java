package ARRAY.EXAMPLES;

import java.util.ArrayList;

public class MedianSortedArrays {


    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Convert nums1 to ArrayList
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            list1.add(nums1[i]);
        }
        // Convert nums2 to ArrayList
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            list2.add(nums2[i]);
        }

        // Merge the two sorted ArrayLists
        ArrayList<Integer> merged = new ArrayList<>();
        int i = 0; // Index for list1
        int j = 0; // Index for list2

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) <= list2.get(j)) {
                merged.add(list1.get(i));
                i++;
            } else {
                merged.add(list2.get(j));
                j++;
            }
        }
        // Add remaining elements from list1
        while (i < list1.size()) {
            merged.add(list1.get(i));
            i++;
        }
        // Add remaining elements from list2
        while (j < list2.size()) {
            merged.add(list2.get(j));
            j++;
        }

        // Find median
        int total = merged.size();
        if (total % 2 == 1) {
            // Odd length: return middle element
            return merged.get(total / 2);
        } else {
            // Even length: average of two middle elements
            return (merged.get(total / 2 - 1) + merged.get(total / 2)) / 2.0;
        }
    }

public static void main(String[] args) {
    MedianSortedArrays solution = new MedianSortedArrays();

    // Test case 1: nums1 = [1,3], nums2 = [2]
    int[] nums1_1 = {1, 3};
    int[] nums2_1 = {2};
    System.out.println("Test case 1: Median = " + solution.findMedianSortedArrays(nums1_1, nums2_1)); // Expected: 2.0

    // Test case 2: nums1 = [1,2], nums2 = [3,4]
    int[] nums1_2 = {1, 2};
    int[] nums2_2 = {3, 4};
    System.out.println("Test case 2: Median = " + solution.findMedianSortedArrays(nums1_2, nums2_2)); // Expected: 2.5

    // Test case 3: nums1 = [], nums2 = [1]
    int[] nums1_3 = {};
    int[] nums2_3 = {1};
    System.out.println("Test case 3: Median = " + solution.findMedianSortedArrays(nums1_3, nums2_3)); // Expected: 1.0
}
}