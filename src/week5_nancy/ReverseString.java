package week5_nancy;

public class ReverseString {
    public static void main(String[] args) {
    String input = "ABCD";
        System.out.println("reverseString(input) = " + reverseString(input));


    }
    public static String reverseString(String input){
        String reverse ="";
        for(int i = input.length()-1;i>=0;i--){
            reverse += input.charAt(i);
        }
        return reverse;
    }


}
/*
String -- Reverse
Write a return method that can reverse String
Ex: Reverse("ABCD"); ==> DCBA
 */