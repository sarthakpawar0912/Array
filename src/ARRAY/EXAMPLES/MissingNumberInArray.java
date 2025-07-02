package ARRAY.EXAMPLES;

import java.util.HashSet;

public class MissingNumberInArray {

    public int missingNumber(int[] arr){
        // Create a HashSet to store array elements
        HashSet<Integer> set = new HashSet<>();
        // Add all array elements to the HashSet
        for(int i = 0; i < arr.length; i++){
            set.add(arr[i]);
        }
        // Check each number in the expected sequence
        for(int i = arr[0]; i <= arr[arr.length - 1]; i++){
            // If a  System: number is not in the HashSet, it is the missing number
            if (!set.contains(i)) {
                return i;
            }
        }
        // In case no missing number is found (though problem assumes one exists)
        return -1;
    }

    public static void main(String[] args) {
        MissingNumberInArray missingNumberInArray = new MissingNumberInArray();
        int[] arr = {1, 2, 3, 5, 6};
        int result = missingNumberInArray.missingNumber(arr);
        System.out.println(result);
    }
}