package week07_omid;
import java.util.Arrays;

public class FindMinimum {

    public static int findMinimum(int[] numbers){

        // Check if the array is empty or null
        if (numbers == null || numbers.length == 0){

            throw new IllegalArgumentException ("The array is empty or null.");

        }

        // Initialize max with the first element of the array
        int min = numbers[0];

        // Iterate through the array to find the maximum
        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] < min){
                min = numbers[i];
            }
        }

        return min;
    }


    public static int findMin(int[] numbers){
        // Check if the array is empty or null
        if (numbers == null || numbers.length == 0){

            throw new IllegalArgumentException("Array can't be empty or null.");
        }

        // Sort the array in ascending order
        Arrays.sort(numbers);

        // The minimum value will be at the first index (index 0) after sorting
       return numbers[0];

    }



    public static void main(String[] args) {

        int[] numbers = {5, 2, 9, 1, 7, 10};
        int[] number = {8, 12, 2, 18, 20, 10};

        //Method 1
        int minimum = findMinimum(numbers);

        System.out.println("M1 Minimum number is : "+ minimum);

        //Method2
        int min = findMin(number);
        System.out.println("M2 Minimum number is : "+ min);

    }





}


/*
Question1: Array - Find Minimum
Write a method that can find the maximum number from an int Array
 */