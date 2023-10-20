package week04_zulya;

public class FrequencyOfCharacters {

    //Write a return method that can find the frequency of characters
    //Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
    public static void main(String[] args) {
        System.out.println("" + frequencyOfChars("AAAABBBBBBBCCCCDD"));
    }

    public static String frequencyOfChars(String str) {

        String frequency = "";
        int j = 0;
        while (j < str.length()) {
            int count = 0;
            for (int i =0; i <str.length(); i++){
               if (str.charAt(i)==str.charAt(j)){
                   count++;
               }
            }
            frequency +=str.charAt(j)+""+count;
            str = str.replace(""+str.charAt(j),"");
        }
        return frequency;
    }
}
