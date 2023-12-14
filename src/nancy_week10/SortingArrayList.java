package nancy_week10;

import java.util.ArrayList;
import java.util.Arrays;

public class SortingArrayList {
    public static void main (String[] args){
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,4,7,2,5,3,6,9,8));

        System.out.println("sortingListAscending(list) = " + sortingListAscending(list));

        System.out.println("sortingListDescending(list) = " + sortingListDescending(list));
    }

    public static ArrayList<Integer> sortingListAscending(ArrayList<Integer> list){
        if(list == null){
            return null;
        }
        int temp = 0;
        for(int i = 0;i< list.size();i++){
            //inner loop to take out each element starting from the last one to compare with the first one
            //outer loop to run inner loop thru its element from first one to last
            for(int j = list.size()-1; j > i ;j--){
            if(list.get(i) > list.get(j)) {
                 temp = list.get(i); // re-asign temp in each inner loop
                list.set(i,list.get(j));
                list.set(j,temp);
            }
            }
        }
        return list;
    }


    public static ArrayList<Integer> sortingListDescending(ArrayList<Integer> list){
        if(list == null){
            return null;
        }
        int temp = 0;
       for(int i = 0;i < list.size();i ++){
           for(int j = list.size()-1;j > i ; j--){
               if(list.get(i) < list.get(j)){
                   temp = list.get(i);
                   list.set(i, list.get(j));
                   list.set(j,temp);
               }
           }
       }
        return list;
    }
}
/*
ArrayList - sorting in ascending
Write a method that can sort the ArrayList in Ascending order without using
the sort method.
ArrayList - sorting in descending order
Write a method that can sort the ArrayList in descending order without
using the sort method.
 */