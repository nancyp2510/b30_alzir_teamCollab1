package Week01_omid;

import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number");
        int num1 = input.nextInt();


        if (num1 % 2 == 0){
            System.out.println(num1+" is even number");
        }else {
            System.out.println(num1+ " is odd number");
        }
    }
}
