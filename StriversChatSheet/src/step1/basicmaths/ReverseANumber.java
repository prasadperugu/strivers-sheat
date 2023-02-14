package step1.basicmaths;

public class ReverseANumber {
    public static void main(String[] args) {
         double num = 12435346534L;
         int n = 1565;
       int res = reverseAnumber(n);
        System.out.println(res);


    }
    static int reverseAnumber(int n){
      int revNum = 0;
        while(n>0){
            int lastDigit = n%10;
//            System.out.print(lastDigit);
            revNum = (revNum*10)+lastDigit;
            n=n/10;
        }
        return revNum;
    }
}
