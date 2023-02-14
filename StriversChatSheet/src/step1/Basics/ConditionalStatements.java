package step1.Basics;

import java.util.Scanner;

public class ConditionalStatements {
    //write a program to take input og an age
    //print he is adult or not
    //>=21, yes
    //< 21, no
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your age: ");
        int ageHolder = input.nextInt();
        System.out.println("enter your name: ");
        String nameHolder = input.next();
        if(ageHolder >= 21){
            System.out.println("he is adult");
        }
        else if(ageHolder <9) {
            System.out.println("he is not");
        }
        switch (ageHolder){
            case 1 :
                System.out.println("print yes");
            case 9:
                System.out.println("print no");


        }
        switch (nameHolder){
            case "perugu":
                System.out.println("he is perugu");
                break;
            case "prasad" :
                System.out.println("he is prasad");
                break;
            case "surya":
                System.out.println("he is surendra");
                break;

        }


    }
}
