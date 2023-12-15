package nancy_week9;

import java.util.ArrayList;
import java.util.Arrays;

public class Arrl_RemoveSomeValues {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 101, 200, 300));

        System.out.println("removeSomeValues(list) = " + removeSomeValues(list, 100));
    }

    public static ArrayList<Integer> removeSomeValues(ArrayList<Integer> list, int value){
        if(list == null){
            return  null;
        }

        ArrayList<Integer> resultList = new ArrayList<>();
        for(Integer element : list){
            if(element< value && !resultList.contains(element)){
                resultList.add(element);
            }
        }
        return  resultList;
    }

    public static ArrayList<String> removeSomeValues(ArrayList<String> list, String value){
        if(list == null){
            return  null;
        }

        ArrayList<String> resultList = new ArrayList<>();
        for(String element : list){
            if(!element.equalsIgnoreCase(value) && !resultList.contains(element)){
                resultList.add(element);
            }
        }
        return  resultList;
    }

}
/*
3) ArrayList - Remove some values
Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
 */