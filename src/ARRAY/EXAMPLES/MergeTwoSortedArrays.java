package ARRAY.EXAMPLES;

public class MergeTwoSortedArrays {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        // Create a temporary array to store merged result
        int[] result = new int[m + n];

        // Initialize pointers for nums1, nums2, and result
        int i = 0; // Pointer for nums1

        int j = 0; // Pointer for nums2
        int k = 0; // Pointer for result

        // Compare elements from nums1 and nums2, add smaller to result
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                result[k] = nums1[i];
                i++;
            } else {
                result[k] = nums2[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements from nums1, if any
        while (i < m) {
            result[k] = nums1[i];
            i++;
            k++;
        }

        // Copy remaining elements from nums2, if any
        while (j < n) {
            result[k] = nums2[j];
            j++;
            k++;
        }

        // Copy result back to nums1
        for (int index = 0; index < m + n; index++) {
            nums1[index] = result[index];
        }
    }

    public static void main(String[] args) {
        MergeTwoSortedArrays solution = new MergeTwoSortedArrays();

        // Test case 1: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        solution.merge(nums1, m, nums2, n);
        System.out.print("Test case 1: ");
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.println(); // Expected: 1 2 2 3 5 6

        // Test case 2: nums1 = [1], m = 1, nums2 = [], n = 0
        int[] nums1_2 = {1};
        m = 1;
        int[] nums2_2 = {};
        n = 0;
        solution.merge(nums1_2, m, nums2_2, n);
        System.out.print("Test case 2: ");
        for (int i = 0; i < nums1_2.length; i++) {
            System.out.print(nums1_2[i] + " ");
        }
        System.out.println(); // Expected: 1

        // Test case 3: nums1 = [0], m = 0, nums2 = [1], n = 1
        int[] nums1_3 = {0};
        m = 0;
        int[] nums2_3 = {1};
        n = 1;
        solution.merge(nums1_3, m, nums2_3, n);
        System.out.print("Test case 3: ");
        for (int i = 0; i < nums1_3.length; i++) {
            System.out.print(nums1_3[i] + " ");
        }
        System.out.println(); // Expected: 1
    }
}
