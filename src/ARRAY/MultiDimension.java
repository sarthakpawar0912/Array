package ARRAY;
import java.util.Scanner;

public class MultiDimension {

    public static void main(String[] args) {

     //   int[][]arr=new int[3][3];

//
//        int[][] arr ={
//                {1,2,3}, //0th index
//                {4,5,6}, //1st index
//                {7,8,9}  //2nd index
//        };


//        int[][] arr2D={
//                {1,2,3},//0th index
//                {4,5},  //1st index
//                {6,7,8,9} //2nd index----------->arr2D[2]={6,7,8,9}
//        };

        Scanner sc=new Scanner(System.in);

        //input
        int[][] arr=new int[3][2];
        System.out.println(arr.length);

        for (int row=0;row<arr.length;row++){
            //for each col in every row
            for (int col=0;col<arr[row].length;col++){
                System.out.println("Enter the value for arr["+row+"]["+col+"]:");
                arr[row][col]=sc.nextInt();
            }
        }

        //output
        for (int row=0;row<arr.length;row++){
            for (int col=0;col<arr[row].length;col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }


    }


}
