package step2;

import java.util.Arrays;
import java.util.Scanner;

/*
selection sort=>
 1.select minimum & swap it
 2.select minimum again & swap it
 3...
 */
public class SelectionSorting {
    public static void main(String[] args) {
        Scanner arr = new Scanner(System.in);
        System.out.println("Enter the array of elements:");
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = arr.nextInt();
        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i <= array.length-2; i++) {
            int min = array[0];
            for (int j = 0; j <= array.length-1; j++) {
                if(array[i]<array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }



            
        }
        System.out.println(Arrays.toString(array));



    }
}
