package Week06_omid;

import java.util.Scanner;
import java.util.regex.Pattern;

public class StringPasswordValidation {

    public static boolean passwordValidation(String password) {

        // Check if the password has at least 6 characters and does not contain spaces
        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }

        boolean containsUpperCase = false;
        boolean containsLowerCase = false;
        boolean containsSpecialCh = false;
        boolean containsDigit = false;

        // Loop through each character in the password using toCharArray()
        //toCharArray() method converts the given string into a sequence of characters.
        for (char each : password.toCharArray()) {

            if (Character.isUpperCase(each)) {
                containsUpperCase = true;
            } else if (Character.isLowerCase(each)) {
                containsLowerCase = true;
                //valueOf() is used to convert each into string
            } else if ("!@#$%^&*()_+-=[]{};':,.<>/?".contains(String.valueOf(each))) {
                containsSpecialCh = true;
            } else if (Character.isDigit(each)) {
                containsDigit = true;
            }
        }

        return containsUpperCase && containsLowerCase && containsSpecialCh && containsDigit;

    }

    public static void main(String[] args) {
        // Method 1
       String pass1 = "WoodenSpoon1@";
       String pass2 = "helloWorld";

        System.out.println("Password 1 = " + passwordValidation(pass1));
        System.out.println("Password 2 = " + passwordValidation(pass2));

        // Method 2
        String pass3 = "WoodenSpoon1@";
        String pass4 = "helloWorld";

        System.out.println("Password 3 = " + isPasswordValid(pass3));
        System.out.println("Password 4 = " + isPasswordValid(pass4));
    }


    public static boolean isPasswordValid(String password) {
        // Check if the password has at least 6 characters and does not contain spaces
        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }

        // Check if the password contains at least one uppercase letter
        //Pattern.compile method compiles a regular expression pattern into a Pattern object.
        //Matcher is an object created from a compiled regular expression pattern.
        //Find is a method coming from Matcher class
        if (!Pattern.compile("[A-Z]").matcher(password).find()) {
            return false;
        }

        // Check if the password contains at least one lowercase letter
        if (!Pattern.compile("[a-z]").matcher(password).find()) {
            return false;
        }

        // Check if the password contains at least one special character
        if (!Pattern.compile("[!@#$%^&*()_+\\-=\\[\\]{};':\",.<>/?]").matcher(password).find()) {
            return false;
        }

        // Check if the password contains at least one digit
        if (!Pattern.compile("\\d").matcher(password).find()) {
            return false;
        }

        // If all requirements are met, return true
        return true;
    }

}
/*
1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit
if all requirements above are met, the method returns true, otherwise returns false

 */