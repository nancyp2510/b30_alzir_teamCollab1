package week01_zulya;

public class Numbers_Swap {
    public static void main(String[] args) {



        int firstNumber = 25;
        int secondNumber = 10;


        firstNumber = firstNumber + secondNumber;
        secondNumber = firstNumber-secondNumber;
        firstNumber = firstNumber-secondNumber;

        System.out.println("firstNumber = " + firstNumber);
        System.out.println("secondNumber = " + secondNumber);


    }
}
