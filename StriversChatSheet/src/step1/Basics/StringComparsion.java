package step1.Basics;

public class StringComparsion {
    public static void main(String[] args) {
        /*
        comparsion of strings
        1. == (comprator) method
        checks reference variables(same values) are pointing to same object or not in pool;
        2. .equals() method
        when you only need to check the values.

         */

        String a = "prasad";
        String b = "prasad";
        System.out.println(a==b);


        /*
         create different objects of same value:
         these values are created outside the pool but inside the heap
         */

         String  c = new String("prasad");
         String  d = new String("prasad");
        System.out.println(c==d); // false
        System.out.println(c.equals(d)); //true


    }
}
