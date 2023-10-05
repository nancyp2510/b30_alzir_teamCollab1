package Week01_omid;

import java.util.Scanner;

public class WithoutOperator {

    public static void main(String[] args) {

        int num1 ,num2 , numbers;
        int result = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number");
        num1 = input.nextInt();

        System.out.println("Enter your second number");
        num2 = input.nextInt();


        System.out.println("Result is : "+Math.floorDiv(num1,num2));
    }
}
