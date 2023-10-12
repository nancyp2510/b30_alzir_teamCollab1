package week03_omid;

public class ReverseNegativeNumber {

    public static void main(String[] args) {

        System.out.println(reverseNegativeInt(-321));
    }

    public static int reverseNegativeInt(int num){

        int reverse = 0;

        while (num < 0){
            int lastDigit = num % 10;
            reverse = reverse * 10 + lastDigit;
            num /=10;
        }
        return reverse;
    }
}
