package nancy_week9;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrL_RemoveElement {
    public static void main(String[] args){
        ArrayList<String> allNamesList = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed", "Mary", "Xuka","Nobita"));
        System.out.println("removeElement(allNamesList,\"Ahmed\") = " + removeElement(allNamesList, "Ahmed"));

        //allNamesList.removeIf(p->p.equalsIgnoreCase("Ahmed"));
        //System.out.println(allNamesList);


        ArrayList<String> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList("A", "B","C"));



       System.out.println(removeElement(list1, "A"));
       ArrayList<String> list2 = null;

        System.out.println("removeElement(list1,\"A\") = " + removeElement(list1, "A"));

        System.out.println("removeElement(list2,\"nice\") = " + removeElement(list2, "nice"));


    }
    public static ArrayList<String> removeElement(ArrayList<String> list, String removeElement){
        if(list == null){
            return null;
        }
        ArrayList<String> resultList = new ArrayList<>();
        for(String eachElement : list){
            if(!resultList.contains(eachElement) && !eachElement.equalsIgnoreCase(removeElement)){
                resultList.add(eachElement);
            }
        }
        return resultList;
    }

    //Overloading method
    public static ArrayList<Integer> removeElement(ArrayList<Integer> list, Integer removeElement){
        if(list == null){
            return null;
        }

        ArrayList<Integer> resultList = new ArrayList<>();
        for(Integer eachElement : list){
            if(!resultList.contains(eachElement) && eachElement !=(removeElement)){
                resultList.add(eachElement);
            }
        }
        return resultList;
    }

}
/*
2) ArrayList - Remove "Ahmed"
Given a list of people' names: "Ahmed", "John", Eric", "Ahmed"..... Write a java operation to remove all the names named Ahmed
 */