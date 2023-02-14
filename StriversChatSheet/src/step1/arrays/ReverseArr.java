package step1.arrays;

import java.util.Arrays;

import static step1.arrays.ArrayQuestions0.swap;

public class ReverseArr {
    public static void main(String[] args) {
        int[] arr = {2,4,4,34,40,49,41};
        revese(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void revese(int[] a){
        int start = 0;
        int end = a.length-1;
        while (start < end){
             swap(a,start,end);
             start++;
             end--;
            
        }
    }
}
