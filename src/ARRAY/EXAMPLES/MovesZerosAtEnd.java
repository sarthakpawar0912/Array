package ARRAY.EXAMPLES;

public class MovesZerosAtEnd {

    public void moveZeroes(int[] nums) {
        // Initialize a pointer to track the position where the next non-zero element should be placed
        int insertPos = 0;

        // First pass: Move all non-zero elements to the front of the array
        // Iterate through each element in the array
        for (int num : nums) {
            // If the current element is not zero, place it at insertPos and increment insertPos
            if (num != 0) {
                nums[insertPos] = num;
                insertPos++;
            }
        }

        // Second pass: Fill the remaining positions from insertPos to the end with zeros
        // Continue until insertPos reaches the end of the array
        while (insertPos < nums.length) {
            nums[insertPos] = 0;
            insertPos++;
        }
    }

    public static void main(String[] args) {
        // Create an instance of MovesZerosAtEnd
        MovesZerosAtEnd mover = new MovesZerosAtEnd();
        // Example array with zeros and non-zero elements
        int[] nums = {0, 1, 0, 3, 12};
        // Call the moveZeroes method to modify the array in-place
        mover.moveZeroes(nums);
        // Print the modified array to verify the result
        System.out.print("Array after moving zeros to end: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}