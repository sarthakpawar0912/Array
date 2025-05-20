package ARRAY;
import java.util.Arrays;

public class SWAP {

    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,6,7,8,9,10,11,12};

        swap(arr,1,9);

        System.out.println(Arrays.toString(arr));

    }
    static void swap(int[] arr,int i,int j){

        int temp=arr[i];

        arr[i]=arr[j];

        arr[j]=temp;

    }
}
