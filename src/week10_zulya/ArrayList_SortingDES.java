package week10_zulya;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayList_SortingDES {

    /*
    Write a method that can sort the ArrayList in descending order without using the sort method.
     */

    //using sort() method of Collections framework plus reverseOrder() method
    public static void descendingSort(ArrayList<Integer> list) {
        Collections.sort(list, Comparator.reverseOrder());
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);

        System.out.println("Before sorting: " + numbers);

        descendingSort(numbers);

        System.out.println("After sorting in descending order: " + numbers);
    }


}
