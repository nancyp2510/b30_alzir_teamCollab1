package week11_omid;

import java.util.HashMap;
import java.util.Map;

public class MapMinValue {


    public static void main(String[] args) {

        Map<String, Integer> sampleMap = new HashMap<>();
        sampleMap.put("Ali", 30);
        sampleMap.put("John", 15);
        sampleMap.put("Aseel", 50);
        sampleMap.put("Bob", 5);


        int minValue = findMinValue(sampleMap);
        System.out.println("Minimum value in the map: " + minValue);


    }


    public static int findMinValue (Map<String, Integer> map){

        int minValue = Integer.MAX_VALUE; //a constant in the Integer class in Java,

        // Iterate through the values to find the minimum
        for (int value: map.values()){

            if (value < minValue){
                minValue = value;
            }
        }

        return minValue;
    }
}
