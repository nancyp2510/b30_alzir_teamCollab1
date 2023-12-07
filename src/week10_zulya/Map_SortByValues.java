package week10_zulya;

import java.util.*;

public class Map_SortByValues {

    //Write a method that can sort the Map by values.

    public static <K, V extends Comparable<V>> Map<K, V> sortByValues(Map<K, V> map) {
        List<Map.Entry<K, V>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort(Comparator.comparing(Map.Entry::getValue));

        Map<K, V> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<K, V> entry : entryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }

    public static void main(String[] args) {
        Map<String, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("one", 5);
        unsortedMap.put("two", 2);
        unsortedMap.put("three", 8);
        unsortedMap.put("four", 1);

        System.out.println("Before sorting: " + unsortedMap);

        Map<String, Integer> sortedMap = sortByValues(unsortedMap);

        System.out.println("After sorting: " + sortedMap);
    }
}
