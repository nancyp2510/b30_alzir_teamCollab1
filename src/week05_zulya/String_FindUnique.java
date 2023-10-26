package week05_zulya;

public class String_FindUnique {

    //String -- Find the unique
    //Write a return method that can find the unique characters from the String Ex: unique("AAABBBCCCDEF") ==> "DEF";


    public static void main(String[] args) {

        String str1 = "AAABBBCCCDEF";
        System.out.println("str1 = " + str1);
        System.out.println("findUnique(str1) = " + findUnique(str1));

    }


    public static String findUnique(String str1) {

        String unique = "";

        for (int i = 0; i < str1.length(); i++) {

           // char currentChar = str1.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < str1.length(); j++) {
                if (i != j && str1.charAt(i) == str1.charAt(j)) {    //index number does not equal, but value of index is equal
                    isUnique = false; // if condition is not met -->then
                    break;  // --> we
                }
            }
            if (isUnique) {   // once condition  is met and it's true then
                unique += str1.charAt(i);   // value of index i added to string unique
            }
        }


        return unique;
    }
}
