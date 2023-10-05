package week02_omid;

public class SwapNumbers {

    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 30;

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;



        System.out.println("Num1 : "+num1 + "\nNum2 : "+num2);
    }
    
}
