package week02_omid;

import java.util.ArrayList;
import java.util.List;

public class NumbersDivisibleBy_3_5_15 {

    public static void main(String[] args) {


        List<Integer> DivBy3 = new ArrayList<>();
        List<Integer> DivBy5 = new ArrayList<>();
        List<Integer> DivBy15 = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {

          //  System.out.println(i);
            if (i % 15 == 0){
                DivBy15.add(i);
            }else if (i % 5 == 0){
                DivBy5.add(i);
            } else if (i % 3 == 0) {

                DivBy3.add(i);
            }
        }

        System.out.println("Divisible by 3:" + DivBy3 + "\nDivisible by 5: "+DivBy5+ "\nDivisible by 15: "+DivBy15);
    }
}
