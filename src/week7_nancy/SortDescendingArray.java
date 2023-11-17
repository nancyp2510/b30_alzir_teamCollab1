package week7_nancy;

import java.util.Arrays;

public class SortDescendingArray {
    public static void main(String[] args) {
        int[] array = {20,5,10,15,30,25};

       // System.out.println("sortIntArrayDescending(array) = " + Arrays.toString(sortIntArrayDescending(array)));
        System.out.println("sortIntArrayDescending2(array) = " + Arrays.toString(sortIntArrayDescending2(array)));

    }
    public static int[] sortIntArrayDescending(int[] array){
     int[] sortedArray = new int[array.length];
     Arrays.sort(array);
/*
    for(int i = 0; i <array.length;i++){
        for(int j = i+1; j < array.length;j++){
            int temp = 0;
            if(array[i] > array[j]){
                temp = array[i];
                array[i]= array[j];
                array[j] = temp;
            }
        }
    }
*/
    for(int i = 0; i < array.length; i++){
        sortedArray[i] = array[(array.length-1)-i];
    }
        return sortedArray;
    }


    public static int[] sortIntArrayDescending2(int[] arr){
        int[] sortedArray = arr;
        for(int i = 0; i < sortedArray.length;i ++){
            for(int j = i+1;j<sortedArray.length; j++){
                int temp = 0;
                if(arr[i]<arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return sortedArray;
    }

}
/*
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex: int[] arr = {10,20,7, 8, 90};
arr = Sort(arr); ==> {90, 20, 10, 8, 7};
 */