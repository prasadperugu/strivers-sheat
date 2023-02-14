package step1.basicmaths;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        int n1 = input1.nextInt();
        Scanner input2 = new Scanner(System.in);
        int n2 = input2.nextInt();
        int gcd = 0;
        for (int i = 1; i <= n1; i++) {

                if (n1 % i == 0 && n2 % i == 0) {
                        gcd = i;


            }


        }
        System.out.println(gcd);

    }
}
