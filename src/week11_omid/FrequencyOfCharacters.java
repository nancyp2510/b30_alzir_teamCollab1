package week11_omid;

import java.util.*;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "aaabbbbbccccccccc";

        // LinkedHashMap to preserve the order of insertion
        Map<String, Integer> map = new LinkedHashMap<>();
        //splits it into an array of individual characters.
        for (String each : str.split("")) {
            int frequency = Collections.frequency(Arrays.asList(str.split("")), each); //converts the array of characters obtained by splitting the string str into a List<String>.
            map.put(each, frequency);
        }

        System.out.println("First solution Frequency of characters = " + map);

        Map<Character, Integer> maps = findCharacterFrequency(str);
        System.out.println("Second solution Frequency of characters = " + map);
    }


    public static Map<Character, Integer> findCharacterFrequency(String str) {
        Map<Character, Integer> map = new HashMap<>(); //uniqueness of keys.

        // Counting the frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            map.put(currentChar, map.getOrDefault(currentChar, 0) + 1); //It effectively increments the count of the character.
        }

        return map;
    }

}
