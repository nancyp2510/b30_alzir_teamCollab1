package week01_zulya;

import org.w3c.dom.ls.LSOutput;

public class Numbers_ConsecutiveNumbers {
    public static void main(String[] args) {


        int N = 24;

        // % 2 replace with Codility
        //% 3 replace with Test
        //% 5 replace with Coders


        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
                System.out.println("CodilityTestCoders");
            } else if (i % 2 == 0 && i % 3 == 0) {
                System.out.println("CodilityTest");
            }else if(i % 3 == 0 && i % 5 == 0){
                System.out.println("TestCoders");
            }else if (i % 2 == 0 && i % 5 == 0){
                System.out.println("CodilityCoders");
            }else if(i % 2 == 0){
                System.out.println("Codility");
            } else if (i % 3 == 0) {
                System.out.println("Test");
            }else if (i % 5 == 0){
                System.out.println("Coders");
            }else {
                System.out.println(i);
            }

        }


    }
}
