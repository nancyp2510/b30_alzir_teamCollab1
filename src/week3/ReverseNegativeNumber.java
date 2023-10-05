package week3;

public class ReverseNegativeNumber {
    public static void main(String[] args) {
        int num = 987654321;
        System.out.println("Reverse number is: " + reverseNegativeNumberUsingString(num));
        System.out.println("Reverse number is: " + reverseNegativeNumberUsingLoop(num));
        System.out.println("Reverse number is: " + reverseNegativeNumberUsingForLoop(num));
    }

    public static int reverseNegativeNumberUsingString(int num){
        String str = num+"";
        if(str.charAt(0)=='-') {
            str = str.substring(1);
        }
        String reverse = "";
        for(int i = str.length()-1;i>=0;i--){
            reverse += str.charAt(i);
        }

        num = Integer.parseInt(reverse);
        return num*(-1);
    }

    public static int reverseNegativeNumberUsingLoop(int num){
        int reverse = 0;
        while(num!=0){
            int remainder = num%10;
            reverse = reverse*10 + remainder;
            num /=10;
        }

        return reverse;
    }

    public static int reverseNegativeNumberUsingForLoop(int num){
        int reverse = 0;
        for(;num!=0;num /=10){
            int remainder = num%10;
            reverse = reverse*10 + remainder ;
        }
        return reverse;
    }
}
/*
2. Numbers -- Reverse negative number
Write a return method that can reverse
negative number and return it as int
 */