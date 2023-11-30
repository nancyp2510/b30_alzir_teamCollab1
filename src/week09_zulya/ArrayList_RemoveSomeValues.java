package week09_zulya;

import java.util.ArrayList;

public class ArrayList_RemoveSomeValues {

    //3) ArrayList - Remove some values
    //Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.

    public static void main(String[] args) {
        ArrayList <Integer> numbers = new ArrayList<>();

        numbers.add(100);
        numbers.add(101);
        numbers.add(1);
        numbers.add(4);
        numbers.add(10);
        numbers.add(-1);
        numbers.add(-34);
        numbers.add(900);


        System.out.println("numbers BEFORE removing values greater than 100 = " + numbers);

        numbers.removeIf(p->p >100);

        System.out.println("numbers AFTER removing values greater than 100 = " + numbers);
    }
}
