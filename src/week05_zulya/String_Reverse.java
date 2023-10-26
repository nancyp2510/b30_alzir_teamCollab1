package week05_zulya;

public class String_Reverse {
    //String -- Reverse
    //Write a return method that can reverse String Ex: Reverse("ABCD"); ==> DCBA
    public static void main(String[] args) {

        String str1 = "ABCD";
        System.out.println("str1 = " + str1);
        System.out.println("reverseString(str1) = " + reverseString(str1));

    }


    public static String reverseString(String str1){

        String reverse = "";

        for (int i = str1.length()-1; i >=0; i--) {

            reverse+=str1.charAt(i);
        }

        return reverse;
    }
}
