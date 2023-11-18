package week7_nancy;

import java.util.Arrays;

public class SortAscendingArray {
    public static void main(String[] args) {
        int[] array = {20,5,10,15,30,25};

        System.out.println("sortedArrayAscending(array) = " + Arrays.toString(sortedArrayAscending(array)));
    }

    public static int[] sortedArrayAscending(int[] array) {
        int[] sortedArray = array;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int temp = 0;
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
            return sortedArray;
        }

}
/*
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
arr = Sort(arr); ==>{ 7, 8, 9, 10};

 */