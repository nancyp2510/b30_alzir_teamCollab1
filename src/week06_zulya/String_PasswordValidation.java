package week06_zulya;


    //String -- Password Validation Task
    // Write a return method that can verify if a password is valid or not.
    // requirements:
    //1. Password MUST be at least have 6 characters and should not contain space
    //2. PassWord should at least contain one upper case letter
    //3. PassWord should at least contain one lowercase letter
    //4. Password should at least contain one special characters
    //5. Password should at least contain a digit
    //if all requirements above are met, the method returns true, otherwise returns false


import java.util.regex.Pattern;

public class String_PasswordValidation {

    public static void main(String[] args) {

        String password = "!1PassWord";
        boolean isValid = verifyPassword(password);
        System.out.println("Password is valid : " + isValid);

    }


    public static boolean verifyPassword(String password) {


        boolean containsUpperCase = false;
        boolean containsLowerCase = false;
        boolean containsDigit = false;
        boolean containsCharacter = false;


        if (password.isEmpty()) {     //if Empty throw Exception
            throw new IllegalArgumentException("Password can not be empty");
        }
        if (password.length() < 6 || password.contains(" ")) { //1.space and less than 6 characters
            return false;
        }

        //loop through String to get the rest result
        for (char eachLetter : password.toCharArray()) {
            if (Character.isLowerCase(eachLetter)) {
                containsLowerCase = true;
            } else if (Character.isUpperCase(eachLetter)) {
                containsUpperCase = true;
            }else if (Character.isDigit(eachLetter)){
                containsDigit=true;
            }else{
                containsCharacter=true;
            }

        }
        return containsUpperCase && containsCharacter && containsDigit && containsLowerCase;
    }
}

