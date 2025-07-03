package ARRAY.EXAMPLES;

import java.util.ArrayList;

public class TrappingRainWater {

    public int trap(int[] height) {

        // Convert height to ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < height.length; i++) {

            list.add(height[i]);

        }

        int n = list.size();

        if (n <= 2) return 0; // Need at least 3 bars to trap water

        int left = 0, right = n - 1;

        int leftMax = 0, rightMax = 0;

        int water = 0;

        // Two-pointer approach
        while (left < right) {

            // Process the smaller side
            if (list.get(left) <= list.get(right)) {

                // Update leftMax
                if (list.get(left) >= leftMax) {

                    leftMax = list.get(left);

                } else {

                    // Water trapped at left
                    water += leftMax - list.get(left);

                }

                left++;

            } else {

                // Update rightMax
                if (list.get(right) >= rightMax) {

                    rightMax = list.get(right);

                } else {

                    // Water trapped at right
                    water += rightMax - list.get(right);

                }

                right--;

            }

        }

        return water;

    }

    public static void main(String[] args) {

        TrappingRainWater solution = new TrappingRainWater();

        // Test case 1: height = [0,1,0,2,1,0,1,3,2,1,2,1]
        int[] height1 = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};

        System.out.println("Test case 1: Water trapped = " + solution.trap(height1)); // Expected: 6

        // Test case 2: height = [4,2,0,3,2,5]
        int[] height2 = {4, 2, 0, 3, 2, 5};

        System.out.println("Test case 2: Water trapped = " + solution.trap(height2)); // Expected: 9

        // Test case 3: height = [1]
        int[] height3 = {1};

        System.out.println("Test case 3: Water trapped = " + solution.trap(height3)); // Expected: 0
    }
}
