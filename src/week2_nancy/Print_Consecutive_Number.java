package week2_nancy;

import java.util.ArrayList;
import java.util.List;

public class Print_Consecutive_Number {
    public static void main(String[] args) {
       Integer N = 24;
       codilityTestCoders(N);

    }

    public static void codilityTestCoders(Integer N){
        List<String> list = new ArrayList<>();
        for (Integer i = 1; i <= N; i++) {
            list.add( (i%2==0 && i%3 ==0 && i%5 ==0)?"CodilityTestCoders"
                    :(i%2==0 && i%3 ==0)?"CodilityTest"
                    :(i%2==0 && i%5 ==0)?"CodilityCoders"
                    :(i%3 ==0 && i%5 ==0)?"TestCoders"
                    :(i%2==0)?"Codility"
                    :(i%3 ==0)?"Test"
                    :(i%5 ==0)?"Coders"
                    :(i+"")
            );
        }

        for(String each : list){
            System.out.println(each);
        }
    }

}
