package com.prasad;
//string=> collection sequence of characters, string is declared as final which means you cannot modify it
public class StringsInDeep {
    public static void main(String[] args) {
        //string=>datatype, a=>reference variable, prasad=>object
        String a = "prasad";
        String b = "prasad";
        /*
        if i create same object twice with different reference variable,
        how many objects was created in heap?
        ans: only one object is created all ref variables are pointing to same object.
        concepts:
        1.string pool:- string pool is a separate memory structure inside heap.
        all the similar values of strings are not re-created in the pool.
        usecase: makes out program more optimise.
        2. immutability:- you cannot change/modify the string objects.
        only you can create a new object to modify.
         */

        String name = "prasad";
        System.out.println(name);
        name = "surendra";
        System.out.println(name);







    }
}
