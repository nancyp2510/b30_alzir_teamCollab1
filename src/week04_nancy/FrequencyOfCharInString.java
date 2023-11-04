package week04_nancy;

public class FrequencyOfCharInString {
public static void main (String[] args){

    String inputString1 = null;
    String inputString2 = "";
    String inputString3 = "                      ";
    String inputString4 = "AAABBCDD";

//    System.out.println("frequencyOfChar(inputString1) = " + frequencyOfChar(inputString1));
//    System.out.println("frequencyOfChar(inputString2) = " + frequencyOfChar(inputString2));
//    System.out.println("frequencyOfChar(inputString3) = " + frequencyOfChar(inputString3));
//    System.out.println("frequencyOfChar(inputString4) = " + frequencyOfChar(inputString4));

    System.out.println("frequencyOfChar(inputString1) = " + frequencyOfChar2(inputString1));
    System.out.println("frequencyOfChar(inputString2) = " + frequencyOfChar2(inputString2));
    System.out.println("frequencyOfChar(inputString3) = " + frequencyOfChar2(inputString3));
    System.out.println("frequencyOfChar(inputString4) = " + frequencyOfChar2(inputString4));

}

    //NOT REALLY BEST METHOD, USE METHOD2 BETTER.
    public static String frequencyOfChar(String inputString) {
//NOT REALLY GOOD WAY TO HANDLE THIS CASE, USE THE METHOD2 BETTER
        String result = "";

        try {
            for (char eachChar : inputString.toCharArray()) {
                int frequency = 0;
                for (char eachLetter : inputString.toCharArray()) {
                    if (eachChar == eachLetter && eachChar != ' ') {
                        frequency++;
                    }
                }
                if (!result.contains(eachChar + "")) {
                    result += eachChar + "" + frequency;
                }
            }
            System.err.println("Input String can't be null or empty or blank!!!");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }


    public static String frequencyOfChar2 (String inputString){

    if(inputString == null || inputString.isEmpty() || inputString.isBlank()){
        System.err.println("Input String can't be null / empty / blank !!!");
        return inputString;
    }
        String result = "";

        for (char eachChar : inputString.toCharArray()) {
            int frequency = 0;
            for (char eachLetter : inputString.toCharArray()) {
                if (eachChar == eachLetter ) {
                    frequency++;
                }
            }
            if (!result.contains(eachChar + "")) {
                result += eachChar + "" + frequency;
            }
        }

    return result;

    }

}
/*
String
Frequency of Characters
Write a return method that can find the frequency of
characters
Ex:
FrequencyOfChars ("AAABBCDD") ==> A3B2C1D2
 */