package week3;

public class PrimeNumber {
    // Prime number are numbers greater than 1 AND only divisible for 1 and itself (divisible for more nums is not primeNumber)
    public static void main(String[] args) {
        int num = -7;
        System.out.println(num + " is prime number: "+ isPrime(num));

    }

    public static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }
        // dividend / divisor = quotient
        // so the divisor is bigger than a half of dividend, it's not completely divisible
        for(int i = 2;i <= num/2;i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
}
/*
1. Numbers -- Prime Number
Write a method that can check if a number is
prime or not
 */