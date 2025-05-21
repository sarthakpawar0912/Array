package ARRAY;

public class MaxInArray {
   
    public static void main(String[] args) {

       int[] arr={32,12,655,78,54,86,03,99};
        System.out.println(max(arr));
}
static int max(int[] arr) {
    int maxVal = arr[0];
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] > maxVal) {
            maxVal = arr[i];
        }
    }
    return maxVal;
}
}
