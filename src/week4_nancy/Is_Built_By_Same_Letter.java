package week4_nancy;

import java.util.Arrays;

public class Is_Built_By_Same_Letter {
    public static void main(String[] args) {
        String str1 = null;
        String str2 = "cab";

        String str3 = "abc";
        String str4 = "cab";

        String str5 = "apple";
        String str6 = "eppla";

        System.out.println("isBuiltBySameLetter_Palindrome(str1,str2) = " + isBuiltBySameLetter_Palindrome(str1, str2));
        System.out.println("isBuiltBySameLetter_Palindrome(str3,str4) = " + isBuiltBySameLetter_Palindrome(str3, str4));

        System.out.println("isBuiltBySameLetters(str3,str4) = " + isBuiltBySameLetters(str3, str4));
        System.out.println("isBiultBySameLetters(str5,str6) = " + isBuiltBySameLetters(str5, str6));
    }

    //IF PALINDROME - palindrome is the words/number/phrases that read backward same as forward
    public static boolean isBuiltBySameLetter_Palindrome(String str1, String str2){
        if(str1==null){
            return str2==null;
        }else if(str2==null){
            return false;
        }

        String reverseStr2 ="";
        for(int i = str2.length()-1;i>=0;i--){
           char eachLetterOfStr2 = str2.charAt(i);
            reverseStr2 += eachLetterOfStr2;
        }
        if(str1.equalsIgnoreCase(reverseStr2)){
            return true;
        }
        return false;
    }

    // IF REALLY BUILT BY THE SAME LETTERS
    public static boolean isBuiltBySameLetters(String str1, String str2){
        if(str1==null){
            return str2==null;
        }else if(str2==null){
            return false;
        }

        /*
        ARRAYS has these popular/most used methods: toString(), sort(),equals(), copyOfRange(), copyOf()
        Ex: Arrays.copyOfRange(arrayName, index1,index2) -->copy from arrayName , element from index1 to index2
         */
        char[] str1Array = str1.toCharArray();
        char[] str2Array = str2.toCharArray();

        Arrays.sort(str1Array); // don't have to re-assign
        Arrays.sort(str2Array);

        return Arrays.equals(str1Array,str2Array);
    }


}
/*
String
Same letters
Write a return method that check if a string is build out of the
same letters as another string.
Ex:
same(" abc ",","cab"); --> true
same("abc abb "); -->
 */