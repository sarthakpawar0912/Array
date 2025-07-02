package ARRAY.EXAMPLES;

public class FindMinMaxElement {

    public int[] findMinMax(int[] nums) {
        int min = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        FindMinMaxElement element = new FindMinMaxElement();
        int[] nums = {23, 54, 0, -5, 67};
        int[] result = element.findMinMax(nums);
        System.out.println("Minimum: " + result[0]);
        System.out.println("Maximum: " + result[1]);
    }
} 