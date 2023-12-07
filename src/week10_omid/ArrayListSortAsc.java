package week10_omid;

import java.util.ArrayList;

public class ArrayListSortAsc {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(2);
        numbers.add(10);
        numbers.add(3);
        numbers.add(1);
        numbers.add(6);

        System.out.println("Original ArrayList: " + numbers);

        // Calling the selectionSort method to sort the ArrayList in ascending order
        selectionSortAsc(numbers);


        System.out.println("Sorted ArrayList (Ascending): " + numbers);

    }

    public static void selectionSortAsc(ArrayList<Integer> list) {
        int num = list.size();  // Get the number of elements in the ArrayList

        // Iterate through the ArrayList to select elements
        for (int i = 0; i < num - 1; i++) {
            int minIndex = i;

            // Find the index of the minimum element in the remaining unsorted portion
            for (int j = i + 1; j < num; j++) {
                // Compare the current element with the elements in the remaining portion
                if (list.get(j) < list.get(minIndex)) {
                    // Update the minIndex if a smaller element is found
                    minIndex = j;
                }
            }

            // Swap the found minimum with element at position i
            int temp = list.get(i);         // Store the current element in a temporary variable
            list.set(i, list.get(minIndex)); // Assign the minimum element to the current position
            list.set(minIndex, temp);        // Place the current element in the minimum element's original position
        }
    }
}
