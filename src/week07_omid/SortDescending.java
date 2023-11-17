package week07_omid;

import java.util.Arrays;

public class SortDescending {

    public static int[] sortDescending(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;

            // Find the index of the maximum element in the remaining unsorted array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) {   // Only change has been made from < to >.
                    maxIndex = j;
                }
            }

            // Swap the maximum element with the current element
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }

        return arr;
    }

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        int[] sortedNumbers = sortDescending(numbers);

        System.out.println(Arrays.toString(sortedNumbers));

    }
}