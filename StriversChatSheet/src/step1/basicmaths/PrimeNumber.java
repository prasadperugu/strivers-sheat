package step1.basicmaths;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the number");
        int n = input.nextInt();
        int count = 0;
        for(int i = 2;i*i<=n;i++){
            if(n%i==0) {
                count++;
                System.out.println(count +" "+i);
            }
        }
        if(count>=1){
            System.out.println("its not prime");
        }
        else{
            System.out.println("its prime");
        }

    }
}
