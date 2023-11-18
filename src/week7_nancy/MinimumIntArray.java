package week7_nancy;

public class MinimumIntArray {
    public static void main(String[] args) {
        int[] array = {20,5,10,15,30,35};
        int[] array1 = {1};
        System.out.println("minInArray(array) = " + minInArray(array));
        System.out.println("minInArray(array) = " + minInArray(array1));
    }

    public static int minInArray(int[] array){
        if(array == null){
            System.err.println("int array can't be null!!!");
        }
        int min = Integer.MAX_VALUE;
        for(int each : array){
            if(each <min){
                min = each;
            }
        }

        return min;
    }
}
/*
Question1: Array - Find Minimum
Write a method that can find the minimum number from an int Array
 */