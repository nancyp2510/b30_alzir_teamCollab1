package week07_omid;

import java.util.Arrays;

public class SortAscending {

    public static int[] sortArrayAscending(int[] arr) {
        // Check if the array is empty or null
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("The array is empty or null.");
        }

        // Store the length of the array in number
        int number = arr.length;

        for (int i = 0; i < number - 1; i++) {
            int minIndex = i; //the index of the current element being considered as the minimum.

            // Find the index of the minimum element in the remaining unsorted array
            for (int j = i + 1; j < number; j++) {
                if (arr[j] < arr[minIndex]) {  // To find new unsorted array from arr[j]
                    minIndex = j; // update new element to minIndex
                }
            }

            // Swap the found minimum element with the element at index i
            int temporary = arr[i]; // to store the value of the element at index i.
            arr[i] = arr[minIndex]; //ensuring that the minimum element is now in its correct sorted position.
            arr[minIndex] = temporary; //minIndex is updated with the original value of the element at index i
        }

        return arr;
    }

    public static void main(String[] args) {

        int[] numbers = {5, 2, 9, 1, 7};
        int[] sortedNumbers = sortArrayAscending(numbers);

        System.out.println(Arrays.toString(sortedNumbers));

    }
}
