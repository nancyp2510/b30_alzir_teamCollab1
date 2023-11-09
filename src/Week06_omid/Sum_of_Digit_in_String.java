package Week06_omid;

public class Sum_of_Digit_in_String {

    public static int sumOfDigits(String digit){

        int sum = 0;  //variable to store the sum of digits

        //Iterate through each character in the digit string
        for (char each : digit.toCharArray()) {
                if (Character.isDigit(each)){   // Check if the character is a digit

                    // Convert the digit character to its numeric value
                    int digitValue = Character.getNumericValue(each);

                    sum += digitValue; // add it to the sum
                }
        }

        return sum;
    }

    public static void main(String[] args) {

        String example1 = "Omid123Java567";
        String example2 = "Python123C#432";

        System.out.println("The sum of digits is = " + sumOfDigits(example1));
        System.out.println("The sum of digits is = " + sumOfDigits(example2));
    }
}
