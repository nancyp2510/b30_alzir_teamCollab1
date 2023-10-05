package week2_nancy;

import java.util.ArrayList;
import java.util.List;

public class Number_DivisibleBy3_5_15 {
    public static void main(String[] args) {
        List<Integer> divisibleBy15 = new ArrayList<>();
        List<Integer> divisibleBy5 = new ArrayList<>();
        List<Integer> divisibleBy3 = new ArrayList<>();

        for (int i = 1; i <= 100 ; i++) {
            if(i % 15 == 0){
                divisibleBy15.add(i);
            }else if(i%5 == 0){
                divisibleBy5.add(i);
            }else if(i%3 == 0){
                divisibleBy3.add(i);
            }else{
                continue;
            }
        }

        System.out.println("Divisible By 15 : " + divisibleBy15);
        System.out.println("Divisible By 5 : " + divisibleBy5);
        System.out.println("Divisible By 3 : " + divisibleBy3);

    }
}

/*
Write a program that can print the number between 1~100 that can divisible by 3,5 and 15
 */