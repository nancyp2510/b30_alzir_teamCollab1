package nancy_week11;

import java.util.HashMap;
import java.util.Map;

public class MinValueInMap {
    public static void main (String[] args){
        Map<String, Integer> map = new HashMap<>();
        map.put("Mike", 6000);
        map.put("Ryan", 5500);
        map.put("Emma", 4000);
        map.put("Rosie", 7600);
        map.put("Bobby", 8200);

        Map<String, Integer> map2 = Map.of("Julia",10000,"Adam",8700,"Henry",9768,"William",4589);

        System.out.println("minValueOfMap(map) = " + minValueOfMap(map));
    }

    public static Integer minValueOfMap(Map<String, Integer> map){
        Integer min = Integer.MAX_VALUE;
        for(Map.Entry<String,Integer> eachEntry: map.entrySet()){
            if(eachEntry.getValue() < min){
                min = eachEntry.getValue();
            }
        }
        return min;
    }


}
/*
Map - Min value
Write a method that can return the minimum value from a map (DO NOT
use sort method).
 */