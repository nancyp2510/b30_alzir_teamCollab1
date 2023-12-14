package week08_zulya;

import java.util.Arrays;

/*
Array - Move Zeros to the End
Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method) Ex: input: {1,0,2,0,3,0,4,0}; output: [1, 2, 3, 4, 0, 0, 0, 0]
 */
public class Array_MoveZeros {
    public static void main(String[] args) {

        int[] array = {0,3,4,0,0,0,3,4};

        moveZeros(array);
        System.out.println(Arrays.toString(array));

    }

    public static void moveZeros(int[] array) {

        int noZeroIndex = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] != 0) { //if current element is not zero, then swap withnthe first zero met
               if(i != noZeroIndex){
                   array[noZeroIndex] =array[i];
                   array[i]=0;
               }
               noZeroIndex++;
            }
        }
    }
}

