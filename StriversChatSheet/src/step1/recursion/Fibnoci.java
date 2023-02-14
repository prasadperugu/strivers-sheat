package step1.recursion;

import java.util.Scanner;

public class Fibnoci {
    public static void main(String[] args) {
//        int n1=0;
//        int n2=1;
//        int fib=0;
//        Scanner input = new Scanner(System.in);
//        System.out.println("please enter the number:"+" ");
//        int n=input.nextInt();
//        for (int i = 0; i < n; i++) {
//
//            fib = n1+n2;
//            n1=n2;
//            n2=fib;
//
//        }
//        System.out.println(fib);
        int x =fibo(6);
        System.out.println(x);




    }
    static int fibo(int n){
        if(n<2){
            return  n;
        }

        return fibo(n-1) + fibo(n-2);

    }

}
