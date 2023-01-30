//package is the folder in which your java file lies
//useCase: this(some) function is only be access to files that are in this named package
//provides this layer of security for your java files from one files of package to others
package com.prasad;

import java.util.Scanner;

public class InputFromUser {
    //String[] args these are command line arguments
    public static void main(String[] args) {
        //scanner class for inputs using util package
        Scanner userInput = new Scanner(System.in);
        int random = userInput.nextInt();
        String random_2 = userInput.next();
        // system class for output
        System.out.println(random);
        System.out.println(random_2);
         // System.out.println(args[0]);
    }



}
