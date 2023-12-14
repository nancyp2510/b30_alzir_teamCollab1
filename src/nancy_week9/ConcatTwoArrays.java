package nancy_week9;
import java.util.Arrays;

public class ConcatTwoArrays {
    public static void main (String[] args){
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {10,20,30,40,50};
        System.out.println("concatTwoArray(arr1,arr2) = " + Arrays.toString( concatTwoArray(arr1, arr2)));

        int[] arr3 = null;
        int[] arr4 = null;

        System.out.println("concatTwoArray(arr3,arr4) = " + Arrays.toString(concatTwoArray(arr3, arr4)));

        String[] arr5 = {"Java", "Ruby", "Python", "C++", "Ruby", "Javascrift"};
        String[] arr6 = {"Selenium", "Cucumber", "TestNG", "Junit", "jdbc", "Rest assured", "Postman"};

        System.out.println("concatTwoArray(arr5,arr6) = " + Arrays.toString(concatTwoArray(arr5, arr6)));


    }

    public static int[] concatTwoArray(int[] arr1, int[] arr2){
       if(arr1 == null){
           return arr2;
       }else if(arr2 == null){
           return arr1;
       }else if(arr1 == null & arr2 == null){
           System.err.println("Two arrays can't be null!!!");
           return null;
       }

        int[] concatedArray = Arrays.copyOf(arr1, arr1.length + arr2.length);
        for(int i = arr1.length, j =0 ;i < concatedArray.length; i ++, j++){
            concatedArray[i] = arr2[j];
        }

        return concatedArray;
    }
    
    //Overloading method
    public static String[] concatTwoArray(String[] arr1, String[] arr2){
        if(arr1 == null){
            return arr2;
        }else if(arr2 == null){
            return arr1;
        }else if(arr1 == null & arr2 == null){
            System.err.println("Two array can't be null!!!");
            return null;
        }

        String[] concatedArray = Arrays.copyOf(arr1, arr1.length + arr2.length);
        for(int i = arr1.length, j =0 ;i < concatedArray.length; i ++, j++){
            concatedArray[i] = arr2[j];
        }

        return concatedArray;
    }

}
/*
1) Array - Concat two arrays
Write a return method that can concate two arrays
 */