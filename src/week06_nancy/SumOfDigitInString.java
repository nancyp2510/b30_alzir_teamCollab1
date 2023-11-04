package week06_nancy;

public class SumOfDigitInString {

    public static void main(String[] args) {
        String inputString1 = "12 plants and 3 flowers";
        String inputString2 = "5 girls travel thru 6 states in 7 days";
        System.out.println("sumOfDigitInString(inputString1) = " + sumOfDigitInString(inputString1));
        System.out.println("sumOfDigitInString(inputString1) = " + sumOfDigitInString(inputString2));

    }

    public static int sumOfDigitInString(String inputString){
        int sum = 0;
        for(char eachChar : inputString.toCharArray()){
            if(Character.isDigit(eachChar)){
                //to convert char into int, then add to sum
                sum+= Integer.parseInt(String.valueOf(eachChar));
            }
        }
        return sum;
    }

}
/*
String -- sum of digits in a string Write a method that can return the sum of the digits in a string
 */