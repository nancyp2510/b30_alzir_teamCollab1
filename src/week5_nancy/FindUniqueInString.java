package week5_nancy;

public class FindUniqueInString {
    public static void main(String[] args) {
        String input = "AAABBBCCCDEF";
        System.out.println("uniqueChar(input) = " + uniqueChar(input));

    }
public static String uniqueChar(String input){
        String output = "";
        for(char eachChar: input.toCharArray()){
            int frequency = 0;
            for(char eachLetter: input.toCharArray()){
                if(eachChar == eachLetter){
                    frequency ++;
                }
            }
            if(frequency == 1){
                output += eachChar + "";
            }
        }

       return output;
}

}
/*
String -- Find the unique
Write a return method that can find the unique characters from the String
Ex: unique("AAABBBCCCDEF") ==> "DEF";
 */