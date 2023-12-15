package week10_omid;

import java.util.ArrayList;

public class ArrayListSortDesc {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(2);
        numbers.add(10);
        numbers.add(3);
        numbers.add(1);
        numbers.add(6);

        System.out.println("Original ArrayList: " + numbers);

        // Calling the selectionSort method to sort the ArrayList in Descending order
        selectionSortDesc(numbers);


        System.out.println("Sorted ArrayList (Descending): " + numbers);

    }

    public static void selectionSortDesc(ArrayList<Integer> list) {
        int num = list.size();

        // Iterate through the ArrayList to select elements
        for (int i = 0; i < num - 1; i++) {
            int minIndex = i;


            for (int j = i + 1; j < num; j++) {

                if (list.get(j) > list.get(minIndex)) {
                    // Update the minIndex if a larger element is found
                    minIndex = j;
                }
            }

            // Swap the found minimum with element at position i
            int temp = list.get(i);
            list.set(i, list.get(minIndex));
            list.set(minIndex, temp);
        }
    }
}
