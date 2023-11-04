package week06_nancy;

public class PasswordValidationTask {
    public static void main(String[] args) {
        String password1 = "Beautiful#Life15";
        String password2 = "emily2";
        String password3 = "abd deD1";
        String password4 = "";
        String password5 = null;
        String password6 = "                   ";
        String password7 = "Beautiful# Life15";


        System.out.println("isValidPassword(password1) = " + isValidPassword(password1));
        System.out.println("isValidPassword(password2) = " + isValidPassword(password2));
        System.out.println("isValidPassword(password3) = " + isValidPassword(password3));
        System.out.println("isValidPassword(password4) = " + isValidPassword(password4));
        System.out.println("isValidPassword(password5) = " + isValidPassword(password5));
        System.out.println("isValidPassword(password6) = " + isValidPassword(password6));
        System.out.println("isValidPassword(password7) = " + isValidPassword(password7));
    }

    public static boolean isValidPassword (String password){
        //have this null condition, otherwise it will throw NullPointerException
        // no need for isEmpty() or isBlank() bc of the valid password condition

        if(password == null){
            return false;
        }

        int upperCaseLetter = 0;
        int lowerCaseLetter = 0;
        int specialChar = 0;
        int digit = 0;

        for(char eachChar : password.toCharArray()){
            if(Character.isDigit(eachChar)){
                digit ++;
            }else if(Character.isUpperCase(eachChar)){
                upperCaseLetter++;
            }else if(Character.isLowerCase(eachChar)){
                lowerCaseLetter++;
            }else{
                specialChar++;
            }
        }

        if(password.length()>=6
                && (!password.contains(" "))
                && (digit>=1)
                && (upperCaseLetter >=1)
                && (lowerCaseLetter >=1)
                && (specialChar >=1)
        ){
            return true;
        }

        return false;
    }
}
/*
String -- Password Validation Task 1. Write a return method that can verify if a password is valid or not. requirements: 1. Password MUST be at least have 6 characters and should not contain space 2. PassWord should at least contain one upper case letter 3. PassWord should at least contain one lowercase letter 4. Password should at least contain one special characters 5. Password should at least contain a digit if all requirements above are met, the method returns true, otherwise returns false
 */