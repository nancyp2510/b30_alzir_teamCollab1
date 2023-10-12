package week03_omid;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check if it is truly prime number or not: ");

        //We take the input from the user and store it in a variable of int type number using the Scanner
        int number = scanner.nextInt();

        //We call the isPrime() function and pass the taken number as a parameter. This function returns true if the number is prime; otherwise, it returns false.
        if (isPrime(number)) {
            System.out.println(number + " is prime number");
        } else {
            System.out.println(number + " is a non-prime number");
        }
    }

         // We define the isPrime() function. Inside isPrime(), we first check if the number is less than or equal to one, and if the condition is satisfied, then it simply returns false.
        static boolean isPrime(int num){

        if (num <= 1){
            return false;
        }

            //We run a for loop from 2 to number/2, and if any divisor of the number is found, then it returns false (the number is not prime).
            for (int i = 2; i <= num/2; i++) {

                if ((num%i)==0){
                    return false;
                }
            }

            //After we end the loop, it returns true because we do not find any divisor of the number.
            return true;

        }



}
/*
1. Numbers -- Prime Number
Write a method that can check if a number is
prime or not

 */