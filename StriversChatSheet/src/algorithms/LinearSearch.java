package algorithms;

public class LinearSearch {
    /*
    find whether the element is existed in the array or not
    if no value found return -1
     */
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 2, 5, 34, 6};
        int target = 366;
//        System.out.println(linearSearch(arr, target));
//        System.out.println(linearSearch2(arr,target));
        System.out.println(linearSearch3(arr,target));

    }

    // search in the array: return the index if item is found
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        //run a for loop
        for (int i = 0; i < arr.length; i++) {
            // check for element at every index if it is == target
            // int element = arr[i];
            if (arr[i] == target) {
                return i;
            }

        }
        //this line will execute if none of return statements have executed
        //hence target is not found
        return -1;
    }


    //search the target and return the element
    static int linearSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        // run a for loop
//        for (int i = 0; i < arr.length; i++) {
        for (int element : arr) {
            // check for element at every index if it is == target
//            int element = arr[i];
            if (element == target) {
                return element;
            }
        }
        //this line will execute if none of return statements have executed
        //hence target is not found
        return Integer.MAX_VALUE;
    }


    //search the target and return true or false
    static boolean linearSearch3(int[] arr, int target)  {
        if (arr.length == 0) {
            return false;
        }
        // run a for loop
//        for (int i = 0; i < arr.length; i++) {
        for (int element : arr) {
            // check for element at every index if it is == target
//            int element = arr[i];
            if (element == target) {
                return true;
            }
        }
        //this line will execute if none of return statements have executed
        //hence target is not found
        return false;

    }
}

