package step1.Basics;

import java.util.Arrays;
//arrays are mutable in java the orginal object can be mofify/changed
public class ArrayPassingInFun {
    public static void main(String[] args) {
        int[] nums = {22,5,6,88};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr){
        arr[1] = 11;
    }

}
