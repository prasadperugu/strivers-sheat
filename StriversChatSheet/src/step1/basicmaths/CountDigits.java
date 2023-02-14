package step1.basicmaths;

public class CountDigits {
    public static void main(String[] args) {
        //% operator will give you the remainder since
        //you will get last digit of that number using modulo(%) operator
        int n = 778988;
        int res=count(n);
        System.out.println(res);
//        while (n > 0) {
//            int lastDigit = n % 10;
//            System.out.print(lastDigit);
//            n = n / 10; //now the value will be 778
//        }

        //code 1:


    }
    public static int count(int n){
        int count = 0;
        while(n>0){
//            int lastDigit = n%10;
            count++;
            n = n/10;
        }
        return count;
    }

}
