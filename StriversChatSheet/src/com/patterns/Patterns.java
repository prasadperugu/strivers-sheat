package com.patterns;

public class Patterns {
    public static void main(String[] args) {
//        pattern1(4);
//        pattern2(5);
        pattern3(3);
//        pattern4(3);
//        pattern5(3);


    }

    static void pattern1(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }

    }

    static void pattern3(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n+1-row; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    static void pattern4(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <=row; col++) {
                System.out.print(col+" ");
            }
            System.out.println();

        }
    }

    static void pattern5(int n){
        for (int row = 0; row < 2*n; row++) {
            int c = 111;

            for (int col = 0; col<c ; col++) {
                System.out.println("* ");





            }

        }
    }
}

