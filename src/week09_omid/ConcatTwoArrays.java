package week09_omid;

import java.util.Arrays;

public class ConcatTwoArrays {


    public static int[] concatenateArrays(int[] array1, int[] array2) {
        int length1 = array1.length;
        int length2 = array2.length;
        int[] result = new int[length1 + length2];

        // Copy elements from the first array to the result
        for (int i = 0; i < length1; i++) {
            result[i] = array1[i];
        }

        // Copy elements from the second array to the result
        for (int i = 0; i < length2; i++) {
            result[length1 + i] = array2[i];
        }

        return result;
    }


    public static void main(String[] args) {


        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] concatenatedArray = concatenateArrays(array1, array2);

        // Print the concatenated array
        System.out.println(Arrays.toString(concatenatedArray));

    }
}
