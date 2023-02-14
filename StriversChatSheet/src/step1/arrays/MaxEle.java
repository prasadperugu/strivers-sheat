package step1.arrays;

public class MaxEle  {
    public static void main(String[] args) {
        int[] arr = {1,0,2,5,4};
        int ans = max(arr);
        System.out.println(ans);
    }

    static int max(int[] a){
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if(a[i] > max){
                max = a[i];
            }

        }
        return max;




    }

}
