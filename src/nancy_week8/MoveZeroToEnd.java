package nancy_week8;

import java.util.Arrays;

public class MoveZeroToEnd {
    public static void main(String[] args) {
    int[] arr = {1,0,2,0,3,0,4,0};

        System.out.println(Arrays.toString(moveZeroToEnd(arr)));


    }

    public static int[] moveZeroToEnd(int[] arr) {

    if(arr == null){
        System.err.println("int[] array can't be null!!!");
    }
        int[] outputArr = new int[arr.length];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            // it will chech the !=0 element and add to outputArr
            // then the rest will be added 0 by default
            if (arr[i] != 0) {
                outputArr[k] = arr[i];
                k++;
            }
        }
        return outputArr;
    }

    // another solution is add to ArrayList and remove 0, then add to array

    }
/*
Array - Move Zeros to the End
Write a method that can move all the zeros to last indexes of the array (Do
Not Use Sort Method) Ex: input: {1,0,2,0,3,0,4,0}; output: [1, 2, 3, 4, 0, 0, 0,
0]
 */