package step1.Basics;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysInDeep {
    public static void main(String[] args) {
        // syntax
        // datatype[] variable_name = new datatype[size];
        // store 5 rool nos
//        int[] rnos = new int[5];
//        // or directly

        Scanner arrayInput = new Scanner(System.in);
//        int[] arrayValues = new int[5];
//        //input using for loops
//        for (int i = 0; i < arrayValues.length; i++) {
//            arrayValues[i] = arrayInput.nextInt();
//        }
//        //1st way
//        for (int i = 0; i < arrayValues.length; i++) {
//            System.out.println(arrayValues[i]);
//
//        }
//
//        //for each loop(2nd way to print loop)
//        for (int num : arrayValues) {
//            System.out.print(num + " ");
//        }
//
//        //toStringMethod=>when you pass an array into it,it converts
//        //it into a string and print that string(3rd way to print loop)
//        System.out.println(Arrays.toString(arrayValues));
//
//        //array of objects
//        String[] names = new String[4];
//        //input using for loop
//        for (int i = 0; i < names.length; i++) {
//            names[i] = arrayInput.next();
//
//        }
//        //1st way
//        for (int i = 0; i < names.length; i++) {
//            System.out.println(names[i]);
//
//        }
//
//        //for each loop(2nd way to print loop)
//        for (String num : names) {
//            System.out.print(num + " ");
//        }
//
//        //3rd way
//        System.out.println(Arrays.toString(names));

        //Array of objects
        String[] str = new String[3];
        for (int i = 0; i < str.length; i++) {
            str[i] = arrayInput.next();
        }
        System.out.println(Arrays.toString(str));
        //modify
        str[1] = "ppp";
        System.out.println(Arrays.toString(str));


    }
}
