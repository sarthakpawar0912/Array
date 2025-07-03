package ARRAY.EXAMPLES;


import java.util.HashSet;

public class ZeroSumSubarrayChecker {

    // Function to check if a subarray with 0 sum exists
    public static boolean hasZeroSumSubarray(int[] arr) {
      
        HashSet<Integer> sumSet = new HashSet<>();

        int sum = 0;

        for (int num : arr) {

            sum += num;

            // Check for three conditions:
            // 1. current sum is 0
            // 2. current element is 0
            // 3. sum already seen before (means subarray in between sums to 0)

            if (sum == 0 || num == 0 || sumSet.contains(sum)) {

                return true;

            }

            sumSet.add(sum);

        }

        return false;

    }

    // Main function to run multiple test cases
    public static void main(String[] args) {

        int[][] testCases = {

                {4, 2, -3, 1, 6},     // true: [2, -3, 1]

                {1, 2, 3},            // false
                {-3, 2, 3, 1, 6},     // true: [-3, 2, 1]
                {1, -1},              // true: [1, -1]
                {0},                  // true: [0]
                {},                   // false
                {1, 2, -2, 3},        // true: [2, -2]
                {3, 4, -7, 5, -6, 2}  // true: [3, 4, -7]
        };

        for (int i = 0; i < testCases.length; i++) {
            boolean result = hasZeroSumSubarray(testCases[i]);
            System.out.println("Test case " + (i + 1) + ": " + (result ? "Zero-sum subarray exists" : "No zero-sum subarray"));
        }
    }
}
