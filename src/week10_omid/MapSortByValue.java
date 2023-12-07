package week10_omid;

import java.util.*;

public class MapSortByValue {

    public static void main(String[] args) {


        Map<String, Integer> unsortedMap = new HashMap<>();

        unsortedMap.put("Bashar", 18);
        unsortedMap.put("Alice", 25);
        unsortedMap.put("Bob", 30);
        unsortedMap.put("Eve", 20);
        unsortedMap.put("David", 35);


        System.out.println("Original Map: " + unsortedMap);

        // Call the sortMapByValues method to sort the map by values in ascending order
        Map<String, Integer> sortedMap = sortMapByValues(unsortedMap);


        System.out.println("Sorted Map by Values (Ascending): " + sortedMap);
    }


    public static Map<String, Integer> sortMapByValues(Map<String , Integer> map){
        // Convert the map's entries to a list of Map.Entry objects
        List<Map.Entry<String, Integer>> list = new LinkedList<>(map.entrySet());

        // Sort the list of entries by values in ascending order
        list.sort(Map.Entry.comparingByValue());

        // Create a new LinkedHashMap to store the sorted entries
        Map<String, Integer> sortedMap = new LinkedHashMap<>();

        for (Map.Entry<String, Integer> entry : list){
            // Copy each sorted entry into the new map
            sortedMap.put(entry.getKey(), entry.getValue());
        }


        return sortedMap;
    }
}
