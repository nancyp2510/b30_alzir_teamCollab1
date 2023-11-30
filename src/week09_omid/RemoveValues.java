package week09_omid;

import java.util.ArrayList;
import java.util.List;

public class RemoveValues {

    public static void main(String[] args) {
        // Create an ArrayList of Integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(105);
        numbers.add(50);
        numbers.add(200);


        // Remove values greater than 100
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > 100) {
                numbers.remove(i);
                i--; // Decrement the index to account for removed element
            }
        }

        // Print the updated list
        System.out.println(numbers); // It will print: [1, 2, 3, 50]
    }
}
