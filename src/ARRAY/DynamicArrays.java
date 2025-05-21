package ARRAY;
import java.util.ArrayList;
import java.util.Scanner;

public class DynamicArrays {//ArrayLIST

    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>(10);


//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(40);
//        list.add(50);
//        list.add(60);
//        list.add(70);
//        list.add(80);
//        list.add(90);
//        list.add(100);
//       // list.add(110);
//        System.out.println(list);
//        list.remove(1);
//        System.out.println(list);
//        System.out.println(list.contains(55));
//        System.out.println(list.contains(100));

        Scanner sc=new Scanner(System.in);

        //input
        for(int i=0;i<10;i++){

            list.add(sc.nextInt());

        }

        //get item at any index[[0]]
        for(int i=0;i<10;i++){

            System.out.println(list.get(i));

        }
    }
}
