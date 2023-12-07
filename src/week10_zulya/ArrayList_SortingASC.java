package week10_zulya;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayList_SortingASC {


  //  Write a method that can sort the ArrayList in Ascending order without using the sort method.

    //java 8 Stream api with sorted() method
    public static void streamSort(ArrayList<Integer> list) {
        List<Integer> sortedList = list.stream()
                .sorted()
                .collect(Collectors.toList());
        list.clear();
        list.addAll(sortedList);
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(4);
        numbers.add(3);
        numbers.add(2);
        numbers.add(1);


        System.out.println("Before sorting: " + numbers);

        streamSort(numbers);

        System.out.println("After sorting: " + numbers);
    }
}





