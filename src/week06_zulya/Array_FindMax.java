package week06_zulya;

public class Array_FindMax {
    //  Write a method that can find the maximum number from an int Array
    public static void main(String[] args) {

  int [] arrayToCheck = {100,1,2,3};

  int maxNum =findMaxNum(arrayToCheck);
        System.out.println("maximum number from array is " + maxNum);
    }


    public static int findMaxNum(int[] array) {

        if (array.length == 0) {
            throw  new IllegalArgumentException("Array can not be empty");
        }

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
