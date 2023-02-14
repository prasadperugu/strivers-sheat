package step1.arrays;

import java.util.Arrays;

public class ArrayQuestions0 {
    public static void main(String[] args) {
        int[]   arr = {1,4,4,6,6};
       int[] ans = swap(arr,1,3);
        System.out.println(Arrays.toString(ans));
    }
    static int[] swap(int[] x,int start, int end){
        int temp = x[start];
        x[start] = x[end];
        x[end]   = temp;
        return x;

    }
}
