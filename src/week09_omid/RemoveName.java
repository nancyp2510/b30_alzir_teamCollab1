package week09_omid;

import java.util.ArrayList;
import java.util.List;

public class RemoveName {

    public static void main(String[] args) {
        // Create an ArrayList of names
        List<String> names = new ArrayList<>();
        names.add("Ahmed");
        names.add("Nancy");
        names.add("Zulya");
        names.add("Ahmed");
        names.add("Omid");
        names.add("Kamran");
        names.add("Ali");
        names.add("Celine");

        // Remove all occurrences of "Ahmed"
        names.removeIf(name -> name.equals("Ahmed"));

        // Print the updated list
        System.out.println(names); // It will print: [John, Eric]
    }

}
