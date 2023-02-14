package step1.recursion;

public class NumberExampleRecursion {
    public static void main(String[] args) {
        number0(1);
    }
    static void number0(int n){
        if(n==5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        //recursive call
        // if you are calling a function again and again, you can treat it as recursion
        number0(n+1);
    }
    //why recursion?
    //solving big problems easily
    //you can convert recursion solutions into iteration and vice versa
    //space complexity is not constant because of recursive calls

}
