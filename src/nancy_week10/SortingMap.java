package nancy_week10;

import java.util.*;
import java.util.stream.Collectors;

public class SortingMap {
    public static void main (String[] args){
        Map<String, Integer> salary = new HashMap<>();
        salary.put("Mike", 6000);
        salary.put("Ryan", 5500);
        salary.put("Emma", 4000);
        salary.put("Rosie", 7600);
        salary.put("Bobby", 8200);

        System.out.println("sortedMap(salary) = " + sortedMap(salary));
    }

    public static Map<String, Integer> sortedMap(Map<String, Integer> map){
        //Use LinkedHashMap as it keeps inserting order
    LinkedHashMap<String, Integer> sortedMap = map.entrySet()
            .stream()
            .sorted(Map.Entry.comparingByValue()) // this is a method of Comparator interface - part of Collection Framework
            .collect(Collectors.toMap(
                    Map.Entry::getKey,Map.Entry::getValue
                    ,(oldValue, newValue) -> oldValue, LinkedHashMap::new));

        return sortedMap;
    }


    public static Map<String, Integer> sortedMap1(Map<String, Integer> map){
        Set< Map<String,Integer> > entrySet = new HashSet<>();

        //Use LinkedHashMap as it keeps inserting order
        LinkedHashMap<String, Integer> sortedMap = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue()) // this is a method of Comparator interface - part of Collection Framework
                .collect(Collectors.toMap(
                        Map.Entry::getKey,Map.Entry::getValue
                        ,(oldValue, newValue) -> oldValue, LinkedHashMap::new));

        return sortedMap;
    }
}
/*
Map - Sort the map by values
Write a method that can sort the Map by values.
 */