package week09_zulya;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Array_Concat2Arrays {

    //Array - Concat two arrays
    //Write a return method that can concat two arrays

    public static void main(String[] args) {
        int [] array1 ={ 1,2,3,4,5 } ;
        int [] array2 ={ 6,7,8,9,10 } ;
        int [] result =concat2arrays(array1,array2);
        System.out.println("result = " + Arrays.toString(result));
    }


    public static int[] concat2arrays(int [] array1, int []array2){

        int [] result = new int[array1.length+array2.length];

        for (int i = 0; i < array1.length; i++) {
            result[i]=array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            result[array1.length +i]= array2[i];
        }

        return result;
    }
}
