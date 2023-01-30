package com.prasad;

public class FunctionsPassByValue {
    public static void main(String[] args) {
        /*
        for primitives:- just passing value only
        for non-primitives:- passing value of the reference variable
         */
        int a = 10;
        int b = 20;
        //copy of the reference variable value hase been passed
       int handleRes= swap(a,b);
        System.out.println(handleRes);
        String name = "prasad";
        changeName(name);
        System.out.println(name);

    }
    static int swap(int x, int y) {
       int temp = x;
       x = y;
       y = temp;
        System.out.println(x+" "+y);
        return x+y;
    }
    static void changeName(String naam){
        naam = "surendra"; //just creating name new object not modifying/changing it
    }

}
