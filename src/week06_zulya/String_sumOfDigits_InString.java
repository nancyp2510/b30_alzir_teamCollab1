package week06_zulya;

public class String_sumOfDigits_InString {

    //Write a method that can return the sum of the digits in a string
    public static void main(String[] args) {

        System.out.println("sum of the digits in the string = " + sumFromString(""));

    }

    public static int sumFromString(String word){

        if (word.isEmpty()){
            System.err.println("String can not be empty");
        }
        int sum =0;
        for (int i = 0; i < word.length(); i++) {

            if (Character.isDigit(word.charAt(i))){
                sum+= Character.getNumericValue(word.charAt(i));
            }
        }

        return sum;
    }
}
