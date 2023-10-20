package week04_zulya;

import java.util.Arrays;
import java.util.TreeSet;

public class SameLetters {

    //String -- Same letters
    //Write a return method that check if a string is build out of the same letters as another string.
    //Ex: same("abc", "cab"); -> true
    //same("abc", "abb"); -> false:
    public static void main(String[] args) {
        System.out.println(sameLetters("aCd", "cAd"));
        System.out.println(sameLetters("abb","acb"));
    }

    public static boolean sameLetters(String str1, String str2) {

        str1 = new TreeSet<String>(Arrays.asList(str1.toLowerCase().split(""))).toString();

        str2 = new TreeSet<String>(Arrays.asList(str2.toLowerCase().split(""))).toString();

        return str1.equals(str2);
    }
}
