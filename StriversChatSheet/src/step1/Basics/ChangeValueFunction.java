package step1.Basics;

import java.util.Arrays;

public class ChangeValueFunction {
    public static void main(String[] args) {
        String[] names = {"prasad","perugu","peruguprasad"};
        changeName(names);
//                changeName(String.valueOf(names));
//        int[] p = {212,6,6,6};
//        changeName(p);
        System.out.println(Arrays.toString(names));

    }

    static void changeName(String[] p){
         p[0] = "per";
    }
}
