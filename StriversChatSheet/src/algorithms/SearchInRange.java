package algorithms;

public class SearchInRange  {
    public static void main(String[] args) {
        int[] arr = {2,5,6,7,3};
        //search for 3 in the range of index [1,4]
        int target = 7;

        System.out.println(search(arr,target,1,4));


    }

    static int search(int[] arr,int target,int start,int end){
        if(arr.length==0){
            return -1;
        }
        for (int i = start; i <= end ; i++) {
            if(arr[i]==target){
                return i;
            }

        }

        return Integer.MAX_VALUE;
    }
}
