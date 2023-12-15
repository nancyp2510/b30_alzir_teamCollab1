package nancy_week11;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharInString {
    public static void main (String[] args){
        String str = "aaabbbbbbbbcccddt";
        System.out.println("frequencyOfChar(str) = " + frequencyOfChar(str));

    }
    public static Map<String,Integer> frequencyOfChar (String str){
        Map<String,Integer> mapOfCharFrequency = new HashMap<>();

        for(String each : str.split("")){
            int frequency = Collections.frequency(Arrays.asList(str.split("")), each);
            mapOfCharFrequency.put(each,frequency);
        }
        return mapOfCharFrequency;
    }
}
/*
Write a method that prints the frequency of each character from a String.
 */