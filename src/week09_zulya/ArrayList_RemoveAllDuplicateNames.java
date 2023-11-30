package week09_zulya;

import java.util.ArrayList;

public class ArrayList_RemoveAllDuplicateNames {

//2) ArrayList - Remove "Ahmed"
// Given a list of people' names: "Ahmed", "John", Eric", "Ahmed"..... Write a java operation to remove all the names named Ahmed

    public static void main(String[] args) {
        ArrayList <String> names = new ArrayList<>();

        names.add("Ahmed");
        names.add("John");
        names.add("Eric");
        names.add("Ahmed");

        System.out.println("names BEFORE removing all names : Ahmed = " + names);

        names.removeIf(p->p.equals("Ahmed"));

        System.out.println("names AFTER removing all names : Ahmed = " + names);
    }
    }

