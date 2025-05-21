package ARRAY;
import java.util.Arrays;
import java.util.Scanner;

public class BasicInput {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int arr[]=new int[5];

        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;

        for (int i=0;i<arr.length;i++){

            arr[i]=sc.nextInt();

        }

        System.out.println(Arrays.toString(arr));


        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }


        System.out.println(arr[5]);   //index out of bound error

        String [] str=new String[5];

        for (int i=0;i<str.length;i++){

            str[i]=sc.next();

        }

        System.out.println(Arrays.toString(str));

    }
}
