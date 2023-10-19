package week03_zulya;

public class PrimeNumber {

    //1. Numbers -- Prime Number
    //Write a method that can check if a number is prime or not
    public static void main(String[] args) {

        int number = 5;
        System.out.println(number +" " + primeNumber(number));
    }


    public static boolean primeNumber(int number) {

        if (number <= 1) {
            return false;
        }

        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
}
