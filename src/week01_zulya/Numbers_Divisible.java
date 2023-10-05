package week01_zulya;

import java.util.ArrayList;
import java.util.List;

public class Numbers_Divisible {
    public static void main(String[] args) {

        List<Integer> by15 = new ArrayList<>();
        List <Integer> by5 = new ArrayList<>();
        List <Integer> by3 = new ArrayList<>();



        for (int i = 1; i <= 100; i++) {

            if ( i % 3 == 0 && i % 5 == 0 && i % 15 ==0 ) {
                by15.add(i);
            } else if (i % 5 == 0) {
                by5.add(i);
            } else if (i % 3 == 0) {
                by3.add(i);
            }
        }
            System.out.println("Divisible By 15: "+by15);
            System.out.println("Divisible By 5: "+by5);
            System.out.println("Divisible By 3: "+by3);

    }
}
