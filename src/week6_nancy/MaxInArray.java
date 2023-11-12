package week6_nancy;

public class MaxInArray {
    public static void main(String[] args) {
        int[] input1 = new int[]{1,2,3,1,2,5,7,1,2};
        int[] input2 = {125, 46, 559, 123, 28};

        System.out.println("maxNumberInArray(input1) = " + maxNumberInArray(input1));
        System.out.println("maxNumberInArray(input2) = " + maxNumberInArray(input2));
    }


    public static int maxNumberInArray(int[] input){
        int max = Integer.MIN_VALUE;
        for(int each : input){
            if (each>max){
                max = each;
            }
        }

        return max;
    }

}
/*
Write a method that can find the maximum number from an int Array
 */