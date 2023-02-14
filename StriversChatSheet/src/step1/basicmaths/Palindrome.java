package step1.basicmaths;

public class Palindrome {
    public static void main(String[] args) {
        int number = 161;
//        int p =0;
      int res =  palindrome(number);

      boolean res1 = condition(res,number);
        System.out.println(res1);
       if(res==number){
           System.out.println("its palindrome");
       }
       else {
           System.out.println("no");
       }



    }
    static int palindrome(int x){
        int p = 0;
        while(x>0){
            int ld = x%10;
            x = x/10;
            p = (p*10) + ld;

        }
       return p;
    }
    static boolean condition(int x, int y){
        if(x==y){
            return true;
        }
        return false;
    }
}
