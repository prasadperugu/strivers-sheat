package step1.Basics;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimArray {
    public static void main(String[] args) {
        /*
              1 2 3
              4 5 3
              4 4 5

         */
//        int[][] arr = new int[3][3];
//        int[][] arr2d = {
//                {3,4,5}, //0th index
//                {4,5,}, //1st index
//                {5,5,5,4} //2nd index
//        };
        int[][] arr2d = new int[3][3];
        Scanner in = new Scanner(System.in);
        //input
        for (int i = 0; i < arr2d.length; i++) {
            // for each col in every row
            for (int j = 0; j < arr2d[i].length; j++) {
                arr2d[i][j] = in.nextInt();
            }

        }

        //output way 1
//        for (int i = 0; i < arr2d.length; i++) {
//            // for each col in every row
//            for (int j = 0; j < arr2d[i].length; j++) {
//                System.out.print(arr2d[i][j]+" ");
//            }
//            System.out.println();
//
//        }

        //way 2

//        for (int i = 0; i < arr2d.length; i++) {
//            System.out.println(Arrays.toString(arr2d[i]));
//
//        }

        //way 3

        for(int[] a:arr2d){
            System.out.println(Arrays.toString(a));
        }

    }
}
